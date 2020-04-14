/**
 */
package org.mdse.gt.stationplan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.gt.stationplan.StationPlan;
import org.mdse.gt.stationplan.StationplanPackage;
import org.mdse.gt.stationplan.TrainStation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Station Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.gt.stationplan.impl.StationPlanImpl#getTrainStations <em>Train Stations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StationPlanImpl extends IdentifiableImpl implements StationPlan {
	/**
	 * The cached value of the '{@link #getTrainStations() <em>Train Stations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainStations()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainStation> trainStations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StationplanPackage.Literals.STATION_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrainStation> getTrainStations() {
		if (trainStations == null) {
			trainStations = new EObjectContainmentEList<TrainStation>(TrainStation.class, this, StationplanPackage.STATION_PLAN__TRAIN_STATIONS);
		}
		return trainStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StationplanPackage.STATION_PLAN__TRAIN_STATIONS:
				return ((InternalEList<?>)getTrainStations()).basicRemove(otherEnd, msgs);
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
			case StationplanPackage.STATION_PLAN__TRAIN_STATIONS:
				return getTrainStations();
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
			case StationplanPackage.STATION_PLAN__TRAIN_STATIONS:
				getTrainStations().clear();
				getTrainStations().addAll((Collection<? extends TrainStation>)newValue);
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
			case StationplanPackage.STATION_PLAN__TRAIN_STATIONS:
				getTrainStations().clear();
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
			case StationplanPackage.STATION_PLAN__TRAIN_STATIONS:
				return trainStations != null && !trainStations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StationPlanImpl
