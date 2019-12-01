/**
 */
package brickModel2.impl;

import brickModel2.BrickElement;
import brickModel2.BrickModel;
import brickModel2.BrickModel2Package;
import brickModel2.Limits;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brick Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link brickModel2.impl.BrickModelImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link brickModel2.impl.BrickModelImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link brickModel2.impl.BrickModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BrickModelImpl extends MinimalEObjectImpl.Container implements BrickModel {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<BrickElement> contains;

	/**
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected Limits limits;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrickModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrickModel2Package.Literals.BRICK_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BrickElement> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<BrickElement>(BrickElement.class, this, BrickModel2Package.BRICK_MODEL__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Limits getLimits() {
		return limits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimits(Limits newLimits, NotificationChain msgs) {
		Limits oldLimits = limits;
		limits = newLimits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrickModel2Package.BRICK_MODEL__LIMITS, oldLimits, newLimits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimits(Limits newLimits) {
		if (newLimits != limits) {
			NotificationChain msgs = null;
			if (limits != null)
				msgs = ((InternalEObject)limits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrickModel2Package.BRICK_MODEL__LIMITS, null, msgs);
			if (newLimits != null)
				msgs = ((InternalEObject)newLimits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrickModel2Package.BRICK_MODEL__LIMITS, null, msgs);
			msgs = basicSetLimits(newLimits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrickModel2Package.BRICK_MODEL__LIMITS, newLimits, newLimits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrickModel2Package.BRICK_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BrickModel2Package.BRICK_MODEL__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case BrickModel2Package.BRICK_MODEL__LIMITS:
				return basicSetLimits(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BrickModel2Package.BRICK_MODEL__CONTAINS:
				return getContains();
			case BrickModel2Package.BRICK_MODEL__LIMITS:
				return getLimits();
			case BrickModel2Package.BRICK_MODEL__NAME:
				return getName();
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
			case BrickModel2Package.BRICK_MODEL__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends BrickElement>)newValue);
				return;
			case BrickModel2Package.BRICK_MODEL__LIMITS:
				setLimits((Limits)newValue);
				return;
			case BrickModel2Package.BRICK_MODEL__NAME:
				setName((String)newValue);
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
			case BrickModel2Package.BRICK_MODEL__CONTAINS:
				getContains().clear();
				return;
			case BrickModel2Package.BRICK_MODEL__LIMITS:
				setLimits((Limits)null);
				return;
			case BrickModel2Package.BRICK_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case BrickModel2Package.BRICK_MODEL__CONTAINS:
				return contains != null && !contains.isEmpty();
			case BrickModel2Package.BRICK_MODEL__LIMITS:
				return limits != null;
			case BrickModel2Package.BRICK_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BrickModelImpl
