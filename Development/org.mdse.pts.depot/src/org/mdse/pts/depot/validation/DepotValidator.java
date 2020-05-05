package org.mdse.pts.depot.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.mdse.pts.depot.*;

public class DepotValidator extends EObjectValidator {
	private DiagnosticChain diagnostics;
	private boolean modelIsValid;
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}
	
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		
		return modelIsValid;
	}
	
	protected boolean validateIntercityTrain(IntercityTrain train) {
		return false;
	}
	
	protected boolean validateRegionalTrain(RegionalTrain train) {
		return false;
	}
	
	protected boolean validateTrain(Train train) {
		EList<Coach> coaches = train.getCoaches();
		
		if (coaches.size() < 1) {
			constraintViolated(train, "Trains must have at least 1 coach");
			return false;
		}
		if (!hasLocomotive(coaches)) constraintViolated(train, "Train must have a Locomotive at one of its ends.");
		boolean hasDiningCoach = false;
		boolean firstSequenceEnded = false;
		boolean secondSequenceStarted = false;
		boolean hasFirstClass = false;
		
		int i = coaches.get(0) instanceof Locomotive ? 1 : 0;
		int last = coaches.get(coaches.size() - 1) instanceof Locomotive ? coaches.size() -2 : coaches.size() -1;
		if (last <= 0) {
			if ((coaches.get(i) instanceof DiningCoach)) {
				firstSequenceEnded = true;
				hasDiningCoach = true;
				i++;
			} else if (coaches.get(i) instanceof Locomotive) {
				if (i != last)
					constraintViolated(train, "Train can only have a Locomotive at the front or end.");
			} else if (coaches.get(i) instanceof FirstClassPassengerCoach) {
				hasFirstClass = true;
			}
			Class<? extends Coach> firstType = coaches.get(i).getClass();
			
			for (; i < last; i++) {
				Coach coach = coaches.get(i);
				if (coach instanceof DiningCoach) {
					if (hasDiningCoach)
						constraintViolated(train, "Train must have only 1 DiningCoach.");
					if (firstSequenceEnded && secondSequenceStarted) {
						constraintViolated(train, "Trains Dining Coach must be placed between First and Second Class Coaches.");
					}
					hasDiningCoach = true;
				} else if (coach instanceof Locomotive) {
					constraintViolated(train, "Train can only have a Locomotive at the front or end.");
				} else if (coach.getClass().equals(firstType)) {
					if (coach instanceof FirstClassPassengerCoach) {
						hasFirstClass = true;
					}
					if (firstSequenceEnded) {
						constraintViolated(train, "Train must not contain more than one sequence, of the same class of Passenger Coach");
					}
				} else {
					firstSequenceEnded = true;
					secondSequenceStarted = true;
					if (coach instanceof FirstClassPassengerCoach) {
						hasFirstClass = true;
					}
				}
			}
		}
		
		if (train instanceof IntercityTrain)
			return true;;
		if (!hasDiningCoach) {
			constraintViolated(train, "IntercityTrain must have a dining coach");
		}
		if (!hasFirstClass) {
			constraintViolated(train, "IntercityTrain must have a first class passenger coach");
		}
		return modelIsValid;
	}
	
	
	private boolean hasLocomotive(EList<Coach> coaches) {
		return coaches.get(0) instanceof Locomotive
				|| coaches.get(coaches.size() -1) instanceof Locomotive;
	}
	
	protected boolean validateDepot(Depot depot) {
		EList<Train> trains = depot.getTrains();
		
		return allTrainsHaveUniqueName(trains);
	}
	
	private boolean allTrainsHaveUniqueName(EList<Train> trains) {
		HashSet<String> names = new HashSet<String>();
		for (int i = 0; i < trains.size(); i++) {
			if (!names.add(trains.get(i).getName())) {
				return false;
			}
		}
		return true;
	}
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		modelIsValid = false;
		return false;
	}
}
