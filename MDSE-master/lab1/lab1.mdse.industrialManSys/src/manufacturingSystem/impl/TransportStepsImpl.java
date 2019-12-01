/**
 */
package manufacturingSystem.impl;

import java.util.Collection;

import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.TransportSteps;
import manufacturingSystem.WorkPieces;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Steps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.TransportStepsImpl#getTransports <em>Transports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportStepsImpl extends EachStepImpl implements TransportSteps {
	/**
	 * The cached value of the '{@link #getTransports() <em>Transports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransports()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPieces> transports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportStepsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.TRANSPORT_STEPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPieces> getTransports() {
		if (transports == null) {
			transports = new EObjectResolvingEList<WorkPieces>(WorkPieces.class, this, ManufacturingSystemPackage.TRANSPORT_STEPS__TRANSPORTS);
		}
		return transports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManufacturingSystemPackage.TRANSPORT_STEPS__TRANSPORTS:
				return getTransports();
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
			case ManufacturingSystemPackage.TRANSPORT_STEPS__TRANSPORTS:
				getTransports().clear();
				getTransports().addAll((Collection<? extends WorkPieces>)newValue);
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
			case ManufacturingSystemPackage.TRANSPORT_STEPS__TRANSPORTS:
				getTransports().clear();
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
			case ManufacturingSystemPackage.TRANSPORT_STEPS__TRANSPORTS:
				return transports != null && !transports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransportStepsImpl
