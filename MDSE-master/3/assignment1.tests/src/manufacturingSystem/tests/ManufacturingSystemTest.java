/**
 */
package manufacturingSystem.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import manufacturingSystem.ManufacturingSystem;
import manufacturingSystem.ManufacturingSystemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manufacturing System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManufacturingSystemTest extends TestCase {

	/**
	 * The fixture for this Manufacturing System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManufacturingSystemTest.class);
	}

	/**
	 * Constructs a new Manufacturing System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Manufacturing System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ManufacturingSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Manufacturing System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingSystem getFixture() {
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
		setFixture(ManufacturingSystemFactory.eINSTANCE.createManufacturingSystem());
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

} //ManufacturingSystemTest
