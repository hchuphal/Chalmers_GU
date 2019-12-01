/**
 */
package manufacturingSystem.impl;

import manufacturingSystem.BinaryCondition;
import manufacturingSystem.BinaryType;
import manufacturingSystem.CompositeManufacturingStep;
import manufacturingSystem.InputCondition;
import manufacturingSystem.ManufacturingStep;
import manufacturingSystem.ManufacturingSystem;
import manufacturingSystem.ManufacturingSystemElement;
import manufacturingSystem.ManufacturingSystemFactory;
import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.Negation;
import manufacturingSystem.OutputDecision;
import manufacturingSystem.QualityAssuranceStep;
import manufacturingSystem.Responsible;
import manufacturingSystem.Step;
import manufacturingSystem.StoragePoint;
import manufacturingSystem.TransportStep;
import manufacturingSystem.WorkPiece;
import manufacturingSystem.WorkPieceCondition;
import manufacturingSystem.WorkPieceType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManufacturingSystemPackageImpl extends EPackageImpl implements ManufacturingSystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPieceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufacturingStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufacturingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityAssuranceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storagePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufacturingSystemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeManufacturingStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPieceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPieceConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see manufacturingSystem.ManufacturingSystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ManufacturingSystemPackageImpl() {
		super(eNS_URI, ManufacturingSystemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ManufacturingSystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ManufacturingSystemPackage init() {
		if (isInited) return (ManufacturingSystemPackage)EPackage.Registry.INSTANCE.getEPackage(ManufacturingSystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredManufacturingSystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ManufacturingSystemPackageImpl theManufacturingSystemPackage = registeredManufacturingSystemPackage instanceof ManufacturingSystemPackageImpl ? (ManufacturingSystemPackageImpl)registeredManufacturingSystemPackage : new ManufacturingSystemPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theManufacturingSystemPackage.createPackageContents();

		// Initialize created meta-data
		theManufacturingSystemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theManufacturingSystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ManufacturingSystemPackage.eNS_URI, theManufacturingSystemPackage);
		return theManufacturingSystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkPiece() {
		return workPieceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkPiece_HasType() {
		return (EReference)workPieceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManufacturingStep() {
		return manufacturingStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManufacturingSystem() {
		return manufacturingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_ConsistsOf() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Start() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_End() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Uses() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Transforms() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManufacturingSystem_Name() {
		return (EAttribute)manufacturingSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Responsible() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Staff() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportStep() {
		return transportStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityAssuranceStep() {
		return qualityAssuranceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Speed() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Input() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Output() {
		return (EReference)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponsible() {
		return responsibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsible_Name() {
		return (EAttribute)responsibleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputCondition() {
		return inputConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputCondition_Name() {
		return (EAttribute)inputConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoragePoint() {
		return storagePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStoragePoint_Stores() {
		return (EReference)storagePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManufacturingSystemElement() {
		return manufacturingSystemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystemElement_Transition() {
		return (EReference)manufacturingSystemElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManufacturingSystemElement_Name() {
		return (EAttribute)manufacturingSystemElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystemElement_Responsible() {
		return (EReference)manufacturingSystemElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeManufacturingStep() {
		return compositeManufacturingStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeManufacturingStep_Contains() {
		return (EReference)compositeManufacturingStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkPieceType() {
		return workPieceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkPieceType_Name() {
		return (EAttribute)workPieceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputDecision() {
		return outputDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputDecision_OutputTypes() {
		return (EReference)outputDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputDecision_Input() {
		return (EReference)outputDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkPieceCondition() {
		return workPieceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkPieceCondition_RequiresType() {
		return (EReference)workPieceConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryCondition() {
		return binaryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryCondition_Left() {
		return (EReference)binaryConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryCondition_Right() {
		return (EReference)binaryConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryCondition_Type() {
		return (EAttribute)binaryConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegation() {
		return negationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNegation_Contains() {
		return (EReference)negationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBinaryType() {
		return binaryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturingSystemFactory getManufacturingSystemFactory() {
		return (ManufacturingSystemFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		workPieceEClass = createEClass(WORK_PIECE);
		createEReference(workPieceEClass, WORK_PIECE__HAS_TYPE);

		manufacturingStepEClass = createEClass(MANUFACTURING_STEP);

		manufacturingSystemEClass = createEClass(MANUFACTURING_SYSTEM);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__CONSISTS_OF);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__START);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__END);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__USES);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__TRANSFORMS);
		createEAttribute(manufacturingSystemEClass, MANUFACTURING_SYSTEM__NAME);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__RESPONSIBLE);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__STAFF);

		transportStepEClass = createEClass(TRANSPORT_STEP);

		qualityAssuranceStepEClass = createEClass(QUALITY_ASSURANCE_STEP);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__SPEED);
		createEReference(stepEClass, STEP__INPUT);
		createEReference(stepEClass, STEP__OUTPUT);

		responsibleEClass = createEClass(RESPONSIBLE);
		createEAttribute(responsibleEClass, RESPONSIBLE__NAME);

		inputConditionEClass = createEClass(INPUT_CONDITION);
		createEAttribute(inputConditionEClass, INPUT_CONDITION__NAME);

		storagePointEClass = createEClass(STORAGE_POINT);
		createEReference(storagePointEClass, STORAGE_POINT__STORES);

		manufacturingSystemElementEClass = createEClass(MANUFACTURING_SYSTEM_ELEMENT);
		createEReference(manufacturingSystemElementEClass, MANUFACTURING_SYSTEM_ELEMENT__TRANSITION);
		createEAttribute(manufacturingSystemElementEClass, MANUFACTURING_SYSTEM_ELEMENT__NAME);
		createEReference(manufacturingSystemElementEClass, MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE);

		compositeManufacturingStepEClass = createEClass(COMPOSITE_MANUFACTURING_STEP);
		createEReference(compositeManufacturingStepEClass, COMPOSITE_MANUFACTURING_STEP__CONTAINS);

		workPieceTypeEClass = createEClass(WORK_PIECE_TYPE);
		createEAttribute(workPieceTypeEClass, WORK_PIECE_TYPE__NAME);

		outputDecisionEClass = createEClass(OUTPUT_DECISION);
		createEReference(outputDecisionEClass, OUTPUT_DECISION__OUTPUT_TYPES);
		createEReference(outputDecisionEClass, OUTPUT_DECISION__INPUT);

		workPieceConditionEClass = createEClass(WORK_PIECE_CONDITION);
		createEReference(workPieceConditionEClass, WORK_PIECE_CONDITION__REQUIRES_TYPE);

		binaryConditionEClass = createEClass(BINARY_CONDITION);
		createEReference(binaryConditionEClass, BINARY_CONDITION__LEFT);
		createEReference(binaryConditionEClass, BINARY_CONDITION__RIGHT);
		createEAttribute(binaryConditionEClass, BINARY_CONDITION__TYPE);

		negationEClass = createEClass(NEGATION);
		createEReference(negationEClass, NEGATION__CONTAINS);

		// Create enums
		binaryTypeEEnum = createEEnum(BINARY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		manufacturingStepEClass.getESuperTypes().add(this.getStep());
		transportStepEClass.getESuperTypes().add(this.getStep());
		qualityAssuranceStepEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(this.getManufacturingSystemElement());
		storagePointEClass.getESuperTypes().add(this.getManufacturingSystemElement());
		compositeManufacturingStepEClass.getESuperTypes().add(this.getStep());
		workPieceConditionEClass.getESuperTypes().add(this.getInputCondition());
		binaryConditionEClass.getESuperTypes().add(this.getInputCondition());
		negationEClass.getESuperTypes().add(this.getInputCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(workPieceEClass, WorkPiece.class, "WorkPiece", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkPiece_HasType(), this.getWorkPieceType(), null, "hasType", null, 1, 1, WorkPiece.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manufacturingStepEClass, ManufacturingStep.class, "ManufacturingStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manufacturingSystemEClass, ManufacturingSystem.class, "ManufacturingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManufacturingSystem_ConsistsOf(), this.getManufacturingSystemElement(), null, "consistsOf", null, 1, -1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_Start(), this.getStoragePoint(), null, "start", null, 1, -1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_End(), this.getStoragePoint(), null, "end", null, 1, -1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_Uses(), this.getWorkPieceType(), null, "uses", null, 0, -1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_Transforms(), this.getWorkPiece(), null, "transforms", null, 0, -1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManufacturingSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_Responsible(), this.getResponsible(), null, "responsible", null, 0, 1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_Staff(), this.getResponsible(), null, "staff", null, 0, -1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportStepEClass, TransportStep.class, "TransportStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityAssuranceStepEClass, QualityAssuranceStep.class, "QualityAssuranceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Speed(), ecorePackage.getEInt(), "speed", "0", 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Input(), this.getInputCondition(), null, "input", null, 1, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Output(), this.getOutputDecision(), null, "output", null, 1, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsibleEClass, Responsible.class, "Responsible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponsible_Name(), ecorePackage.getEString(), "name", null, 0, 1, Responsible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputConditionEClass, InputCondition.class, "InputCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputCondition_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storagePointEClass, StoragePoint.class, "StoragePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStoragePoint_Stores(), this.getWorkPieceType(), null, "stores", null, 0, -1, StoragePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manufacturingSystemElementEClass, ManufacturingSystemElement.class, "ManufacturingSystemElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManufacturingSystemElement_Transition(), this.getManufacturingSystemElement(), null, "transition", null, 0, -1, ManufacturingSystemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getManufacturingSystemElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ManufacturingSystemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystemElement_Responsible(), this.getResponsible(), null, "responsible", null, 0, 1, ManufacturingSystemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeManufacturingStepEClass, CompositeManufacturingStep.class, "CompositeManufacturingStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeManufacturingStep_Contains(), this.getManufacturingSystem(), null, "contains", null, 1, 1, CompositeManufacturingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPieceTypeEClass, WorkPieceType.class, "WorkPieceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkPieceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkPieceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputDecisionEClass, OutputDecision.class, "OutputDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputDecision_OutputTypes(), this.getWorkPieceType(), null, "outputTypes", null, 0, 1, OutputDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputDecision_Input(), this.getInputCondition(), null, "input", null, 1, -1, OutputDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workPieceConditionEClass, WorkPieceCondition.class, "WorkPieceCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkPieceCondition_RequiresType(), this.getWorkPieceType(), null, "requiresType", null, 1, 1, WorkPieceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryConditionEClass, BinaryCondition.class, "BinaryCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryCondition_Left(), this.getInputCondition(), null, "left", null, 1, 1, BinaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryCondition_Right(), this.getInputCondition(), null, "right", null, 1, 1, BinaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryCondition_Type(), this.getBinaryType(), "type", null, 1, 1, BinaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negationEClass, Negation.class, "Negation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegation_Contains(), this.getInputCondition(), null, "contains", null, 1, 1, Negation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryTypeEEnum, BinaryType.class, "BinaryType");
		addEEnumLiteral(binaryTypeEEnum, BinaryType.AND);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.OR);

		// Create resource
		createResource(eNS_URI);
	}

} //ManufacturingSystemPackageImpl
