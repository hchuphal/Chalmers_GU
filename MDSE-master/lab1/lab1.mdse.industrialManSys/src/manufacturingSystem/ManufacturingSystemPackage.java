/**
 */
package manufacturingSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see manufacturingSystem.ManufacturingSystemFactory
 * @model kind="package"
 * @generated
 */
public interface ManufacturingSystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "manufacturingSystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://lab1.chalmers.se";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lab1.chalmers.se";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManufacturingSystemPackage eINSTANCE = manufacturingSystem.impl.ManufacturingSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.ManufacturingSystemImpl <em>Manufacturing System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.ManufacturingSystemImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getManufacturingSystem()
	 * @generated
	 */
	int MANUFACTURING_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Manufacturingsteps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__MANUFACTURINGSTEPS = 0;

	/**
	 * The feature id for the '<em><b>Storage Facilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__STORAGE_FACILITIES = 1;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Startpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__STARTPOINT = 3;

	/**
	 * The number of structural features of the '<em>Manufacturing System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Manufacturing System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.EachStepImpl <em>Each Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.EachStepImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getEachStep()
	 * @generated
	 */
	int EACH_STEP = 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACH_STEP__SPEED = 0;

	/**
	 * The feature id for the '<em><b>Responsible Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACH_STEP__RESPONSIBLE_PERSON = 1;

	/**
	 * The number of structural features of the '<em>Each Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACH_STEP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Each Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACH_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.ManufacturingStepImpl <em>Manufacturing Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.ManufacturingStepImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getManufacturingStep()
	 * @generated
	 */
	int MANUFACTURING_STEP = 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__SPEED = EACH_STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Responsible Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__RESPONSIBLE_PERSON = EACH_STEP__RESPONSIBLE_PERSON;

	/**
	 * The feature id for the '<em><b>Transportsteps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__TRANSPORTSTEPS = EACH_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualityassurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__QUALITYASSURANCE = EACH_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manufacturing Seps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__MANUFACTURING_SEPS = EACH_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transport Work Pieces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__TRANSPORT_WORK_PIECES = EACH_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ouput Workpieces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__OUPUT_WORKPIECES = EACH_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input Workpieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__INPUT_WORKPIECES = EACH_STEP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Manufacturing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP_FEATURE_COUNT = EACH_STEP_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Manufacturing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP_OPERATION_COUNT = EACH_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.TransportStepsImpl <em>Transport Steps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.TransportStepsImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getTransportSteps()
	 * @generated
	 */
	int TRANSPORT_STEPS = 3;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEPS__SPEED = EACH_STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Responsible Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEPS__RESPONSIBLE_PERSON = EACH_STEP__RESPONSIBLE_PERSON;

	/**
	 * The feature id for the '<em><b>Transports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEPS__TRANSPORTS = EACH_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transport Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEPS_FEATURE_COUNT = EACH_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transport Steps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEPS_OPERATION_COUNT = EACH_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.QualityAssuranceImpl <em>Quality Assurance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.QualityAssuranceImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getQualityAssurance()
	 * @generated
	 */
	int QUALITY_ASSURANCE = 4;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__SPEED = EACH_STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Responsible Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__RESPONSIBLE_PERSON = EACH_STEP__RESPONSIBLE_PERSON;

	/**
	 * The number of structural features of the '<em>Quality Assurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_FEATURE_COUNT = EACH_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Assurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_OPERATION_COUNT = EACH_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.WorkPiecesImpl <em>Work Pieces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.WorkPiecesImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getWorkPieces()
	 * @generated
	 */
	int WORK_PIECES = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECES__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECES__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Stored In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECES__STORED_IN = 2;

	/**
	 * The number of structural features of the '<em>Work Pieces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Work Pieces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.StorageImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 6;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.types <em>types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.types
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#gettypes()
	 * @generated
	 */
	int TYPES = 7;


	/**
	 * Returns the meta object for class '{@link manufacturingSystem.ManufacturingSystem <em>Manufacturing System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufacturing System</em>'.
	 * @see manufacturingSystem.ManufacturingSystem
	 * @generated
	 */
	EClass getManufacturingSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.ManufacturingSystem#getManufacturingsteps <em>Manufacturingsteps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manufacturingsteps</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getManufacturingsteps()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Manufacturingsteps();

	/**
	 * Returns the meta object for the containment reference '{@link manufacturingSystem.ManufacturingSystem#getStorageFacilities <em>Storage Facilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Storage Facilities</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getStorageFacilities()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_StorageFacilities();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.ManufacturingSystem#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getEndpoint()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Endpoint();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.ManufacturingSystem#getStartpoint <em>Startpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startpoint</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getStartpoint()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Startpoint();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.ManufacturingStep <em>Manufacturing Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufacturing Step</em>'.
	 * @see manufacturingSystem.ManufacturingStep
	 * @generated
	 */
	EClass getManufacturingStep();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.ManufacturingStep#getTransportsteps <em>Transportsteps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transportsteps</em>'.
	 * @see manufacturingSystem.ManufacturingStep#getTransportsteps()
	 * @see #getManufacturingStep()
	 * @generated
	 */
	EReference getManufacturingStep_Transportsteps();

	/**
	 * Returns the meta object for the containment reference '{@link manufacturingSystem.ManufacturingStep#getQualityassurance <em>Qualityassurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualityassurance</em>'.
	 * @see manufacturingSystem.ManufacturingStep#getQualityassurance()
	 * @see #getManufacturingStep()
	 * @generated
	 */
	EReference getManufacturingStep_Qualityassurance();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.ManufacturingStep#getManufacturingSeps <em>Manufacturing Seps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manufacturing Seps</em>'.
	 * @see manufacturingSystem.ManufacturingStep#getManufacturingSeps()
	 * @see #getManufacturingStep()
	 * @generated
	 */
	EReference getManufacturingStep_ManufacturingSeps();

	/**
	 * Returns the meta object for the reference list '{@link manufacturingSystem.ManufacturingStep#getTransportWorkPieces <em>Transport Work Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transport Work Pieces</em>'.
	 * @see manufacturingSystem.ManufacturingStep#getTransportWorkPieces()
	 * @see #getManufacturingStep()
	 * @generated
	 */
	EReference getManufacturingStep_TransportWorkPieces();

	/**
	 * Returns the meta object for the reference list '{@link manufacturingSystem.ManufacturingStep#getOuputWorkpieces <em>Ouput Workpieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ouput Workpieces</em>'.
	 * @see manufacturingSystem.ManufacturingStep#getOuputWorkpieces()
	 * @see #getManufacturingStep()
	 * @generated
	 */
	EReference getManufacturingStep_OuputWorkpieces();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.ManufacturingStep#getInputWorkpieces <em>Input Workpieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Workpieces</em>'.
	 * @see manufacturingSystem.ManufacturingStep#getInputWorkpieces()
	 * @see #getManufacturingStep()
	 * @generated
	 */
	EReference getManufacturingStep_InputWorkpieces();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.EachStep <em>Each Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Each Step</em>'.
	 * @see manufacturingSystem.EachStep
	 * @generated
	 */
	EClass getEachStep();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.EachStep#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see manufacturingSystem.EachStep#getSpeed()
	 * @see #getEachStep()
	 * @generated
	 */
	EAttribute getEachStep_Speed();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.EachStep#getResponsiblePerson <em>Responsible Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsible Person</em>'.
	 * @see manufacturingSystem.EachStep#getResponsiblePerson()
	 * @see #getEachStep()
	 * @generated
	 */
	EAttribute getEachStep_ResponsiblePerson();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.TransportSteps <em>Transport Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Steps</em>'.
	 * @see manufacturingSystem.TransportSteps
	 * @generated
	 */
	EClass getTransportSteps();

	/**
	 * Returns the meta object for the reference list '{@link manufacturingSystem.TransportSteps#getTransports <em>Transports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transports</em>'.
	 * @see manufacturingSystem.TransportSteps#getTransports()
	 * @see #getTransportSteps()
	 * @generated
	 */
	EReference getTransportSteps_Transports();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.QualityAssurance <em>Quality Assurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Assurance</em>'.
	 * @see manufacturingSystem.QualityAssurance
	 * @generated
	 */
	EClass getQualityAssurance();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.WorkPieces <em>Work Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Pieces</em>'.
	 * @see manufacturingSystem.WorkPieces
	 * @generated
	 */
	EClass getWorkPieces();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.WorkPieces#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see manufacturingSystem.WorkPieces#getType()
	 * @see #getWorkPieces()
	 * @generated
	 */
	EAttribute getWorkPieces_Type();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.WorkPieces#isCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see manufacturingSystem.WorkPieces#isCondition()
	 * @see #getWorkPieces()
	 * @generated
	 */
	EAttribute getWorkPieces_Condition();

	/**
	 * Returns the meta object for the reference list '{@link manufacturingSystem.WorkPieces#getStoredIn <em>Stored In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stored In</em>'.
	 * @see manufacturingSystem.WorkPieces#getStoredIn()
	 * @see #getWorkPieces()
	 * @generated
	 */
	EReference getWorkPieces_StoredIn();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see manufacturingSystem.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for enum '{@link manufacturingSystem.types <em>types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>types</em>'.
	 * @see manufacturingSystem.types
	 * @generated
	 */
	EEnum gettypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManufacturingSystemFactory getManufacturingSystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.ManufacturingSystemImpl <em>Manufacturing System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.ManufacturingSystemImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getManufacturingSystem()
		 * @generated
		 */
		EClass MANUFACTURING_SYSTEM = eINSTANCE.getManufacturingSystem();

		/**
		 * The meta object literal for the '<em><b>Manufacturingsteps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__MANUFACTURINGSTEPS = eINSTANCE.getManufacturingSystem_Manufacturingsteps();

		/**
		 * The meta object literal for the '<em><b>Storage Facilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__STORAGE_FACILITIES = eINSTANCE.getManufacturingSystem_StorageFacilities();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__ENDPOINT = eINSTANCE.getManufacturingSystem_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Startpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__STARTPOINT = eINSTANCE.getManufacturingSystem_Startpoint();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.ManufacturingStepImpl <em>Manufacturing Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.ManufacturingStepImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getManufacturingStep()
		 * @generated
		 */
		EClass MANUFACTURING_STEP = eINSTANCE.getManufacturingStep();

		/**
		 * The meta object literal for the '<em><b>Transportsteps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_STEP__TRANSPORTSTEPS = eINSTANCE.getManufacturingStep_Transportsteps();

		/**
		 * The meta object literal for the '<em><b>Qualityassurance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_STEP__QUALITYASSURANCE = eINSTANCE.getManufacturingStep_Qualityassurance();

		/**
		 * The meta object literal for the '<em><b>Manufacturing Seps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_STEP__MANUFACTURING_SEPS = eINSTANCE.getManufacturingStep_ManufacturingSeps();

		/**
		 * The meta object literal for the '<em><b>Transport Work Pieces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_STEP__TRANSPORT_WORK_PIECES = eINSTANCE.getManufacturingStep_TransportWorkPieces();

		/**
		 * The meta object literal for the '<em><b>Ouput Workpieces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_STEP__OUPUT_WORKPIECES = eINSTANCE.getManufacturingStep_OuputWorkpieces();

		/**
		 * The meta object literal for the '<em><b>Input Workpieces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_STEP__INPUT_WORKPIECES = eINSTANCE.getManufacturingStep_InputWorkpieces();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.EachStepImpl <em>Each Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.EachStepImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getEachStep()
		 * @generated
		 */
		EClass EACH_STEP = eINSTANCE.getEachStep();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EACH_STEP__SPEED = eINSTANCE.getEachStep_Speed();

		/**
		 * The meta object literal for the '<em><b>Responsible Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EACH_STEP__RESPONSIBLE_PERSON = eINSTANCE.getEachStep_ResponsiblePerson();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.TransportStepsImpl <em>Transport Steps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.TransportStepsImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getTransportSteps()
		 * @generated
		 */
		EClass TRANSPORT_STEPS = eINSTANCE.getTransportSteps();

		/**
		 * The meta object literal for the '<em><b>Transports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_STEPS__TRANSPORTS = eINSTANCE.getTransportSteps_Transports();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.QualityAssuranceImpl <em>Quality Assurance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.QualityAssuranceImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getQualityAssurance()
		 * @generated
		 */
		EClass QUALITY_ASSURANCE = eINSTANCE.getQualityAssurance();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.WorkPiecesImpl <em>Work Pieces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.WorkPiecesImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getWorkPieces()
		 * @generated
		 */
		EClass WORK_PIECES = eINSTANCE.getWorkPieces();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PIECES__TYPE = eINSTANCE.getWorkPieces_Type();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PIECES__CONDITION = eINSTANCE.getWorkPieces_Condition();

		/**
		 * The meta object literal for the '<em><b>Stored In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECES__STORED_IN = eINSTANCE.getWorkPieces_StoredIn();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.StorageImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.types <em>types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.types
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#gettypes()
		 * @generated
		 */
		EEnum TYPES = eINSTANCE.gettypes();

	}

} //ManufacturingSystemPackage
