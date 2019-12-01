/**
 */
package brickModel2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link brickModel2.BrickElement#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link brickModel2.BrickElement#getGetSize <em>Get Size</em>}</li>
 *   <li>{@link brickModel2.BrickElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see brickModel2.BrickModel2Package#getBrickElement()
 * @model abstract="true"
 * @generated
 */
public interface BrickElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(Size)
	 * @see brickModel2.BrickModel2Package#getBrickElement_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	Size getDimensions();

	/**
	 * Sets the value of the '{@link brickModel2.BrickElement#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(Size value);

	/**
	 * Returns the value of the '<em><b>Get Size</b></em>' reference list.
	 * The list contents are of type {@link brickModel2.BrickElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Size</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Size</em>' reference list.
	 * @see brickModel2.BrickModel2Package#getBrickElement_GetSize()
	 * @model
	 * @generated
	 */
	EList<BrickElement> getGetSize();

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
	 * @see brickModel2.BrickModel2Package#getBrickElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link brickModel2.BrickElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BrickElement
