/**
 */
package manufacturingSystem.impl;

import java.util.Collection;

import manufacturingSystem.ManufacturingSystem;
import manufacturingSystem.ManufacturingSystemElement;
import manufacturingSystem.ManufacturingSystemPackage;
import manufacturingSystem.Responsible;
import manufacturingSystem.StoragePoint;
import manufacturingSystem.WorkPiece;
import manufacturingSystem.WorkPieceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manufacturing System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getStart <em>Start</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getEnd <em>End</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getTransforms <em>Transforms</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link manufacturingSystem.impl.ManufacturingSystemImpl#getStaff <em>Staff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManufacturingSystemImpl extends MinimalEObjectImpl.Container implements ManufacturingSystem {
	/**
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ManufacturingSystemElement> consistsOf;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected EList<StoragePoint> start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<StoragePoint> end;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPieceType> uses;

	/**
	 * The cached value of the '{@link #getTransforms() <em>Transforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransforms()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> transforms;

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
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsible> staff;

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
	public EList<ManufacturingSystemElement> getConsistsOf() {
		if (consistsOf == null) {
			consistsOf = new EObjectContainmentEList<ManufacturingSystemElement>(ManufacturingSystemElement.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF);
		}
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoragePoint> getStart() {
		if (start == null) {
			start = new EObjectResolvingEList<StoragePoint>(StoragePoint.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START);
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StoragePoint> getEnd() {
		if (end == null) {
			end = new EObjectResolvingEList<StoragePoint>(StoragePoint.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END);
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPieceType> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<WorkPieceType>(WorkPieceType.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkPiece> getTransforms() {
		if (transforms == null) {
			transforms = new EObjectContainmentEList<WorkPiece>(WorkPiece.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS);
		}
		return transforms;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE, oldResponsible, responsible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE, oldResponsible, responsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Responsible> getStaff() {
		if (staff == null) {
			staff = new EObjectContainmentEList<Responsible>(Responsible.class, this, ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				return ((InternalEList<?>)getConsistsOf()).basicRemove(otherEnd, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				return ((InternalEList<?>)getUses()).basicRemove(otherEnd, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				return ((InternalEList<?>)getTransforms()).basicRemove(otherEnd, msgs);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				return getConsistsOf();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START:
				return getStart();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END:
				return getEnd();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				return getUses();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				return getTransforms();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME:
				return getName();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE:
				if (resolve) return getResponsible();
				return basicGetResponsible();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				return getStaff();
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				getConsistsOf().clear();
				getConsistsOf().addAll((Collection<? extends ManufacturingSystemElement>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START:
				getStart().clear();
				getStart().addAll((Collection<? extends StoragePoint>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends StoragePoint>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends WorkPieceType>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				getTransforms().clear();
				getTransforms().addAll((Collection<? extends WorkPiece>)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME:
				setName((String)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE:
				setResponsible((Responsible)newValue);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				getStaff().clear();
				getStaff().addAll((Collection<? extends Responsible>)newValue);
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				getConsistsOf().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START:
				getStart().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END:
				getEnd().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				getUses().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				getTransforms().clear();
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE:
				setResponsible((Responsible)null);
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				getStaff().clear();
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
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
				return consistsOf != null && !consistsOf.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__START:
				return start != null && !start.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__END:
				return end != null && !end.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
				return uses != null && !uses.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
				return transforms != null && !transforms.isEmpty();
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__RESPONSIBLE:
				return responsible != null;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				return staff != null && !staff.isEmpty();
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

} //ManufacturingSystemImpl
