/**
 */
package org.mdse.gt.stationplan;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mdse.gt.stationplan.StationplanPackage
 * @generated
 */
public interface StationplanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationplanFactory eINSTANCE = org.mdse.gt.stationplan.impl.StationplanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Station Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station Plan</em>'.
	 * @generated
	 */
	StationPlan createStationPlan();

	/**
	 * Returns a new object of class '<em>Train Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Train Station</em>'.
	 * @generated
	 */
	TrainStation createTrainStation();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StationplanPackage getStationplanPackage();

} //StationplanFactory
