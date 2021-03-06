/**
 * @author Jose Antonio de Benito Suarez
 * Clase que implementa la interface numero y en la que se realizaran las operaciones 
 * necesarias para el funcionamiento del programa. Esta clase es de creacion de SIRIUS
 * los objetos
 *  */
package granja.impl;

import granja.Datos;
import granja.GranjaPackage;
import granja.numero;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>numero</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link granja.impl.numeroImpl#getIdNumero <em>Id Numero</em>}</li>
 *   <li>{@link granja.impl.numeroImpl#getDatos <em>Datos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class numeroImpl extends MinimalEObjectImpl.Container implements numero {
	/**
	 * The default value of the '{@link #getIdNumero() <em>Id Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNumero()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_NUMERO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdNumero() <em>Id Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNumero()
	 * @generated
	 * @ordered
	 */
	protected String idNumero = ID_NUMERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatos() <em>Datos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatos()
	 * @generated
	 * @ordered
	 */
	protected static final Datos DATOS_EDEFAULT = Datos.FOTOS;

	/**
	 * The cached value of the '{@link #getDatos() <em>Datos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatos()
	 * @generated
	 * @ordered
	 */
	protected Datos datos = DATOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected numeroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GranjaPackage.Literals.NUMERO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdNumero() {
		return idNumero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdNumero(String newIdNumero) {
		String oldIdNumero = idNumero;
		idNumero = newIdNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.NUMERO__ID_NUMERO, oldIdNumero, idNumero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datos getDatos() {
		return datos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatos(Datos newDatos) {
		Datos oldDatos = datos;
		datos = newDatos == null ? DATOS_EDEFAULT : newDatos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.NUMERO__DATOS, oldDatos, datos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GranjaPackage.NUMERO__ID_NUMERO:
				return getIdNumero();
			case GranjaPackage.NUMERO__DATOS:
				return getDatos();
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
			case GranjaPackage.NUMERO__ID_NUMERO:
				setIdNumero((String)newValue);
				return;
			case GranjaPackage.NUMERO__DATOS:
				setDatos((Datos)newValue);
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
			case GranjaPackage.NUMERO__ID_NUMERO:
				setIdNumero(ID_NUMERO_EDEFAULT);
				return;
			case GranjaPackage.NUMERO__DATOS:
				setDatos(DATOS_EDEFAULT);
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
			case GranjaPackage.NUMERO__ID_NUMERO:
				return ID_NUMERO_EDEFAULT == null ? idNumero != null : !ID_NUMERO_EDEFAULT.equals(idNumero);
			case GranjaPackage.NUMERO__DATOS:
				return datos != DATOS_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idNumero: ");
		result.append(idNumero);
		result.append(", datos: ");
		result.append(datos);
		result.append(')');
		return result.toString();
	}

} //numeroImpl
