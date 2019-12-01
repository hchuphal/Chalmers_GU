/**
 */
package manufacturingSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.Negation#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getNegation()
 * @model
 * @generated
 */
public interface Negation extends InputCondition {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference.
	 * @see #setContains(InputCondition)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getNegation_Contains()
	 * @model required="true"
	 * @generated
	 */
	InputCondition getContains();

	/**
	 * Sets the value of the '{@link manufacturingSystem.Negation#getContains <em>Contains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(InputCondition value);

} // Negation
