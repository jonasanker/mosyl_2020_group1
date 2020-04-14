/**
 */
package org.mdse.pts.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.network.Leg#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.pts.network.Leg#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.mdse.pts.network.Leg#getStations <em>Stations</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.network.NetworkPackage#getLeg()
 * @model
 * @generated
 */
public interface Leg extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.pts.network.NetworkPackage#getLeg_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Leg#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(Integer)
	 * @see org.mdse.pts.network.NetworkPackage#getLeg_Distance()
	 * @model required="true"
	 * @generated
	 */
	Integer getDistance();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Leg#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Integer value);

	/**
	 * Returns the value of the '<em><b>Stations</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.pts.network.Station}.
	 * It is bidirectional and its opposite is '{@link org.mdse.pts.network.Station#getLegs <em>Legs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stations</em>' reference list.
	 * @see org.mdse.pts.network.NetworkPackage#getLeg_Stations()
	 * @see org.mdse.pts.network.Station#getLegs
	 * @model opposite="legs" lower="2" upper="2"
	 * @generated
	 */
	EList<Station> getStations();

} // Leg
