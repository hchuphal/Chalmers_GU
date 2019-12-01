/**
 */
package manufacturingSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.BinaryCondition#getLeft <em>Left</em>}</li>
 *   <li>{@link manufacturingSystem.BinaryCondition#getRight <em>Right</em>}</li>
 *   <li>{@link manufacturingSystem.BinaryCondition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getBinaryCondition()
 * @model
 * @generated
 */
public interface BinaryCondition extends InputCondition {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(InputCondition)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getBinaryCondition_Left()
	 * @model required="true"
	 * @generated
	 */
	InputCondition getLeft();

	/**
	 * Sets the value of the '{@link manufacturingSystem.BinaryCondition#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(InputCondition value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(InputCondition)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getBinaryCondition_Right()
	 * @model required="true"
	 * @generated
	 */
	InputCondition getRight();

	/**
	 * Sets the value of the '{@link manufacturingSystem.BinaryCondition#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(InputCondition value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link manufacturingSystem.BinaryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see manufacturingSystem.BinaryType
	 * @see #setType(BinaryType)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getBinaryCondition_Type()
	 * @model required="true"
	 * @generated
	 */
	BinaryType getType();

	/**
	 * Sets the value of the '{@link manufacturingSystem.BinaryCondition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see manufacturingSystem.BinaryType
	 * @see #getType()
	 * @generated
	 */
	void setType(BinaryType value);

} // BinaryCondition
