/**
 */
package manufacturingSystem.tests;

import junit.textui.TestRunner;

import manufacturingSystem.ManufacturingSystemFactory;
import manufacturingSystem.WorkPieceCondition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Piece Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkPieceConditionTest extends InputConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkPieceConditionTest.class);
	}

	/**
	 * Constructs a new Work Piece Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Piece Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkPieceCondition getFixture() {
		return (WorkPieceCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufacturingSystemFactory.eINSTANCE.createWorkPieceCondition());
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

} //WorkPieceConditionTest
