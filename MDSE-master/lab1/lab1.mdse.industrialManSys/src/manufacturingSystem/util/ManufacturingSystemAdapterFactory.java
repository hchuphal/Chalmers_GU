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
			public Adapter caseManufacturingSystem(ManufacturingSystem object) {
				return createManufacturingSystemAdapter();
			}
			@Override
			public Adapter caseManufacturingStep(ManufacturingStep object) {
				return createManufacturingStepAdapter();
			}
			@Override
			public Adapter caseEachStep(EachStep object) {
				return createEachStepAdapter();
			}
			@Override
			public Adapter caseTransportSteps(TransportSteps object) {
				return createTransportStepsAdapter();
			}
			@Override
			public Adapter caseQualityAssurance(QualityAssurance object) {
				return createQualityAssuranceAdapter();
			}
			@Override
			public Adapter caseWorkPieces(WorkPieces object) {
				return createWorkPiecesAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
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
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.EachStep <em>Each Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.EachStep
	 * @generated
	 */
	public Adapter createEachStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.TransportSteps <em>Transport Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.TransportSteps
	 * @generated
	 */
	public Adapter createTransportStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.QualityAssurance <em>Quality Assurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.QualityAssurance
	 * @generated
	 */
	public Adapter createQualityAssuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.WorkPieces <em>Work Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.WorkPieces
	 * @generated
	 */
	public Adapter createWorkPiecesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link manufacturingSystem.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see manufacturingSystem.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
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
