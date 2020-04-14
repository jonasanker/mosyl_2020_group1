/**
 */
package org.mdse.gt.stationplan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.gt.stationplan.Connection#getDistanceInMeters <em>Distance In Meters</em>}</li>
 *   <li>{@link org.mdse.gt.stationplan.Connection#getTargetStation <em>Target Station</em>}</li>
 *   <li>{@link org.mdse.gt.stationplan.Connection#getSourceStation <em>Source Station</em>}</li>
 * </ul>
 *
 * @see org.mdse.gt.stationplan.StationplanPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Distance In Meters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance In Meters</em>' attribute.
	 * @see #setDistanceInMeters(Integer)
	 * @see org.mdse.gt.stationplan.StationplanPackage#getConnection_DistanceInMeters()
	 * @model required="true"
	 * @generated
	 */
	Integer getDistanceInMeters();

	/**
	 * Sets the value of the '{@link org.mdse.gt.stationplan.Connection#getDistanceInMeters <em>Distance In Meters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance In Meters</em>' attribute.
	 * @see #getDistanceInMeters()
	 * @generated
	 */
	void setDistanceInMeters(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Station</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.mdse.gt.stationplan.TrainStation#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Station</em>' reference.
	 * @see #setTargetStation(TrainStation)
	 * @see org.mdse.gt.stationplan.StationplanPackage#getConnection_TargetStation()
	 * @see org.mdse.gt.stationplan.TrainStation#getIncomingConnections
	 * @model opposite="incomingConnections" required="true"
	 * @generated
	 */
	TrainStation getTargetStation();

	/**
	 * Sets the value of the '{@link org.mdse.gt.stationplan.Connection#getTargetStation <em>Target Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Station</em>' reference.
	 * @see #getTargetStation()
	 * @generated
	 */
	void setTargetStation(TrainStation value);

	/**
	 * Returns the value of the '<em><b>Source Station</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.mdse.gt.stationplan.TrainStation#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Station</em>' container reference.
	 * @see #setSourceStation(TrainStation)
	 * @see org.mdse.gt.stationplan.StationplanPackage#getConnection_SourceStation()
	 * @see org.mdse.gt.stationplan.TrainStation#getOutgoingConnections
	 * @model opposite="outgoingConnections" required="true" transient="false"
	 * @generated
	 */
	TrainStation getSourceStation();

	/**
	 * Sets the value of the '{@link org.mdse.gt.stationplan.Connection#getSourceStation <em>Source Station</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Station</em>' container reference.
	 * @see #getSourceStation()
	 * @generated
	 */
	void setSourceStation(TrainStation value);

} // Connection
