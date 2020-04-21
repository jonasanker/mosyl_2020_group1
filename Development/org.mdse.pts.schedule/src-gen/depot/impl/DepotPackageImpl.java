/**
 */
package depot.impl;

import depot.Coach;
import depot.CoachWithId;
import depot.Depot;
import depot.DepotFactory;
import depot.DepotPackage;
import depot.DiningCoach;
import depot.IntercityTrain;
import depot.Locomotive;
import depot.PassengerClass;
import depot.PassengerCoach;
import depot.RegionalTrain;
import depot.Train;

import network.NetworkPackage;

import network.impl.NetworkPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepotPackageImpl extends EPackageImpl implements DepotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intercityTrainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalTrainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locomotiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coachWithIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerCoachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diningCoachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum passengerClassEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see depot.DepotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DepotPackageImpl() {
		super(eNS_URI, DepotFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DepotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DepotPackage init() {
		if (isInited) return (DepotPackage)EPackage.Registry.INSTANCE.getEPackage(DepotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDepotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DepotPackageImpl theDepotPackage = registeredDepotPackage instanceof DepotPackageImpl ? (DepotPackageImpl)registeredDepotPackage : new DepotPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(registeredPackage instanceof NetworkPackageImpl ? registeredPackage : NetworkPackage.eINSTANCE);

		// Create package meta-data objects
		theDepotPackage.createPackageContents();
		theNetworkPackage.createPackageContents();

		// Initialize created meta-data
		theDepotPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDepotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DepotPackage.eNS_URI, theDepotPackage);
		return theDepotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepot() {
		return depotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepot_Trains() {
		return (EReference)depotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrain() {
		return trainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrain_Name() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntercityTrain() {
		return intercityTrainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntercityTrain_Coaches() {
		return (EReference)intercityTrainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionalTrain() {
		return regionalTrainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegionalTrain_Coaches() {
		return (EReference)regionalTrainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoach() {
		return coachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocomotive() {
		return locomotiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoachWithId() {
		return coachWithIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoachWithId_Identifier() {
		return (EAttribute)coachWithIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassengerCoach() {
		return passengerCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPassengerCoach_PassengerClass() {
		return (EAttribute)passengerCoachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiningCoach() {
		return diningCoachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPassengerClass() {
		return passengerClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepotFactory getDepotFactory() {
		return (DepotFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		depotEClass = createEClass(DEPOT);
		createEReference(depotEClass, DEPOT__TRAINS);

		trainEClass = createEClass(TRAIN);
		createEAttribute(trainEClass, TRAIN__NAME);

		intercityTrainEClass = createEClass(INTERCITY_TRAIN);
		createEReference(intercityTrainEClass, INTERCITY_TRAIN__COACHES);

		regionalTrainEClass = createEClass(REGIONAL_TRAIN);
		createEReference(regionalTrainEClass, REGIONAL_TRAIN__COACHES);

		coachEClass = createEClass(COACH);

		locomotiveEClass = createEClass(LOCOMOTIVE);

		coachWithIdEClass = createEClass(COACH_WITH_ID);
		createEAttribute(coachWithIdEClass, COACH_WITH_ID__IDENTIFIER);

		passengerCoachEClass = createEClass(PASSENGER_COACH);
		createEAttribute(passengerCoachEClass, PASSENGER_COACH__PASSENGER_CLASS);

		diningCoachEClass = createEClass(DINING_COACH);

		// Create enums
		passengerClassEEnum = createEEnum(PASSENGER_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		intercityTrainEClass.getESuperTypes().add(this.getTrain());
		regionalTrainEClass.getESuperTypes().add(this.getTrain());
		locomotiveEClass.getESuperTypes().add(this.getCoach());
		coachWithIdEClass.getESuperTypes().add(this.getCoach());
		passengerCoachEClass.getESuperTypes().add(this.getCoachWithId());
		diningCoachEClass.getESuperTypes().add(this.getCoachWithId());

		// Initialize classes, features, and operations; add parameters
		initEClass(depotEClass, Depot.class, "Depot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepot_Trains(), this.getTrain(), null, "trains", null, 0, -1, Depot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainEClass, Train.class, "Train", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrain_Name(), ecorePackage.getEString(), "name", null, 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intercityTrainEClass, IntercityTrain.class, "IntercityTrain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntercityTrain_Coaches(), this.getCoach(), null, "coaches", null, 2, -1, IntercityTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalTrainEClass, RegionalTrain.class, "RegionalTrain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegionalTrain_Coaches(), this.getCoach(), null, "coaches", null, 1, -1, RegionalTrain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coachEClass, Coach.class, "Coach", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locomotiveEClass, Locomotive.class, "Locomotive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coachWithIdEClass, CoachWithId.class, "CoachWithId", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoachWithId_Identifier(), ecorePackage.getEInt(), "identifier", null, 0, 1, CoachWithId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passengerCoachEClass, PassengerCoach.class, "PassengerCoach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassengerCoach_PassengerClass(), this.getPassengerClass(), "passengerClass", null, 0, 1, PassengerCoach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diningCoachEClass, DiningCoach.class, "DiningCoach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(passengerClassEEnum, PassengerClass.class, "PassengerClass");
		addEEnumLiteral(passengerClassEEnum, PassengerClass.FIRST_CLASS);
		addEEnumLiteral(passengerClassEEnum, PassengerClass.SECOND_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DepotPackageImpl
