/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;

import mm_hybrid.MM_HybridPackage;
import mm_hybrid.Rule;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getName_rule <em>Name rule</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getIn <em>In</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getOut <em>Out</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The default value of the '{@link #getName_rule() <em>Name rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_rule()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_rule() <em>Name rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_rule()
	 * @generated
	 * @ordered
	 */
	protected String name_rule = NAME_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected boolean isMain = IS_MAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElementRule> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetElementRule> out;

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
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> extends_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_rule() {
		return name_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_rule(String newName_rule) {
		String oldName_rule = name_rule;
		name_rule = newName_rule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__NAME_RULE, oldName_rule, name_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__IS_ABSTRACT, oldIsAbstract,
					isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMain() {
		return isMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMain(boolean newIsMain) {
		boolean oldIsMain = isMain;
		isMain = newIsMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__IS_MAIN, oldIsMain, isMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElementRule> getIn() {
		if (in == null) {
			in = new EObjectContainmentEList<SourceElementRule>(
					SourceElementRule.class, this, MM_HybridPackage.RULE__IN);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetElementRule> getOut() {
		if (out == null) {
			out = new EObjectContainmentEList<TargetElementRule>(
					TargetElementRule.class, this, MM_HybridPackage.RULE__OUT);
		}
		return out;
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
					MM_HybridPackage.RULE__TYPE_ATTRIBUTE, oldTypeAttribute,
					typeAttribute));
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
					MM_HybridPackage.RULE__TYPE_ELEMENT, oldTypeElement,
					typeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<Rule>(Rule.class, this,
					MM_HybridPackage.RULE__EXTENDS);
		}
		return extends_;
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
		case MM_HybridPackage.RULE__IN:
			return ((InternalEList<?>) getIn()).basicRemove(otherEnd, msgs);
		case MM_HybridPackage.RULE__OUT:
			return ((InternalEList<?>) getOut()).basicRemove(otherEnd, msgs);
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
		case MM_HybridPackage.RULE__NAME_RULE:
			return getName_rule();
		case MM_HybridPackage.RULE__IS_ABSTRACT:
			return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
		case MM_HybridPackage.RULE__IS_MAIN:
			return isIsMain() ? Boolean.TRUE : Boolean.FALSE;
		case MM_HybridPackage.RULE__IN:
			return getIn();
		case MM_HybridPackage.RULE__OUT:
			return getOut();
		case MM_HybridPackage.RULE__TYPE_ATTRIBUTE:
			return getTypeAttribute();
		case MM_HybridPackage.RULE__TYPE_ELEMENT:
			return getTypeElement();
		case MM_HybridPackage.RULE__EXTENDS:
			return getExtends();
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
		case MM_HybridPackage.RULE__NAME_RULE:
			setName_rule((String) newValue);
			return;
		case MM_HybridPackage.RULE__IS_ABSTRACT:
			setIsAbstract(((Boolean) newValue).booleanValue());
			return;
		case MM_HybridPackage.RULE__IS_MAIN:
			setIsMain(((Boolean) newValue).booleanValue());
			return;
		case MM_HybridPackage.RULE__IN:
			getIn().clear();
			getIn().addAll((Collection<? extends SourceElementRule>) newValue);
			return;
		case MM_HybridPackage.RULE__OUT:
			getOut().clear();
			getOut().addAll((Collection<? extends TargetElementRule>) newValue);
			return;
		case MM_HybridPackage.RULE__TYPE_ATTRIBUTE:
			setTypeAttribute((TypeAtribute) newValue);
			return;
		case MM_HybridPackage.RULE__TYPE_ELEMENT:
			setTypeElement((TypeElem) newValue);
			return;
		case MM_HybridPackage.RULE__EXTENDS:
			getExtends().clear();
			getExtends().addAll((Collection<? extends Rule>) newValue);
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
		case MM_HybridPackage.RULE__NAME_RULE:
			setName_rule(NAME_RULE_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__IS_MAIN:
			setIsMain(IS_MAIN_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__IN:
			getIn().clear();
			return;
		case MM_HybridPackage.RULE__OUT:
			getOut().clear();
			return;
		case MM_HybridPackage.RULE__TYPE_ATTRIBUTE:
			setTypeAttribute(TYPE_ATTRIBUTE_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__TYPE_ELEMENT:
			setTypeElement(TYPE_ELEMENT_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__EXTENDS:
			getExtends().clear();
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
		case MM_HybridPackage.RULE__NAME_RULE:
			return NAME_RULE_EDEFAULT == null ? name_rule != null
					: !NAME_RULE_EDEFAULT.equals(name_rule);
		case MM_HybridPackage.RULE__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case MM_HybridPackage.RULE__IS_MAIN:
			return isMain != IS_MAIN_EDEFAULT;
		case MM_HybridPackage.RULE__IN:
			return in != null && !in.isEmpty();
		case MM_HybridPackage.RULE__OUT:
			return out != null && !out.isEmpty();
		case MM_HybridPackage.RULE__TYPE_ATTRIBUTE:
			return typeAttribute != TYPE_ATTRIBUTE_EDEFAULT;
		case MM_HybridPackage.RULE__TYPE_ELEMENT:
			return typeElement != TYPE_ELEMENT_EDEFAULT;
		case MM_HybridPackage.RULE__EXTENDS:
			return extends_ != null && !extends_.isEmpty();
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
		result.append(" (name_rule: "); //$NON-NLS-1$
		result.append(name_rule);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append(isAbstract);
		result.append(", isMain: "); //$NON-NLS-1$
		result.append(isMain);
		result.append(", typeAttribute: "); //$NON-NLS-1$
		result.append(typeAttribute);
		result.append(", typeElement: "); //$NON-NLS-1$
		result.append(typeElement);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
