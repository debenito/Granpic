/**
 */
package granja.impl;

import granja.Dispositivos;
import granja.Granja;
import granja.GranjaPackage;
import granja.Tipo;
import granja.accion;
import granja.login;
import granja.numero;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Granja</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link granja.impl.GranjaImpl#getNombreGranja <em>Nombre Granja</em>}</li>
 *   <li>{@link granja.impl.GranjaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link granja.impl.GranjaImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link granja.impl.GranjaImpl#getDispositivos <em>Dispositivos</em>}</li>
 *   <li>{@link granja.impl.GranjaImpl#getTipos_acciones <em>Tipos acciones</em>}</li>
 *   <li>{@link granja.impl.GranjaImpl#getTipos_numeros <em>Tipos numeros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GranjaImpl extends MinimalEObjectImpl.Container implements Granja {
	/**
	 * The default value of the '{@link #getNombreGranja() <em>Nombre Granja</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGranja()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_GRANJA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreGranja() <em>Nombre Granja</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreGranja()
	 * @generated
	 * @ordered
	 */
	protected String nombreGranja = NOMBRE_GRANJA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final Tipo TIPO_EDEFAULT = Tipo.DELAVAL;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected Tipo tipo = TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected login login;

	/**
	 * The cached value of the '{@link #getDispositivos() <em>Dispositivos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositivos()
	 * @generated
	 * @ordered
	 */
	protected EList<Dispositivos> dispositivos;

	/**
	 * The cached value of the '{@link #getTipos_acciones() <em>Tipos acciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipos_acciones()
	 * @generated
	 * @ordered
	 */
	protected EList<accion> tipos_acciones;

	/**
	 * The cached value of the '{@link #getTipos_numeros() <em>Tipos numeros</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipos_numeros()
	 * @generated
	 * @ordered
	 */
	protected EList<numero> tipos_numeros;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GranjaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GranjaPackage.Literals.GRANJA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreGranja() {
		return nombreGranja;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreGranja(String newNombreGranja) {
		String oldNombreGranja = nombreGranja;
		nombreGranja = newNombreGranja;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.GRANJA__NOMBRE_GRANJA, oldNombreGranja, nombreGranja));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(Tipo newTipo) {
		Tipo oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.GRANJA__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public login getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogin(login newLogin, NotificationChain msgs) {
		login oldLogin = login;
		login = newLogin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GranjaPackage.GRANJA__LOGIN, oldLogin, newLogin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(login newLogin) {
		if (newLogin != login) {
			NotificationChain msgs = null;
			if (login != null)
				msgs = ((InternalEObject)login).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GranjaPackage.GRANJA__LOGIN, null, msgs);
			if (newLogin != null)
				msgs = ((InternalEObject)newLogin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GranjaPackage.GRANJA__LOGIN, null, msgs);
			msgs = basicSetLogin(newLogin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.GRANJA__LOGIN, newLogin, newLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dispositivos> getDispositivos() {
		if (dispositivos == null) {
			dispositivos = new EObjectContainmentEList<Dispositivos>(Dispositivos.class, this, GranjaPackage.GRANJA__DISPOSITIVOS);
		}
		return dispositivos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<accion> getTipos_acciones() {
		if (tipos_acciones == null) {
			tipos_acciones = new EObjectContainmentEList<accion>(accion.class, this, GranjaPackage.GRANJA__TIPOS_ACCIONES);
		}
		return tipos_acciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<numero> getTipos_numeros() {
		if (tipos_numeros == null) {
			tipos_numeros = new EObjectContainmentEList<numero>(numero.class, this, GranjaPackage.GRANJA__TIPOS_NUMEROS);
		}
		return tipos_numeros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GranjaPackage.GRANJA__LOGIN:
				return basicSetLogin(null, msgs);
			case GranjaPackage.GRANJA__DISPOSITIVOS:
				return ((InternalEList<?>)getDispositivos()).basicRemove(otherEnd, msgs);
			case GranjaPackage.GRANJA__TIPOS_ACCIONES:
				return ((InternalEList<?>)getTipos_acciones()).basicRemove(otherEnd, msgs);
			case GranjaPackage.GRANJA__TIPOS_NUMEROS:
				return ((InternalEList<?>)getTipos_numeros()).basicRemove(otherEnd, msgs);
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
			case GranjaPackage.GRANJA__NOMBRE_GRANJA:
				return getNombreGranja();
			case GranjaPackage.GRANJA__TIPO:
				return getTipo();
			case GranjaPackage.GRANJA__LOGIN:
				return getLogin();
			case GranjaPackage.GRANJA__DISPOSITIVOS:
				return getDispositivos();
			case GranjaPackage.GRANJA__TIPOS_ACCIONES:
				return getTipos_acciones();
			case GranjaPackage.GRANJA__TIPOS_NUMEROS:
				return getTipos_numeros();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GranjaPackage.GRANJA__NOMBRE_GRANJA:
				setNombreGranja((String)newValue);
				return;
			case GranjaPackage.GRANJA__TIPO:
				setTipo((Tipo)newValue);
				return;
			case GranjaPackage.GRANJA__LOGIN:
				setLogin((login)newValue);
				return;
			case GranjaPackage.GRANJA__DISPOSITIVOS:
				getDispositivos().clear();
				getDispositivos().addAll((Collection<? extends Dispositivos>)newValue);
				return;
			case GranjaPackage.GRANJA__TIPOS_ACCIONES:
				getTipos_acciones().clear();
				getTipos_acciones().addAll((Collection<? extends accion>)newValue);
				return;
			case GranjaPackage.GRANJA__TIPOS_NUMEROS:
				getTipos_numeros().clear();
				getTipos_numeros().addAll((Collection<? extends numero>)newValue);
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
			case GranjaPackage.GRANJA__NOMBRE_GRANJA:
				setNombreGranja(NOMBRE_GRANJA_EDEFAULT);
				return;
			case GranjaPackage.GRANJA__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case GranjaPackage.GRANJA__LOGIN:
				setLogin((login)null);
				return;
			case GranjaPackage.GRANJA__DISPOSITIVOS:
				getDispositivos().clear();
				return;
			case GranjaPackage.GRANJA__TIPOS_ACCIONES:
				getTipos_acciones().clear();
				return;
			case GranjaPackage.GRANJA__TIPOS_NUMEROS:
				getTipos_numeros().clear();
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
			case GranjaPackage.GRANJA__NOMBRE_GRANJA:
				return NOMBRE_GRANJA_EDEFAULT == null ? nombreGranja != null : !NOMBRE_GRANJA_EDEFAULT.equals(nombreGranja);
			case GranjaPackage.GRANJA__TIPO:
				return tipo != TIPO_EDEFAULT;
			case GranjaPackage.GRANJA__LOGIN:
				return login != null;
			case GranjaPackage.GRANJA__DISPOSITIVOS:
				return dispositivos != null && !dispositivos.isEmpty();
			case GranjaPackage.GRANJA__TIPOS_ACCIONES:
				return tipos_acciones != null && !tipos_acciones.isEmpty();
			case GranjaPackage.GRANJA__TIPOS_NUMEROS:
				return tipos_numeros != null && !tipos_numeros.isEmpty();
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
		result.append(" (nombreGranja: ");
		result.append(nombreGranja);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //GranjaImpl
