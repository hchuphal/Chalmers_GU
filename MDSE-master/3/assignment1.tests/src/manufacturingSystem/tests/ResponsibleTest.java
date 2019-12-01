/**
 */
package manufacturingSystem.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import manufacturingSystem.ManufacturingSystemFactory;
import manufacturingSystem.Responsible;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Responsible</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponsibleTest extends TestCase {

	/**
	 * The fixture for this Responsible test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Responsible fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResponsibleTest.class);
	}

	/**
	 * Constructs a new Responsible test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Responsible test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Responsible fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Responsible test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Responsible getFixture() {
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
		setFixture(ManufacturingSystemFactory.eINSTANCE.createResponsible());
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

} //ResponsibleTest
