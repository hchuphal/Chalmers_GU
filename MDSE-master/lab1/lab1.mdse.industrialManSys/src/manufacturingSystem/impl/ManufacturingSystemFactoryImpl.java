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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM: return createManufacturingSystem();
			case ManufacturingSystemPackage.MANUFACTURING_STEP: return createManufacturingStep();
			case ManufacturingSystemPackage.TRANSPORT_STEPS: return createTransportSteps();
			case ManufacturingSystemPackage.QUALITY_ASSURANCE: return createQualityAssurance();
			case ManufacturingSystemPackage.WORK_PIECES: return createWorkPieces();
			case ManufacturingSystemPackage.STORAGE: return createStorage();
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
			case ManufacturingSystemPackage.TYPES:
				return createtypesFromString(eDataType, initialValue);
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
			case ManufacturingSystemPackage.TYPES:
				return converttypesToString(eDataType, instanceValue);
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
	public TransportSteps createTransportSteps() {
		TransportStepsImpl transportSteps = new TransportStepsImpl();
		return transportSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityAssurance createQualityAssurance() {
		QualityAssuranceImpl qualityAssurance = new QualityAssuranceImpl();
		return qualityAssurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPieces createWorkPieces() {
		WorkPiecesImpl workPieces = new WorkPiecesImpl();
		return workPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage createStorage() {
		StorageImpl storage = new StorageImpl();
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public types createtypesFromString(EDataType eDataType, String initialValue) {
		types result = types.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypesToString(EDataType eDataType, Object instanceValue) {
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
