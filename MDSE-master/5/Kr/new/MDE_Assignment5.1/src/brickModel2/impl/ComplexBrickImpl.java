/**
 */
package brickModel2.impl;

import brickModel2.BrickModel2Package;
import brickModel2.ComplexBrick;
import brickModel2.Position;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Brick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link brickModel2.impl.ComplexBrickImpl#getHasPosition <em>Has Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexBrickImpl extends BrickElementImpl implements ComplexBrick {
	/**
	 * The cached value of the '{@link #getHasPosition() <em>Has Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> hasPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexBrickImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrickModel2Package.Literals.COMPLEX_BRICK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Position> getHasPosition() {
		if (hasPosition == null) {
			hasPosition = new EObjectContainmentEList<Position>(Position.class, this, BrickModel2Package.COMPLEX_BRICK__HAS_POSITION);
		}
		return hasPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BrickModel2Package.COMPLEX_BRICK__HAS_POSITION:
				return ((InternalEList<?>)getHasPosition()).basicRemove(otherEnd, msgs);
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
			case BrickModel2Package.COMPLEX_BRICK__HAS_POSITION:
				return getHasPosition();
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
			case BrickModel2Package.COMPLEX_BRICK__HAS_POSITION:
				getHasPosition().clear();
				getHasPosition().addAll((Collection<? extends Position>)newValue);
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
			case BrickModel2Package.COMPLEX_BRICK__HAS_POSITION:
				getHasPosition().clear();
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
			case BrickModel2Package.COMPLEX_BRICK__HAS_POSITION:
				return hasPosition != null && !hasPosition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexBrickImpl
