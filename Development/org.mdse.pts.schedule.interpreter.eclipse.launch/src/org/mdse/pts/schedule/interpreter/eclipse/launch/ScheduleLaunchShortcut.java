package org.mdse.pts.schedule.interpreter.eclipse.launch;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.mdse.pts.common.util.EclipseUtil;
import org.mdse.pts.common.util.EcoreIOUtil;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.interpreter.ScheduleInterpreter;
import org.mdse.pts.schedule.interpreter.ResultData;
import org.mdse.pts.schedule.interpreter.ScheduleInterpreterException;;

public class ScheduleLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		System.out.println("selection");
		//Load model
		IFile file = EclipseUtil.getFirstIFileFromSelectionWithExtension("schedule", selection);
		Schedule schedule = (Schedule) EcoreIOUtil.loadModel(file);

		interpretSchedule(schedule);
		
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		System.out.println("xtext");
		if (editor instanceof XtextEditor) {
			XtextEditor xtextEditor = (XtextEditor) editor;
			
			IXtextDocument document = xtextEditor.getDocument();
			document.readOnly(new IUnitOfWork<Void, XtextResource>() {
				public java.lang.Void exec(XtextResource state) throws Exception {
					List<EObject> contents = state.getContents();
					
					if (!contents.isEmpty()) {
						EObject root = contents.get(0);
						
						if (root instanceof Schedule) {
							Schedule schedule = (Schedule) root;
							interpretSchedule(schedule);
						}
					}
					
					return null;
				}
			});
			
			return;
		}
		
		String title = "Unsupported Launch Selection.";
		String message = "The file appears to not be a proper Schedule.";
		MessageDialog.openError(null, title, message);
	}
	
	protected void interpretSchedule(Schedule schedule) {
		try {
			ScheduleInterpreter interpreter = new ScheduleInterpreter();
			ResultData resultData = interpreter.interpret(schedule);
			System.out.println("##############################TESTING");
			//WRITE TO FILE
		} catch (ScheduleInterpreterException e) {
			String title = "Error";
			String message = e.getMessage();
			MessageDialog.openError(null, title, message);
		}
	}
	
}
