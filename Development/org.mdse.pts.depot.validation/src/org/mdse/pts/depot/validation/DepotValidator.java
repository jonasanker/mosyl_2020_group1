package org.mdse.pts.depot.validation;

import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;

import org.mdse.pts.depot.*;

public class DepotValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(DepotPackage.eINSTANCE, new DepotValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}
	
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);
		
		this.diagnostics = diagnostics;
		if (DepotPackage.eINSTANCE.getDepot().equals(eClass)) {
			modelIsValid &= validateDepot((Depot)eObject);
		} else if (DepotPackage.eINSTANCE.getTrain().equals(eClass)
				|| DepotPackage.eINSTANCE.getIntercityTrain().equals(eClass)
				|| DepotPackage.eINSTANCE.getRegionalTrain().equals(eClass)) {
			modelIsValid &= validateTrain((Train)eObject);
		}
		
		return modelIsValid;
	}
	
	protected boolean validateIntercityTrain(IntercityTrain train) {
		return validateTrain(train);
	}
	
	protected boolean validateRegionalTrain(RegionalTrain train) {
		return validateTrain(train);
	}
	
	protected boolean validateTrain(Train train) {
		boolean modelIsValid = true;
		EList<Coach> coaches = train.getCoaches();
		
		boolean hasDiningCoach = false;
		boolean firstSequenceEnded = false;
		boolean secondSequenceStarted = false;
		boolean hasFirstClass = false;
		HashSet<Integer> names = new HashSet<Integer>();
		
		if (!hasLocomotive(coaches)) modelIsValid &= constraintViolated(train, train, "Train must have a Locomotive at one of its ends.");
		if (coaches.size() < 1) return constraintViolated(train, train, "Trains must have at least 1 coach");
		if (coaches.size() == 1) return modelIsValid;
		
		Class<? extends Coach> firstType = null, secondType = null;
		for (int j = 0; j < coaches.size() && firstType == null; j++) {
			if (coaches.get(j) instanceof FirstClassPassengerCoach) {
				firstType = FirstClassPassengerCoach.class;
				secondType = SecondClassPassengerCoach.class;
			}
			else if (coaches.get(j) instanceof SecondClassPassengerCoach) {
				firstType = SecondClassPassengerCoach.class;
				secondType = FirstClassPassengerCoach.class;
			}
		}
		
		for (int i = 0; i < coaches.size(); i++) {
			Coach coach = coaches.get(i);
			if (coach instanceof CoachWithId && !names.add(((CoachWithId)coach).getIdentifier())) {
				modelIsValid = constraintViolated(train, coach, "Coach ids must be unique within a train.");
			}
			
			if (coach instanceof DiningCoach) {
				if (hasDiningCoach) {
					modelIsValid = constraintViolated(train, coach, "Train must have only 1 DiningCoach.");
				} if (firstSequenceEnded && secondSequenceStarted) {
					modelIsValid = constraintViolated(train, coach, "Trains Dining Coach must be placed between First and Second Class Coaches.");
				}
				hasDiningCoach = true;
			} else if (coach instanceof Locomotive && i != coaches.size() -1 && i != 0) {
				modelIsValid = constraintViolated(train, coach, "Train can only have a Locomotive at the front or end.");
			} else if (firstType != null && firstType.isAssignableFrom(coach.getClass()) && firstSequenceEnded) {
				modelIsValid = constraintViolated(train, coach, "Train must not contain more than one sequence, of the same class of Passenger Coach");
			} else if (secondType != null && secondType.isAssignableFrom(coach.getClass())){
				firstSequenceEnded = secondSequenceStarted = true;
			}
			
			if (coach instanceof FirstClassPassengerCoach) {
				hasFirstClass = true;
			}
		}
		
		if (train instanceof RegionalTrain) {
			return modelIsValid;
		} if (!hasDiningCoach) {
			modelIsValid = constraintViolated(train, train, "IntercityTrain must have a dining coach");
		} if (!hasFirstClass) {
			modelIsValid = constraintViolated(train, train, "IntercityTrain must have a first class passenger coach");
		}
		return modelIsValid;
	}
	
	
	private boolean hasLocomotive(EList<Coach> coaches) {
		return coaches.size() > 0 
			&& (coaches.get(0) instanceof Locomotive
			|| coaches.get(coaches.size() -1) instanceof Locomotive);
	}
	
	protected boolean validateDepot(Depot depot) {
		boolean modelIsValid = true;
		EList<Train> trains = depot.getTrains();
		
		return modelIsValid && allTrainsHaveUniqueName(trains);
	}
	
	private boolean allTrainsHaveUniqueName(EList<Train> trains) {
		boolean modelIsValid = true;
		HashSet<String> names = new HashSet<String>();
		
		for (int i = 0; i < trains.size(); i++) {
			if (!names.add(trains.get(i).getName())) {
				modelIsValid &= constraintViolated(trains.get(i), trains.get(i), "Train names must be unique");
			}
		}
		
		return modelIsValid;
	}
	
	protected boolean constraintViolated(Train train, EObject errorObj, String message) {
		return constraintViolated((EObject)errorObj, train.getName() + ": " + message);
	}
	
	//Utility method from MiniSql Exercise about static semantics
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
}
