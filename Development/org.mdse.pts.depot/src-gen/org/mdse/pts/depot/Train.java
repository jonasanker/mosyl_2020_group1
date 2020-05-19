/**
 */
package org.mdse.pts.depot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.depot.Train#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.pts.depot.Train#getCoaches <em>Coaches</em>}</li>
 *   <li>{@link org.mdse.pts.depot.Train#getTrainSpeed <em>Train Speed</em>}</li>
 * </ul>
 *
 * @see org.mdse.pts.depot.DepotPackage#getTrain()
 * @model abstract="true"
 * @generated
 */
public interface Train extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.pts.depot.DepotPackage#getTrain_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.pts.depot.Train#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Coaches</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.pts.depot.Coach}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coaches</em>' containment reference list.
	 * @see org.mdse.pts.depot.DepotPackage#getTrain_Coaches()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Coach> getCoaches();

	/**
	 * Returns the value of the '<em><b>Train Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * Get the Speed of the Train
	 * - Regional train, average 80 kph
	 * - Intercity train, average 150 kph
	 * - Intercity train with >= 8 coaches, average 130 kph
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Speed</em>' attribute.
	 * @see #setTrainSpeed(int)
	 * @see org.mdse.pts.depot.DepotPackage#getTrain_TrainSpeed()
	 * @model required="true" derived="true"
	 */
	int getTrainSpeed();

	/**
	 * Sets the value of the '{@link org.mdse.pts.depot.Train#getTrainSpeed <em>Train Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Manually set else auto calculated train speed
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Speed</em>' attribute.
	 * @see #getTrainSpeed()
	 */
	void setTrainSpeed(int value);

} // Train
