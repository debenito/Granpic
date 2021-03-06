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
 * A representation of the literals of the enumeration '<em><b>Nombre Accion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see granja.GranjaPackage#getNombreAccion()
 * @model
 * @generated
 */
public enum NombreAccion implements Enumerator {
	/**
	 * The '<em><b>ABRIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABRIR_VALUE
	 * @generated
	 * @ordered
	 */
	ABRIR(0, "ABRIR", "ABRIR"),

	/**
	 * The '<em><b>ENVIAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIAR_VALUE
	 * @generated
	 * @ordered
	 */
	ENVIAR(1, "ENVIAR", "ENVIAR"),

	/**
	 * The '<em><b>SACAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SACAR_VALUE
	 * @generated
	 * @ordered
	 */
	SACAR(2, "SACAR", "SACAR"),

	/**
	 * The '<em><b>CERRAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERRAR_VALUE
	 * @generated
	 * @ordered
	 */
	CERRAR(3, "CERRAR", "CERRAR"),

	/**
	 * The '<em><b>ESTADO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTADO_VALUE
	 * @generated
	 * @ordered
	 */
	ESTADO(4, "ESTADO", "ESTADO"),

	/**
	 * The '<em><b>GRABAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRABAR_VALUE
	 * @generated
	 * @ordered
	 */
	GRABAR(5, "GRABAR", "GRABAR"),

	/**
	 * The '<em><b>DETECTAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTAR_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTAR(6, "DETECTAR", "DETECTAR"),

	/**
	 * The '<em><b>ENCENDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCENDER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCENDER(7, "ENCENDER", "ENCENDER"),

	/**
	 * The '<em><b>APAGAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APAGAR_VALUE
	 * @generated
	 * @ordered
	 */
	APAGAR(8, "APAGAR", "APAGAR"),

	/**
	 * The '<em><b>AUMENTAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUMENTAR_VALUE
	 * @generated
	 * @ordered
	 */
	AUMENTAR(9, "AUMENTAR", "AUMENTAR"),

	/**
	 * The '<em><b>DISMINUIR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISMINUIR_VALUE
	 * @generated
	 * @ordered
	 */
	DISMINUIR(10, "DISMINUIR", "DISMINUIR"),

	/**
	 * The '<em><b>COMPROBAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPROBAR_VALUE
	 * @generated
	 * @ordered
	 */
	COMPROBAR(11, "COMPROBAR", "COMPROBAR"),

	/**
	 * The '<em><b>ACTIVAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVAR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVAR(12, "ACTIVAR", "ACTIVAR"),

	/**
	 * The '<em><b>DESACTIVAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESACTIVAR_VALUE
	 * @generated
	 * @ordered
	 */
	DESACTIVAR(13, "DESACTIVAR", "DESACTIVAR");

	/**
	 * The '<em><b>ABRIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABRIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABRIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABRIR_VALUE = 0;

	/**
	 * The '<em><b>ENVIAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENVIAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENVIAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENVIAR_VALUE = 1;

	/**
	 * The '<em><b>SACAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SACAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SACAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SACAR_VALUE = 2;

	/**
	 * The '<em><b>CERRAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CERRAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CERRAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CERRAR_VALUE = 3;

	/**
	 * The '<em><b>ESTADO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESTADO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESTADO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESTADO_VALUE = 4;

	/**
	 * The '<em><b>GRABAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRABAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRABAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRABAR_VALUE = 5;

	/**
	 * The '<em><b>DETECTAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DETECTAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETECTAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DETECTAR_VALUE = 6;

	/**
	 * The '<em><b>ENCENDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENCENDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENCENDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENCENDER_VALUE = 7;

	/**
	 * The '<em><b>APAGAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APAGAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APAGAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APAGAR_VALUE = 8;

	/**
	 * The '<em><b>AUMENTAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUMENTAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUMENTAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUMENTAR_VALUE = 9;

	/**
	 * The '<em><b>DISMINUIR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISMINUIR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISMINUIR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISMINUIR_VALUE = 10;

	/**
	 * The '<em><b>COMPROBAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPROBAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPROBAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPROBAR_VALUE = 11;

	/**
	 * The '<em><b>ACTIVAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTIVAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVAR_VALUE = 12;

	/**
	 * The '<em><b>DESACTIVAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESACTIVAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESACTIVAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESACTIVAR_VALUE = 13;

	/**
	 * An array of all the '<em><b>Nombre Accion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NombreAccion[] VALUES_ARRAY =
		new NombreAccion[] {
			ABRIR,
			ENVIAR,
			SACAR,
			CERRAR,
			ESTADO,
			GRABAR,
			DETECTAR,
			ENCENDER,
			APAGAR,
			AUMENTAR,
			DISMINUIR,
			COMPROBAR,
			ACTIVAR,
			DESACTIVAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Nombre Accion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NombreAccion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nombre Accion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NombreAccion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NombreAccion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombre Accion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NombreAccion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NombreAccion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nombre Accion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NombreAccion get(int value) {
		switch (value) {
			case ABRIR_VALUE: return ABRIR;
			case ENVIAR_VALUE: return ENVIAR;
			case SACAR_VALUE: return SACAR;
			case CERRAR_VALUE: return CERRAR;
			case ESTADO_VALUE: return ESTADO;
			case GRABAR_VALUE: return GRABAR;
			case DETECTAR_VALUE: return DETECTAR;
			case ENCENDER_VALUE: return ENCENDER;
			case APAGAR_VALUE: return APAGAR;
			case AUMENTAR_VALUE: return AUMENTAR;
			case DISMINUIR_VALUE: return DISMINUIR;
			case COMPROBAR_VALUE: return COMPROBAR;
			case ACTIVAR_VALUE: return ACTIVAR;
			case DESACTIVAR_VALUE: return DESACTIVAR;
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
	private NombreAccion(int value, String name, String literal) {
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
	
} //NombreAccion
