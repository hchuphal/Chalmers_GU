/**
 */
package brickModel2.util;

import brickModel2.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see brickModel2.BrickModel2Package
 * @generated
 */
public class BrickModel2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BrickModel2Validator INSTANCE = new BrickModel2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "brickModel2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrickModel2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BrickModel2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BrickModel2Package.LIMITS:
				return validateLimits((Limits)value, diagnostics, context);
			case BrickModel2Package.BRICK_MODEL:
				return validateBrickModel((BrickModel)value, diagnostics, context);
			case BrickModel2Package.BRICK_ELEMENT:
				return validateBrickElement((BrickElement)value, diagnostics, context);
			case BrickModel2Package.ABSTRACT_BRICK:
				return validateAbstractBrick((AbstractBrick)value, diagnostics, context);
			case BrickModel2Package.COMPLEX_BRICK:
				return validateComplexBrick((ComplexBrick)value, diagnostics, context);
			case BrickModel2Package.POSITION:
				return validatePosition((Position)value, diagnostics, context);
			case BrickModel2Package.SIZE:
				return validateSize((Size)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimits(Limits limits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(limits, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrickModel(BrickModel brickModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(brickModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrickElement(BrickElement brickElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(brickElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractBrick(AbstractBrick abstractBrick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractBrick, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexBrick(ComplexBrick complexBrick, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexBrick, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(position, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(position, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(position, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(position, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(position, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(position, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(position, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(position, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(position, diagnostics, context);
		if (result || diagnostics != null) result &= validatePosition_checkX(position, diagnostics, context);
		if (result || diagnostics != null) result &= validatePosition_checkY(position, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkX constraint of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POSITION__CHECK_X__EEXPRESSION = "\n" +
		"\t\tself.x <> 0";

	/**
	 * Validates the checkX constraint of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition_checkX(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BrickModel2Package.Literals.POSITION,
				 position,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkX",
				 POSITION__CHECK_X__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the checkY constraint of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POSITION__CHECK_Y__EEXPRESSION = "\n" +
		"\t\tself.y <> 0";

	/**
	 * Validates the checkY constraint of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition_checkY(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BrickModel2Package.Literals.POSITION,
				 position,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkY",
				 POSITION__CHECK_Y__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSize(Size size, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(size, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(size, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(size, diagnostics, context);
		if (result || diagnostics != null) result &= validateSize_limitHeight(size, diagnostics, context);
		if (result || diagnostics != null) result &= validateSize_limitWidth(size, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the limitHeight constraint of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIZE__LIMIT_HEIGHT__EEXPRESSION = "\n" +
		"\t\tself.brickHeight >=1";

	/**
	 * Validates the limitHeight constraint of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSize_limitHeight(Size size, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BrickModel2Package.Literals.SIZE,
				 size,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "limitHeight",
				 SIZE__LIMIT_HEIGHT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the limitWidth constraint of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIZE__LIMIT_WIDTH__EEXPRESSION = "\n" +
		"\t\tself.brickWidth >=1";

	/**
	 * Validates the limitWidth constraint of '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSize_limitWidth(Size size, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(BrickModel2Package.Literals.SIZE,
				 size,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "limitWidth",
				 SIZE__LIMIT_WIDTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BrickModel2Validator
