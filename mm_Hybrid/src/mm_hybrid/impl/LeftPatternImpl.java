/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;

import mm_hybrid.LeftPattern;
import mm_hybrid.MM_HybridPackage;
import mm_hybrid.TargetElementRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.LeftPatternImpl#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftPatternImpl extends EObjectImpl implements LeftPattern {
	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected TargetElementRule targetElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeftPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.LEFT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElementRule getTargetElement() {
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetElement(
			TargetElementRule newTargetElement, NotificationChain msgs) {
		TargetElementRule oldTargetElement = targetElement;
		targetElement = newTargetElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT,
					oldTargetElement, newTargetElement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElement(TargetElementRule newTargetElement) {
		if (newTargetElement != targetElement) {
			NotificationChain msgs = null;
			if (targetElement != null)
				msgs = ((InternalEObject) targetElement).eInverseRemove(this,
						MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN,
						TargetElementRule.class, msgs);
			if (newTargetElement != null)
				msgs = ((InternalEObject) newTargetElement).eInverseAdd(this,
						MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN,
						TargetElementRule.class, msgs);
			msgs = basicSetTargetElement(newTargetElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT,
					newTargetElement, newTargetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT:
			if (targetElement != null)
				msgs = ((InternalEObject) targetElement)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT,
								null, msgs);
			return basicSetTargetElement((TargetElementRule) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT:
			return basicSetTargetElement(null, msgs);
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
		case MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT:
			return getTargetElement();
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
		case MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT:
			setTargetElement((TargetElementRule) newValue);
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
		case MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT:
			setTargetElement((TargetElementRule) null);
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
		case MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT:
			return targetElement != null;
		}
		return super.eIsSet(featureID);
	}

} //LeftPatternImpl
