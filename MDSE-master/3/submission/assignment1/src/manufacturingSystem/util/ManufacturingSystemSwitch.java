/**
 */
package manufacturingSystem.util;

import manufacturingSystem.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see manufacturingSystem.ManufacturingSystemPackage
 * @generated
 */
public class ManufacturingSystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManufacturingSystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingSystemSwitch() {
		if (modelPackage == null) {
			modelPackage = ManufacturingSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ManufacturingSystemPackage.WORK_PIECE: {
				WorkPiece workPiece = (WorkPiece)theEObject;
				T result = caseWorkPiece(workPiece);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.MANUFACTURING_STEP: {
				ManufacturingStep manufacturingStep = (ManufacturingStep)theEObject;
				T result = caseManufacturingStep(manufacturingStep);
				if (result == null) result = caseStep(manufacturingStep);
				if (result == null) result = caseManufacturingSystemElement(manufacturingStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM: {
				ManufacturingSystem manufacturingSystem = (ManufacturingSystem)theEObject;
				T result = caseManufacturingSystem(manufacturingSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.TRANSPORT_STEP: {
				TransportStep transportStep = (TransportStep)theEObject;
				T result = caseTransportStep(transportStep);
				if (result == null) result = caseStep(transportStep);
				if (result == null) result = caseManufacturingSystemElement(transportStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.QUALITY_ASSURANCE_STEP: {
				QualityAssuranceStep qualityAssuranceStep = (QualityAssuranceStep)theEObject;
				T result = caseQualityAssuranceStep(qualityAssuranceStep);
				if (result == null) result = caseStep(qualityAssuranceStep);
				if (result == null) result = caseManufacturingSystemElement(qualityAssuranceStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseManufacturingSystemElement(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.RESPONSIBLE: {
				Responsible responsible = (Responsible)theEObject;
				T result = caseResponsible(responsible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.INPUT_CONDITION: {
				InputCondition inputCondition = (InputCondition)theEObject;
				T result = caseInputCondition(inputCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.STORAGE_POINT: {
				StoragePoint storagePoint = (StoragePoint)theEObject;
				T result = caseStoragePoint(storagePoint);
				if (result == null) result = caseManufacturingSystemElement(storagePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT: {
				ManufacturingSystemElement manufacturingSystemElement = (ManufacturingSystemElement)theEObject;
				T result = caseManufacturingSystemElement(manufacturingSystemElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.COMPOSITE_MANUFACTURING_STEP: {
				CompositeManufacturingStep compositeManufacturingStep = (CompositeManufacturingStep)theEObject;
				T result = caseCompositeManufacturingStep(compositeManufacturingStep);
				if (result == null) result = caseStep(compositeManufacturingStep);
				if (result == null) result = caseManufacturingSystemElement(compositeManufacturingStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.WORK_PIECE_TYPE: {
				WorkPieceType workPieceType = (WorkPieceType)theEObject;
				T result = caseWorkPieceType(workPieceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.OUTPUT_DECISION: {
				OutputDecision outputDecision = (OutputDecision)theEObject;
				T result = caseOutputDecision(outputDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.WORK_PIECE_CONDITION: {
				WorkPieceCondition workPieceCondition = (WorkPieceCondition)theEObject;
				T result = caseWorkPieceCondition(workPieceCondition);
				if (result == null) result = caseInputCondition(workPieceCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.BINARY_CONDITION: {
				BinaryCondition binaryCondition = (BinaryCondition)theEObject;
				T result = caseBinaryCondition(binaryCondition);
				if (result == null) result = caseInputCondition(binaryCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ManufacturingSystemPackage.NEGATION: {
				Negation negation = (Negation)theEObject;
				T result = caseNegation(negation);
				if (result == null) result = caseInputCondition(negation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Piece</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Piece</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkPiece(WorkPiece object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufacturing Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufacturing Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturingStep(ManufacturingStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufacturing System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufacturing System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturingSystem(ManufacturingSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportStep(TransportStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Assurance Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Assurance Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityAssuranceStep(QualityAssuranceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsible(Responsible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputCondition(InputCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoragePoint(StoragePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturingSystemElement(ManufacturingSystemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Manufacturing Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Manufacturing Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeManufacturingStep(CompositeManufacturingStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Piece Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Piece Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkPieceType(WorkPieceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDecision(OutputDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Piece Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Piece Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkPieceCondition(WorkPieceCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryCondition(BinaryCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegation(Negation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ManufacturingSystemSwitch
