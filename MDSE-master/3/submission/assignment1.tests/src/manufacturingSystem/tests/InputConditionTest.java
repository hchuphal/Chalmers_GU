/**
 */
package manufacturingSystem.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import manufacturingSystem.InputCondition;
import manufacturingSystem.ManufacturingSystemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputConditionTest extends TestCase {

	/**
	 * The fixture for this Input Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputCondition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputConditionTest.class);
	}

	/**
	 * Constructs a new Input Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConditionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Input Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InputCondition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Input Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputCondition getFixture() {
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
		setFixture(ManufacturingSystemFactory.eINSTANCE.createInputCondition());
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

} //InputConditionTest
