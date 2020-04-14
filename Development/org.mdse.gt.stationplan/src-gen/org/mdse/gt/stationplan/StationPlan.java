/**
 */
package org.mdse.gt.stationplan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.gt.stationplan.StationPlan#getTrainStations <em>Train Stations</em>}</li>
 * </ul>
 *
 * @see org.mdse.gt.stationplan.StationplanPackage#getStationPlan()
 * @model
 * @generated
 */
public interface StationPlan extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Train Stations</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.gt.stationplan.TrainStation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train Stations</em>' containment reference list.
	 * @see org.mdse.gt.stationplan.StationplanPackage#getStationPlan_TrainStations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrainStation> getTrainStations();

} // StationPlan
