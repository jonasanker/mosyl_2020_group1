/**
 */
package depot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see depot.DepotFactory
 * @model kind="package"
 * @generated
 */
public interface DepotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "depot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/pts/depot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "depot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DepotPackage eINSTANCE = depot.impl.DepotPackageImpl.init();

	/**
	 * The meta object id for the '{@link depot.impl.DepotImpl <em>Depot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.impl.DepotImpl
	 * @see depot.impl.DepotPackageImpl#getDepot()
	 * @generated
	 */
	int DEPOT = 0;

	/**
	 * The feature id for the '<em><b>Trains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT__TRAINS = 0;

	/**
	 * The number of structural features of the '<em>Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Depot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link depot.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.impl.TrainImpl
	 * @see depot.impl.DepotPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link depot.impl.IntercityTrainImpl <em>Intercity Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.impl.IntercityTrainImpl
	 * @see depot.impl.DepotPackageImpl#getIntercityTrain()
	 * @generated
	 */
	int INTERCITY_TRAIN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TRAIN__NAME = TRAIN__NAME;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TRAIN__COACHES = TRAIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intercity Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TRAIN_FEATURE_COUNT = TRAIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Intercity Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCITY_TRAIN_OPERATION_COUNT = TRAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link depot.impl.RegionalTrainImpl <em>Regional Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.impl.RegionalTrainImpl
	 * @see depot.impl.DepotPackageImpl#getRegionalTrain()
	 * @generated
	 */
	int REGIONAL_TRAIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_TRAIN__NAME = TRAIN__NAME;

	/**
	 * The feature id for the '<em><b>Coaches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_TRAIN__COACHES = TRAIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Regional Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_TRAIN_FEATURE_COUNT = TRAIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Regional Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGIONAL_TRAIN_OPERATION_COUNT = TRAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link depot.impl.CoachImpl <em>Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.impl.CoachImpl
	 * @see depot.impl.DepotPackageImpl#getCoach()
	 * @generated
	 */
	int COACH = 4;

	/**
	 * The number of structural features of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link depot.impl.LocomotiveImpl <em>Locomotive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.impl.LocomotiveImpl
	 * @see depot.impl.DepotPackageImpl#getLocomotive()
	 * @generated
	 */
	int LOCOMOTIVE = 5;

	/**
	 * The number of structural features of the '<em>Locomotive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE_FEATURE_COUNT = COACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Locomotive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCOMOTIVE_OPERATION_COUNT = COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link depot.impl.CoachWithIdImpl <em>Coach With Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.impl.CoachWithIdImpl
	 * @see depot.impl.DepotPackageImpl#getCoachWithId()
	 * @generated
	 */
	int COACH_WITH_ID = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_WITH_ID__IDENTIFIER = COACH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coach With Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_WITH_ID_FEATURE_COUNT = COACH_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coach With Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_WITH_ID_OPERATION_COUNT = COACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link depot.impl.PassengerCoachImpl <em>Passenger Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.impl.PassengerCoachImpl
	 * @see depot.impl.DepotPackageImpl#getPassengerCoach()
	 * @generated
	 */
	int PASSENGER_COACH = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH__IDENTIFIER = COACH_WITH_ID__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Passenger Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH__PASSENGER_CLASS = COACH_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH_FEATURE_COUNT = COACH_WITH_ID_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Passenger Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_COACH_OPERATION_COUNT = COACH_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link depot.impl.DiningCoachImpl <em>Dining Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.impl.DiningCoachImpl
	 * @see depot.impl.DepotPackageImpl#getDiningCoach()
	 * @generated
	 */
	int DINING_COACH = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH__IDENTIFIER = COACH_WITH_ID__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Dining Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH_FEATURE_COUNT = COACH_WITH_ID_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dining Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DINING_COACH_OPERATION_COUNT = COACH_WITH_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link depot.PassengerClass <em>Passenger Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see depot.PassengerClass
	 * @see depot.impl.DepotPackageImpl#getPassengerClass()
	 * @generated
	 */
	int PASSENGER_CLASS = 9;


	/**
	 * Returns the meta object for class '{@link depot.Depot <em>Depot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depot</em>'.
	 * @see depot.Depot
	 * @generated
	 */
	EClass getDepot();

	/**
	 * Returns the meta object for the reference list '{@link depot.Depot#getTrains <em>Trains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trains</em>'.
	 * @see depot.Depot#getTrains()
	 * @see #getDepot()
	 * @generated
	 */
	EReference getDepot_Trains();

	/**
	 * Returns the meta object for class '{@link depot.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see depot.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the attribute '{@link depot.Train#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see depot.Train#getName()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Name();

	/**
	 * Returns the meta object for class '{@link depot.IntercityTrain <em>Intercity Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intercity Train</em>'.
	 * @see depot.IntercityTrain
	 * @generated
	 */
	EClass getIntercityTrain();

	/**
	 * Returns the meta object for the reference list '{@link depot.IntercityTrain#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coaches</em>'.
	 * @see depot.IntercityTrain#getCoaches()
	 * @see #getIntercityTrain()
	 * @generated
	 */
	EReference getIntercityTrain_Coaches();

	/**
	 * Returns the meta object for class '{@link depot.RegionalTrain <em>Regional Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regional Train</em>'.
	 * @see depot.RegionalTrain
	 * @generated
	 */
	EClass getRegionalTrain();

	/**
	 * Returns the meta object for the reference list '{@link depot.RegionalTrain#getCoaches <em>Coaches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Coaches</em>'.
	 * @see depot.RegionalTrain#getCoaches()
	 * @see #getRegionalTrain()
	 * @generated
	 */
	EReference getRegionalTrain_Coaches();

	/**
	 * Returns the meta object for class '{@link depot.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach</em>'.
	 * @see depot.Coach
	 * @generated
	 */
	EClass getCoach();

	/**
	 * Returns the meta object for class '{@link depot.Locomotive <em>Locomotive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locomotive</em>'.
	 * @see depot.Locomotive
	 * @generated
	 */
	EClass getLocomotive();

	/**
	 * Returns the meta object for class '{@link depot.CoachWithId <em>Coach With Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach With Id</em>'.
	 * @see depot.CoachWithId
	 * @generated
	 */
	EClass getCoachWithId();

	/**
	 * Returns the meta object for the attribute '{@link depot.CoachWithId#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see depot.CoachWithId#getIdentifier()
	 * @see #getCoachWithId()
	 * @generated
	 */
	EAttribute getCoachWithId_Identifier();

	/**
	 * Returns the meta object for class '{@link depot.PassengerCoach <em>Passenger Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Coach</em>'.
	 * @see depot.PassengerCoach
	 * @generated
	 */
	EClass getPassengerCoach();

	/**
	 * Returns the meta object for the attribute '{@link depot.PassengerCoach#getPassengerClass <em>Passenger Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Class</em>'.
	 * @see depot.PassengerCoach#getPassengerClass()
	 * @see #getPassengerCoach()
	 * @generated
	 */
	EAttribute getPassengerCoach_PassengerClass();

	/**
	 * Returns the meta object for class '{@link depot.DiningCoach <em>Dining Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dining Coach</em>'.
	 * @see depot.DiningCoach
	 * @generated
	 */
	EClass getDiningCoach();

	/**
	 * Returns the meta object for enum '{@link depot.PassengerClass <em>Passenger Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Passenger Class</em>'.
	 * @see depot.PassengerClass
	 * @generated
	 */
	EEnum getPassengerClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DepotFactory getDepotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link depot.impl.DepotImpl <em>Depot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.impl.DepotImpl
		 * @see depot.impl.DepotPackageImpl#getDepot()
		 * @generated
		 */
		EClass DEPOT = eINSTANCE.getDepot();

		/**
		 * The meta object literal for the '<em><b>Trains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPOT__TRAINS = eINSTANCE.getDepot_Trains();

		/**
		 * The meta object literal for the '{@link depot.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.impl.TrainImpl
		 * @see depot.impl.DepotPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__NAME = eINSTANCE.getTrain_Name();

		/**
		 * The meta object literal for the '{@link depot.impl.IntercityTrainImpl <em>Intercity Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.impl.IntercityTrainImpl
		 * @see depot.impl.DepotPackageImpl#getIntercityTrain()
		 * @generated
		 */
		EClass INTERCITY_TRAIN = eINSTANCE.getIntercityTrain();

		/**
		 * The meta object literal for the '<em><b>Coaches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCITY_TRAIN__COACHES = eINSTANCE.getIntercityTrain_Coaches();

		/**
		 * The meta object literal for the '{@link depot.impl.RegionalTrainImpl <em>Regional Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.impl.RegionalTrainImpl
		 * @see depot.impl.DepotPackageImpl#getRegionalTrain()
		 * @generated
		 */
		EClass REGIONAL_TRAIN = eINSTANCE.getRegionalTrain();

		/**
		 * The meta object literal for the '<em><b>Coaches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGIONAL_TRAIN__COACHES = eINSTANCE.getRegionalTrain_Coaches();

		/**
		 * The meta object literal for the '{@link depot.impl.CoachImpl <em>Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.impl.CoachImpl
		 * @see depot.impl.DepotPackageImpl#getCoach()
		 * @generated
		 */
		EClass COACH = eINSTANCE.getCoach();

		/**
		 * The meta object literal for the '{@link depot.impl.LocomotiveImpl <em>Locomotive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.impl.LocomotiveImpl
		 * @see depot.impl.DepotPackageImpl#getLocomotive()
		 * @generated
		 */
		EClass LOCOMOTIVE = eINSTANCE.getLocomotive();

		/**
		 * The meta object literal for the '{@link depot.impl.CoachWithIdImpl <em>Coach With Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.impl.CoachWithIdImpl
		 * @see depot.impl.DepotPackageImpl#getCoachWithId()
		 * @generated
		 */
		EClass COACH_WITH_ID = eINSTANCE.getCoachWithId();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COACH_WITH_ID__IDENTIFIER = eINSTANCE.getCoachWithId_Identifier();

		/**
		 * The meta object literal for the '{@link depot.impl.PassengerCoachImpl <em>Passenger Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.impl.PassengerCoachImpl
		 * @see depot.impl.DepotPackageImpl#getPassengerCoach()
		 * @generated
		 */
		EClass PASSENGER_COACH = eINSTANCE.getPassengerCoach();

		/**
		 * The meta object literal for the '<em><b>Passenger Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_COACH__PASSENGER_CLASS = eINSTANCE.getPassengerCoach_PassengerClass();

		/**
		 * The meta object literal for the '{@link depot.impl.DiningCoachImpl <em>Dining Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.impl.DiningCoachImpl
		 * @see depot.impl.DepotPackageImpl#getDiningCoach()
		 * @generated
		 */
		EClass DINING_COACH = eINSTANCE.getDiningCoach();

		/**
		 * The meta object literal for the '{@link depot.PassengerClass <em>Passenger Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see depot.PassengerClass
		 * @see depot.impl.DepotPackageImpl#getPassengerClass()
		 * @generated
		 */
		EEnum PASSENGER_CLASS = eINSTANCE.getPassengerClass();

	}

} //DepotPackage
