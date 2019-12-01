/**
 */
package manufacturingSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.WorkPiece#getHasType <em>Has Type</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getWorkPiece()
 * @model
 * @generated
 */
public interface WorkPiece extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Type</em>' reference.
	 * @see #setHasType(WorkPieceType)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getWorkPiece_HasType()
	 * @model required="true"
	 * @generated
	 */
	WorkPieceType getHasType();

	/**
	 * Sets the value of the '{@link manufacturingSystem.WorkPiece#getHasType <em>Has Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Type</em>' reference.
	 * @see #getHasType()
	 * @generated
	 */
	void setHasType(WorkPieceType value);

} // WorkPiece
