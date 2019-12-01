/**
 */
package brickModel2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see brickModel2.BrickModel2Package
 * @generated
 */
public interface BrickModel2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BrickModel2Factory eINSTANCE = brickModel2.impl.BrickModel2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Limits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Limits</em>'.
	 * @generated
	 */
	Limits createLimits();

	/**
	 * Returns a new object of class '<em>Brick Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Brick Model</em>'.
	 * @generated
	 */
	BrickModel createBrickModel();

	/**
	 * Returns a new object of class '<em>Abstract Brick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Brick</em>'.
	 * @generated
	 */
	AbstractBrick createAbstractBrick();

	/**
	 * Returns a new object of class '<em>Complex Brick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Brick</em>'.
	 * @generated
	 */
	ComplexBrick createComplexBrick();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size</em>'.
	 * @generated
	 */
	Size createSize();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BrickModel2Package getBrickModel2Package();

} //BrickModel2Factory
