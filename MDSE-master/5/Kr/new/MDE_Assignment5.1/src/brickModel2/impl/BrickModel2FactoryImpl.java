/**
 */
package brickModel2.impl;

import brickModel2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BrickModel2FactoryImpl extends EFactoryImpl implements BrickModel2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BrickModel2Factory init() {
		try {
			BrickModel2Factory theBrickModel2Factory = (BrickModel2Factory)EPackage.Registry.INSTANCE.getEFactory(BrickModel2Package.eNS_URI);
			if (theBrickModel2Factory != null) {
				return theBrickModel2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BrickModel2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrickModel2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BrickModel2Package.LIMITS: return createLimits();
			case BrickModel2Package.BRICK_MODEL: return createBrickModel();
			case BrickModel2Package.ABSTRACT_BRICK: return createAbstractBrick();
			case BrickModel2Package.COMPLEX_BRICK: return createComplexBrick();
			case BrickModel2Package.POSITION: return createPosition();
			case BrickModel2Package.SIZE: return createSize();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Limits createLimits() {
		LimitsImpl limits = new LimitsImpl();
		return limits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickModel createBrickModel() {
		BrickModelImpl brickModel = new BrickModelImpl();
		return brickModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractBrick createAbstractBrick() {
		AbstractBrickImpl abstractBrick = new AbstractBrickImpl();
		return abstractBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexBrick createComplexBrick() {
		ComplexBrickImpl complexBrick = new ComplexBrickImpl();
		return complexBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BrickModel2Package getBrickModel2Package() {
		return (BrickModel2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BrickModel2Package getPackage() {
		return BrickModel2Package.eINSTANCE;
	}

} //BrickModel2FactoryImpl
