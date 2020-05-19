package org.mdse.pts.schedule.validation;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.mdse.pts.schedule.Frequency;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.SchedulePackage;
import org.mdse.pts.schedule.TrainSchedule;

public class ScheduleValidator extends EObjectValidator implements IStartup {

	@Override
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(SchedulePackage.eINSTANCE, new ScheduleValidator());
	}

	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		if (SchedulePackage.eINSTANCE.getTrainSchedule().equals(eClass)) {
			modelIsValid &= new TrainScheduleValidator((TrainSchedule) eObject, diagnostics).validate();
		} else if (SchedulePackage.eINSTANCE.getRoute().equals(eClass)) {
			modelIsValid &= new RouteValidator((Route) eObject, diagnostics).validate();
		} else if (SchedulePackage.eINSTANCE.getFrequency().equals(eClass)) {
			modelIsValid &= new FrequencyValidator((Frequency) eObject, diagnostics).validate();
		}
		
		return modelIsValid;
	}
}
