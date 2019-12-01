/**
 */
package manufacturingSystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see manufacturingSystem.ManufacturingSystemPackage
 * @generated
 */
public interface ManufacturingSystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManufacturingSystemFactory eINSTANCE = manufacturingSystem.impl.ManufacturingSystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Manufacturing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manufacturing System</em>'.
	 * @generated
	 */
	ManufacturingSystem createManufacturingSystem();

	/**
	 * Returns a new object of class '<em>Manufacturing Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manufacturing Step</em>'.
	 * @generated
	 */
	ManufacturingStep createManufacturingStep();

	/**
	 * Returns a new object of class '<em>Transport Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Steps</em>'.
	 * @generated
	 */
	TransportSteps createTransportSteps();

	/**
	 * Returns a new object of class '<em>Quality Assurance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Assurance</em>'.
	 * @generated
	 */
	QualityAssurance createQualityAssurance();

	/**
	 * Returns a new object of class '<em>Work Pieces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Pieces</em>'.
	 * @generated
	 */
	WorkPieces createWorkPieces();

	/**
	 * Returns a new object of class '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage</em>'.
	 * @generated
	 */
	Storage createStorage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ManufacturingSystemPackage getManufacturingSystemPackage();

} //ManufacturingSystemFactory
