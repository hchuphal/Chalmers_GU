/**
 */
package manufacturingSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.Step#getSpeed <em>Speed</em>}</li>
 *   <li>{@link manufacturingSystem.Step#getInput <em>Input</em>}</li>
 *   <li>{@link manufacturingSystem.Step#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends ManufacturingSystemElement {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getStep_Speed()
	 * @model default="0"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link manufacturingSystem.Step#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.InputCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getStep_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputCondition> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.OutputDecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getStep_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputDecision> getOutput();

} // Step
