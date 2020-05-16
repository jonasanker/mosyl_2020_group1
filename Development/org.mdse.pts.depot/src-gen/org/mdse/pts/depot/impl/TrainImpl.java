/**
 */
package org.mdse.pts.depot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.pts.depot.Coach;
import org.mdse.pts.depot.DepotPackage;
import org.mdse.pts.depot.Train;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.pts.depot.impl.TrainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.pts.depot.impl.TrainImpl#getCoaches <em>Coaches</em>}</li>
 *   <li>{@link org.mdse.pts.depot.impl.TrainImpl#getTrainSpeed <em>Train Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TrainImpl extends MinimalEObjectImpl.Container implements Train {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoaches() <em>Coaches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoaches()
	 * @generated
	 * @ordered
	 */
	protected EList<Coach> coaches;

	/**
	 * The default value of the '{@link #getTrainSpeed() <em>Train Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrainSpeed() <em>Train Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSpeed()
	 * @generated
	 * @ordered
	 */
	protected int trainSpeed = TRAIN_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DepotPackage.Literals.TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DepotPackage.TRAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coach> getCoaches() {
		if (coaches == null) {
			coaches = new EObjectContainmentEList<Coach>(Coach.class, this, DepotPackage.TRAIN__COACHES);
		}
		return coaches;
	}

	/**
	 * {@inheritDoc}}
	 */
	@Override
	public abstract int getTrainSpeed();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setTrainSpeed(int newTrainSpeed) {
		int oldTrainSpeed = trainSpeed;
		trainSpeed = newTrainSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DepotPackage.TRAIN__TRAIN_SPEED, oldTrainSpeed, trainSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DepotPackage.TRAIN__COACHES:
				return ((InternalEList<?>)getCoaches()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DepotPackage.TRAIN__NAME:
				return getName();
			case DepotPackage.TRAIN__COACHES:
				return getCoaches();
			case DepotPackage.TRAIN__TRAIN_SPEED:
				return getTrainSpeed();
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
			case DepotPackage.TRAIN__NAME:
				setName((String)newValue);
				return;
			case DepotPackage.TRAIN__COACHES:
				getCoaches().clear();
				getCoaches().addAll((Collection<? extends Coach>)newValue);
				return;
			case DepotPackage.TRAIN__TRAIN_SPEED:
				setTrainSpeed((Integer)newValue);
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
			case DepotPackage.TRAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DepotPackage.TRAIN__COACHES:
				getCoaches().clear();
				return;
			case DepotPackage.TRAIN__TRAIN_SPEED:
				setTrainSpeed(TRAIN_SPEED_EDEFAULT);
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
			case DepotPackage.TRAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DepotPackage.TRAIN__COACHES:
				return coaches != null && !coaches.isEmpty();
			case DepotPackage.TRAIN__TRAIN_SPEED:
				return trainSpeed != TRAIN_SPEED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", trainSpeed: ");
		result.append(trainSpeed);
		result.append(')');
		return result.toString();
	}

} //TrainImpl
