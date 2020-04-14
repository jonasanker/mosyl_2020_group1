/**
 */
package org.mdse.pts.depot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mdse.pts.depot.DepotPackage
 * @generated
 */
public interface DepotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DepotFactory eINSTANCE = org.mdse.pts.depot.impl.DepotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Depot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depot</em>'.
	 * @generated
	 */
	Depot createDepot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DepotPackage getDepotPackage();

} //DepotFactory
