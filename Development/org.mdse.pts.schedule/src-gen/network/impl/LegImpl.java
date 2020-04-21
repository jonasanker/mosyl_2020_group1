/**
 */
package network.impl;

import network.Leg;
import network.NetworkPackage;
import network.Station;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link network.impl.LegImpl#getName <em>Name</em>}</li>
 *   <li>{@link network.impl.LegImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link network.impl.LegImpl#getStation1 <em>Station1</em>}</li>
 *   <li>{@link network.impl.LegImpl#getStation2 <em>Station2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegImpl extends MinimalEObjectImpl.Container implements Leg {
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
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected Integer distance = DISTANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStation1() <em>Station1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation1()
	 * @generated
	 * @ordered
	 */
	protected Station station1;

	/**
	 * The cached value of the '{@link #getStation2() <em>Station2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStation2()
	 * @generated
	 * @ordered
	 */
	protected Station station2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.LEG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LEG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(Integer newDistance) {
		Integer oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LEG__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getStation1() {
		if (station1 != null && station1.eIsProxy()) {
			InternalEObject oldStation1 = (InternalEObject)station1;
			station1 = (Station)eResolveProxy(oldStation1);
			if (station1 != oldStation1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.LEG__STATION1, oldStation1, station1));
			}
		}
		return station1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation1() {
		return station1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStation1(Station newStation1) {
		Station oldStation1 = station1;
		station1 = newStation1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LEG__STATION1, oldStation1, station1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Station getStation2() {
		if (station2 != null && station2.eIsProxy()) {
			InternalEObject oldStation2 = (InternalEObject)station2;
			station2 = (Station)eResolveProxy(oldStation2);
			if (station2 != oldStation2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.LEG__STATION2, oldStation2, station2));
			}
		}
		return station2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Station basicGetStation2() {
		return station2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStation2(Station newStation2) {
		Station oldStation2 = station2;
		station2 = newStation2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.LEG__STATION2, oldStation2, station2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkPackage.LEG__NAME:
				return getName();
			case NetworkPackage.LEG__DISTANCE:
				return getDistance();
			case NetworkPackage.LEG__STATION1:
				if (resolve) return getStation1();
				return basicGetStation1();
			case NetworkPackage.LEG__STATION2:
				if (resolve) return getStation2();
				return basicGetStation2();
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
			case NetworkPackage.LEG__NAME:
				setName((String)newValue);
				return;
			case NetworkPackage.LEG__DISTANCE:
				setDistance((Integer)newValue);
				return;
			case NetworkPackage.LEG__STATION1:
				setStation1((Station)newValue);
				return;
			case NetworkPackage.LEG__STATION2:
				setStation2((Station)newValue);
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
			case NetworkPackage.LEG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NetworkPackage.LEG__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case NetworkPackage.LEG__STATION1:
				setStation1((Station)null);
				return;
			case NetworkPackage.LEG__STATION2:
				setStation2((Station)null);
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
			case NetworkPackage.LEG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NetworkPackage.LEG__DISTANCE:
				return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
			case NetworkPackage.LEG__STATION1:
				return station1 != null;
			case NetworkPackage.LEG__STATION2:
				return station2 != null;
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
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //LegImpl
