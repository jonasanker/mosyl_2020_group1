/**
 */
package org.mdse.pts.network;

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
 *   <li>{@link org.mdse.pts.network.Leg#getStation1 <em>Station1</em>}</li>
 *   <li>{@link org.mdse.pts.network.Leg#getStation2 <em>Station2</em>}</li>
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
	 * Returns the value of the '<em><b>Station1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station1</em>' reference.
	 * @see #setStation1(Station)
	 * @see org.mdse.pts.network.NetworkPackage#getLeg_Station1()
	 * @model required="true"
	 * @generated
	 */
	Station getStation1();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Leg#getStation1 <em>Station1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station1</em>' reference.
	 * @see #getStation1()
	 * @generated
	 */
	void setStation1(Station value);

	/**
	 * Returns the value of the '<em><b>Station2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station2</em>' reference.
	 * @see #setStation2(Station)
	 * @see org.mdse.pts.network.NetworkPackage#getLeg_Station2()
	 * @model required="true"
	 * @generated
	 */
	Station getStation2();

	/**
	 * Sets the value of the '{@link org.mdse.pts.network.Leg#getStation2 <em>Station2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station2</em>' reference.
	 * @see #getStation2()
	 * @generated
	 */
	void setStation2(Station value);

} // Leg
