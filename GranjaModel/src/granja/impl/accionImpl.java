/**
 * @author Jose Antonio de Benito Suarez
 * Clase que implementa la interface accion y en la que se realizaran las operaciones 
 * necesarias para el funcionamiento del programa. Esta clase es de creacion de SIRIUS
 * los objetos
 *  */
package granja.impl;

import granja.GranjaPackage;
import granja.NombreAccion;
import granja.accion;
import granja.numero;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link granja.impl.accionImpl#getNombreAccion <em>Nombre Accion</em>}</li>
 *   <li>{@link granja.impl.accionImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link granja.impl.accionImpl#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class accionImpl extends MinimalEObjectImpl.Container implements accion {
	/**
	 * The default value of the '{@link #getNombreAccion() <em>Nombre Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAccion()
	 * @generated
	 * @ordered
	 */
	protected static final NombreAccion NOMBRE_ACCION_EDEFAULT = NombreAccion.ABRIR;

	/**
	 * The cached value of the '{@link #getNombreAccion() <em>Nombre Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAccion()
	 * @generated
	 * @ordered
	 */
	protected NombreAccion nombreAccion = NOMBRE_ACCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected numero numero;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected accionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GranjaPackage.Literals.ACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NombreAccion getNombreAccion() {
		return nombreAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAccion(NombreAccion newNombreAccion) {
		NombreAccion oldNombreAccion = nombreAccion;
		nombreAccion = newNombreAccion == null ? NOMBRE_ACCION_EDEFAULT : newNombreAccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.ACCION__NOMBRE_ACCION, oldNombreAccion, nombreAccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public numero getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumero(numero newNumero, NotificationChain msgs) {
		numero oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GranjaPackage.ACCION__NUMERO, oldNumero, newNumero);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(numero newNumero) {
		if (newNumero != numero) {
			NotificationChain msgs = null;
			if (numero != null)
				msgs = ((InternalEObject)numero).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GranjaPackage.ACCION__NUMERO, null, msgs);
			if (newNumero != null)
				msgs = ((InternalEObject)newNumero).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GranjaPackage.ACCION__NUMERO, null, msgs);
			msgs = basicSetNumero(newNumero, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.ACCION__NUMERO, newNumero, newNumero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.ACCION__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GranjaPackage.ACCION__NUMERO:
				return basicSetNumero(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GranjaPackage.ACCION__NOMBRE_ACCION:
				return getNombreAccion();
			case GranjaPackage.ACCION__NUMERO:
				return getNumero();
			case GranjaPackage.ACCION__DESCRIPCION:
				return getDescripcion();
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
			case GranjaPackage.ACCION__NOMBRE_ACCION:
				setNombreAccion((NombreAccion)newValue);
				return;
			case GranjaPackage.ACCION__NUMERO:
				setNumero((numero)newValue);
				return;
			case GranjaPackage.ACCION__DESCRIPCION:
				setDescripcion((String)newValue);
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
			case GranjaPackage.ACCION__NOMBRE_ACCION:
				setNombreAccion(NOMBRE_ACCION_EDEFAULT);
				return;
			case GranjaPackage.ACCION__NUMERO:
				setNumero((numero)null);
				return;
			case GranjaPackage.ACCION__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
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
			case GranjaPackage.ACCION__NOMBRE_ACCION:
				return nombreAccion != NOMBRE_ACCION_EDEFAULT;
			case GranjaPackage.ACCION__NUMERO:
				return numero != null;
			case GranjaPackage.ACCION__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
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
		result.append(" (nombreAccion: ");
		result.append(nombreAccion);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //accionImpl
