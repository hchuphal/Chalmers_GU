/**
 */
package brickModel2.tests;

import brickModel2.AbstractBrick;
import brickModel2.BrickModel2Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Brick</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractBrickTest extends BrickElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractBrickTest.class);
	}

	/**
	 * Constructs a new Abstract Brick test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBrickTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract Brick test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbstractBrick getFixture() {
		return (AbstractBrick)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BrickModel2Factory.eINSTANCE.createAbstractBrick());
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

} //AbstractBrickTest
