/**
 */
package depot.impl;

import depot.Coach;
import depot.DepotPackage;
import depot.IntercityTrain;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercity Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link depot.impl.IntercityTrainImpl#getCoaches <em>Coaches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntercityTrainImpl extends TrainImpl implements IntercityTrain {
	/**
	 * The cached value of the '{@link #getCoaches() <em>Coaches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoaches()
	 * @generated
	 * @ordered
	 */
	protected EList<Coach> coaches;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coach> getCoaches() {
		if (coaches == null) {
			coaches = new EObjectResolvingEList<Coach>(Coach.class, this, DepotPackage.INTERCITY_TRAIN__COACHES);
		}
		return coaches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DepotPackage.INTERCITY_TRAIN__COACHES:
				return getCoaches();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DepotPackage.INTERCITY_TRAIN__COACHES:
				getCoaches().clear();
				getCoaches().addAll((Collection<? extends Coach>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DepotPackage.INTERCITY_TRAIN__COACHES:
				getCoaches().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DepotPackage.INTERCITY_TRAIN__COACHES:
				return coaches != null && !coaches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntercityTrainImpl
