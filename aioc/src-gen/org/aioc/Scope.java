/**
 */
package org.aioc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.Scope#getThread <em>Thread</em>}</li>
 *   <li>{@link org.aioc.Scope#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link org.aioc.Scope#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.aioc.Scope#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.aioc.Scope#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see org.aioc.AiocPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject
{
  /**
   * Returns the value of the '<em><b>Thread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thread</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thread</em>' attribute.
   * @see #setThread(String)
   * @see org.aioc.AiocPackage#getScope_Thread()
   * @model
   * @generated
   */
  String getThread();

  /**
   * Sets the value of the '{@link org.aioc.Scope#getThread <em>Thread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thread</em>' attribute.
   * @see #getThread()
   * @generated
   */
  void setThread(String value);

  /**
   * Returns the value of the '<em><b>Choreography</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choreography</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choreography</em>' containment reference.
   * @see #setChoreography(Choreography)
   * @see org.aioc.AiocPackage#getScope_Choreography()
   * @model containment="true"
   * @generated
   */
  Choreography getChoreography();

  /**
   * Sets the value of the '{@link org.aioc.Scope#getChoreography <em>Choreography</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choreography</em>' containment reference.
   * @see #getChoreography()
   * @generated
   */
  void setChoreography(Choreography value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(AssignmentSet)
   * @see org.aioc.AiocPackage#getScope_Properties()
   * @model containment="true"
   * @generated
   */
  AssignmentSet getProperties();

  /**
   * Sets the value of the '{@link org.aioc.Scope#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(AssignmentSet value);

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference.
   * @see #setRoles(Roles)
   * @see org.aioc.AiocPackage#getScope_Roles()
   * @model containment="true"
   * @generated
   */
  Roles getRoles();

  /**
   * Sets the value of the '{@link org.aioc.Scope#getRoles <em>Roles</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Roles</em>' containment reference.
   * @see #getRoles()
   * @generated
   */
  void setRoles(Roles value);

  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.aioc.AiocPackage#getScope_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.aioc.Scope#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

} // Scope
