/**
 */
package org.mdse.gt.stationplan.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.mdse.gt.stationplan.Connection;
import org.mdse.gt.stationplan.StationplanPackage;
import org.mdse.gt.stationplan.TrainStation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.gt.stationplan.impl.ConnectionImpl#getDistanceInMeters <em>Distance In Meters</em>}</li>
 *   <li>{@link org.mdse.gt.stationplan.impl.ConnectionImpl#getTargetStation <em>Target Station</em>}</li>
 *   <li>{@link org.mdse.gt.stationplan.impl.ConnectionImpl#getSourceStation <em>Source Station</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends IdentifiableImpl implements Connection {
	/**
	 * The default value of the '{@link #getDistanceInMeters() <em>Distance In Meters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceInMeters()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISTANCE_IN_METERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistanceInMeters() <em>Distance In Meters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceInMeters()
	 * @generated
	 * @ordered
	 */
	protected Integer distanceInMeters = DISTANCE_IN_METERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetStation() <em>Target Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetStation()
	 * @generated
	 * @ordered
	 */
	protected TrainStation targetStation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StationplanPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDistanceInMeters() {
		return distanceInMeters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistanceInMeters(Integer newDistanceInMeters) {
		Integer oldDistanceInMeters = distanceInMeters;
		distanceInMeters = newDistanceInMeters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StationplanPackage.CONNECTION__DISTANCE_IN_METERS, oldDistanceInMeters, distanceInMeters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainStation getTargetStation() {
		if (targetStation != null && targetStation.eIsProxy()) {
			InternalEObject oldTargetStation = (InternalEObject)targetStation;
			targetStation = (TrainStation)eResolveProxy(oldTargetStation);
			if (targetStation != oldTargetStation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StationplanPackage.CONNECTION__TARGET_STATION, oldTargetStation, targetStation));
			}
		}
		return targetStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainStation basicGetTargetStation() {
		return targetStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetStation(TrainStation newTargetStation, NotificationChain msgs) {
		TrainStation oldTargetStation = targetStation;
		targetStation = newTargetStation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StationplanPackage.CONNECTION__TARGET_STATION, oldTargetStation, newTargetStation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetStation(TrainStation newTargetStation) {
		if (newTargetStation != targetStation) {
			NotificationChain msgs = null;
			if (targetStation != null)
				msgs = ((InternalEObject)targetStation).eInverseRemove(this, StationplanPackage.TRAIN_STATION__INCOMING_CONNECTIONS, TrainStation.class, msgs);
			if (newTargetStation != null)
				msgs = ((InternalEObject)newTargetStation).eInverseAdd(this, StationplanPackage.TRAIN_STATION__INCOMING_CONNECTIONS, TrainStation.class, msgs);
			msgs = basicSetTargetStation(newTargetStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StationplanPackage.CONNECTION__TARGET_STATION, newTargetStation, newTargetStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrainStation getSourceStation() {
		if (eContainerFeatureID() != StationplanPackage.CONNECTION__SOURCE_STATION) return null;
		return (TrainStation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceStation(TrainStation newSourceStation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSourceStation, StationplanPackage.CONNECTION__SOURCE_STATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceStation(TrainStation newSourceStation) {
		if (newSourceStation != eInternalContainer() || (eContainerFeatureID() != StationplanPackage.CONNECTION__SOURCE_STATION && newSourceStation != null)) {
			if (EcoreUtil.isAncestor(this, newSourceStation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceStation != null)
				msgs = ((InternalEObject)newSourceStation).eInverseAdd(this, StationplanPackage.TRAIN_STATION__OUTGOING_CONNECTIONS, TrainStation.class, msgs);
			msgs = basicSetSourceStation(newSourceStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StationplanPackage.CONNECTION__SOURCE_STATION, newSourceStation, newSourceStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StationplanPackage.CONNECTION__TARGET_STATION:
				if (targetStation != null)
					msgs = ((InternalEObject)targetStation).eInverseRemove(this, StationplanPackage.TRAIN_STATION__INCOMING_CONNECTIONS, TrainStation.class, msgs);
				return basicSetTargetStation((TrainStation)otherEnd, msgs);
			case StationplanPackage.CONNECTION__SOURCE_STATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSourceStation((TrainStation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StationplanPackage.CONNECTION__TARGET_STATION:
				return basicSetTargetStation(null, msgs);
			case StationplanPackage.CONNECTION__SOURCE_STATION:
				return basicSetSourceStation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StationplanPackage.CONNECTION__SOURCE_STATION:
				return eInternalContainer().eInverseRemove(this, StationplanPackage.TRAIN_STATION__OUTGOING_CONNECTIONS, TrainStation.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StationplanPackage.CONNECTION__DISTANCE_IN_METERS:
				return getDistanceInMeters();
			case StationplanPackage.CONNECTION__TARGET_STATION:
				if (resolve) return getTargetStation();
				return basicGetTargetStation();
			case StationplanPackage.CONNECTION__SOURCE_STATION:
				return getSourceStation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StationplanPackage.CONNECTION__DISTANCE_IN_METERS:
				setDistanceInMeters((Integer)newValue);
				return;
			case StationplanPackage.CONNECTION__TARGET_STATION:
				setTargetStation((TrainStation)newValue);
				return;
			case StationplanPackage.CONNECTION__SOURCE_STATION:
				setSourceStation((TrainStation)newValue);
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
			case StationplanPackage.CONNECTION__DISTANCE_IN_METERS:
				setDistanceInMeters(DISTANCE_IN_METERS_EDEFAULT);
				return;
			case StationplanPackage.CONNECTION__TARGET_STATION:
				setTargetStation((TrainStation)null);
				return;
			case StationplanPackage.CONNECTION__SOURCE_STATION:
				setSourceStation((TrainStation)null);
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
			case StationplanPackage.CONNECTION__DISTANCE_IN_METERS:
				return DISTANCE_IN_METERS_EDEFAULT == null ? distanceInMeters != null : !DISTANCE_IN_METERS_EDEFAULT.equals(distanceInMeters);
			case StationplanPackage.CONNECTION__TARGET_STATION:
				return targetStation != null;
			case StationplanPackage.CONNECTION__SOURCE_STATION:
				return getSourceStation() != null;
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
		result.append(" (distanceInMeters: ");
		result.append(distanceInMeters);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
