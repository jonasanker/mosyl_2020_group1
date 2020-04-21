/**
 */
package network.util;

import java.util.Map;

import network.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see network.NetworkPackage
 * @generated
 */
public class NetworkValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final NetworkValidator INSTANCE = new NetworkValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "network";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return NetworkPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case NetworkPackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case NetworkPackage.STATION:
				return validateStation((Station)value, diagnostics, context);
			case NetworkPackage.LEG:
				return validateLeg((Leg)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(network, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(station, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(station, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_nonEmptyLegNamesMustBeUnique(station, diagnostics, context);
		if (result || diagnostics != null) result &= validateStation_legMustHaveANameIfMoreThanOneLegBetweenTwoStations(station, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonEmptyLegNamesMustBeUnique constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATION__NON_EMPTY_LEG_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "\n" +
		"\t\t\tlegs -> forAll(l1 |\n" +
		"\t\t\t\t\tlegs -> forAll(l2 |\n" +
		"\t\t\t\t\t\tl1 <> l2 implies l1.name <> l2.name))";

	/**
	 * Validates the nonEmptyLegNamesMustBeUnique constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_nonEmptyLegNamesMustBeUnique(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NetworkPackage.Literals.STATION,
				 station,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nonEmptyLegNamesMustBeUnique",
				 STATION__NON_EMPTY_LEG_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the legMustHaveANameIfMoreThanOneLegBetweenTwoStations constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATION__LEG_MUST_HAVE_ANAME_IF_MORE_THAN_ONE_LEG_BETWEEN_TWO_STATIONS__EEXPRESSION = "\n" +
		"\t\t\tlegs -> forAll(l1 |\n" +
		"\t\t\t\t\tlegs -> forAll(l2 |\n" +
		"\t\t\t\t\t\tl1 <> l2 \n" +
		"\t\t\t\t\t\tand\n" +
		"\t\t\t\t\t\tl1.station1 = l2.station1 and l1.station2 = l2.station2\n" +
		"\t\t\t\t\t\tor \n" +
		"\t\t\t\t\t\tl1.station1 = l2.station2 and l1.station2 = l2.station1\n" +
		"\t\t\t\t\t\timplies\n" +
		"\t\t\t\t\t\tl1.name.size() > 0 and l2.name.size() > 0\n" +
		"\t\t\t\t\t)\n" +
		"\t\t\t\t)";

	/**
	 * Validates the legMustHaveANameIfMoreThanOneLegBetweenTwoStations constraint of '<em>Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStation_legMustHaveANameIfMoreThanOneLegBetweenTwoStations(Station station, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(NetworkPackage.Literals.STATION,
				 station,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "legMustHaveANameIfMoreThanOneLegBetweenTwoStations",
				 STATION__LEG_MUST_HAVE_ANAME_IF_MORE_THAN_ONE_LEG_BETWEEN_TWO_STATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeg(Leg leg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leg, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //NetworkValidator
