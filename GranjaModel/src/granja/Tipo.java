/**
 * @author Jose Antonio de Benito Suarez
 * Clase enumerador de las acciones que se pueden implementar en los dispositivos
 *  */
package granja;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see granja.GranjaPackage#getTipo()
 * @model
 * @generated
 */
public enum Tipo implements Enumerator {
	/**
	 * The '<em><b>DELAVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAVAL_VALUE
	 * @generated
	 * @ordered
	 */
	DELAVAL(0, "DELAVAL", "DELAVAL"),

	/**
	 * The '<em><b>SIEMENS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIEMENS_VALUE
	 * @generated
	 * @ordered
	 */
	SIEMENS(1, "SIEMENS", "SIEMENS"),

	/**
	 * The '<em><b>TABLET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLET_VALUE
	 * @generated
	 * @ordered
	 */
	TABLET(2, "TABLET", "TABLET"),

	/**
	 * The '<em><b>MOVIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVIL_VALUE
	 * @generated
	 * @ordered
	 */
	MOVIL(3, "MOVIL", "MOVIL"),

	/**
	 * The '<em><b>ORDENADOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDENADOR_VALUE
	 * @generated
	 * @ordered
	 */
	ORDENADOR(4, "ORDENADOR", "ORDENADOR");

	/**
	 * The '<em><b>DELAVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELAVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELAVAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELAVAL_VALUE = 0;

	/**
	 * The '<em><b>SIEMENS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIEMENS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIEMENS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIEMENS_VALUE = 1;

	/**
	 * The '<em><b>TABLET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TABLET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TABLET_VALUE = 2;

	/**
	 * The '<em><b>MOVIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVIL_VALUE = 3;

	/**
	 * The '<em><b>ORDENADOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORDENADOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORDENADOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORDENADOR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Tipo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Tipo[] VALUES_ARRAY =
		new Tipo[] {
			DELAVAL,
			SIEMENS,
			TABLET,
			MOVIL,
			ORDENADOR,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Tipo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo get(int value) {
		switch (value) {
			case DELAVAL_VALUE: return DELAVAL;
			case SIEMENS_VALUE: return SIEMENS;
			case TABLET_VALUE: return TABLET;
			case MOVIL_VALUE: return MOVIL;
			case ORDENADOR_VALUE: return ORDENADOR;
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
	private Tipo(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Tipo
