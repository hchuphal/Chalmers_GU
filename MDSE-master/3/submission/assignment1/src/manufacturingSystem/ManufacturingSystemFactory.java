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
	 * Returns a new object of class '<em>Work Piece</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Piece</em>'.
	 * @generated
	 */
	WorkPiece createWorkPiece();

	/**
	 * Returns a new object of class '<em>Manufacturing Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manufacturing Step</em>'.
	 * @generated
	 */
	ManufacturingStep createManufacturingStep();

	/**
	 * Returns a new object of class '<em>Manufacturing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manufacturing System</em>'.
	 * @generated
	 */
	ManufacturingSystem createManufacturingSystem();

	/**
	 * Returns a new object of class '<em>Transport Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Step</em>'.
	 * @generated
	 */
	TransportStep createTransportStep();

	/**
	 * Returns a new object of class '<em>Quality Assurance Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Assurance Step</em>'.
	 * @generated
	 */
	QualityAssuranceStep createQualityAssuranceStep();

	/**
	 * Returns a new object of class '<em>Responsible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsible</em>'.
	 * @generated
	 */
	Responsible createResponsible();

	/**
	 * Returns a new object of class '<em>Input Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Condition</em>'.
	 * @generated
	 */
	InputCondition createInputCondition();

	/**
	 * Returns a new object of class '<em>Storage Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Point</em>'.
	 * @generated
	 */
	StoragePoint createStoragePoint();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	ManufacturingSystemElement createManufacturingSystemElement();

	/**
	 * Returns a new object of class '<em>Composite Manufacturing Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Manufacturing Step</em>'.
	 * @generated
	 */
	CompositeManufacturingStep createCompositeManufacturingStep();

	/**
	 * Returns a new object of class '<em>Work Piece Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Piece Type</em>'.
	 * @generated
	 */
	WorkPieceType createWorkPieceType();

	/**
	 * Returns a new object of class '<em>Output Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Decision</em>'.
	 * @generated
	 */
	OutputDecision createOutputDecision();

	/**
	 * Returns a new object of class '<em>Work Piece Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Piece Condition</em>'.
	 * @generated
	 */
	WorkPieceCondition createWorkPieceCondition();

	/**
	 * Returns a new object of class '<em>Binary Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Condition</em>'.
	 * @generated
	 */
	BinaryCondition createBinaryCondition();

	/**
	 * Returns a new object of class '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negation</em>'.
	 * @generated
	 */
	Negation createNegation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ManufacturingSystemPackage getManufacturingSystemPackage();

} //ManufacturingSystemFactory
