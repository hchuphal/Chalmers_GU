/**
 */
package manufacturingSystem.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import manufacturingSystem.ManufacturingSystemFactory;
import manufacturingSystem.OutputDecision;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Decision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputDecisionTest extends TestCase {

	/**
	 * The fixture for this Output Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDecision fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputDecisionTest.class);
	}

	/**
	 * Constructs a new Output Decision test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDecisionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Output Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OutputDecision fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Output Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDecision getFixture() {
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
		setFixture(ManufacturingSystemFactory.eINSTANCE.createOutputDecision());
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

} //OutputDecisionTest
