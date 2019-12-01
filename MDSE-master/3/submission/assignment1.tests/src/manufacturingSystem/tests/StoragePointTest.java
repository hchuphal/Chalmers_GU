/**
 */
package manufacturingSystem.tests;

import junit.textui.TestRunner;

import manufacturingSystem.ManufacturingSystemFactory;
import manufacturingSystem.StoragePoint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Storage Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StoragePointTest extends ManufacturingSystemElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StoragePointTest.class);
	}

	/**
	 * Constructs a new Storage Point test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoragePointTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Storage Point test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StoragePoint getFixture() {
		return (StoragePoint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManufacturingSystemFactory.eINSTANCE.createStoragePoint());
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

} //StoragePointTest
