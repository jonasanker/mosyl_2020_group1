/**
 */
package common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link common.Time#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link common.Time#getHours <em>Hours</em>}</li>
 * </ul>
 *
 * @see common.CommonPackage#getTime()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='max60Minutes max24Hours'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot max60Minutes='minutes &lt; 60' max24Hours='hours &lt; 24'"
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see #setMinutes(int)
	 * @see common.CommonPackage#getTime_Minutes()
	 * @model required="true"
	 * @generated
	 */
	int getMinutes();

	/**
	 * Sets the value of the '{@link common.Time#getMinutes <em>Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes</em>' attribute.
	 * @see #getMinutes()
	 * @generated
	 */
	void setMinutes(int value);

	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(int)
	 * @see common.CommonPackage#getTime_Hours()
	 * @model required="true"
	 * @generated
	 */
	int getHours();

	/**
	 * Sets the value of the '{@link common.Time#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(int value);

} // Time
