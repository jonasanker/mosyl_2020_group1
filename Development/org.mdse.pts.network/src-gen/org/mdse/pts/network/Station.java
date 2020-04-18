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
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonEmptyLegNamesMustBeUnique legMustHaveANameIfMoreThanOneLegBetweenTwoStations'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nonEmptyLegNamesMustBeUnique='\n\t\t\tlegs -&gt; forAll(l1 |\n\t\t\t\t\tlegs -&gt; forAll(l2 |\n\t\t\t\t\t\tl1 &lt;&gt; l2 implies l1.name &lt;&gt; l2.name))' legMustHaveANameIfMoreThanOneLegBetweenTwoStations='\n\t\t\tlegs -&gt; forAll(l1 |\n\t\t\t\t\tlegs -&gt; forAll(l2 |\n\t\t\t\t\t\tl1 &lt;&gt; l2 \n\t\t\t\t\t\tand\n\t\t\t\t\t\tl1.station1 = l2.station1 and l1.station2 = l2.station2\n\t\t\t\t\t\tor \n\t\t\t\t\t\tl1.station1 = l2.station2 and l1.station2 = l2.station1\n\t\t\t\t\t\timplies\n\t\t\t\t\t\tl1.name.size() &gt; 0 and l2.name.size() &gt; 0\n\t\t\t\t\t)\n\t\t\t\t)'"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legs</em>' reference list.
	 * @see org.mdse.pts.network.NetworkPackage#getStation_Legs()
	 * @model
	 * @generated
	 */
	EList<Leg> getLegs();

} // Station
