/**
 */
package manufacturingSystem.impl;

import java.util.Collection;

import manufacturingSystem.ManufacturingStep;
import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.QualityAssurance;
import manufacturingSystem.TransportSteps;

import manufacturingSystem.WorkPieces;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufacturing Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.ManufacturingStepImpl#getTransportsteps <em>Transportsteps</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingStepImpl#getQualityassurance <em>Qualityassurance</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingStepImpl#getManufacturingSeps <em>Manufacturing Seps</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingStepImpl#getTransportWorkPieces <em>Transport Work Pieces</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingStepImpl#getOuputWorkpieces <em>Ouput Workpieces</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingStepImpl#getInputWorkpieces <em>Input Workpieces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturingStepImpl extends EachStepImpl implements ManufacturingStep {
	/**
	 * The cached value of the '{@link #getTransportsteps() <em>Transportsteps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportsteps()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportSteps> transportsteps;

	/**
	 * The cached value of the '{@link #getQualityassurance() <em>Qualityassurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityassurance()
	 * @generated
	 * @ordered
	 */
	protected QualityAssurance qualityassurance;

	/**
	 * The cached value of the '{@link #getManufacturingSeps() <em>Manufacturing Seps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingSeps()
	 * @generated
	 * @ordered
	 */
	protected EList<ManufacturingStep> manufacturingSeps;

	/**
	 * The cached value of the '{@link #getTransportWorkPieces() <em>Transport Work Pieces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportWorkPieces()
	 * @generated
	 * @ordered
	 */
	protected EList<TransportSteps> transportWorkPieces;

	/**
	 * The cached value of the '{@link #getOuputWorkpieces() <em>Ouput Workpieces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuputWorkpieces()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPieces> ouputWorkpieces;

	/**
	 * The cached value of the '{@link #getInputWorkpieces() <em>Input Workpieces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputWorkpieces()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPieces> inputWorkpieces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManufacturingStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManufacturingSystemPackage.Literals.MANUFACTURING_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransportSteps> getTransportsteps() {
		if (transportsteps == null) {
			transportsteps = new EObjectContainmentEList<TransportSteps>(TransportSteps.class, this, ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORTSTEPS);
		}
		return transportsteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityAssurance getQualityassurance() {
		return qualityassurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualityassurance(QualityAssurance newQualityassurance, NotificationChain msgs) {
		QualityAssurance oldQualityassurance = qualityassurance;
		qualityassurance = newQualityassurance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_STEP__QUALITYASSURANCE, oldQualityassurance, newQualityassurance);
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
	public void setQualityassurance(QualityAssurance newQualityassurance) {
		if (newQualityassurance != qualityassurance) {
			NotificationChain msgs = null;
			if (qualityassurance != null)
				msgs = ((InternalEObject)qualityassurance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ManufacturingSystemPackage.MANUFACTURING_STEP__QUALITYASSURANCE, null, msgs);
			if (newQualityassurance != null)
				msgs = ((InternalEObject)newQualityassurance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ManufacturingSystemPackage.MANUFACTURING_STEP__QUALITYASSURANCE, null, msgs);
			msgs = basicSetQualityassurance(newQualityassurance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_STEP__QUALITYASSURANCE, newQualityassurance, newQualityassurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManufacturingStep> getManufacturingSeps() {
		if (manufacturingSeps == null) {
			manufacturingSeps = new EObjectContainmentEList<ManufacturingStep>(ManufacturingStep.class, this, ManufacturingSystemPackage.MANUFACTURING_STEP__MANUFACTURING_SEPS);
		}
		return manufacturingSeps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransportSteps> getTransportWorkPieces() {
		if (transportWorkPieces == null) {
			transportWorkPieces = new EObjectResolvingEList<TransportSteps>(TransportSteps.class, this, ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORT_WORK_PIECES);
		}
		return transportWorkPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPieces> getOuputWorkpieces() {
		if (ouputWorkpieces == null) {
			ouputWorkpieces = new EObjectResolvingEList<WorkPieces>(WorkPieces.class, this, ManufacturingSystemPackage.MANUFACTURING_STEP__OUPUT_WORKPIECES);
		}
		return ouputWorkpieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPieces> getInputWorkpieces() {
		if (inputWorkpieces == null) {
			inputWorkpieces = new EObjectContainmentEList<WorkPieces>(WorkPieces.class, this, ManufacturingSystemPackage.MANUFACTURING_STEP__INPUT_WORKPIECES);
		}
		return inputWorkpieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORTSTEPS:
				return ((InternalEList<?>)getTransportsteps()).basicRemove(otherEnd, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_STEP__QUALITYASSURANCE:
				return basicSetQualityassurance(null, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_STEP__MANUFACTURING_SEPS:
				return ((InternalEList<?>)getManufacturingSeps()).basicRemove(otherEnd, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_STEP__INPUT_WORKPIECES:
				return ((InternalEList<?>)getInputWorkpieces()).basicRemove(otherEnd, msgs);
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
			case ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORTSTEPS:
				return getTransportsteps();
			case ManufacturingSystemPackage.MANUFACTURING_STEP__QUALITYASSURANCE:
				return getQualityassurance();
			case ManufacturingSystemPackage.MANUFACTURING_STEP__MANUFACTURING_SEPS:
				return getManufacturingSeps();
			case ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORT_WORK_PIECES:
				return getTransportWorkPieces();
			case ManufacturingSystemPackage.MANUFACTURING_STEP__OUPUT_WORKPIECES:
				return getOuputWorkpieces();
			case ManufacturingSystemPackage.MANUFACTURING_STEP__INPUT_WORKPIECES:
				return getInputWorkpieces();
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
			case ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORTSTEPS:
				getTransportsteps().clear();
				getTransportsteps().addAll((Collection<? extends TransportSteps>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__QUALITYASSURANCE:
				setQualityassurance((QualityAssurance)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__MANUFACTURING_SEPS:
				getManufacturingSeps().clear();
				getManufacturingSeps().addAll((Collection<? extends ManufacturingStep>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORT_WORK_PIECES:
				getTransportWorkPieces().clear();
				getTransportWorkPieces().addAll((Collection<? extends TransportSteps>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__OUPUT_WORKPIECES:
				getOuputWorkpieces().clear();
				getOuputWorkpieces().addAll((Collection<? extends WorkPieces>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__INPUT_WORKPIECES:
				getInputWorkpieces().clear();
				getInputWorkpieces().addAll((Collection<? extends WorkPieces>)newValue);
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
			case ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORTSTEPS:
				getTransportsteps().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__QUALITYASSURANCE:
				setQualityassurance((QualityAssurance)null);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__MANUFACTURING_SEPS:
				getManufacturingSeps().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORT_WORK_PIECES:
				getTransportWorkPieces().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__OUPUT_WORKPIECES:
				getOuputWorkpieces().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__INPUT_WORKPIECES:
				getInputWorkpieces().clear();
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
			case ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORTSTEPS:
				return transportsteps != null && !transportsteps.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_STEP__QUALITYASSURANCE:
				return qualityassurance != null;
			case ManufacturingSystemPackage.MANUFACTURING_STEP__MANUFACTURING_SEPS:
				return manufacturingSeps != null && !manufacturingSeps.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_STEP__TRANSPORT_WORK_PIECES:
				return transportWorkPieces != null && !transportWorkPieces.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_STEP__OUPUT_WORKPIECES:
				return ouputWorkpieces != null && !ouputWorkpieces.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_STEP__INPUT_WORKPIECES:
				return inputWorkpieces != null && !inputWorkpieces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManufacturingStepImpl
