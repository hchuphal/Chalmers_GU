/**
 */
package manufacturingSystem.impl;

import java.util.Collection;

import manufacturingSystem.ManufacturingSystemElement;
import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.Responsible;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemElementImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemElementImpl#getResponsible <em>Responsible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturingSystemElementImpl extends MinimalEObjectImpl.Container implements ManufacturingSystemElement {
	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<ManufacturingSystemElement> transition;

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
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected Responsible responsible;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingSystemElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManufacturingSystemElement> getTransition() {
		if (transition == null) {
			transition = new EObjectResolvingEList<ManufacturingSystemElement>(ManufacturingSystemElement.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__TRANSITION);
		}
		return transition;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Responsible getResponsible() {
		if (responsible != null && responsible.eIsProxy()) {
			InternalEObject oldResponsible = (InternalEObject)responsible;
			responsible = (Responsible)eResolveProxy(oldResponsible);
			if (responsible != oldResponsible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE, oldResponsible, responsible));
			}
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsible basicGetResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponsible(Responsible newResponsible) {
		Responsible oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__TRANSITION:
				return getTransition();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__NAME:
				return getName();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends ManufacturingSystemElement>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE:
				setResponsible((Responsible)newValue);
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__TRANSITION:
				getTransition().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE:
				setResponsible((Responsible)null);
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__TRANSITION:
				return transition != null && !transition.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT__RESPONSIBLE:
				return responsible != null;
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

} //ManufacturingSystemElementImpl
