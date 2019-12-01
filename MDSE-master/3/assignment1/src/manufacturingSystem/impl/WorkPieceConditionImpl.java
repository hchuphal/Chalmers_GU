/**
 */
package manufacturingSystem.impl;

import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.WorkPieceCondition;
import manufacturingSystem.WorkPieceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Piece Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.WorkPieceConditionImpl#getRequiresType <em>Requires Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkPieceConditionImpl extends InputConditionImpl implements WorkPieceCondition {
	/**
	 * The cached value of the '{@link #getRequiresType() <em>Requires Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresType()
	 * @generated
	 * @ordered
	 */
	protected WorkPieceType requiresType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPieceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.WORK_PIECE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPieceType getRequiresType() {
		if (requiresType != null && requiresType.eIsProxy()) {
			InternalEObject oldRequiresType = (InternalEObject)requiresType;
			requiresType = (WorkPieceType)eResolveProxy(oldRequiresType);
			if (requiresType != oldRequiresType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturingSystemPackage.WORK_PIECE_CONDITION__REQUIRES_TYPE, oldRequiresType, requiresType));
			}
		}
		return requiresType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceType basicGetRequiresType() {
		return requiresType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiresType(WorkPieceType newRequiresType) {
		WorkPieceType oldRequiresType = requiresType;
		requiresType = newRequiresType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.WORK_PIECE_CONDITION__REQUIRES_TYPE, oldRequiresType, requiresType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.WORK_PIECE_CONDITION__REQUIRES_TYPE:
				if (resolve) return getRequiresType();
				return basicGetRequiresType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ManufacturingSystemPackage.WORK_PIECE_CONDITION__REQUIRES_TYPE:
				setRequiresType((WorkPieceType)newValue);
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
			case ManufacturingSystemPackage.WORK_PIECE_CONDITION__REQUIRES_TYPE:
				setRequiresType((WorkPieceType)null);
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
			case ManufacturingSystemPackage.WORK_PIECE_CONDITION__REQUIRES_TYPE:
				return requiresType != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkPieceConditionImpl
