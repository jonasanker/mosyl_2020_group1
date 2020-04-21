/**
 */
package depot.impl;

import depot.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepotFactoryImpl extends EFactoryImpl implements DepotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DepotFactory init() {
		try {
			DepotFactory theDepotFactory = (DepotFactory)EPackage.Registry.INSTANCE.getEFactory(DepotPackage.eNS_URI);
			if (theDepotFactory != null) {
				return theDepotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DepotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DepotPackage.DEPOT: return createDepot();
			case DepotPackage.INTERCITY_TRAIN: return createIntercityTrain();
			case DepotPackage.REGIONAL_TRAIN: return createRegionalTrain();
			case DepotPackage.LOCOMOTIVE: return createLocomotive();
			case DepotPackage.PASSENGER_COACH: return createPassengerCoach();
			case DepotPackage.DINING_COACH: return createDiningCoach();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DepotPackage.PASSENGER_CLASS:
				return createPassengerClassFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DepotPackage.PASSENGER_CLASS:
				return convertPassengerClassToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Depot createDepot() {
		DepotImpl depot = new DepotImpl();
		return depot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntercityTrain createIntercityTrain() {
		IntercityTrainImpl intercityTrain = new IntercityTrainImpl();
		return intercityTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionalTrain createRegionalTrain() {
		RegionalTrainImpl regionalTrain = new RegionalTrainImpl();
		return regionalTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Locomotive createLocomotive() {
		LocomotiveImpl locomotive = new LocomotiveImpl();
		return locomotive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerCoach createPassengerCoach() {
		PassengerCoachImpl passengerCoach = new PassengerCoachImpl();
		return passengerCoach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiningCoach createDiningCoach() {
		DiningCoachImpl diningCoach = new DiningCoachImpl();
		return diningCoach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassengerClass createPassengerClassFromString(EDataType eDataType, String initialValue) {
		PassengerClass result = PassengerClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassengerClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepotPackage getDepotPackage() {
		return (DepotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DepotPackage getPackage() {
		return DepotPackage.eINSTANCE;
	}

} //DepotFactoryImpl
