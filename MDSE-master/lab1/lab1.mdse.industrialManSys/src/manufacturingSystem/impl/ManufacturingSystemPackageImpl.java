/**
 */
package manufacturingSystem.impl;

import manufacturingSystem.EachStep;
import manufacturingSystem.ManufacturingStep;
import manufacturingSystem.ManufacturingSystem;
import manufacturingSystem.ManufacturingSystemFactory;
import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.QualityAssurance;
import manufacturingSystem.Storage;
import manufacturingSystem.TransportSteps;
import manufacturingSystem.WorkPieces;
import manufacturingSystem.types;

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
	private EClass manufacturingSystemEClass = null;

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
	private EClass eachStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityAssuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workPiecesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typesEEnum = null;

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
	public EClass getManufacturingSystem() {
		return manufacturingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Manufacturingsteps() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_StorageFacilities() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Endpoint() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingSystem_Startpoint() {
		return (EReference)manufacturingSystemEClass.getEStructuralFeatures().get(3);
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
	public EReference getManufacturingStep_Transportsteps() {
		return (EReference)manufacturingStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingStep_Qualityassurance() {
		return (EReference)manufacturingStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingStep_ManufacturingSeps() {
		return (EReference)manufacturingStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingStep_TransportWorkPieces() {
		return (EReference)manufacturingStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingStep_OuputWorkpieces() {
		return (EReference)manufacturingStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManufacturingStep_InputWorkpieces() {
		return (EReference)manufacturingStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEachStep() {
		return eachStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEachStep_Speed() {
		return (EAttribute)eachStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEachStep_ResponsiblePerson() {
		return (EAttribute)eachStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportSteps() {
		return transportStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransportSteps_Transports() {
		return (EReference)transportStepsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQualityAssurance() {
		return qualityAssuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkPieces() {
		return workPiecesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkPieces_Type() {
		return (EAttribute)workPiecesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkPieces_Condition() {
		return (EAttribute)workPiecesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkPieces_StoredIn() {
		return (EReference)workPiecesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStorage() {
		return storageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum gettypes() {
		return typesEEnum;
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
		manufacturingSystemEClass = createEClass(MANUFACTURING_SYSTEM);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__MANUFACTURINGSTEPS);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__STORAGE_FACILITIES);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__ENDPOINT);
		createEReference(manufacturingSystemEClass, MANUFACTURING_SYSTEM__STARTPOINT);

		manufacturingStepEClass = createEClass(MANUFACTURING_STEP);
		createEReference(manufacturingStepEClass, MANUFACTURING_STEP__TRANSPORTSTEPS);
		createEReference(manufacturingStepEClass, MANUFACTURING_STEP__QUALITYASSURANCE);
		createEReference(manufacturingStepEClass, MANUFACTURING_STEP__MANUFACTURING_SEPS);
		createEReference(manufacturingStepEClass, MANUFACTURING_STEP__TRANSPORT_WORK_PIECES);
		createEReference(manufacturingStepEClass, MANUFACTURING_STEP__OUPUT_WORKPIECES);
		createEReference(manufacturingStepEClass, MANUFACTURING_STEP__INPUT_WORKPIECES);

		eachStepEClass = createEClass(EACH_STEP);
		createEAttribute(eachStepEClass, EACH_STEP__SPEED);
		createEAttribute(eachStepEClass, EACH_STEP__RESPONSIBLE_PERSON);

		transportStepsEClass = createEClass(TRANSPORT_STEPS);
		createEReference(transportStepsEClass, TRANSPORT_STEPS__TRANSPORTS);

		qualityAssuranceEClass = createEClass(QUALITY_ASSURANCE);

		workPiecesEClass = createEClass(WORK_PIECES);
		createEAttribute(workPiecesEClass, WORK_PIECES__TYPE);
		createEAttribute(workPiecesEClass, WORK_PIECES__CONDITION);
		createEReference(workPiecesEClass, WORK_PIECES__STORED_IN);

		storageEClass = createEClass(STORAGE);

		// Create enums
		typesEEnum = createEEnum(TYPES);
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
		manufacturingStepEClass.getESuperTypes().add(this.getEachStep());
		transportStepsEClass.getESuperTypes().add(this.getEachStep());
		qualityAssuranceEClass.getESuperTypes().add(this.getEachStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(manufacturingSystemEClass, ManufacturingSystem.class, "ManufacturingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManufacturingSystem_Manufacturingsteps(), this.getManufacturingStep(), null, "manufacturingsteps", null, 1, -1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_StorageFacilities(), this.getStorage(), null, "storageFacilities", null, 0, 1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_Endpoint(), this.getStorage(), null, "endpoint", null, 1, 1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingSystem_Startpoint(), this.getStorage(), null, "startpoint", null, 1, 1, ManufacturingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manufacturingStepEClass, ManufacturingStep.class, "ManufacturingStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManufacturingStep_Transportsteps(), this.getTransportSteps(), null, "transportsteps", null, 1, -1, ManufacturingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingStep_Qualityassurance(), this.getQualityAssurance(), null, "qualityassurance", null, 0, 1, ManufacturingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingStep_ManufacturingSeps(), this.getManufacturingStep(), null, "manufacturingSeps", null, 1, -1, ManufacturingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingStep_TransportWorkPieces(), this.getTransportSteps(), null, "transportWorkPieces", null, 1, -1, ManufacturingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingStep_OuputWorkpieces(), this.getWorkPieces(), null, "ouputWorkpieces", null, 1, -1, ManufacturingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManufacturingStep_InputWorkpieces(), this.getWorkPieces(), null, "inputWorkpieces", null, 1, -1, ManufacturingStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eachStepEClass, EachStep.class, "EachStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEachStep_Speed(), ecorePackage.getEBigDecimal(), "speed", "0.0", 0, 1, EachStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEachStep_ResponsiblePerson(), ecorePackage.getEString(), "ResponsiblePerson", null, 0, 1, EachStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transportStepsEClass, TransportSteps.class, "TransportSteps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransportSteps_Transports(), this.getWorkPieces(), null, "transports", null, 1, -1, TransportSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityAssuranceEClass, QualityAssurance.class, "QualityAssurance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workPiecesEClass, WorkPieces.class, "WorkPieces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkPieces_Type(), ecorePackage.getEString(), "type", null, 0, 1, WorkPieces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkPieces_Condition(), ecorePackage.getEBoolean(), "condition", "false", 0, 1, WorkPieces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkPieces_StoredIn(), this.getStorage(), null, "storedIn", null, 1, -1, WorkPieces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageEClass, Storage.class, "Storage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(typesEEnum, types.class, "types");
		addEEnumLiteral(typesEEnum, types.WOOD);
		addEEnumLiteral(typesEEnum, types.METAL);

		// Create resource
		createResource(eNS_URI);
	}

} //ManufacturingSystemPackageImpl
