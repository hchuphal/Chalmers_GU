/**
 */
package manufacturingSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Decision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.OutputDecision#getOutputTypes <em>Output Types</em>}</li>
 *   <li>{@link manufacturingSystem.OutputDecision#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getOutputDecision()
 * @model
 * @generated
 */
public interface OutputDecision extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Types</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Types</em>' reference.
	 * @see #setOutputTypes(WorkPieceType)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getOutputDecision_OutputTypes()
	 * @model
	 * @generated
	 */
	WorkPieceType getOutputTypes();

	/**
	 * Sets the value of the '{@link manufacturingSystem.OutputDecision#getOutputTypes <em>Output Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Types</em>' reference.
	 * @see #getOutputTypes()
	 * @generated
	 */
	void setOutputTypes(WorkPieceType value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link manufacturingSystem.InputCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getOutputDecision_Input()
	 * @model required="true"
	 * @generated
	 */
	EList<InputCondition> getInput();

} // OutputDecision
