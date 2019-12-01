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
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getManufacturingsteps <em>Manufacturingsteps</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getStorageFacilities <em>Storage Facilities</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingSystem#getStartpoint <em>Startpoint</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem()
 * @model
 * @generated
 */
public interface ManufacturingSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Manufacturingsteps</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.ManufacturingStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturingsteps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturingsteps</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_Manufacturingsteps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ManufacturingStep> getManufacturingsteps();

	/**
	 * Returns the value of the '<em><b>Storage Facilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Facilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Facilities</em>' containment reference.
	 * @see #setStorageFacilities(Storage)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_StorageFacilities()
	 * @model containment="true"
	 * @generated
	 */
	Storage getStorageFacilities();

	/**
	 * Sets the value of the '{@link manufacturingSystem.ManufacturingSystem#getStorageFacilities <em>Storage Facilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Facilities</em>' containment reference.
	 * @see #getStorageFacilities()
	 * @generated
	 */
	void setStorageFacilities(Storage value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' reference.
	 * @see #setEndpoint(Storage)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_Endpoint()
	 * @model required="true"
	 * @generated
	 */
	Storage getEndpoint();

	/**
	 * Sets the value of the '{@link manufacturingSystem.ManufacturingSystem#getEndpoint <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(Storage value);

	/**
	 * Returns the value of the '<em><b>Startpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startpoint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startpoint</em>' reference.
	 * @see #setStartpoint(Storage)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingSystem_Startpoint()
	 * @model required="true"
	 * @generated
	 */
	Storage getStartpoint();

	/**
	 * Sets the value of the '{@link manufacturingSystem.ManufacturingSystem#getStartpoint <em>Startpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startpoint</em>' reference.
	 * @see #getStartpoint()
	 * @generated
	 */
	void setStartpoint(Storage value);

} // ManufacturingSystem
