/*
 * generated by Xtext 2.20.0
 */
package org.mdse.pts.schedule.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.mdse.pts.common.util.EclipseUtil
import org.mdse.pts.common.util.EcoreIOUtil
import org.mdse.pts.schedule.Schedule
import org.mdse.pts.schedule.interpreter.ScheduleInterpreter
import org.mdse.pts.timetable.transformation.TimetableToHMTL
import java.io.File
import org.eclipse.emf.common.util.BasicMonitor
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ScheduleGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var project = EclipseUtil.resolveProjectFromResource(resource);
		var folder = project.getFolder("timetables");
		var javaFolder = new File(folder.location.toString);
		var arguments = new ArrayList<String>();
		
		var interpreter = new ScheduleInterpreter()
		var schedule = resource.contents.get(0) as Schedule
		var timetables = interpreter.interpret(schedule)
		for(String stationName : timetables.keySet()) {
			var timetable = timetables.get(stationName)
			var generator = new TimetableToHMTL(timetable, javaFolder, arguments)
			generator.doGenerate(new BasicMonitor())
		  }
		
		EclipseUtil.refreshResource(folder);
	}
	
}
