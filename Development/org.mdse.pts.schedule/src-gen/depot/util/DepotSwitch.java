/**
 */
package depot.util;

import depot.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see depot.DepotPackage
 * @generated
 */
public class DepotSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DepotPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepotSwitch() {
		if (modelPackage == null) {
			modelPackage = DepotPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DepotPackage.DEPOT: {
				Depot depot = (Depot)theEObject;
				T result = caseDepot(depot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DepotPackage.TRAIN: {
				Train train = (Train)theEObject;
				T result = caseTrain(train);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DepotPackage.INTERCITY_TRAIN: {
				IntercityTrain intercityTrain = (IntercityTrain)theEObject;
				T result = caseIntercityTrain(intercityTrain);
				if (result == null) result = caseTrain(intercityTrain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DepotPackage.REGIONAL_TRAIN: {
				RegionalTrain regionalTrain = (RegionalTrain)theEObject;
				T result = caseRegionalTrain(regionalTrain);
				if (result == null) result = caseTrain(regionalTrain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DepotPackage.COACH: {
				Coach coach = (Coach)theEObject;
				T result = caseCoach(coach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DepotPackage.LOCOMOTIVE: {
				Locomotive locomotive = (Locomotive)theEObject;
				T result = caseLocomotive(locomotive);
				if (result == null) result = caseCoach(locomotive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DepotPackage.COACH_WITH_ID: {
				CoachWithId coachWithId = (CoachWithId)theEObject;
				T result = caseCoachWithId(coachWithId);
				if (result == null) result = caseCoach(coachWithId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DepotPackage.PASSENGER_COACH: {
				PassengerCoach passengerCoach = (PassengerCoach)theEObject;
				T result = casePassengerCoach(passengerCoach);
				if (result == null) result = caseCoachWithId(passengerCoach);
				if (result == null) result = caseCoach(passengerCoach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DepotPackage.DINING_COACH: {
				DiningCoach diningCoach = (DiningCoach)theEObject;
				T result = caseDiningCoach(diningCoach);
				if (result == null) result = caseCoachWithId(diningCoach);
				if (result == null) result = caseCoach(diningCoach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepot(Depot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Train</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Train</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrain(Train object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intercity Train</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intercity Train</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntercityTrain(IntercityTrain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Train</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Train</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalTrain(RegionalTrain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoach(Coach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locomotive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locomotive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocomotive(Locomotive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coach With Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coach With Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoachWithId(CoachWithId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Coach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Coach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerCoach(PassengerCoach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dining Coach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dining Coach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiningCoach(DiningCoach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DepotSwitch
