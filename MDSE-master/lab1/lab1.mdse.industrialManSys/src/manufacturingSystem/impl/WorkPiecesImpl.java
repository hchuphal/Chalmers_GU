/**
 */
package manufacturingSystem.impl;

import java.util.Collection;

import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.Storage;
import manufacturingSystem.WorkPieces;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Pieces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.WorkPiecesImpl#getType <em>Type</em>}</li>
 *   <li>{@link manufacturingSystem.impl.WorkPiecesImpl#isCondition <em>Condition</em>}</li>
 *   <li>{@link manufacturingSystem.impl.WorkPiecesImpl#getStoredIn <em>Stored In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkPiecesImpl extends MinimalEObjectImpl.Container implements WorkPieces {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCondition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONDITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCondition()
	 * @generated
	 * @ordered
	 */
	protected boolean condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStoredIn() <em>Stored In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Storage> storedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkPiecesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.WORK_PIECES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.WORK_PIECES__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(boolean newCondition) {
		boolean oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.WORK_PIECES__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Storage> getStoredIn() {
		if (storedIn == null) {
			storedIn = new EObjectResolvingEList<Storage>(Storage.class, this, ManufacturingSystemPackage.WORK_PIECES__STORED_IN);
		}
		return storedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.WORK_PIECES__TYPE:
				return getType();
			case ManufacturingSystemPackage.WORK_PIECES__CONDITION:
				return isCondition();
			case ManufacturingSystemPackage.WORK_PIECES__STORED_IN:
				return getStoredIn();
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
			case ManufacturingSystemPackage.WORK_PIECES__TYPE:
				setType((String)newValue);
				return;
			case ManufacturingSystemPackage.WORK_PIECES__CONDITION:
				setCondition((Boolean)newValue);
				return;
			case ManufacturingSystemPackage.WORK_PIECES__STORED_IN:
				getStoredIn().clear();
				getStoredIn().addAll((Collection<? extends Storage>)newValue);
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
			case ManufacturingSystemPackage.WORK_PIECES__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ManufacturingSystemPackage.WORK_PIECES__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case ManufacturingSystemPackage.WORK_PIECES__STORED_IN:
				getStoredIn().clear();
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
			case ManufacturingSystemPackage.WORK_PIECES__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ManufacturingSystemPackage.WORK_PIECES__CONDITION:
				return condition != CONDITION_EDEFAULT;
			case ManufacturingSystemPackage.WORK_PIECES__STORED_IN:
				return storedIn != null && !storedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //WorkPiecesImpl
