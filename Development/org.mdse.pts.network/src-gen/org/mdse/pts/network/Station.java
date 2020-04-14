/**
 */
package org.mdse.pts.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.network.Station#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.pts.network.Station#getLegs <em>Legs</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.network.NetworkPackage#getStation()
 * @model
 * @generated
 */
public interface Station extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.pts.network.NetworkPackage#getStation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Station#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Legs</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.pts.network.Leg}.
	 * It is bidirectional and its opposite is '{@link org.mdse.pts.network.Leg#getStations <em>Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legs</em>' reference list.
	 * @see org.mdse.pts.network.NetworkPackage#getStation_Legs()
	 * @see org.mdse.pts.network.Leg#getStations
	 * @model opposite="stations"
	 * @generated
	 */
	EList<Leg> getLegs();

} // Station
