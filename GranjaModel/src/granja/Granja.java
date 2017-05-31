/**
 */
package granja;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Granja</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link granja.Granja#getNombreGranja <em>Nombre Granja</em>}</li>
 *   <li>{@link granja.Granja#getTipo <em>Tipo</em>}</li>
 *   <li>{@link granja.Granja#getLogin <em>Login</em>}</li>
 *   <li>{@link granja.Granja#getDispositivos <em>Dispositivos</em>}</li>
 *   <li>{@link granja.Granja#getTipos_acciones <em>Tipos acciones</em>}</li>
 *   <li>{@link granja.Granja#getTipos_numeros <em>Tipos numeros</em>}</li>
 * </ul>
 *
 * @see granja.GranjaPackage#getGranja()
 * @model
 * @generated
 */
public interface Granja extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Granja</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Granja</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Granja</em>' attribute.
	 * @see #setNombreGranja(String)
	 * @see granja.GranjaPackage#getGranja_NombreGranja()
	 * @model
	 * @generated
	 */
	String getNombreGranja();

	/**
	 * Sets the value of the '{@link granja.Granja#getNombreGranja <em>Nombre Granja</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Granja</em>' attribute.
	 * @see #getNombreGranja()
	 * @generated
	 */
	void setNombreGranja(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link granja.Tipo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see granja.Tipo
	 * @see #setTipo(Tipo)
	 * @see granja.GranjaPackage#getGranja_Tipo()
	 * @model
	 * @generated
	 */
	Tipo getTipo();

	/**
	 * Sets the value of the '{@link granja.Granja#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see granja.Tipo
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' containment reference.
	 * @see #setLogin(login)
	 * @see granja.GranjaPackage#getGranja_Login()
	 * @model containment="true"
	 * @generated
	 */
	login getLogin();

	/**
	 * Sets the value of the '{@link granja.Granja#getLogin <em>Login</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' containment reference.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(login value);

	/**
	 * Returns the value of the '<em><b>Dispositivos</b></em>' containment reference list.
	 * The list contents are of type {@link granja.Dispositivos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispositivos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispositivos</em>' containment reference list.
	 * @see granja.GranjaPackage#getGranja_Dispositivos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dispositivos> getDispositivos();

	/**
	 * Returns the value of the '<em><b>Tipos acciones</b></em>' containment reference list.
	 * The list contents are of type {@link granja.accion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipos acciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipos acciones</em>' containment reference list.
	 * @see granja.GranjaPackage#getGranja_Tipos_acciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<accion> getTipos_acciones();

	/**
	 * Returns the value of the '<em><b>Tipos numeros</b></em>' containment reference list.
	 * The list contents are of type {@link granja.numero}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipos numeros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipos numeros</em>' containment reference list.
	 * @see granja.GranjaPackage#getGranja_Tipos_numeros()
	 * @model containment="true"
	 * @generated
	 */
	EList<numero> getTipos_numeros();

} // Granja
