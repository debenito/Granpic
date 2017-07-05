/**
 * @author Jose Antonio de Benito Suarez
 * Clase encargada de llamar a distintas factorias las cueales se encarga de la creacion de 
 * los objetos
 *  */
package granja;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see granja.GranjaPackage
 * @generated
 */
public interface GranjaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GranjaFactory eINSTANCE = granja.impl.GranjaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Granja</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Granja</em>'.
	 * @generated
	 */
	Granja createGranja();

	/**
	 * Returns a new object of class '<em>login</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>login</em>'.
	 * @generated
	 */
	login createlogin();

	/**
	 * Returns a new object of class '<em>Dispositivos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dispositivos</em>'.
	 * @generated
	 */
	Dispositivos createDispositivos();

	/**
	 * Returns a new object of class '<em>accion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>accion</em>'.
	 * @generated
	 */
	accion createaccion();

	/**
	 * Returns a new object of class '<em>numero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>numero</em>'.
	 * @generated
	 */
	numero createnumero();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GranjaPackage getGranjaPackage();

} //GranjaFactory
