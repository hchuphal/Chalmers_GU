/**
 */
package manufacturingSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufacturing System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getStart <em>Start</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getEnd <em>End</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getUses <em>Uses</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getName <em>Name</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem()
 * @model
 * @generated
 */
public interface ManufacturingSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.ManufacturingSystemElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_ConsistsOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ManufacturingSystemElement> getConsistsOf();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference list.
	 * The list contents are of type {@link manufacturingSystem.StoragePoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_Start()
	 * @model required="true"
	 * @generated
	 */
	EList<StoragePoint> getStart();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link manufacturingSystem.StoragePoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_End()
	 * @model required="true"
	 * @generated
	 */
	EList<StoragePoint> getEnd();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.WorkPieceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_Uses()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPieceType> getUses();

	/**
	 * Returns the value of the '<em><b>Transforms</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transforms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transforms</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_Transforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPiece> getTransforms();

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
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link manufacturingSystem.ManufacturingSystem#getName <em>Name</em>}' attribute.
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
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_Responsible()
	 * @model
	 * @generated
	 */
	Responsible getResponsible();

	/**
	 * Sets the value of the '{@link manufacturingSystem.ManufacturingSystem#getResponsible <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Responsible value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.Responsible}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_Staff()
	 * @model containment="true"
	 * @generated
	 */
	EList<Responsible> getStaff();

} // ManufacturingSystem
