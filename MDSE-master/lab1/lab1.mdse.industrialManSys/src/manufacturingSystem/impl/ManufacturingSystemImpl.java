/**
 */
package manufacturingSystem.impl;

import java.util.Collection;

import manufacturingSystem.ManufacturingStep;
import manufacturingSystem.ManufacturingSystem;
import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.Storage;

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
 * An implementation of the model object '<em><b>Manufacturing System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getManufacturingsteps <em>Manufacturingsteps</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getStorageFacilities <em>Storage Facilities</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getStartpoint <em>Startpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturingSystemImpl extends MinimalEObjectImpl.Container implements ManufacturingSystem {
	/**
	 * The cached value of the '{@link #getManufacturingsteps() <em>Manufacturingsteps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingsteps()
	 * @generated
	 * @ordered
	 */
	protected EList<ManufacturingStep> manufacturingsteps;

	/**
	 * The cached value of the '{@link #getStorageFacilities() <em>Storage Facilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageFacilities()
	 * @generated
	 * @ordered
	 */
	protected Storage storageFacilities;

	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected Storage endpoint;

	/**
	 * The cached value of the '{@link #getStartpoint() <em>Startpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartpoint()
	 * @generated
	 * @ordered
	 */
	protected Storage startpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManufacturingStep> getManufacturingsteps() {
		if (manufacturingsteps == null) {
			manufacturingsteps = new EObjectContainmentEList<ManufacturingStep>(ManufacturingStep.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__MANUFACTURINGSTEPS);
		}
		return manufacturingsteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage getStorageFacilities() {
		return storageFacilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorageFacilities(Storage newStorageFacilities, NotificationChain msgs) {
		Storage oldStorageFacilities = storageFacilities;
		storageFacilities = newStorageFacilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STORAGE_FACILITIES, oldStorageFacilities, newStorageFacilities);
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
	public void setStorageFacilities(Storage newStorageFacilities) {
		if (newStorageFacilities != storageFacilities) {
			NotificationChain msgs = null;
			if (storageFacilities != null)
				msgs = ((InternalEObject)storageFacilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STORAGE_FACILITIES, null, msgs);
			if (newStorageFacilities != null)
				msgs = ((InternalEObject)newStorageFacilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STORAGE_FACILITIES, null, msgs);
			msgs = basicSetStorageFacilities(newStorageFacilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STORAGE_FACILITIES, newStorageFacilities, newStorageFacilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage getEndpoint() {
		if (endpoint != null && endpoint.eIsProxy()) {
			InternalEObject oldEndpoint = (InternalEObject)endpoint;
			endpoint = (Storage)eResolveProxy(oldEndpoint);
			if (endpoint != oldEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__ENDPOINT, oldEndpoint, endpoint));
			}
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpoint(Storage newEndpoint) {
		Storage oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage getStartpoint() {
		if (startpoint != null && startpoint.eIsProxy()) {
			InternalEObject oldStartpoint = (InternalEObject)startpoint;
			startpoint = (Storage)eResolveProxy(oldStartpoint);
			if (startpoint != oldStartpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STARTPOINT, oldStartpoint, startpoint));
			}
		}
		return startpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetStartpoint() {
		return startpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartpoint(Storage newStartpoint) {
		Storage oldStartpoint = startpoint;
		startpoint = newStartpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STARTPOINT, oldStartpoint, startpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__MANUFACTURINGSTEPS:
				return ((InternalEList<?>)getManufacturingsteps()).basicRemove(otherEnd, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STORAGE_FACILITIES:
				return basicSetStorageFacilities(null, msgs);
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__MANUFACTURINGSTEPS:
				return getManufacturingsteps();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STORAGE_FACILITIES:
				return getStorageFacilities();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__ENDPOINT:
				if (resolve) return getEndpoint();
				return basicGetEndpoint();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STARTPOINT:
				if (resolve) return getStartpoint();
				return basicGetStartpoint();
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__MANUFACTURINGSTEPS:
				getManufacturingsteps().clear();
				getManufacturingsteps().addAll((Collection<? extends ManufacturingStep>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STORAGE_FACILITIES:
				setStorageFacilities((Storage)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__ENDPOINT:
				setEndpoint((Storage)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STARTPOINT:
				setStartpoint((Storage)newValue);
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__MANUFACTURINGSTEPS:
				getManufacturingsteps().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STORAGE_FACILITIES:
				setStorageFacilities((Storage)null);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__ENDPOINT:
				setEndpoint((Storage)null);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STARTPOINT:
				setStartpoint((Storage)null);
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__MANUFACTURINGSTEPS:
				return manufacturingsteps != null && !manufacturingsteps.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STORAGE_FACILITIES:
				return storageFacilities != null;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__ENDPOINT:
				return endpoint != null;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STARTPOINT:
				return startpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //ManufacturingSystemImpl
