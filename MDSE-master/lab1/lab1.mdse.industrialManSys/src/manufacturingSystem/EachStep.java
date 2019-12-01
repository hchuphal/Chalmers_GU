/**
 */
package manufacturingSystem;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Each Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.EachStep#getSpeed <em>Speed</em>}</li>
 *   <li>{@link manufacturingSystem.EachStep#getResponsiblePerson <em>Responsible Person</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getEachStep()
 * @model abstract="true"
 * @generated
 */
public interface EachStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(BigDecimal)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getEachStep_Speed()
	 * @model default="0.0"
	 * @generated
	 */
	BigDecimal getSpeed();

	/**
	 * Sets the value of the '{@link manufacturingSystem.EachStep#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Responsible Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Person</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Person</em>' attribute.
	 * @see #setResponsiblePerson(String)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getEachStep_ResponsiblePerson()
	 * @model
	 * @generated
	 */
	String getResponsiblePerson();

	/**
	 * Sets the value of the '{@link manufacturingSystem.EachStep#getResponsiblePerson <em>Responsible Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Person</em>' attribute.
	 * @see #getResponsiblePerson()
	 * @generated
	 */
	void setResponsiblePerson(String value);

} // EachStep
