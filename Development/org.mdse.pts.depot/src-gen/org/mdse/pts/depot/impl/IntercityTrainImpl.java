/**
 */
package org.mdse.pts.depot.impl;

import org.eclipse.emf.ecore.EClass;

import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.IntercityTrain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercity Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class IntercityTrainImpl extends TrainImpl implements IntercityTrain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercityTrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DepotPackage.Literals.INTERCITY_TRAIN;
	}
	
	@Override
	public int getTrainSpeed() {
		if (coaches.size() >= 8) {
			return 130;
		} else {
			return 150;
		}
	}

} //IntercityTrainImpl
