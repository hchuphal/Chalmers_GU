/**
 */
package manufacturingSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.TransportSteps#getTransports <em>Transports</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getTransportSteps()
 * @model
 * @generated
 */
public interface TransportSteps extends EachStep {
	/**
	 * Returns the value of the '<em><b>Transports</b></em>' reference list.
	 * The list contents are of type {@link manufacturingSystem.WorkPieces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transports</em>' reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getTransportSteps_Transports()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkPieces> getTransports();

} // TransportSteps
