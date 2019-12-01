/**
 */
package manufacturingSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Manufacturing Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.CompositeManufacturingStep#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getCompositeManufacturingStep()
 * @model
 * @generated
 */
public interface CompositeManufacturingStep extends Step {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(ManufacturingSystem)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getCompositeManufacturingStep_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ManufacturingSystem getContains();

	/**
	 * Sets the value of the '{@link manufacturingSystem.CompositeManufacturingStep#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(ManufacturingSystem value);

} // CompositeManufacturingStep
