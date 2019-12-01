/**
 */
package manufacturingSystem.impl;

import java.util.Collection;

import manufacturingSystem.InputCondition;
import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.OutputDecision;
import manufacturingSystem.WorkPieceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.OutputDecisionImpl#getOutputTypes <em>Output Types</em>}</li>
 *   <li>{@link manufacturingSystem.impl.OutputDecisionImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputDecisionImpl extends MinimalEObjectImpl.Container implements OutputDecision {
	/**
	 * The cached value of the '{@link #getOutputTypes() <em>Output Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTypes()
	 * @generated
	 * @ordered
	 */
	protected WorkPieceType outputTypes;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputCondition> input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.OUTPUT_DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPieceType getOutputTypes() {
		if (outputTypes != null && outputTypes.eIsProxy()) {
			InternalEObject oldOutputTypes = (InternalEObject)outputTypes;
			outputTypes = (WorkPieceType)eResolveProxy(oldOutputTypes);
			if (outputTypes != oldOutputTypes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturingSystemPackage.OUTPUT_DECISION__OUTPUT_TYPES, oldOutputTypes, outputTypes));
			}
		}
		return outputTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceType basicGetOutputTypes() {
		return outputTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputTypes(WorkPieceType newOutputTypes) {
		WorkPieceType oldOutputTypes = outputTypes;
		outputTypes = newOutputTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.OUTPUT_DECISION__OUTPUT_TYPES, oldOutputTypes, outputTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputCondition> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<InputCondition>(InputCondition.class, this, ManufacturingSystemPackage.OUTPUT_DECISION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.OUTPUT_DECISION__OUTPUT_TYPES:
				if (resolve) return getOutputTypes();
				return basicGetOutputTypes();
			case ManufacturingSystemPackage.OUTPUT_DECISION__INPUT:
				return getInput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManufacturingSystemPackage.OUTPUT_DECISION__OUTPUT_TYPES:
				setOutputTypes((WorkPieceType)newValue);
				return;
			case ManufacturingSystemPackage.OUTPUT_DECISION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputCondition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ManufacturingSystemPackage.OUTPUT_DECISION__OUTPUT_TYPES:
				setOutputTypes((WorkPieceType)null);
				return;
			case ManufacturingSystemPackage.OUTPUT_DECISION__INPUT:
				getInput().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ManufacturingSystemPackage.OUTPUT_DECISION__OUTPUT_TYPES:
				return outputTypes != null;
			case ManufacturingSystemPackage.OUTPUT_DECISION__INPUT:
				return input != null && !input.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputDecisionImpl
