/**
 */
package manufacturingSystem.impl;

import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.WorkPiece;
import manufacturingSystem.WorkPieceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Piece</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.WorkPieceImpl#getHasType <em>Has Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkPieceImpl extends MinimalEObjectImpl.Container implements WorkPiece {
	/**
	 * The cached value of the '{@link #getHasType() <em>Has Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasType()
	 * @generated
	 * @ordered
	 */
	protected WorkPieceType hasType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPieceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.WORK_PIECE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkPieceType getHasType() {
		if (hasType != null && hasType.eIsProxy()) {
			InternalEObject oldHasType = (InternalEObject)hasType;
			hasType = (WorkPieceType)eResolveProxy(oldHasType);
			if (hasType != oldHasType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturingSystemPackage.WORK_PIECE__HAS_TYPE, oldHasType, hasType));
			}
		}
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkPieceType basicGetHasType() {
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasType(WorkPieceType newHasType) {
		WorkPieceType oldHasType = hasType;
		hasType = newHasType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.WORK_PIECE__HAS_TYPE, oldHasType, hasType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.WORK_PIECE__HAS_TYPE:
				if (resolve) return getHasType();
				return basicGetHasType();
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
			case ManufacturingSystemPackage.WORK_PIECE__HAS_TYPE:
				setHasType((WorkPieceType)newValue);
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
			case ManufacturingSystemPackage.WORK_PIECE__HAS_TYPE:
				setHasType((WorkPieceType)null);
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
			case ManufacturingSystemPackage.WORK_PIECE__HAS_TYPE:
				return hasType != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkPieceImpl
