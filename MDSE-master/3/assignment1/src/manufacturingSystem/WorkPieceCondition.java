/**
 */
package manufacturingSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Piece Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.WorkPieceCondition#getRequiresType <em>Requires Type</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getWorkPieceCondition()
 * @model
 * @generated
 */
public interface WorkPieceCondition extends InputCondition {
	/**
	 * Returns the value of the '<em><b>Requires Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Type</em>' reference.
	 * @see #setRequiresType(WorkPieceType)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getWorkPieceCondition_RequiresType()
	 * @model required="true"
	 * @generated
	 */
	WorkPieceType getRequiresType();

	/**
	 * Sets the value of the '{@link manufacturingSystem.WorkPieceCondition#getRequiresType <em>Requires Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Type</em>' reference.
	 * @see #getRequiresType()
	 * @generated
	 */
	void setRequiresType(WorkPieceType value);

} // WorkPieceCondition
