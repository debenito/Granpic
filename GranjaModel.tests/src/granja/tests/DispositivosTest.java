/**
 */
package granja.tests;

import granja.Dispositivos;
import granja.GranjaFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dispositivos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DispositivosTest extends TestCase {

	/**
	 * The fixture for this Dispositivos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dispositivos fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DispositivosTest.class);
	}

	/**
	 * Constructs a new Dispositivos test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispositivosTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dispositivos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Dispositivos fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dispositivos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dispositivos getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GranjaFactory.eINSTANCE.createDispositivos());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DispositivosTest
