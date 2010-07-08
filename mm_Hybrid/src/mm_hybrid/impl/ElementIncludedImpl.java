/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;

import mm_hybrid.Element;
import mm_hybrid.ElementIncluded;
import mm_hybrid.MM_HybridPackage;

import mm_hybrid.SourceElementRule;
import mm_hybrid.TargetElementRule;
import mm_hybrid.TypeAtribute;
import mm_hybrid.TypeElem;
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
 * An implementation of the model object '<em><b>Element Included</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getTypeElement <em>Type Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementIncludedImpl extends EObjectImpl implements ElementIncluded {
	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElementRule> sourceElement;

	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetElementRule> targetElement;

	/**
	 * The default value of the '{@link #getTypeAttribute() <em>Type Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAtribute TYPE_ATTRIBUTE_EDEFAULT = TypeAtribute.COPY;

	/**
	 * The cached value of the '{@link #getTypeAttribute() <em>Type Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribute()
	 * @generated
	 * @ordered
	 */
	protected TypeAtribute typeAttribute = TYPE_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeElem TYPE_ELEMENT_EDEFAULT = TypeElem.MY_ECLASSIFIER;

	/**
	 * The cached value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected TypeElem typeElement = TYPE_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementIncludedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.ELEMENT_INCLUDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElementRule> getSourceElement() {
		if (sourceElement == null) {
			sourceElement = new EObjectContainmentEList<SourceElementRule>(
					SourceElementRule.class, this,
					MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT);
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetElementRule> getTargetElement() {
		if (targetElement == null) {
			targetElement = new EObjectContainmentEList<TargetElementRule>(
					TargetElementRule.class, this,
					MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT);
		}
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAtribute getTypeAttribute() {
		return typeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAttribute(TypeAtribute newTypeAttribute) {
		TypeAtribute oldTypeAttribute = typeAttribute;
		typeAttribute = newTypeAttribute == null ? TYPE_ATTRIBUTE_EDEFAULT
				: newTypeAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE,
					oldTypeAttribute, typeAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElem getTypeElement() {
		return typeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeElement(TypeElem newTypeElement) {
		TypeElem oldTypeElement = typeElement;
		typeElement = newTypeElement == null ? TYPE_ELEMENT_EDEFAULT
				: newTypeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT,
					oldTypeElement, typeElement));
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
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			return ((InternalEList<?>) getSourceElement()).basicRemove(
					otherEnd, msgs);
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return ((InternalEList<?>) getTargetElement()).basicRemove(
					otherEnd, msgs);
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
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			return getSourceElement();
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return getTargetElement();
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE:
			return getTypeAttribute();
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT:
			return getTypeElement();
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
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			getSourceElement().clear();
			getSourceElement().addAll(
					(Collection<? extends SourceElementRule>) newValue);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			getTargetElement().clear();
			getTargetElement().addAll(
					(Collection<? extends TargetElementRule>) newValue);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE:
			setTypeAttribute((TypeAtribute) newValue);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT:
			setTypeElement((TypeElem) newValue);
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
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			getSourceElement().clear();
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			getTargetElement().clear();
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE:
			setTypeAttribute(TYPE_ATTRIBUTE_EDEFAULT);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT:
			setTypeElement(TYPE_ELEMENT_EDEFAULT);
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
		case MM_HybridPackage.ELEMENT_INCLUDED__SOURCE_ELEMENT:
			return sourceElement != null && !sourceElement.isEmpty();
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return targetElement != null && !targetElement.isEmpty();
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE:
			return typeAttribute != TYPE_ATTRIBUTE_EDEFAULT;
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT:
			return typeElement != TYPE_ELEMENT_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeAttribute: "); //$NON-NLS-1$
		result.append(typeAttribute);
		result.append(", typeElement: "); //$NON-NLS-1$
		result.append(typeElement);
		result.append(')');
		return result.toString();
	}

} //ElementIncludedImpl
