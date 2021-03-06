/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Where#getWhereCondition <em>Where Condition</em>}</li>
 *   <li>{@link org.aioc.Where#isParen <em>Paren</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getWhere()
 * @model
 * @generated
 */
public interface Where extends EObject
{
  /**
   * Returns the value of the '<em><b>Where Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Condition</em>' containment reference.
   * @see #setWhereCondition(WhereCompareCondition)
   * @see org.aioc.AiocPackage#getWhere_WhereCondition()
   * @model containment="true"
   * @generated
   */
  WhereCompareCondition getWhereCondition();

  /**
   * Sets the value of the '{@link org.aioc.Where#getWhereCondition <em>Where Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Condition</em>' containment reference.
   * @see #getWhereCondition()
   * @generated
   */
  void setWhereCondition(WhereCompareCondition value);

  /**
   * Returns the value of the '<em><b>Paren</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paren</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paren</em>' attribute.
   * @see #setParen(boolean)
   * @see org.aioc.AiocPackage#getWhere_Paren()
   * @model
   * @generated
   */
  boolean isParen();

  /**
   * Sets the value of the '{@link org.aioc.Where#isParen <em>Paren</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paren</em>' attribute.
   * @see #isParen()
   * @generated
   */
  void setParen(boolean value);

} // Where
