/**
 */
package granja.impl;

import granja.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GranjaFactoryImpl extends EFactoryImpl implements GranjaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GranjaFactory init() {
		try {
			GranjaFactory theGranjaFactory = (GranjaFactory)EPackage.Registry.INSTANCE.getEFactory(GranjaPackage.eNS_URI);
			if (theGranjaFactory != null) {
				return theGranjaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GranjaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GranjaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GranjaPackage.GRANJA: return createGranja();
			case GranjaPackage.LOGIN: return createlogin();
			case GranjaPackage.DISPOSITIVOS: return createDispositivos();
			case GranjaPackage.ACCION: return createaccion();
			case GranjaPackage.NUMERO: return createnumero();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GranjaPackage.DATOS:
				return createDatosFromString(eDataType, initialValue);
			case GranjaPackage.TIPO:
				return createTipoFromString(eDataType, initialValue);
			case GranjaPackage.TIPOS_DISPOSITIVO:
				return createTiposDispositivoFromString(eDataType, initialValue);
			case GranjaPackage.NOMBRE_ACCION:
				return createNombreAccionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GranjaPackage.DATOS:
				return convertDatosToString(eDataType, instanceValue);
			case GranjaPackage.TIPO:
				return convertTipoToString(eDataType, instanceValue);
			case GranjaPackage.TIPOS_DISPOSITIVO:
				return convertTiposDispositivoToString(eDataType, instanceValue);
			case GranjaPackage.NOMBRE_ACCION:
				return convertNombreAccionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Granja createGranja() {
		GranjaImpl granja = new GranjaImpl();
		return granja;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public login createlogin() {
		loginImpl login = new loginImpl();
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispositivos createDispositivos() {
		DispositivosImpl dispositivos = new DispositivosImpl();
		return dispositivos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public accion createaccion() {
		accionImpl accion = new accionImpl();
		return accion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public numero createnumero() {
		numeroImpl numero = new numeroImpl();
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datos createDatosFromString(EDataType eDataType, String initialValue) {
		Datos result = Datos.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo createTipoFromString(EDataType eDataType, String initialValue) {
		Tipo result = Tipo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiposDispositivo createTiposDispositivoFromString(EDataType eDataType, String initialValue) {
		TiposDispositivo result = TiposDispositivo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTiposDispositivoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NombreAccion createNombreAccionFromString(EDataType eDataType, String initialValue) {
		NombreAccion result = NombreAccion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNombreAccionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GranjaPackage getGranjaPackage() {
		return (GranjaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GranjaPackage getPackage() {
		return GranjaPackage.eINSTANCE;
	}

} //GranjaFactoryImpl
