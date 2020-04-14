/**
 */
package org.mdse.gt.stationplan;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mdse.gt.stationplan.StationplanFactory
 * @model kind="package"
 * @generated
 */
public interface StationplanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stationplan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/gt/stationplan";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stationplan";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StationplanPackage eINSTANCE = org.mdse.gt.stationplan.impl.StationplanPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.gt.stationplan.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.gt.stationplan.impl.IdentifiableImpl
	 * @see org.mdse.gt.stationplan.impl.StationplanPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.gt.stationplan.impl.StationPlanImpl <em>Station Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.gt.stationplan.impl.StationPlanImpl
	 * @see org.mdse.gt.stationplan.impl.StationplanPackageImpl#getStationPlan()
	 * @generated
	 */
	int STATION_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_PLAN__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Train Stations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_PLAN__TRAIN_STATIONS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Station Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_PLAN_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Station Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_PLAN_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.gt.stationplan.impl.TrainStationImpl <em>Train Station</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.gt.stationplan.impl.TrainStationImpl
	 * @see org.mdse.gt.stationplan.impl.StationplanPackageImpl#getTrainStation()
	 * @generated
	 */
	int TRAIN_STATION = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION__OUTGOING_CONNECTIONS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION__INCOMING_CONNECTIONS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Train Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Train Station</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_STATION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.gt.stationplan.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.gt.stationplan.impl.ConnectionImpl
	 * @see org.mdse.gt.stationplan.impl.StationplanPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Distance In Meters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DISTANCE_IN_METERS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET_STATION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Station</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE_STATION = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.mdse.gt.stationplan.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.mdse.gt.stationplan.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.gt.stationplan.Identifiable#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.mdse.gt.stationplan.Identifiable#getIdentifier()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Identifier();

	/**
	 * Returns the meta object for class '{@link org.mdse.gt.stationplan.StationPlan <em>Station Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Plan</em>'.
	 * @see org.mdse.gt.stationplan.StationPlan
	 * @generated
	 */
	EClass getStationPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.gt.stationplan.StationPlan#getTrainStations <em>Train Stations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Train Stations</em>'.
	 * @see org.mdse.gt.stationplan.StationPlan#getTrainStations()
	 * @see #getStationPlan()
	 * @generated
	 */
	EReference getStationPlan_TrainStations();

	/**
	 * Returns the meta object for class '{@link org.mdse.gt.stationplan.TrainStation <em>Train Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train Station</em>'.
	 * @see org.mdse.gt.stationplan.TrainStation
	 * @generated
	 */
	EClass getTrainStation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.gt.stationplan.TrainStation#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Connections</em>'.
	 * @see org.mdse.gt.stationplan.TrainStation#getOutgoingConnections()
	 * @see #getTrainStation()
	 * @generated
	 */
	EReference getTrainStation_OutgoingConnections();

	/**
	 * Returns the meta object for the reference list '{@link org.mdse.gt.stationplan.TrainStation#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Connections</em>'.
	 * @see org.mdse.gt.stationplan.TrainStation#getIncomingConnections()
	 * @see #getTrainStation()
	 * @generated
	 */
	EReference getTrainStation_IncomingConnections();

	/**
	 * Returns the meta object for class '{@link org.mdse.gt.stationplan.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.mdse.gt.stationplan.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.gt.stationplan.Connection#getDistanceInMeters <em>Distance In Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance In Meters</em>'.
	 * @see org.mdse.gt.stationplan.Connection#getDistanceInMeters()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_DistanceInMeters();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.gt.stationplan.Connection#getTargetStation <em>Target Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Station</em>'.
	 * @see org.mdse.gt.stationplan.Connection#getTargetStation()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_TargetStation();

	/**
	 * Returns the meta object for the container reference '{@link org.mdse.gt.stationplan.Connection#getSourceStation <em>Source Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Station</em>'.
	 * @see org.mdse.gt.stationplan.Connection#getSourceStation()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_SourceStation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StationplanFactory getStationplanFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mdse.gt.stationplan.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.gt.stationplan.impl.IdentifiableImpl
		 * @see org.mdse.gt.stationplan.impl.StationplanPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__IDENTIFIER = eINSTANCE.getIdentifiable_Identifier();

		/**
		 * The meta object literal for the '{@link org.mdse.gt.stationplan.impl.StationPlanImpl <em>Station Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.gt.stationplan.impl.StationPlanImpl
		 * @see org.mdse.gt.stationplan.impl.StationplanPackageImpl#getStationPlan()
		 * @generated
		 */
		EClass STATION_PLAN = eINSTANCE.getStationPlan();

		/**
		 * The meta object literal for the '<em><b>Train Stations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATION_PLAN__TRAIN_STATIONS = eINSTANCE.getStationPlan_TrainStations();

		/**
		 * The meta object literal for the '{@link org.mdse.gt.stationplan.impl.TrainStationImpl <em>Train Station</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.gt.stationplan.impl.TrainStationImpl
		 * @see org.mdse.gt.stationplan.impl.StationplanPackageImpl#getTrainStation()
		 * @generated
		 */
		EClass TRAIN_STATION = eINSTANCE.getTrainStation();

		/**
		 * The meta object literal for the '<em><b>Outgoing Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_STATION__OUTGOING_CONNECTIONS = eINSTANCE.getTrainStation_OutgoingConnections();

		/**
		 * The meta object literal for the '<em><b>Incoming Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAIN_STATION__INCOMING_CONNECTIONS = eINSTANCE.getTrainStation_IncomingConnections();

		/**
		 * The meta object literal for the '{@link org.mdse.gt.stationplan.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.gt.stationplan.impl.ConnectionImpl
		 * @see org.mdse.gt.stationplan.impl.StationplanPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Distance In Meters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DISTANCE_IN_METERS = eINSTANCE.getConnection_DistanceInMeters();

		/**
		 * The meta object literal for the '<em><b>Target Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET_STATION = eINSTANCE.getConnection_TargetStation();

		/**
		 * The meta object literal for the '<em><b>Source Station</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE_STATION = eINSTANCE.getConnection_SourceStation();

	}

} //StationplanPackage
