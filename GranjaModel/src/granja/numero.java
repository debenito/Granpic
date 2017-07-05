/**
 * @author Jose Antonio de Benito Suarez
 * Interface para la creacion de numeros 
 *  */
package granja;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>numero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link granja.numero#getIdNumero <em>Id Numero</em>}</li>
 *   <li>{@link granja.numero#getDatos <em>Datos</em>}</li>
 * </ul>
 *
 * @see granja.GranjaPackage#getnumero()
 * @model
 * @generated
 */
public interface numero extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * Metodo que devuelve el numero introducido
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Numero</em>' attribute.
	 * @see #setIdNumero(String)
	 * @see granja.GranjaPackage#getnumero_IdNumero()
	 * @model
	 * @generated
	 */
	String getIdNumero();

	/**
	 * Sets the value of the '{@link granja.numero#getIdNumero <em>Id Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *  Metodo que modifica el numero 
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Numero</em>' attribute.
	 * @see #getIdNumero()
	 * @generated
	 */
	void setIdNumero(String value);

	/**
	 * Returns the value of the '<em><b>Datos</b></em>' attribute.
	 * The literals are from the enumeration {@link granja.Datos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 *  Metodo que devuelve el tipo de dato introducido
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datos</em>' attribute.
	 * @see granja.Datos
	 * @see #setDatos(Datos)
	 * @see granja.GranjaPackage#getnumero_Datos()
	 * @model
	 * @generated
	 */
	Datos getDatos();

	/**
	 * Sets the value of the '{@link granja.numero#getDatos <em>Datos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *  Metodo que modifica el tipo de dato introducido
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datos</em>' attribute.
	 * @see granja.Datos
	 * @see #getDatos()
	 * @generated
	 */
	void setDatos(Datos value);

} // numero
