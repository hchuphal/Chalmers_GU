/**
 */
package manufacturingSystem.util;

import manufacturingSystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see manufacturingSystem.ManufacturingSystemPackage
 * @generated
 */
public class ManufacturingSystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ManufacturingSystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingSystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ManufacturingSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingSystemSwitch<Adapter> modelSwitch =
		new ManufacturingSystemSwitch<Adapter>() {
			@Override
			public Adapter caseWorkPiece(WorkPiece object) {
				return createWorkPieceAdapter();
			}
			@Override
			public Adapter caseManufacturingStep(ManufacturingStep object) {
				return createManufacturingStepAdapter();
			}
			@Override
			public Adapter caseManufacturingSystem(ManufacturingSystem object) {
				return createManufacturingSystemAdapter();
			}
			@Override
			public Adapter caseTransportStep(TransportStep object) {
				return createTransportStepAdapter();
			}
			@Override
			public Adapter caseQualityAssuranceStep(QualityAssuranceStep object) {
				return createQualityAssuranceStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseResponsible(Responsible object) {
				return createResponsibleAdapter();
			}
			@Override
			public Adapter caseInputCondition(InputCondition object) {
				return createInputConditionAdapter();
			}
			@Override
			public Adapter caseStoragePoint(StoragePoint object) {
				return createStoragePointAdapter();
			}
			@Override
			public Adapter caseManufacturingSystemElement(ManufacturingSystemElement object) {
				return createManufacturingSystemElementAdapter();
			}
			@Override
			public Adapter caseCompositeManufacturingStep(CompositeManufacturingStep object) {
				return createCompositeManufacturingStepAdapter();
			}
			@Override
			public Adapter caseWorkPieceType(WorkPieceType object) {
				return createWorkPieceTypeAdapter();
			}
			@Override
			public Adapter caseOutputDecision(OutputDecision object) {
				return createOutputDecisionAdapter();
			}
			@Override
			public Adapter caseWorkPieceCondition(WorkPieceCondition object) {
				return createWorkPieceConditionAdapter();
			}
			@Override
			public Adapter caseBinaryCondition(BinaryCondition object) {
				return createBinaryConditionAdapter();
			}
			@Override
			public Adapter caseNegation(Negation object) {
				return createNegationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.WorkPiece <em>Work Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.WorkPiece
	 * @generated
	 */
	public Adapter createWorkPieceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.ManufacturingStep <em>Manufacturing Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.ManufacturingStep
	 * @generated
	 */
	public Adapter createManufacturingStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.ManufacturingSystem <em>Manufacturing System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.ManufacturingSystem
	 * @generated
	 */
	public Adapter createManufacturingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.TransportStep <em>Transport Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.TransportStep
	 * @generated
	 */
	public Adapter createTransportStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.QualityAssuranceStep <em>Quality Assurance Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.QualityAssuranceStep
	 * @generated
	 */
	public Adapter createQualityAssuranceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.Responsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.Responsible
	 * @generated
	 */
	public Adapter createResponsibleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.InputCondition <em>Input Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.InputCondition
	 * @generated
	 */
	public Adapter createInputConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.StoragePoint <em>Storage Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.StoragePoint
	 * @generated
	 */
	public Adapter createStoragePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.ManufacturingSystemElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.ManufacturingSystemElement
	 * @generated
	 */
	public Adapter createManufacturingSystemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.CompositeManufacturingStep <em>Composite Manufacturing Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.CompositeManufacturingStep
	 * @generated
	 */
	public Adapter createCompositeManufacturingStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.WorkPieceType <em>Work Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.WorkPieceType
	 * @generated
	 */
	public Adapter createWorkPieceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.OutputDecision <em>Output Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.OutputDecision
	 * @generated
	 */
	public Adapter createOutputDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.WorkPieceCondition <em>Work Piece Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.WorkPieceCondition
	 * @generated
	 */
	public Adapter createWorkPieceConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.BinaryCondition <em>Binary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.BinaryCondition
	 * @generated
	 */
	public Adapter createBinaryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ManufacturingSystemAdapterFactory
