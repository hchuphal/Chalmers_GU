/**
 */
package brickModel2.impl;

import brickModel2.BrickModel2Package;
import brickModel2.Size;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link brickModel2.impl.SizeImpl#getBrickHeight <em>Brick Height</em>}</li>
 *   <li>{@link brickModel2.impl.SizeImpl#getBrickWidth <em>Brick Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SizeImpl extends MinimalEObjectImpl.Container implements Size {
	/**
	 * The default value of the '{@link #getBrickHeight() <em>Brick Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrickHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int BRICK_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBrickHeight() <em>Brick Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrickHeight()
	 * @generated
	 * @ordered
	 */
	protected int brickHeight = BRICK_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrickWidth() <em>Brick Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrickWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BRICK_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBrickWidth() <em>Brick Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrickWidth()
	 * @generated
	 * @ordered
	 */
	protected int brickWidth = BRICK_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BrickModel2Package.Literals.SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBrickHeight() {
		return brickHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrickHeight(int newBrickHeight) {
		int oldBrickHeight = brickHeight;
		brickHeight = newBrickHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrickModel2Package.SIZE__BRICK_HEIGHT, oldBrickHeight, brickHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBrickWidth() {
		return brickWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrickWidth(int newBrickWidth) {
		int oldBrickWidth = brickWidth;
		brickWidth = newBrickWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BrickModel2Package.SIZE__BRICK_WIDTH, oldBrickWidth, brickWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BrickModel2Package.SIZE__BRICK_HEIGHT:
				return getBrickHeight();
			case BrickModel2Package.SIZE__BRICK_WIDTH:
				return getBrickWidth();
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
			case BrickModel2Package.SIZE__BRICK_HEIGHT:
				setBrickHeight((Integer)newValue);
				return;
			case BrickModel2Package.SIZE__BRICK_WIDTH:
				setBrickWidth((Integer)newValue);
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
			case BrickModel2Package.SIZE__BRICK_HEIGHT:
				setBrickHeight(BRICK_HEIGHT_EDEFAULT);
				return;
			case BrickModel2Package.SIZE__BRICK_WIDTH:
				setBrickWidth(BRICK_WIDTH_EDEFAULT);
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
			case BrickModel2Package.SIZE__BRICK_HEIGHT:
				return brickHeight != BRICK_HEIGHT_EDEFAULT;
			case BrickModel2Package.SIZE__BRICK_WIDTH:
				return brickWidth != BRICK_WIDTH_EDEFAULT;
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
		result.append(" (brickHeight: ");
		result.append(brickHeight);
		result.append(", brickWidth: ");
		result.append(brickWidth);
		result.append(')');
		return result.toString();
	}

} //SizeImpl
