/**
 */
package granja;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Datos</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see granja.GranjaPackage#getDatos()
 * @model
 * @generated
 */
public enum Datos implements Enumerator {
	/**
	 * The '<em><b>FOTOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOTOS_VALUE
	 * @generated
	 * @ordered
	 */
	FOTOS(0, "FOTOS", "FOTOS"),

	/**
	 * The '<em><b>VOLTIOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLTIOS_VALUE
	 * @generated
	 * @ordered
	 */
	VOLTIOS(1, "VOLTIOS", "VOLTIOS"),

	/**
	 * The '<em><b>GRADOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADOS_VALUE
	 * @generated
	 * @ordered
	 */
	GRADOS(2, "GRADOS", "GRADOS");

	/**
	 * The '<em><b>FOTOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOTOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOTOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOTOS_VALUE = 0;

	/**
	 * The '<em><b>VOLTIOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOLTIOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLTIOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOLTIOS_VALUE = 1;

	/**
	 * The '<em><b>GRADOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRADOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRADOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRADOS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Datos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Datos[] VALUES_ARRAY =
		new Datos[] {
			FOTOS,
			VOLTIOS,
			GRADOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Datos</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Datos> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Datos</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Datos get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Datos result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datos</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Datos getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Datos result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datos</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Datos get(int value) {
		switch (value) {
			case FOTOS_VALUE: return FOTOS;
			case VOLTIOS_VALUE: return VOLTIOS;
			case GRADOS_VALUE: return GRADOS;
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
	private Datos(int value, String name, String literal) {
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
	
} //Datos
