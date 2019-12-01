/**
 */
package brickModel2.tests;

import brickModel2.BrickModel2Factory;
import brickModel2.ComplexBrick;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complex Brick</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexBrickTest extends BrickElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComplexBrickTest.class);
	}

	/**
	 * Constructs a new Complex Brick test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexBrickTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Complex Brick test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComplexBrick getFixture() {
		return (ComplexBrick)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrickModel2Factory.eINSTANCE.createComplexBrick());
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

} //ComplexBrickTest
