/**
 * @author Jose Antonio de Benito Suarez
 * Interface encargada de los metodos que puede realizar una accion
 */
package granja;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>accion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link granja.accion#getNombreAccion <em>Nombre Accion</em>}</li>
 *   <li>{@link granja.accion#getNumero <em>Numero</em>}</li>
 *   <li>{@link granja.accion#getDescripcion <em>Descripcion</em>}</li>
 * </ul>
 *
 * @see granja.GranjaPackage#getaccion()
 * @model
 * @generated
 */
public interface accion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Accion</b></em>' attribute.
	 * The literals are from the enumeration {@link granja.NombreAccion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Accion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * Define el nombre de la accion y es devuelto
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Accion</em>' attribute.
	 * @see granja.NombreAccion
	 * @see #setNombreAccion(NombreAccion)
	 * @see granja.GranjaPackage#getaccion_NombreAccion()
	 * @model
	 * @generated
	 */
	NombreAccion getNombreAccion();

	/**
	 * Sets the value of the '{@link granja.accion#getNombreAccion <em>Nombre Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * modifica el nombre de la accion
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Accion</em>' attribute.
	 * @see granja.NombreAccion
	 * @see #getNombreAccion()
	 * @generated
	 */
	void setNombreAccion(NombreAccion value);

	/**
	 * Returns the value of the '<em><b>Numero</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * devuelve el numero 
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' containment reference.
	 * @see #setNumero(numero)
	 * @see granja.GranjaPackage#getaccion_Numero()
	 * @model containment="true"
	 * @generated
	 */
	numero getNumero();

	/**
	 * Sets the value of the '{@link granja.accion#getNumero <em>Numero</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * Modifica el numero 
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' containment reference.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(numero value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * Devuelve la descripcion
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see granja.GranjaPackage#getaccion_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link granja.accion#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Modifica la descripcion
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

} // accion
