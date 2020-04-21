/**
 */
package depot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coach With Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link depot.CoachWithId#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see depot.DepotPackage#getCoachWithId()
 * @model abstract="true"
 * @generated
 */
public interface CoachWithId extends Coach {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(int)
	 * @see depot.DepotPackage#getCoachWithId_Identifier()
	 * @model
	 * @generated
	 */
	int getIdentifier();

	/**
	 * Sets the value of the '{@link depot.CoachWithId#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(int value);

} // CoachWithId
