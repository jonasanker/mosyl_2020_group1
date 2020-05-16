/**
 */
package org.mdse.pts.depot.impl;

import org.eclipse.emf.ecore.EClass;

import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.RegionalTrain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regional Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RegionalTrainImpl extends TrainImpl implements RegionalTrain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionalTrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DepotPackage.Literals.REGIONAL_TRAIN;
	}
	
	@Override
	public int getTrainSpeed() {
		return 80;
	}

} //RegionalTrainImpl
