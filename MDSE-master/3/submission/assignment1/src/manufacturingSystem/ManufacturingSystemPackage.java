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
	String eNS_URI = "com.chalmers.manufacturingSystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.chalmers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ManufacturingSystemPackage eINSTANCE = manufacturingSystem.impl.ManufacturingSystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.WorkPieceImpl <em>Work Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.WorkPieceImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getWorkPiece()
	 * @generated
	 */
	int WORK_PIECE = 0;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__HAS_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.ManufacturingSystemElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.ManufacturingSystemElementImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getManufacturingSystemElement()
	 * @generated
	 */
	int MANUFACTURING_SYSTEM_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_ELEMENT__TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.StepImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 5;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TRANSITION = MANUFACTURING_SYSTEM_ELEMENT__TRANSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = MANUFACTURING_SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RESPONSIBLE = MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SPEED = MANUFACTURING_SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INPUT = MANUFACTURING_SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTPUT = MANUFACTURING_SYSTEM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = MANUFACTURING_SYSTEM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = MANUFACTURING_SYSTEM_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__TRANSITION = STEP__TRANSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP__OUTPUT = STEP__OUTPUT;

	/**
	 * The number of structural features of the '<em>Manufacturing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manufacturing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.ManufacturingSystemImpl <em>Manufacturing System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.ManufacturingSystemImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getManufacturingSystem()
	 * @generated
	 */
	int MANUFACTURING_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Consists Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__CONSISTS_OF = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__END = 2;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__USES = 3;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__TRANSFORMS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__NAME = 5;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__RESPONSIBLE = 6;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM__STAFF = 7;

	/**
	 * The number of structural features of the '<em>Manufacturing System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Manufacturing System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.TransportStepImpl <em>Transport Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.TransportStepImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getTransportStep()
	 * @generated
	 */
	int TRANSPORT_STEP = 3;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__TRANSITION = STEP__TRANSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP__OUTPUT = STEP__OUTPUT;

	/**
	 * The number of structural features of the '<em>Transport Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.QualityAssuranceStepImpl <em>Quality Assurance Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.QualityAssuranceStepImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getQualityAssuranceStep()
	 * @generated
	 */
	int QUALITY_ASSURANCE_STEP = 4;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__TRANSITION = STEP__TRANSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP__OUTPUT = STEP__OUTPUT;

	/**
	 * The number of structural features of the '<em>Quality Assurance Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Assurance Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.ResponsibleImpl <em>Responsible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.ResponsibleImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getResponsible()
	 * @generated
	 */
	int RESPONSIBLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Responsible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.InputConditionImpl <em>Input Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.InputConditionImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getInputCondition()
	 * @generated
	 */
	int INPUT_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Input Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.StoragePointImpl <em>Storage Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.StoragePointImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getStoragePoint()
	 * @generated
	 */
	int STORAGE_POINT = 8;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_POINT__TRANSITION = MANUFACTURING_SYSTEM_ELEMENT__TRANSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_POINT__NAME = MANUFACTURING_SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_POINT__RESPONSIBLE = MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Stores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_POINT__STORES = MANUFACTURING_SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_POINT_FEATURE_COUNT = MANUFACTURING_SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storage Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_POINT_OPERATION_COUNT = MANUFACTURING_SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.CompositeManufacturingStepImpl <em>Composite Manufacturing Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.CompositeManufacturingStepImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getCompositeManufacturingStep()
	 * @generated
	 */
	int COMPOSITE_MANUFACTURING_STEP = 10;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MANUFACTURING_STEP__TRANSITION = STEP__TRANSITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MANUFACTURING_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MANUFACTURING_STEP__RESPONSIBLE = STEP__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MANUFACTURING_STEP__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MANUFACTURING_STEP__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MANUFACTURING_STEP__OUTPUT = STEP__OUTPUT;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MANUFACTURING_STEP__CONTAINS = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Manufacturing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MANUFACTURING_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Manufacturing Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MANUFACTURING_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.WorkPieceTypeImpl <em>Work Piece Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.WorkPieceTypeImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getWorkPieceType()
	 * @generated
	 */
	int WORK_PIECE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Work Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Work Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.OutputDecisionImpl <em>Output Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.OutputDecisionImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getOutputDecision()
	 * @generated
	 */
	int OUTPUT_DECISION = 12;

	/**
	 * The feature id for the '<em><b>Output Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECISION__OUTPUT_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECISION__INPUT = 1;

	/**
	 * The number of structural features of the '<em>Output Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECISION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.WorkPieceConditionImpl <em>Work Piece Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.WorkPieceConditionImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getWorkPieceCondition()
	 * @generated
	 */
	int WORK_PIECE_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_CONDITION__NAME = INPUT_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Requires Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_CONDITION__REQUIRES_TYPE = INPUT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Piece Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_CONDITION_FEATURE_COUNT = INPUT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Work Piece Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_CONDITION_OPERATION_COUNT = INPUT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.BinaryConditionImpl <em>Binary Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.BinaryConditionImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getBinaryCondition()
	 * @generated
	 */
	int BINARY_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION__NAME = INPUT_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION__LEFT = INPUT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION__RIGHT = INPUT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION__TYPE = INPUT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION_FEATURE_COUNT = INPUT_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONDITION_OPERATION_COUNT = INPUT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.impl.NegationImpl
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__NAME = INPUT_CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__CONTAINS = INPUT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = INPUT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_OPERATION_COUNT = INPUT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link manufacturingSystem.BinaryType <em>Binary Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see manufacturingSystem.BinaryType
	 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link manufacturingSystem.WorkPiece <em>Work Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Piece</em>'.
	 * @see manufacturingSystem.WorkPiece
	 * @generated
	 */
	EClass getWorkPiece();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.WorkPiece#getHasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Type</em>'.
	 * @see manufacturingSystem.WorkPiece#getHasType()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EReference getWorkPiece_HasType();

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
	 * Returns the meta object for class '{@link manufacturingSystem.ManufacturingSystem <em>Manufacturing System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufacturing System</em>'.
	 * @see manufacturingSystem.ManufacturingSystem
	 * @generated
	 */
	EClass getManufacturingSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.ManufacturingSystem#getConsistsOf <em>Consists Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists Of</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getConsistsOf()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_ConsistsOf();

	/**
	 * Returns the meta object for the reference list '{@link manufacturingSystem.ManufacturingSystem#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Start</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getStart()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Start();

	/**
	 * Returns the meta object for the reference list '{@link manufacturingSystem.ManufacturingSystem#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getEnd()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_End();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.ManufacturingSystem#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getUses()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.ManufacturingSystem#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transforms</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getTransforms()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Transforms();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.ManufacturingSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getName()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EAttribute getManufacturingSystem_Name();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.ManufacturingSystem#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getResponsible()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Responsible();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.ManufacturingSystem#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staff</em>'.
	 * @see manufacturingSystem.ManufacturingSystem#getStaff()
	 * @see #getManufacturingSystem()
	 * @generated
	 */
	EReference getManufacturingSystem_Staff();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.TransportStep <em>Transport Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Step</em>'.
	 * @see manufacturingSystem.TransportStep
	 * @generated
	 */
	EClass getTransportStep();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.QualityAssuranceStep <em>Quality Assurance Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Assurance Step</em>'.
	 * @see manufacturingSystem.QualityAssuranceStep
	 * @generated
	 */
	EClass getQualityAssuranceStep();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see manufacturingSystem.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.Step#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see manufacturingSystem.Step#getSpeed()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Speed();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.Step#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see manufacturingSystem.Step#getInput()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link manufacturingSystem.Step#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see manufacturingSystem.Step#getOutput()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Output();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.Responsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsible</em>'.
	 * @see manufacturingSystem.Responsible
	 * @generated
	 */
	EClass getResponsible();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.Responsible#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see manufacturingSystem.Responsible#getName()
	 * @see #getResponsible()
	 * @generated
	 */
	EAttribute getResponsible_Name();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.InputCondition <em>Input Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Condition</em>'.
	 * @see manufacturingSystem.InputCondition
	 * @generated
	 */
	EClass getInputCondition();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.InputCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see manufacturingSystem.InputCondition#getName()
	 * @see #getInputCondition()
	 * @generated
	 */
	EAttribute getInputCondition_Name();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.StoragePoint <em>Storage Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Point</em>'.
	 * @see manufacturingSystem.StoragePoint
	 * @generated
	 */
	EClass getStoragePoint();

	/**
	 * Returns the meta object for the reference list '{@link manufacturingSystem.StoragePoint#getStores <em>Stores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stores</em>'.
	 * @see manufacturingSystem.StoragePoint#getStores()
	 * @see #getStoragePoint()
	 * @generated
	 */
	EReference getStoragePoint_Stores();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.ManufacturingSystemElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see manufacturingSystem.ManufacturingSystemElement
	 * @generated
	 */
	EClass getManufacturingSystemElement();

	/**
	 * Returns the meta object for the reference list '{@link manufacturingSystem.ManufacturingSystemElement#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition</em>'.
	 * @see manufacturingSystem.ManufacturingSystemElement#getTransition()
	 * @see #getManufacturingSystemElement()
	 * @generated
	 */
	EReference getManufacturingSystemElement_Transition();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.ManufacturingSystemElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see manufacturingSystem.ManufacturingSystemElement#getName()
	 * @see #getManufacturingSystemElement()
	 * @generated
	 */
	EAttribute getManufacturingSystemElement_Name();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.ManufacturingSystemElement#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible</em>'.
	 * @see manufacturingSystem.ManufacturingSystemElement#getResponsible()
	 * @see #getManufacturingSystemElement()
	 * @generated
	 */
	EReference getManufacturingSystemElement_Responsible();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.CompositeManufacturingStep <em>Composite Manufacturing Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Manufacturing Step</em>'.
	 * @see manufacturingSystem.CompositeManufacturingStep
	 * @generated
	 */
	EClass getCompositeManufacturingStep();

	/**
	 * Returns the meta object for the containment reference '{@link manufacturingSystem.CompositeManufacturingStep#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see manufacturingSystem.CompositeManufacturingStep#getContains()
	 * @see #getCompositeManufacturingStep()
	 * @generated
	 */
	EReference getCompositeManufacturingStep_Contains();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.WorkPieceType <em>Work Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Piece Type</em>'.
	 * @see manufacturingSystem.WorkPieceType
	 * @generated
	 */
	EClass getWorkPieceType();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.WorkPieceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see manufacturingSystem.WorkPieceType#getName()
	 * @see #getWorkPieceType()
	 * @generated
	 */
	EAttribute getWorkPieceType_Name();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.OutputDecision <em>Output Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Decision</em>'.
	 * @see manufacturingSystem.OutputDecision
	 * @generated
	 */
	EClass getOutputDecision();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.OutputDecision#getOutputTypes <em>Output Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Types</em>'.
	 * @see manufacturingSystem.OutputDecision#getOutputTypes()
	 * @see #getOutputDecision()
	 * @generated
	 */
	EReference getOutputDecision_OutputTypes();

	/**
	 * Returns the meta object for the reference list '{@link manufacturingSystem.OutputDecision#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see manufacturingSystem.OutputDecision#getInput()
	 * @see #getOutputDecision()
	 * @generated
	 */
	EReference getOutputDecision_Input();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.WorkPieceCondition <em>Work Piece Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Piece Condition</em>'.
	 * @see manufacturingSystem.WorkPieceCondition
	 * @generated
	 */
	EClass getWorkPieceCondition();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.WorkPieceCondition#getRequiresType <em>Requires Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requires Type</em>'.
	 * @see manufacturingSystem.WorkPieceCondition#getRequiresType()
	 * @see #getWorkPieceCondition()
	 * @generated
	 */
	EReference getWorkPieceCondition_RequiresType();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.BinaryCondition <em>Binary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Condition</em>'.
	 * @see manufacturingSystem.BinaryCondition
	 * @generated
	 */
	EClass getBinaryCondition();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.BinaryCondition#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see manufacturingSystem.BinaryCondition#getLeft()
	 * @see #getBinaryCondition()
	 * @generated
	 */
	EReference getBinaryCondition_Left();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.BinaryCondition#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see manufacturingSystem.BinaryCondition#getRight()
	 * @see #getBinaryCondition()
	 * @generated
	 */
	EReference getBinaryCondition_Right();

	/**
	 * Returns the meta object for the attribute '{@link manufacturingSystem.BinaryCondition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see manufacturingSystem.BinaryCondition#getType()
	 * @see #getBinaryCondition()
	 * @generated
	 */
	EAttribute getBinaryCondition_Type();

	/**
	 * Returns the meta object for class '{@link manufacturingSystem.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see manufacturingSystem.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for the reference '{@link manufacturingSystem.Negation#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contains</em>'.
	 * @see manufacturingSystem.Negation#getContains()
	 * @see #getNegation()
	 * @generated
	 */
	EReference getNegation_Contains();

	/**
	 * Returns the meta object for enum '{@link manufacturingSystem.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Type</em>'.
	 * @see manufacturingSystem.BinaryType
	 * @generated
	 */
	EEnum getBinaryType();

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
		 * The meta object literal for the '{@link manufacturingSystem.impl.WorkPieceImpl <em>Work Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.WorkPieceImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getWorkPiece()
		 * @generated
		 */
		EClass WORK_PIECE = eINSTANCE.getWorkPiece();

		/**
		 * The meta object literal for the '<em><b>Has Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECE__HAS_TYPE = eINSTANCE.getWorkPiece_HasType();

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
		 * The meta object literal for the '{@link manufacturingSystem.impl.ManufacturingSystemImpl <em>Manufacturing System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.ManufacturingSystemImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getManufacturingSystem()
		 * @generated
		 */
		EClass MANUFACTURING_SYSTEM = eINSTANCE.getManufacturingSystem();

		/**
		 * The meta object literal for the '<em><b>Consists Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__CONSISTS_OF = eINSTANCE.getManufacturingSystem_ConsistsOf();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__START = eINSTANCE.getManufacturingSystem_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__END = eINSTANCE.getManufacturingSystem_End();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__USES = eINSTANCE.getManufacturingSystem_Uses();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__TRANSFORMS = eINSTANCE.getManufacturingSystem_Transforms();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUFACTURING_SYSTEM__NAME = eINSTANCE.getManufacturingSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__RESPONSIBLE = eINSTANCE.getManufacturingSystem_Responsible();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM__STAFF = eINSTANCE.getManufacturingSystem_Staff();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.TransportStepImpl <em>Transport Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.TransportStepImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getTransportStep()
		 * @generated
		 */
		EClass TRANSPORT_STEP = eINSTANCE.getTransportStep();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.QualityAssuranceStepImpl <em>Quality Assurance Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.QualityAssuranceStepImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getQualityAssuranceStep()
		 * @generated
		 */
		EClass QUALITY_ASSURANCE_STEP = eINSTANCE.getQualityAssuranceStep();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.StepImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__SPEED = eINSTANCE.getStep_Speed();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INPUT = eINSTANCE.getStep_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUTPUT = eINSTANCE.getStep_Output();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.ResponsibleImpl <em>Responsible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.ResponsibleImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getResponsible()
		 * @generated
		 */
		EClass RESPONSIBLE = eINSTANCE.getResponsible();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSIBLE__NAME = eINSTANCE.getResponsible_Name();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.InputConditionImpl <em>Input Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.InputConditionImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getInputCondition()
		 * @generated
		 */
		EClass INPUT_CONDITION = eINSTANCE.getInputCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_CONDITION__NAME = eINSTANCE.getInputCondition_Name();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.StoragePointImpl <em>Storage Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.StoragePointImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getStoragePoint()
		 * @generated
		 */
		EClass STORAGE_POINT = eINSTANCE.getStoragePoint();

		/**
		 * The meta object literal for the '<em><b>Stores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_POINT__STORES = eINSTANCE.getStoragePoint_Stores();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.ManufacturingSystemElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.ManufacturingSystemElementImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getManufacturingSystemElement()
		 * @generated
		 */
		EClass MANUFACTURING_SYSTEM_ELEMENT = eINSTANCE.getManufacturingSystemElement();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM_ELEMENT__TRANSITION = eINSTANCE.getManufacturingSystemElement_Transition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUFACTURING_SYSTEM_ELEMENT__NAME = eINSTANCE.getManufacturingSystemElement_Name();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE = eINSTANCE.getManufacturingSystemElement_Responsible();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.CompositeManufacturingStepImpl <em>Composite Manufacturing Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.CompositeManufacturingStepImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getCompositeManufacturingStep()
		 * @generated
		 */
		EClass COMPOSITE_MANUFACTURING_STEP = eINSTANCE.getCompositeManufacturingStep();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MANUFACTURING_STEP__CONTAINS = eINSTANCE.getCompositeManufacturingStep_Contains();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.WorkPieceTypeImpl <em>Work Piece Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.WorkPieceTypeImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getWorkPieceType()
		 * @generated
		 */
		EClass WORK_PIECE_TYPE = eINSTANCE.getWorkPieceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PIECE_TYPE__NAME = eINSTANCE.getWorkPieceType_Name();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.OutputDecisionImpl <em>Output Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.OutputDecisionImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getOutputDecision()
		 * @generated
		 */
		EClass OUTPUT_DECISION = eINSTANCE.getOutputDecision();

		/**
		 * The meta object literal for the '<em><b>Output Types</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DECISION__OUTPUT_TYPES = eINSTANCE.getOutputDecision_OutputTypes();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DECISION__INPUT = eINSTANCE.getOutputDecision_Input();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.WorkPieceConditionImpl <em>Work Piece Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.WorkPieceConditionImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getWorkPieceCondition()
		 * @generated
		 */
		EClass WORK_PIECE_CONDITION = eINSTANCE.getWorkPieceCondition();

		/**
		 * The meta object literal for the '<em><b>Requires Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECE_CONDITION__REQUIRES_TYPE = eINSTANCE.getWorkPieceCondition_RequiresType();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.BinaryConditionImpl <em>Binary Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.BinaryConditionImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getBinaryCondition()
		 * @generated
		 */
		EClass BINARY_CONDITION = eINSTANCE.getBinaryCondition();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONDITION__LEFT = eINSTANCE.getBinaryCondition_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_CONDITION__RIGHT = eINSTANCE.getBinaryCondition_Right();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_CONDITION__TYPE = eINSTANCE.getBinaryCondition_Type();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.impl.NegationImpl
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATION__CONTAINS = eINSTANCE.getNegation_Contains();

		/**
		 * The meta object literal for the '{@link manufacturingSystem.BinaryType <em>Binary Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see manufacturingSystem.BinaryType
		 * @see manufacturingSystem.impl.ManufacturingSystemPackageImpl#getBinaryType()
		 * @generated
		 */
		EEnum BINARY_TYPE = eINSTANCE.getBinaryType();

	}

} //ManufacturingSystemPackage
