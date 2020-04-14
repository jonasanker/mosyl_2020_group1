/**
 */
package org.mdse.gt.stationplan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.gt.stationplan.TrainStation#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link org.mdse.gt.stationplan.TrainStation#getIncomingConnections <em>Incoming Connections</em>}</li>
 * </ul>
 *
 * @see org.mdse.gt.stationplan.StationplanPackage#getTrainStation()
 * @model
 * @generated
 */
public interface TrainStation extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.gt.stationplan.Connection}.
	 * It is bidirectional and its opposite is '{@link org.mdse.gt.stationplan.Connection#getSourceStation <em>Source Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' containment reference list.
	 * @see org.mdse.gt.stationplan.StationplanPackage#getTrainStation_OutgoingConnections()
	 * @see org.mdse.gt.stationplan.Connection#getSourceStation
	 * @model opposite="sourceStation" containment="true"
	 * @generated
	 */
	EList<Connection> getOutgoingConnections();

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link org.mdse.gt.stationplan.Connection}.
	 * It is bidirectional and its opposite is '{@link org.mdse.gt.stationplan.Connection#getTargetStation <em>Target Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see org.mdse.gt.stationplan.StationplanPackage#getTrainStation_IncomingConnections()
	 * @see org.mdse.gt.stationplan.Connection#getTargetStation
	 * @model opposite="targetStation"
	 * @generated
	 */
	EList<Connection> getIncomingConnections();

} // TrainStation
