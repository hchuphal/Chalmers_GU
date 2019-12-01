/**
 */
package brickModel2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link brickModel2.Size#getBrickHeight <em>Brick Height</em>}</li>
 *   <li>{@link brickModel2.Size#getBrickWidth <em>Brick Width</em>}</li>
 * </ul>
 *
 * @see brickModel2.BrickModel2Package#getSize()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='limitHeight limitWidth'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot limitHeight='\n\t\tself.brickHeight &gt;=1' limitWidth='\n\t\tself.brickWidth &gt;=1'"
 * @generated
 */
public interface Size extends EObject {
	/**
	 * Returns the value of the '<em><b>Brick Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick Height</em>' attribute.
	 * @see #setBrickHeight(int)
	 * @see brickModel2.BrickModel2Package#getSize_BrickHeight()
	 * @model required="true"
	 * @generated
	 */
	int getBrickHeight();

	/**
	 * Sets the value of the '{@link brickModel2.Size#getBrickHeight <em>Brick Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brick Height</em>' attribute.
	 * @see #getBrickHeight()
	 * @generated
	 */
	void setBrickHeight(int value);

	/**
	 * Returns the value of the '<em><b>Brick Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brick Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brick Width</em>' attribute.
	 * @see #setBrickWidth(int)
	 * @see brickModel2.BrickModel2Package#getSize_BrickWidth()
	 * @model required="true"
	 * @generated
	 */
	int getBrickWidth();

	/**
	 * Sets the value of the '{@link brickModel2.Size#getBrickWidth <em>Brick Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brick Width</em>' attribute.
	 * @see #getBrickWidth()
	 * @generated
	 */
	void setBrickWidth(int value);

} // Size
