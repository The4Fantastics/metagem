/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import mm_hybrid.InMetaModel;
import mm_hybrid.MM_HybridPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.InMetaModelImpl#getName_mm <em>Name mm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InMetaModelImpl extends EObjectImpl implements InMetaModel {
	/**
	 * The default value of the '{@link #getName_mm() <em>Name mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_mm()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_MM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_mm() <em>Name mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_mm()
	 * @generated
	 * @ordered
	 */
	protected String name_mm = NAME_MM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InMetaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.IN_META_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_mm() {
		return name_mm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_mm(String newName_mm) {
		String oldName_mm = name_mm;
		name_mm = newName_mm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.IN_META_MODEL__NAME_MM, oldName_mm,
					name_mm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MM_HybridPackage.IN_META_MODEL__NAME_MM:
			return getName_mm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MM_HybridPackage.IN_META_MODEL__NAME_MM:
			setName_mm((String) newValue);
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
		case MM_HybridPackage.IN_META_MODEL__NAME_MM:
			setName_mm(NAME_MM_EDEFAULT);
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
		case MM_HybridPackage.IN_META_MODEL__NAME_MM:
			return NAME_MM_EDEFAULT == null ? name_mm != null
					: !NAME_MM_EDEFAULT.equals(name_mm);
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
		result.append(" (name_mm: "); //$NON-NLS-1$
		result.append(name_mm);
		result.append(')');
		return result.toString();
	}

} //InMetaModelImpl