/**
 */
package manufacturingSystem.impl;

import java.util.Collection;

import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.StoragePoint;
import manufacturingSystem.WorkPieceType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.StoragePointImpl#getStores <em>Stores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoragePointImpl extends ManufacturingSystemElementImpl implements StoragePoint {
	/**
	 * The cached value of the '{@link #getStores() <em>Stores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStores()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPieceType> stores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoragePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.STORAGE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPieceType> getStores() {
		if (stores == null) {
			stores = new EObjectResolvingEList<WorkPieceType>(WorkPieceType.class, this, ManufacturingSystemPackage.STORAGE_POINT__STORES);
		}
		return stores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.STORAGE_POINT__STORES:
				return getStores();
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
			case ManufacturingSystemPackage.STORAGE_POINT__STORES:
				getStores().clear();
				getStores().addAll((Collection<? extends WorkPieceType>)newValue);
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
			case ManufacturingSystemPackage.STORAGE_POINT__STORES:
				getStores().clear();
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
			case ManufacturingSystemPackage.STORAGE_POINT__STORES:
				return stores != null && !stores.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StoragePointImpl
