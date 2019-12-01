/**
 */
package manufacturingSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Pieces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.WorkPieces#getType <em>Type</em>}</li>
 *   <li>{@link manufacturingSystem.WorkPieces#isCondition <em>Condition</em>}</li>
 *   <li>{@link manufacturingSystem.WorkPieces#getStoredIn <em>Stored In</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getWorkPieces()
 * @model
 * @generated
 */
public interface WorkPieces extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getWorkPieces_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link manufacturingSystem.WorkPieces#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(boolean)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getWorkPieces_Condition()
	 * @model default="false"
	 * @generated
	 */
	boolean isCondition();

	/**
	 * Sets the value of the '{@link manufacturingSystem.WorkPieces#isCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isCondition()
	 * @generated
	 */
	void setCondition(boolean value);

	/**
	 * Returns the value of the '<em><b>Stored In</b></em>' reference list.
	 * The list contents are of type {@link manufacturingSystem.Storage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stored In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored In</em>' reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getWorkPieces_StoredIn()
	 * @model required="true"
	 * @generated
	 */
	EList<Storage> getStoredIn();

} // WorkPieces
