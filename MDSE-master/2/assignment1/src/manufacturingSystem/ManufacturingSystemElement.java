/**
 */
package manufacturingSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.ManufacturingSystemElement#getTransition <em>Transition</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystemElement#getName <em>Name</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystemElement#getResponsible <em>Responsible</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystemElement()
 * @model
 * @generated
 */
public interface ManufacturingSystemElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference list.
	 * The list contents are of type {@link manufacturingSystem.ManufacturingSystemElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystemElement_Transition()
	 * @model
	 * @generated
	 */
	EList<ManufacturingSystemElement> getTransition();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystemElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link manufacturingSystem.ManufacturingSystemElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference.
	 * @see #setResponsible(Responsible)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystemElement_Responsible()
	 * @model
	 * @generated
	 */
	Responsible getResponsible();

	/**
	 * Sets the value of the '{@link manufacturingSystem.ManufacturingSystemElement#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Responsible value);

} // ManufacturingSystemElement
