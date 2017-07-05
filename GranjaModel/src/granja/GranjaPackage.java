/**
 * @author Jose Antonio de Benito Suarez
 * Clase encargada de la instanciacion de ciertos aspectos correspondientes a sirius
 *  */
package granja;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see granja.GranjaFactory
 * @model kind="package"
 * @generated
 */
public interface GranjaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "granja";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xtext.org/dsl/granja/granja";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "granja";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GranjaPackage eINSTANCE = granja.impl.GranjaPackageImpl.init();

	/**
	 * The meta object id for the '{@link granja.impl.GranjaImpl <em>Granja</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see granja.impl.GranjaImpl
	 * @see granja.impl.GranjaPackageImpl#getGranja()
	 * @generated
	 */
	int GRANJA = 0;

	/**
	 * The feature id for the '<em><b>Nombre Granja</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANJA__NOMBRE_GRANJA = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANJA__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANJA__LOGIN = 2;

	/**
	 * The feature id for the '<em><b>Dispositivos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANJA__DISPOSITIVOS = 3;

	/**
	 * The feature id for the '<em><b>Tipos acciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANJA__TIPOS_ACCIONES = 4;

	/**
	 * The feature id for the '<em><b>Tipos numeros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANJA__TIPOS_NUMEROS = 5;

	/**
	 * The number of structural features of the '<em>Granja</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANJA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Granja</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRANJA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link granja.impl.loginImpl <em>login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see granja.impl.loginImpl
	 * @see granja.impl.GranjaPackageImpl#getlogin()
	 * @generated
	 */
	int LOGIN = 1;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Contrasena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__CONTRASENA = 1;

	/**
	 * The number of structural features of the '<em>login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link granja.impl.DispositivosImpl <em>Dispositivos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see granja.impl.DispositivosImpl
	 * @see granja.impl.GranjaPackageImpl#getDispositivos()
	 * @generated
	 */
	int DISPOSITIVOS = 2;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVOS__CODIGO = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVOS__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Temperatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVOS__TEMPERATURA = 2;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVOS__ACCION = 3;

	/**
	 * The number of structural features of the '<em>Dispositivos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVOS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dispositivos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPOSITIVOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link granja.impl.accionImpl <em>accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see granja.impl.accionImpl
	 * @see granja.impl.GranjaPackageImpl#getaccion()
	 * @generated
	 */
	int ACCION = 3;

	/**
	 * The feature id for the '<em><b>Nombre Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__NOMBRE_ACCION = 0;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__NUMERO = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__DESCRIPCION = 2;

	/**
	 * The number of structural features of the '<em>accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link granja.impl.numeroImpl <em>numero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see granja.impl.numeroImpl
	 * @see granja.impl.GranjaPackageImpl#getnumero()
	 * @generated
	 */
	int NUMERO = 4;

	/**
	 * The feature id for the '<em><b>Id Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO__ID_NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Datos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO__DATOS = 1;

	/**
	 * The number of structural features of the '<em>numero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>numero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link granja.Datos <em>Datos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see granja.Datos
	 * @see granja.impl.GranjaPackageImpl#getDatos()
	 * @generated
	 */
	int DATOS = 5;

	/**
	 * The meta object id for the '{@link granja.Tipo <em>Tipo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see granja.Tipo
	 * @see granja.impl.GranjaPackageImpl#getTipo()
	 * @generated
	 */
	int TIPO = 6;

	/**
	 * The meta object id for the '{@link granja.TiposDispositivo <em>Tipos Dispositivo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see granja.TiposDispositivo
	 * @see granja.impl.GranjaPackageImpl#getTiposDispositivo()
	 * @generated
	 */
	int TIPOS_DISPOSITIVO = 7;

	/**
	 * The meta object id for the '{@link granja.NombreAccion <em>Nombre Accion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see granja.NombreAccion
	 * @see granja.impl.GranjaPackageImpl#getNombreAccion()
	 * @generated
	 */
	int NOMBRE_ACCION = 8;


	/**
	 * Returns the meta object for class '{@link granja.Granja <em>Granja</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Granja</em>'.
	 * @see granja.Granja
	 * @generated
	 */
	EClass getGranja();

	/**
	 * Returns the meta object for the attribute '{@link granja.Granja#getNombreGranja <em>Nombre Granja</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Granja</em>'.
	 * @see granja.Granja#getNombreGranja()
	 * @see #getGranja()
	 * @generated
	 */
	EAttribute getGranja_NombreGranja();

	/**
	 * Returns the meta object for the attribute '{@link granja.Granja#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see granja.Granja#getTipo()
	 * @see #getGranja()
	 * @generated
	 */
	EAttribute getGranja_Tipo();

	/**
	 * Returns the meta object for the containment reference '{@link granja.Granja#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Login</em>'.
	 * @see granja.Granja#getLogin()
	 * @see #getGranja()
	 * @generated
	 */
	EReference getGranja_Login();

	/**
	 * Returns the meta object for the containment reference list '{@link granja.Granja#getDispositivos <em>Dispositivos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dispositivos</em>'.
	 * @see granja.Granja#getDispositivos()
	 * @see #getGranja()
	 * @generated
	 */
	EReference getGranja_Dispositivos();

	/**
	 * Returns the meta object for the containment reference list '{@link granja.Granja#getTipos_acciones <em>Tipos acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipos acciones</em>'.
	 * @see granja.Granja#getTipos_acciones()
	 * @see #getGranja()
	 * @generated
	 */
	EReference getGranja_Tipos_acciones();

	/**
	 * Returns the meta object for the containment reference list '{@link granja.Granja#getTipos_numeros <em>Tipos numeros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipos numeros</em>'.
	 * @see granja.Granja#getTipos_numeros()
	 * @see #getGranja()
	 * @generated
	 */
	EReference getGranja_Tipos_numeros();

	/**
	 * Returns the meta object for class '{@link granja.login <em>login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>login</em>'.
	 * @see granja.login
	 * @generated
	 */
	EClass getlogin();

	/**
	 * Returns the meta object for the attribute '{@link granja.login#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see granja.login#getUsuario()
	 * @see #getlogin()
	 * @generated
	 */
	EAttribute getlogin_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link granja.login#getContrasena <em>Contrasena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrasena</em>'.
	 * @see granja.login#getContrasena()
	 * @see #getlogin()
	 * @generated
	 */
	EAttribute getlogin_Contrasena();

	/**
	 * Returns the meta object for class '{@link granja.Dispositivos <em>Dispositivos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispositivos</em>'.
	 * @see granja.Dispositivos
	 * @generated
	 */
	EClass getDispositivos();

	/**
	 * Returns the meta object for the attribute '{@link granja.Dispositivos#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see granja.Dispositivos#getCodigo()
	 * @see #getDispositivos()
	 * @generated
	 */
	EAttribute getDispositivos_Codigo();

	/**
	 * Returns the meta object for the attribute '{@link granja.Dispositivos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see granja.Dispositivos#getNombre()
	 * @see #getDispositivos()
	 * @generated
	 */
	EAttribute getDispositivos_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link granja.Dispositivos#getTemperatura <em>Temperatura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperatura</em>'.
	 * @see granja.Dispositivos#getTemperatura()
	 * @see #getDispositivos()
	 * @generated
	 */
	EAttribute getDispositivos_Temperatura();

	/**
	 * Returns the meta object for the containment reference '{@link granja.Dispositivos#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accion</em>'.
	 * @see granja.Dispositivos#getAccion()
	 * @see #getDispositivos()
	 * @generated
	 */
	EReference getDispositivos_Accion();

	/**
	 * Returns the meta object for class '{@link granja.accion <em>accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>accion</em>'.
	 * @see granja.accion
	 * @generated
	 */
	EClass getaccion();

	/**
	 * Returns the meta object for the attribute '{@link granja.accion#getNombreAccion <em>Nombre Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Accion</em>'.
	 * @see granja.accion#getNombreAccion()
	 * @see #getaccion()
	 * @generated
	 */
	EAttribute getaccion_NombreAccion();

	/**
	 * Returns the meta object for the containment reference '{@link granja.accion#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numero</em>'.
	 * @see granja.accion#getNumero()
	 * @see #getaccion()
	 * @generated
	 */
	EReference getaccion_Numero();

	/**
	 * Returns the meta object for the attribute '{@link granja.accion#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see granja.accion#getDescripcion()
	 * @see #getaccion()
	 * @generated
	 */
	EAttribute getaccion_Descripcion();

	/**
	 * Returns the meta object for class '{@link granja.numero <em>numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>numero</em>'.
	 * @see granja.numero
	 * @generated
	 */
	EClass getnumero();

	/**
	 * Returns the meta object for the attribute '{@link granja.numero#getIdNumero <em>Id Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Numero</em>'.
	 * @see granja.numero#getIdNumero()
	 * @see #getnumero()
	 * @generated
	 */
	EAttribute getnumero_IdNumero();

	/**
	 * Returns the meta object for the attribute '{@link granja.numero#getDatos <em>Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datos</em>'.
	 * @see granja.numero#getDatos()
	 * @see #getnumero()
	 * @generated
	 */
	EAttribute getnumero_Datos();

	/**
	 * Returns the meta object for enum '{@link granja.Datos <em>Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datos</em>'.
	 * @see granja.Datos
	 * @generated
	 */
	EEnum getDatos();

	/**
	 * Returns the meta object for enum '{@link granja.Tipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo</em>'.
	 * @see granja.Tipo
	 * @generated
	 */
	EEnum getTipo();

	/**
	 * Returns the meta object for enum '{@link granja.TiposDispositivo <em>Tipos Dispositivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipos Dispositivo</em>'.
	 * @see granja.TiposDispositivo
	 * @generated
	 */
	EEnum getTiposDispositivo();

	/**
	 * Returns the meta object for enum '{@link granja.NombreAccion <em>Nombre Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nombre Accion</em>'.
	 * @see granja.NombreAccion
	 * @generated
	 */
	EEnum getNombreAccion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GranjaFactory getGranjaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link granja.impl.GranjaImpl <em>Granja</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see granja.impl.GranjaImpl
		 * @see granja.impl.GranjaPackageImpl#getGranja()
		 * @generated
		 */
		EClass GRANJA = eINSTANCE.getGranja();

		/**
		 * The meta object literal for the '<em><b>Nombre Granja</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANJA__NOMBRE_GRANJA = eINSTANCE.getGranja_NombreGranja();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRANJA__TIPO = eINSTANCE.getGranja_Tipo();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRANJA__LOGIN = eINSTANCE.getGranja_Login();

		/**
		 * The meta object literal for the '<em><b>Dispositivos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRANJA__DISPOSITIVOS = eINSTANCE.getGranja_Dispositivos();

		/**
		 * The meta object literal for the '<em><b>Tipos acciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRANJA__TIPOS_ACCIONES = eINSTANCE.getGranja_Tipos_acciones();

		/**
		 * The meta object literal for the '<em><b>Tipos numeros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRANJA__TIPOS_NUMEROS = eINSTANCE.getGranja_Tipos_numeros();

		/**
		 * The meta object literal for the '{@link granja.impl.loginImpl <em>login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see granja.impl.loginImpl
		 * @see granja.impl.GranjaPackageImpl#getlogin()
		 * @generated
		 */
		EClass LOGIN = eINSTANCE.getlogin();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__USUARIO = eINSTANCE.getlogin_Usuario();

		/**
		 * The meta object literal for the '<em><b>Contrasena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__CONTRASENA = eINSTANCE.getlogin_Contrasena();

		/**
		 * The meta object literal for the '{@link granja.impl.DispositivosImpl <em>Dispositivos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see granja.impl.DispositivosImpl
		 * @see granja.impl.GranjaPackageImpl#getDispositivos()
		 * @generated
		 */
		EClass DISPOSITIVOS = eINSTANCE.getDispositivos();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPOSITIVOS__CODIGO = eINSTANCE.getDispositivos_Codigo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPOSITIVOS__NOMBRE = eINSTANCE.getDispositivos_Nombre();

		/**
		 * The meta object literal for the '<em><b>Temperatura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPOSITIVOS__TEMPERATURA = eINSTANCE.getDispositivos_Temperatura();

		/**
		 * The meta object literal for the '<em><b>Accion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPOSITIVOS__ACCION = eINSTANCE.getDispositivos_Accion();

		/**
		 * The meta object literal for the '{@link granja.impl.accionImpl <em>accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see granja.impl.accionImpl
		 * @see granja.impl.GranjaPackageImpl#getaccion()
		 * @generated
		 */
		EClass ACCION = eINSTANCE.getaccion();

		/**
		 * The meta object literal for the '<em><b>Nombre Accion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION__NOMBRE_ACCION = eINSTANCE.getaccion_NombreAccion();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__NUMERO = eINSTANCE.getaccion_Numero();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION__DESCRIPCION = eINSTANCE.getaccion_Descripcion();

		/**
		 * The meta object literal for the '{@link granja.impl.numeroImpl <em>numero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see granja.impl.numeroImpl
		 * @see granja.impl.GranjaPackageImpl#getnumero()
		 * @generated
		 */
		EClass NUMERO = eINSTANCE.getnumero();

		/**
		 * The meta object literal for the '<em><b>Id Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERO__ID_NUMERO = eINSTANCE.getnumero_IdNumero();

		/**
		 * The meta object literal for the '<em><b>Datos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERO__DATOS = eINSTANCE.getnumero_Datos();

		/**
		 * The meta object literal for the '{@link granja.Datos <em>Datos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see granja.Datos
		 * @see granja.impl.GranjaPackageImpl#getDatos()
		 * @generated
		 */
		EEnum DATOS = eINSTANCE.getDatos();

		/**
		 * The meta object literal for the '{@link granja.Tipo <em>Tipo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see granja.Tipo
		 * @see granja.impl.GranjaPackageImpl#getTipo()
		 * @generated
		 */
		EEnum TIPO = eINSTANCE.getTipo();

		/**
		 * The meta object literal for the '{@link granja.TiposDispositivo <em>Tipos Dispositivo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see granja.TiposDispositivo
		 * @see granja.impl.GranjaPackageImpl#getTiposDispositivo()
		 * @generated
		 */
		EEnum TIPOS_DISPOSITIVO = eINSTANCE.getTiposDispositivo();

		/**
		 * The meta object literal for the '{@link granja.NombreAccion <em>Nombre Accion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see granja.NombreAccion
		 * @see granja.impl.GranjaPackageImpl#getNombreAccion()
		 * @generated
		 */
		EEnum NOMBRE_ACCION = eINSTANCE.getNombreAccion();

	}

} //GranjaPackage
