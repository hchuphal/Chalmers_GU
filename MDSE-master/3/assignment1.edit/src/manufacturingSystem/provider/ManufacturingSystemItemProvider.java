/**
 */
package manufacturingSystem.provider;


import java.util.Collection;
import java.util.List;

import manufacturingSystem.ManufacturingSystem;
import manufacturingSystem.ManufacturingSystemFactory;
import manufacturingSystem.ManufacturingSystemPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link manufacturingSystem.ManufacturingSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ManufacturingSystemItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturingSystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStartPropertyDescriptor(object);
			addEndPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addResponsiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManufacturingSystem_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManufacturingSystem_start_feature", "_UI_ManufacturingSystem_type"),
				 ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__START,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManufacturingSystem_end_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManufacturingSystem_end_feature", "_UI_ManufacturingSystem_type"),
				 ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__END,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManufacturingSystem_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManufacturingSystem_name_feature", "_UI_ManufacturingSystem_type"),
				 ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Responsible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ManufacturingSystem_responsible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ManufacturingSystem_responsible_feature", "_UI_ManufacturingSystem_type"),
				 ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__RESPONSIBLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__CONSISTS_OF);
			childrenFeatures.add(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__USES);
			childrenFeatures.add(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__TRANSFORMS);
			childrenFeatures.add(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__STAFF);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ManufacturingSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ManufacturingSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ManufacturingSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ManufacturingSystem_type") :
			getString("_UI_ManufacturingSystem_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ManufacturingSystem.class)) {
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__CONSISTS_OF:
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__USES:
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__TRANSFORMS:
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM__STAFF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__CONSISTS_OF,
				 ManufacturingSystemFactory.eINSTANCE.createManufacturingSystemElement()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__CONSISTS_OF,
				 ManufacturingSystemFactory.eINSTANCE.createManufacturingStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__CONSISTS_OF,
				 ManufacturingSystemFactory.eINSTANCE.createTransportStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__CONSISTS_OF,
				 ManufacturingSystemFactory.eINSTANCE.createQualityAssuranceStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__CONSISTS_OF,
				 ManufacturingSystemFactory.eINSTANCE.createStoragePoint()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__CONSISTS_OF,
				 ManufacturingSystemFactory.eINSTANCE.createCompositeManufacturingStep()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__USES,
				 ManufacturingSystemFactory.eINSTANCE.createWorkPieceType()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__TRANSFORMS,
				 ManufacturingSystemFactory.eINSTANCE.createWorkPiece()));

		newChildDescriptors.add
			(createChildParameter
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM__STAFF,
				 ManufacturingSystemFactory.eINSTANCE.createResponsible()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ManufacturingSystemEditPlugin.INSTANCE;
	}

}
