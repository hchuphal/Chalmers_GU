/**
 */
package manufacturingSystem.impl;

import manufacturingSystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManufacturingSystemFactoryImpl extends EFactoryImpl implements ManufacturingSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ManufacturingSystemFactory init() {
		try {
			ManufacturingSystemFactory theManufacturingSystemFactory = (ManufacturingSystemFactory)EPackage.Registry.INSTANCE.getEFactory(ManufacturingSystemPackage.eNS_URI);
			if (theManufacturingSystemFactory != null) {
				return theManufacturingSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ManufacturingSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingSystemFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ManufacturingSystemPackage.WORK_PIECE: return createWorkPiece();
			case ManufacturingSystemPackage.MANUFACTURING_STEP: return createManufacturingStep();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM: return createManufacturingSystem();
			case ManufacturingSystemPackage.TRANSPORT_STEP: return createTransportStep();
			case ManufacturingSystemPackage.QUALITY_ASSURANCE_STEP: return createQualityAssuranceStep();
			case ManufacturingSystemPackage.RESPONSIBLE: return createResponsible();
			case ManufacturingSystemPackage.INPUT_CONDITION: return createInputCondition();
			case ManufacturingSystemPackage.STORAGE_POINT: return createStoragePoint();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT: return createManufacturingSystemElement();
			case ManufacturingSystemPackage.COMPOSITE_MANUFACTURING_STEP: return createCompositeManufacturingStep();
			case ManufacturingSystemPackage.WORK_PIECE_TYPE: return createWorkPieceType();
			case ManufacturingSystemPackage.OUTPUT_DECISION: return createOutputDecision();
			case ManufacturingSystemPackage.WORK_PIECE_CONDITION: return createWorkPieceCondition();
			case ManufacturingSystemPackage.BINARY_CONDITION: return createBinaryCondition();
			case ManufacturingSystemPackage.NEGATION: return createNegation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ManufacturingSystemPackage.BINARY_TYPE:
				return createBinaryTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ManufacturingSystemPackage.BINARY_TYPE:
				return convertBinaryTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPiece createWorkPiece() {
		WorkPieceImpl workPiece = new WorkPieceImpl();
		return workPiece;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturingStep createManufacturingStep() {
		ManufacturingStepImpl manufacturingStep = new ManufacturingStepImpl();
		return manufacturingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturingSystem createManufacturingSystem() {
		ManufacturingSystemImpl manufacturingSystem = new ManufacturingSystemImpl();
		return manufacturingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportStep createTransportStep() {
		TransportStepImpl transportStep = new TransportStepImpl();
		return transportStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityAssuranceStep createQualityAssuranceStep() {
		QualityAssuranceStepImpl qualityAssuranceStep = new QualityAssuranceStepImpl();
		return qualityAssuranceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Responsible createResponsible() {
		ResponsibleImpl responsible = new ResponsibleImpl();
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputCondition createInputCondition() {
		InputConditionImpl inputCondition = new InputConditionImpl();
		return inputCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoragePoint createStoragePoint() {
		StoragePointImpl storagePoint = new StoragePointImpl();
		return storagePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturingSystemElement createManufacturingSystemElement() {
		ManufacturingSystemElementImpl manufacturingSystemElement = new ManufacturingSystemElementImpl();
		return manufacturingSystemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeManufacturingStep createCompositeManufacturingStep() {
		CompositeManufacturingStepImpl compositeManufacturingStep = new CompositeManufacturingStepImpl();
		return compositeManufacturingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPieceType createWorkPieceType() {
		WorkPieceTypeImpl workPieceType = new WorkPieceTypeImpl();
		return workPieceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputDecision createOutputDecision() {
		OutputDecisionImpl outputDecision = new OutputDecisionImpl();
		return outputDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPieceCondition createWorkPieceCondition() {
		WorkPieceConditionImpl workPieceCondition = new WorkPieceConditionImpl();
		return workPieceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryCondition createBinaryCondition() {
		BinaryConditionImpl binaryCondition = new BinaryConditionImpl();
		return binaryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType createBinaryTypeFromString(EDataType eDataType, String initialValue) {
		BinaryType result = BinaryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturingSystemPackage getManufacturingSystemPackage() {
		return (ManufacturingSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ManufacturingSystemPackage getPackage() {
		return ManufacturingSystemPackage.eINSTANCE;
	}

} //ManufacturingSystemFactoryImpl
