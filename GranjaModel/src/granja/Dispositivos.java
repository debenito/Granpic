/**
 */
package granja;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispositivos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link granja.Dispositivos#getCodigo <em>Codigo</em>}</li>
 *   <li>{@link granja.Dispositivos#getNombre <em>Nombre</em>}</li>
 *   <li>{@link granja.Dispositivos#getTemperatura <em>Temperatura</em>}</li>
 *   <li>{@link granja.Dispositivos#getAccion <em>Accion</em>}</li>
 * </ul>
 *
 * @see granja.GranjaPackage#getDispositivos()
 * @model
 * @generated
 */
public interface Dispositivos extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo</em>' attribute.
	 * @see #setCodigo(String)
	 * @see granja.GranjaPackage#getDispositivos_Codigo()
	 * @model
	 * @generated
	 */
	String getCodigo();

	/**
	 * Sets the value of the '{@link granja.Dispositivos#getCodigo <em>Codigo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo</em>' attribute.
	 * @see #getCodigo()
	 * @generated
	 */
	void setCodigo(String value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The literals are from the enumeration {@link granja.TiposDispositivo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see granja.TiposDispositivo
	 * @see #setNombre(TiposDispositivo)
	 * @see granja.GranjaPackage#getDispositivos_Nombre()
	 * @model
	 * @generated
	 */
	TiposDispositivo getNombre();

	/**
	 * Sets the value of the '{@link granja.Dispositivos#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see granja.TiposDispositivo
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(TiposDispositivo value);

	/**
	 * Returns the value of the '<em><b>Temperatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperatura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperatura</em>' attribute.
	 * @see #setTemperatura(String)
	 * @see granja.GranjaPackage#getDispositivos_Temperatura()
	 * @model
	 * @generated
	 */
	String getTemperatura();

	/**
	 * Sets the value of the '{@link granja.Dispositivos#getTemperatura <em>Temperatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperatura</em>' attribute.
	 * @see #getTemperatura()
	 * @generated
	 */
	void setTemperatura(String value);

	/**
	 * Returns the value of the '<em><b>Accion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accion</em>' containment reference.
	 * @see #setAccion(accion)
	 * @see granja.GranjaPackage#getDispositivos_Accion()
	 * @model containment="true"
	 * @generated
	 */
	accion getAccion();

	/**
	 * Sets the value of the '{@link granja.Dispositivos#getAccion <em>Accion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accion</em>' containment reference.
	 * @see #getAccion()
	 * @generated
	 */
	void setAccion(accion value);

} // Dispositivos
