/**
 */
package depot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger Coach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link depot.PassengerCoach#getPassengerClass <em>Passenger Class</em>}</li>
 * </ul>
 *
 * @see depot.DepotPackage#getPassengerCoach()
 * @model
 * @generated
 */
public interface PassengerCoach extends CoachWithId {
	/**
	 * Returns the value of the '<em><b>Passenger Class</b></em>' attribute.
	 * The literals are from the enumeration {@link depot.PassengerClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Class</em>' attribute.
	 * @see depot.PassengerClass
	 * @see #setPassengerClass(PassengerClass)
	 * @see depot.DepotPackage#getPassengerCoach_PassengerClass()
	 * @model
	 * @generated
	 */
	PassengerClass getPassengerClass();

	/**
	 * Sets the value of the '{@link depot.PassengerCoach#getPassengerClass <em>Passenger Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Class</em>' attribute.
	 * @see depot.PassengerClass
	 * @see #getPassengerClass()
	 * @generated
	 */
	void setPassengerClass(PassengerClass value);

} // PassengerCoach
