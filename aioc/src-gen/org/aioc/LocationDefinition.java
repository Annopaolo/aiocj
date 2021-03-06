/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.LocationDefinition#getRole <em>Role</em>}</li>
 *   <li>{@link org.aioc.LocationDefinition#getLocation <em>Location</em>}</li>
 *   <li>{@link org.aioc.LocationDefinition#getContinuation <em>Continuation</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getLocationDefinition()
 * @model
 * @generated
 */
public interface LocationDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute.
   * @see #setRole(String)
   * @see org.aioc.AiocPackage#getLocationDefinition_Role()
   * @model
   * @generated
   */
  String getRole();

  /**
   * Sets the value of the '{@link org.aioc.LocationDefinition#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see #getRole()
   * @generated
   */
  void setRole(String value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see org.aioc.AiocPackage#getLocationDefinition_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link org.aioc.LocationDefinition#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Continuation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Continuation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Continuation</em>' containment reference.
   * @see #setContinuation(LocationDefinition)
   * @see org.aioc.AiocPackage#getLocationDefinition_Continuation()
   * @model containment="true"
   * @generated
   */
  LocationDefinition getContinuation();

  /**
   * Sets the value of the '{@link org.aioc.LocationDefinition#getContinuation <em>Continuation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Continuation</em>' containment reference.
   * @see #getContinuation()
   * @generated
   */
  void setContinuation(LocationDefinition value);

} // LocationDefinition
