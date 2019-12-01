/**
 */
package manufacturingSystem.impl;

import java.math.BigDecimal;

import manufacturingSystem.EachStep;
import manufacturingSystem.ManufacturingSystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Each Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.EachStepImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link manufacturingSystem.impl.EachStepImpl#getResponsiblePerson <em>Responsible Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EachStepImpl extends MinimalEObjectImpl.Container implements EachStep {
	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SPEED_EDEFAULT = new BigDecimal("0.0");

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsiblePerson() <em>Responsible Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePerson()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsiblePerson() <em>Responsible Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePerson()
	 * @generated
	 * @ordered
	 */
	protected String responsiblePerson = RESPONSIBLE_PERSON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EachStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.EACH_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(BigDecimal newSpeed) {
		BigDecimal oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.EACH_STEP__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponsiblePerson() {
		return responsiblePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsiblePerson(String newResponsiblePerson) {
		String oldResponsiblePerson = responsiblePerson;
		responsiblePerson = newResponsiblePerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.EACH_STEP__RESPONSIBLE_PERSON, oldResponsiblePerson, responsiblePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.EACH_STEP__SPEED:
				return getSpeed();
			case ManufacturingSystemPackage.EACH_STEP__RESPONSIBLE_PERSON:
				return getResponsiblePerson();
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
			case ManufacturingSystemPackage.EACH_STEP__SPEED:
				setSpeed((BigDecimal)newValue);
				return;
			case ManufacturingSystemPackage.EACH_STEP__RESPONSIBLE_PERSON:
				setResponsiblePerson((String)newValue);
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
			case ManufacturingSystemPackage.EACH_STEP__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case ManufacturingSystemPackage.EACH_STEP__RESPONSIBLE_PERSON:
				setResponsiblePerson(RESPONSIBLE_PERSON_EDEFAULT);
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
			case ManufacturingSystemPackage.EACH_STEP__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case ManufacturingSystemPackage.EACH_STEP__RESPONSIBLE_PERSON:
				return RESPONSIBLE_PERSON_EDEFAULT == null ? responsiblePerson != null : !RESPONSIBLE_PERSON_EDEFAULT.equals(responsiblePerson);
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
		result.append(" (speed: ");
		result.append(speed);
		result.append(", ResponsiblePerson: ");
		result.append(responsiblePerson);
		result.append(')');
		return result.toString();
	}

} //EachStepImpl
