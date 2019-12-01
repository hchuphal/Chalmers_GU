/**
 */
package brickModel2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link brickModel2.ComplexBrick#getHasPosition <em>Has Position</em>}</li>
 * </ul>
 *
 * @see brickModel2.BrickModel2Package#getComplexBrick()
 * @model
 * @generated
 */
public interface ComplexBrick extends BrickElement {
	/**
	 * Returns the value of the '<em><b>Has Position</b></em>' containment reference list.
	 * The list contents are of type {@link brickModel2.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Position</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Position</em>' containment reference list.
	 * @see brickModel2.BrickModel2Package#getComplexBrick_HasPosition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getHasPosition();

} // ComplexBrick
