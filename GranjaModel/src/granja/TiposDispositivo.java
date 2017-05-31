/**
 */
package granja;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipos Dispositivo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see granja.GranjaPackage#getTiposDispositivo()
 * @model
 * @generated
 */
public enum TiposDispositivo implements Enumerator {
	/**
	 * The '<em><b>CAMARA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAMARA_VALUE
	 * @generated
	 * @ordered
	 */
	CAMARA(0, "CAMARA", "CAMARA"),

	/**
	 * The '<em><b>TEMPERATURA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURA_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURA(1, "TEMPERATURA", "TEMPERATURA"),

	/**
	 * The '<em><b>FUEGO HUMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUEGO_HUMO_VALUE
	 * @generated
	 * @ordered
	 */
	FUEGO_HUMO(2, "FUEGO_HUMO", "FUEGO_HUMO"),

	/**
	 * The '<em><b>CO2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO2_VALUE
	 * @generated
	 * @ordered
	 */
	CO2(3, "CO2", "CO2"),

	/**
	 * The '<em><b>GAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAS_VALUE
	 * @generated
	 * @ordered
	 */
	GAS(4, "GAS", "GAS"),

	/**
	 * The '<em><b>PRESENCIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESENCIA_VALUE
	 * @generated
	 * @ordered
	 */
	PRESENCIA(5, "PRESENCIA", "PRESENCIA"),

	/**
	 * The '<em><b>MAGNETICO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGNETICO_VALUE
	 * @generated
	 * @ordered
	 */
	MAGNETICO(6, "MAGNETICO", "MAGNETICO"),

	/**
	 * The '<em><b>ROTURA CRISTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTURA_CRISTAL_VALUE
	 * @generated
	 * @ordered
	 */
	ROTURA_CRISTAL(7, "ROTURA_CRISTAL", "ROTURA_CRISTAL"),

	/**
	 * The '<em><b>BARRERA SEGURIDAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARRERA_SEGURIDAD_VALUE
	 * @generated
	 * @ordered
	 */
	BARRERA_SEGURIDAD(8, "BARRERA_SEGURIDAD", "BARRERA_SEGURIDAD"),

	/**
	 * The '<em><b>LUMINOSIDAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUMINOSIDAD_VALUE
	 * @generated
	 * @ordered
	 */
	LUMINOSIDAD(9, "LUMINOSIDAD", "LUMINOSIDAD"),

	/**
	 * The '<em><b>EMERGENCIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCIA_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCIA(10, "EMERGENCIA", "EMERGENCIA"),

	/**
	 * The '<em><b>INUNDACION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INUNDACION_VALUE
	 * @generated
	 * @ordered
	 */
	INUNDACION(11, "INUNDACION", "INUNDACION"),

	/**
	 * The '<em><b>VIENTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIENTO_VALUE
	 * @generated
	 * @ordered
	 */
	VIENTO(12, "VIENTO", "VIENTO"),

	/**
	 * The '<em><b>LLUVIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LLUVIA_VALUE
	 * @generated
	 * @ordered
	 */
	LLUVIA(13, "LLUVIA", "LLUVIA"),

	/**
	 * The '<em><b>ESTACION METEOROLOGICA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTACION_METEOROLOGICA_VALUE
	 * @generated
	 * @ordered
	 */
	ESTACION_METEOROLOGICA(14, "ESTACION_METEOROLOGICA", "ESTACION_METEOROLOGICA"),

	/**
	 * The '<em><b>SISTEMA IDENTIFICACION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SISTEMA_IDENTIFICACION_VALUE
	 * @generated
	 * @ordered
	 */
	SISTEMA_IDENTIFICACION(15, "SISTEMA_IDENTIFICACION", "SISTEMA_IDENTIFICACION"),

	/**
	 * The '<em><b>INFRARROJOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFRARROJOS_VALUE
	 * @generated
	 * @ordered
	 */
	INFRARROJOS(16, "INFRARROJOS", "INFRARROJOS"),

	/**
	 * The '<em><b>RADIOFRECUENCIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIOFRECUENCIA_VALUE
	 * @generated
	 * @ordered
	 */
	RADIOFRECUENCIA(17, "RADIOFRECUENCIA", "RADIOFRECUENCIA"),

	/**
	 * The '<em><b>MECEDORA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MECEDORA_VALUE
	 * @generated
	 * @ordered
	 */
	MECEDORA(18, "MECEDORA", "MECEDORA"),

	/**
	 * The '<em><b>PULSOMETRO GANADO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PULSOMETRO_GANADO_VALUE
	 * @generated
	 * @ordered
	 */
	PULSOMETRO_GANADO(19, "PULSOMETRO_GANADO", "PULSOMETRO_GANADO"),

	/**
	 * The '<em><b>DEPOSITO LECHE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPOSITO_LECHE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPOSITO_LECHE(20, "DEPOSITO_LECHE", "DEPOSITO_LECHE"),

	/**
	 * The '<em><b>ROBOT LIMPIADOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROBOT_LIMPIADOR_VALUE
	 * @generated
	 * @ordered
	 */
	ROBOT_LIMPIADOR(21, "ROBOT_LIMPIADOR", "ROBOT_LIMPIADOR"),

	/**
	 * The '<em><b>NEVERAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVERAS_VALUE
	 * @generated
	 * @ordered
	 */
	NEVERAS(22, "NEVERAS", "NEVERAS"),

	/**
	 * The '<em><b>LUZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUZ_VALUE
	 * @generated
	 * @ordered
	 */
	LUZ(23, "LUZ", "LUZ"),

	/**
	 * The '<em><b>TERMOSTATO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMOSTATO_VALUE
	 * @generated
	 * @ordered
	 */
	TERMOSTATO(24, "TERMOSTATO", "TERMOSTATO");

	/**
	 * The '<em><b>CAMARA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAMARA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAMARA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAMARA_VALUE = 0;

	/**
	 * The '<em><b>TEMPERATURA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPERATURA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURA_VALUE = 1;

	/**
	 * The '<em><b>FUEGO HUMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUEGO HUMO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUEGO_HUMO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUEGO_HUMO_VALUE = 2;

	/**
	 * The '<em><b>CO2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CO2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CO2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CO2_VALUE = 3;

	/**
	 * The '<em><b>GAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GAS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GAS_VALUE = 4;

	/**
	 * The '<em><b>PRESENCIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRESENCIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESENCIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESENCIA_VALUE = 5;

	/**
	 * The '<em><b>MAGNETICO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAGNETICO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAGNETICO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAGNETICO_VALUE = 6;

	/**
	 * The '<em><b>ROTURA CRISTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROTURA CRISTAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROTURA_CRISTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROTURA_CRISTAL_VALUE = 7;

	/**
	 * The '<em><b>BARRERA SEGURIDAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BARRERA SEGURIDAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARRERA_SEGURIDAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BARRERA_SEGURIDAD_VALUE = 8;

	/**
	 * The '<em><b>LUMINOSIDAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LUMINOSIDAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LUMINOSIDAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUMINOSIDAD_VALUE = 9;

	/**
	 * The '<em><b>EMERGENCIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMERGENCIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMERGENCIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCIA_VALUE = 10;

	/**
	 * The '<em><b>INUNDACION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INUNDACION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INUNDACION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INUNDACION_VALUE = 11;

	/**
	 * The '<em><b>VIENTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIENTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIENTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIENTO_VALUE = 12;

	/**
	 * The '<em><b>LLUVIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LLUVIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LLUVIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LLUVIA_VALUE = 13;

	/**
	 * The '<em><b>ESTACION METEOROLOGICA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESTACION METEOROLOGICA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESTACION_METEOROLOGICA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESTACION_METEOROLOGICA_VALUE = 14;

	/**
	 * The '<em><b>SISTEMA IDENTIFICACION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SISTEMA IDENTIFICACION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SISTEMA_IDENTIFICACION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SISTEMA_IDENTIFICACION_VALUE = 15;

	/**
	 * The '<em><b>INFRARROJOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INFRARROJOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFRARROJOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INFRARROJOS_VALUE = 16;

	/**
	 * The '<em><b>RADIOFRECUENCIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RADIOFRECUENCIA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIOFRECUENCIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIOFRECUENCIA_VALUE = 17;

	/**
	 * The '<em><b>MECEDORA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MECEDORA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MECEDORA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MECEDORA_VALUE = 18;

	/**
	 * The '<em><b>PULSOMETRO GANADO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PULSOMETRO GANADO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PULSOMETRO_GANADO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PULSOMETRO_GANADO_VALUE = 19;

	/**
	 * The '<em><b>DEPOSITO LECHE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPOSITO LECHE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPOSITO_LECHE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPOSITO_LECHE_VALUE = 20;

	/**
	 * The '<em><b>ROBOT LIMPIADOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROBOT LIMPIADOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROBOT_LIMPIADOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROBOT_LIMPIADOR_VALUE = 21;

	/**
	 * The '<em><b>NEVERAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEVERAS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEVERAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEVERAS_VALUE = 22;

	/**
	 * The '<em><b>LUZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LUZ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LUZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LUZ_VALUE = 23;

	/**
	 * The '<em><b>TERMOSTATO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TERMOSTATO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERMOSTATO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TERMOSTATO_VALUE = 24;

	/**
	 * An array of all the '<em><b>Tipos Dispositivo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TiposDispositivo[] VALUES_ARRAY =
		new TiposDispositivo[] {
			CAMARA,
			TEMPERATURA,
			FUEGO_HUMO,
			CO2,
			GAS,
			PRESENCIA,
			MAGNETICO,
			ROTURA_CRISTAL,
			BARRERA_SEGURIDAD,
			LUMINOSIDAD,
			EMERGENCIA,
			INUNDACION,
			VIENTO,
			LLUVIA,
			ESTACION_METEOROLOGICA,
			SISTEMA_IDENTIFICACION,
			INFRARROJOS,
			RADIOFRECUENCIA,
			MECEDORA,
			PULSOMETRO_GANADO,
			DEPOSITO_LECHE,
			ROBOT_LIMPIADOR,
			NEVERAS,
			LUZ,
			TERMOSTATO,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipos Dispositivo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TiposDispositivo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipos Dispositivo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TiposDispositivo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TiposDispositivo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipos Dispositivo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TiposDispositivo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TiposDispositivo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipos Dispositivo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TiposDispositivo get(int value) {
		switch (value) {
			case CAMARA_VALUE: return CAMARA;
			case TEMPERATURA_VALUE: return TEMPERATURA;
			case FUEGO_HUMO_VALUE: return FUEGO_HUMO;
			case CO2_VALUE: return CO2;
			case GAS_VALUE: return GAS;
			case PRESENCIA_VALUE: return PRESENCIA;
			case MAGNETICO_VALUE: return MAGNETICO;
			case ROTURA_CRISTAL_VALUE: return ROTURA_CRISTAL;
			case BARRERA_SEGURIDAD_VALUE: return BARRERA_SEGURIDAD;
			case LUMINOSIDAD_VALUE: return LUMINOSIDAD;
			case EMERGENCIA_VALUE: return EMERGENCIA;
			case INUNDACION_VALUE: return INUNDACION;
			case VIENTO_VALUE: return VIENTO;
			case LLUVIA_VALUE: return LLUVIA;
			case ESTACION_METEOROLOGICA_VALUE: return ESTACION_METEOROLOGICA;
			case SISTEMA_IDENTIFICACION_VALUE: return SISTEMA_IDENTIFICACION;
			case INFRARROJOS_VALUE: return INFRARROJOS;
			case RADIOFRECUENCIA_VALUE: return RADIOFRECUENCIA;
			case MECEDORA_VALUE: return MECEDORA;
			case PULSOMETRO_GANADO_VALUE: return PULSOMETRO_GANADO;
			case DEPOSITO_LECHE_VALUE: return DEPOSITO_LECHE;
			case ROBOT_LIMPIADOR_VALUE: return ROBOT_LIMPIADOR;
			case NEVERAS_VALUE: return NEVERAS;
			case LUZ_VALUE: return LUZ;
			case TERMOSTATO_VALUE: return TERMOSTATO;
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
	private TiposDispositivo(int value, String name, String literal) {
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
	
} //TiposDispositivo
