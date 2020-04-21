/**
 */
package network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link network.Network#getName <em>Name</em>}</li>
 *   <li>{@link network.Network#getStations <em>Stations</em>}</li>
 *   <li>{@link network.Network#getLegs <em>Legs</em>}</li>
 * </ul>
 *
 * @see network.NetworkPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see network.NetworkPackage#getNetwork_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link network.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' containment reference list.
	 * The list contents are of type {@link network.Station}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' containment reference list.
	 * @see network.NetworkPackage#getNetwork_Stations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Station> getStations();

	/**
	 * Returns the value of the '<em><b>Legs</b></em>' containment reference list.
	 * The list contents are of type {@link network.Leg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legs</em>' containment reference list.
	 * @see network.NetworkPackage#getNetwork_Legs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Leg> getLegs();

} // Network
