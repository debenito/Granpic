/**
 */
package granja.impl;

import granja.GranjaPackage;
import granja.login;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>login</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link granja.impl.loginImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link granja.impl.loginImpl#getContrasena <em>Contrasena</em>}</li>
 * </ul>
 *
 * @generated
 */
public class loginImpl extends MinimalEObjectImpl.Container implements login {
	/**
	 * The default value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected static final String USUARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected String usuario = USUARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getContrasena() <em>Contrasena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrasena()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRASENA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContrasena() <em>Contrasena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrasena()
	 * @generated
	 * @ordered
	 */
	protected String contrasena = CONTRASENA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected loginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GranjaPackage.Literals.LOGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuario(String newUsuario) {
		String oldUsuario = usuario;
		usuario = newUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.LOGIN__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContrasena(String newContrasena) {
		String oldContrasena = contrasena;
		contrasena = newContrasena;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GranjaPackage.LOGIN__CONTRASENA, oldContrasena, contrasena));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GranjaPackage.LOGIN__USUARIO:
				return getUsuario();
			case GranjaPackage.LOGIN__CONTRASENA:
				return getContrasena();
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
			case GranjaPackage.LOGIN__USUARIO:
				setUsuario((String)newValue);
				return;
			case GranjaPackage.LOGIN__CONTRASENA:
				setContrasena((String)newValue);
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
			case GranjaPackage.LOGIN__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case GranjaPackage.LOGIN__CONTRASENA:
				setContrasena(CONTRASENA_EDEFAULT);
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
			case GranjaPackage.LOGIN__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case GranjaPackage.LOGIN__CONTRASENA:
				return CONTRASENA_EDEFAULT == null ? contrasena != null : !CONTRASENA_EDEFAULT.equals(contrasena);
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
		result.append(" (usuario: ");
		result.append(usuario);
		result.append(", contrasena: ");
		result.append(contrasena);
		result.append(')');
		return result.toString();
	}

} //loginImpl
