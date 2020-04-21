/**
 */
package depot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regional Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link depot.RegionalTrain#getCoaches <em>Coaches</em>}</li>
 * </ul>
 *
 * @see depot.DepotPackage#getRegionalTrain()
 * @model
 * @generated
 */
public interface RegionalTrain extends Train {
	/**
	 * Returns the value of the '<em><b>Coaches</b></em>' reference list.
	 * The list contents are of type {@link depot.Coach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coaches</em>' reference list.
	 * @see depot.DepotPackage#getRegionalTrain_Coaches()
	 * @model required="true"
	 * @generated
	 */
	EList<Coach> getCoaches();

} // RegionalTrain
