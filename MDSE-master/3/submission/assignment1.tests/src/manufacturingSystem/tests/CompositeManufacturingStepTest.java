/**
 */
package manufacturingSystem.tests;

import junit.textui.TestRunner;

import manufacturingSystem.CompositeManufacturingStep;
import manufacturingSystem.ManufacturingSystemFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Manufacturing Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeManufacturingStepTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeManufacturingStepTest.class);
	}

	/**
	 * Constructs a new Composite Manufacturing Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeManufacturingStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Manufacturing Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeManufacturingStep getFixture() {
		return (CompositeManufacturingStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufacturingSystemFactory.eINSTANCE.createCompositeManufacturingStep());
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

} //CompositeManufacturingStepTest
