/**
 */
package depot.util;

import depot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see depot.DepotPackage
 * @generated
 */
public class DepotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DepotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DepotPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepotSwitch<Adapter> modelSwitch =
		new DepotSwitch<Adapter>() {
			@Override
			public Adapter caseDepot(Depot object) {
				return createDepotAdapter();
			}
			@Override
			public Adapter caseTrain(Train object) {
				return createTrainAdapter();
			}
			@Override
			public Adapter caseIntercityTrain(IntercityTrain object) {
				return createIntercityTrainAdapter();
			}
			@Override
			public Adapter caseRegionalTrain(RegionalTrain object) {
				return createRegionalTrainAdapter();
			}
			@Override
			public Adapter caseCoach(Coach object) {
				return createCoachAdapter();
			}
			@Override
			public Adapter caseLocomotive(Locomotive object) {
				return createLocomotiveAdapter();
			}
			@Override
			public Adapter caseCoachWithId(CoachWithId object) {
				return createCoachWithIdAdapter();
			}
			@Override
			public Adapter casePassengerCoach(PassengerCoach object) {
				return createPassengerCoachAdapter();
			}
			@Override
			public Adapter caseDiningCoach(DiningCoach object) {
				return createDiningCoachAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link depot.Depot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see depot.Depot
	 * @generated
	 */
	public Adapter createDepotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link depot.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see depot.Train
	 * @generated
	 */
	public Adapter createTrainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link depot.IntercityTrain <em>Intercity Train</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see depot.IntercityTrain
	 * @generated
	 */
	public Adapter createIntercityTrainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link depot.RegionalTrain <em>Regional Train</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see depot.RegionalTrain
	 * @generated
	 */
	public Adapter createRegionalTrainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link depot.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see depot.Coach
	 * @generated
	 */
	public Adapter createCoachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link depot.Locomotive <em>Locomotive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see depot.Locomotive
	 * @generated
	 */
	public Adapter createLocomotiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link depot.CoachWithId <em>Coach With Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see depot.CoachWithId
	 * @generated
	 */
	public Adapter createCoachWithIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link depot.PassengerCoach <em>Passenger Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see depot.PassengerCoach
	 * @generated
	 */
	public Adapter createPassengerCoachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link depot.DiningCoach <em>Dining Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see depot.DiningCoach
	 * @generated
	 */
	public Adapter createDiningCoachAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DepotAdapterFactory
