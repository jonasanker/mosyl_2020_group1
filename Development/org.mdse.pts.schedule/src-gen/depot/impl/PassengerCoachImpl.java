/**
 */
package depot.impl;

import depot.DepotPackage;
import depot.PassengerClass;
import depot.PassengerCoach;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passenger Coach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link depot.impl.PassengerCoachImpl#getPassengerClass <em>Passenger Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassengerCoachImpl extends CoachWithIdImpl implements PassengerCoach {
	/**
	 * The default value of the '{@link #getPassengerClass() <em>Passenger Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerClass()
	 * @generated
	 * @ordered
	 */
	protected static final PassengerClass PASSENGER_CLASS_EDEFAULT = PassengerClass.FIRST_CLASS;

	/**
	 * The cached value of the '{@link #getPassengerClass() <em>Passenger Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerClass()
	 * @generated
	 * @ordered
	 */
	protected PassengerClass passengerClass = PASSENGER_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassengerCoachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DepotPackage.Literals.PASSENGER_COACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassengerClass getPassengerClass() {
		return passengerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassengerClass(PassengerClass newPassengerClass) {
		PassengerClass oldPassengerClass = passengerClass;
		passengerClass = newPassengerClass == null ? PASSENGER_CLASS_EDEFAULT : newPassengerClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DepotPackage.PASSENGER_COACH__PASSENGER_CLASS, oldPassengerClass, passengerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DepotPackage.PASSENGER_COACH__PASSENGER_CLASS:
				return getPassengerClass();
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
			case DepotPackage.PASSENGER_COACH__PASSENGER_CLASS:
				setPassengerClass((PassengerClass)newValue);
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
			case DepotPackage.PASSENGER_COACH__PASSENGER_CLASS:
				setPassengerClass(PASSENGER_CLASS_EDEFAULT);
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
			case DepotPackage.PASSENGER_COACH__PASSENGER_CLASS:
				return passengerClass != PASSENGER_CLASS_EDEFAULT;
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
		result.append(" (passengerClass: ");
		result.append(passengerClass);
		result.append(')');
		return result.toString();
	}

} //PassengerCoachImpl
