/**
 */
package org.aioc.impl;

import org.aioc.AiocPackage;
import org.aioc.Where;
import org.aioc.WhereCompareCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aioc.impl.WhereImpl#getWhereCondition <em>Where Condition</em>}</li>
 *   <li>{@link org.aioc.impl.WhereImpl#isParen <em>Paren</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereImpl extends MinimalEObjectImpl.Container implements Where
{
  /**
   * The cached value of the '{@link #getWhereCondition() <em>Where Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereCondition()
   * @generated
   * @ordered
   */
  protected WhereCompareCondition whereCondition;

  /**
   * The default value of the '{@link #isParen() <em>Paren</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isParen()
   * @generated
   * @ordered
   */
  protected static final boolean PAREN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isParen() <em>Paren</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isParen()
   * @generated
   * @ordered
   */
  protected boolean paren = PAREN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhereImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AiocPackage.Literals.WHERE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereCompareCondition getWhereCondition()
  {
    return whereCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhereCondition(WhereCompareCondition newWhereCondition, NotificationChain msgs)
  {
    WhereCompareCondition oldWhereCondition = whereCondition;
    whereCondition = newWhereCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE__WHERE_CONDITION, oldWhereCondition, newWhereCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhereCondition(WhereCompareCondition newWhereCondition)
  {
    if (newWhereCondition != whereCondition)
    {
      NotificationChain msgs = null;
      if (whereCondition != null)
        msgs = ((InternalEObject)whereCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE__WHERE_CONDITION, null, msgs);
      if (newWhereCondition != null)
        msgs = ((InternalEObject)newWhereCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiocPackage.WHERE__WHERE_CONDITION, null, msgs);
      msgs = basicSetWhereCondition(newWhereCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE__WHERE_CONDITION, newWhereCondition, newWhereCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isParen()
  {
    return paren;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParen(boolean newParen)
  {
    boolean oldParen = paren;
    paren = newParen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiocPackage.WHERE__PAREN, oldParen, paren));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AiocPackage.WHERE__WHERE_CONDITION:
        return basicSetWhereCondition(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AiocPackage.WHERE__WHERE_CONDITION:
        return getWhereCondition();
      case AiocPackage.WHERE__PAREN:
        return isParen();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AiocPackage.WHERE__WHERE_CONDITION:
        setWhereCondition((WhereCompareCondition)newValue);
        return;
      case AiocPackage.WHERE__PAREN:
        setParen((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AiocPackage.WHERE__WHERE_CONDITION:
        setWhereCondition((WhereCompareCondition)null);
        return;
      case AiocPackage.WHERE__PAREN:
        setParen(PAREN_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AiocPackage.WHERE__WHERE_CONDITION:
        return whereCondition != null;
      case AiocPackage.WHERE__PAREN:
        return paren != PAREN_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (paren: ");
    result.append(paren);
    result.append(')');
    return result.toString();
  }

} //WhereImpl
