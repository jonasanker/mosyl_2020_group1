/**
 */
package depot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Passenger Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see depot.DepotPackage#getPassengerClass()
 * @model
 * @generated
 */
public enum PassengerClass implements Enumerator {
	/**
	 * The '<em><b>First Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_CLASS(1, "FirstClass", "FirstClass"),

	/**
	 * The '<em><b>Second Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_CLASS(2, "SecondClass", "SecondClass");

	/**
	 * The '<em><b>First Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_CLASS
	 * @model name="FirstClass"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_CLASS_VALUE = 1;

	/**
	 * The '<em><b>Second Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_CLASS
	 * @model name="SecondClass"
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_CLASS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Passenger Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PassengerClass[] VALUES_ARRAY =
		new PassengerClass[] {
			FIRST_CLASS,
			SECOND_CLASS,
		};

	/**
	 * A public read-only list of all the '<em><b>Passenger Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PassengerClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Passenger Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassengerClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassengerClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passenger Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassengerClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassengerClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passenger Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassengerClass get(int value) {
		switch (value) {
			case FIRST_CLASS_VALUE: return FIRST_CLASS;
			case SECOND_CLASS_VALUE: return SECOND_CLASS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PassengerClass(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PassengerClass
