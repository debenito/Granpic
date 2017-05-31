/**
 */
package granja;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>login</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link granja.login#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link granja.login#getContrasena <em>Contrasena</em>}</li>
 * </ul>
 *
 * @see granja.GranjaPackage#getlogin()
 * @model
 * @generated
 */
public interface login extends EObject {
	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuario</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' attribute.
	 * @see #setUsuario(String)
	 * @see granja.GranjaPackage#getlogin_Usuario()
	 * @model
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link granja.login#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Contrasena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrasena</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrasena</em>' attribute.
	 * @see #setContrasena(String)
	 * @see granja.GranjaPackage#getlogin_Contrasena()
	 * @model
	 * @generated
	 */
	String getContrasena();

	/**
	 * Sets the value of the '{@link granja.login#getContrasena <em>Contrasena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrasena</em>' attribute.
	 * @see #getContrasena()
	 * @generated
	 */
	void setContrasena(String value);

} // login
