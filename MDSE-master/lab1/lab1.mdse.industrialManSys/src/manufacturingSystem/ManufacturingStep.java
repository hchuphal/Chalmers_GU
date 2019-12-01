/**
 */
package manufacturingSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manufacturing Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.ManufacturingStep#getTransportsteps <em>Transportsteps</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingStep#getQualityassurance <em>Qualityassurance</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingStep#getManufacturingSeps <em>Manufacturing Seps</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingStep#getTransportWorkPieces <em>Transport Work Pieces</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingStep#getOuputWorkpieces <em>Ouput Workpieces</em>}</li>
 *   <li>{@link manufacturingSystem.ManufacturingStep#getInputWorkpieces <em>Input Workpieces</em>}</li>
 * </ul>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingStep()
 * @model
 * @generated
 */
public interface ManufacturingStep extends EachStep {
	/**
	 * Returns the value of the '<em><b>Transportsteps</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.TransportSteps}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transportsteps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportsteps</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingStep_Transportsteps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TransportSteps> getTransportsteps();

	/**
	 * Returns the value of the '<em><b>Qualityassurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualityassurance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualityassurance</em>' containment reference.
	 * @see #setQualityassurance(QualityAssurance)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingStep_Qualityassurance()
	 * @model containment="true"
	 * @generated
	 */
	QualityAssurance getQualityassurance();

	/**
	 * Sets the value of the '{@link manufacturingSystem.ManufacturingStep#getQualityassurance <em>Qualityassurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualityassurance</em>' containment reference.
	 * @see #getQualityassurance()
	 * @generated
	 */
	void setQualityassurance(QualityAssurance value);

	/**
	 * Returns the value of the '<em><b>Manufacturing Seps</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.ManufacturingStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturing Seps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturing Seps</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingStep_ManufacturingSeps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ManufacturingStep> getManufacturingSeps();

	/**
	 * Returns the value of the '<em><b>Transport Work Pieces</b></em>' reference list.
	 * The list contents are of type {@link manufacturingSystem.TransportSteps}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Work Pieces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Work Pieces</em>' reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingStep_TransportWorkPieces()
	 * @model required="true"
	 * @generated
	 */
	EList<TransportSteps> getTransportWorkPieces();

	/**
	 * Returns the value of the '<em><b>Ouput Workpieces</b></em>' reference list.
	 * The list contents are of type {@link manufacturingSystem.WorkPieces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ouput Workpieces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ouput Workpieces</em>' reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingStep_OuputWorkpieces()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkPieces> getOuputWorkpieces();

	/**
	 * Returns the value of the '<em><b>Input Workpieces</b></em>' containment reference list.
	 * The list contents are of type {@link manufacturingSystem.WorkPieces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Workpieces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Workpieces</em>' containment reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getManufacturingStep_InputWorkpieces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<WorkPieces> getInputWorkpieces();

} // ManufacturingStep
