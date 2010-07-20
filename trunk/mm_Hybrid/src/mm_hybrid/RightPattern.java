/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.RightPattern#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link mm_hybrid.RightPattern#getRule <em>Rule</em>}</li>
 *   <li>{@link mm_hybrid.RightPattern#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getRightPattern()
 * @model
 * @generated
 */
public interface RightPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.SourceElementRule}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.SourceElementRule#getRightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRightPattern_SourceElement()
	 * @see mm_hybrid.SourceElementRule#getRightPattern
	 * @model opposite="rightPattern" containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceElementRule> getSourceElement();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.Rule}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.Rule#getRightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRightPattern_Rule()
	 * @see mm_hybrid.Rule#getRightPattern
	 * @model opposite="rightPattern"
	 * @generated
	 */
	EList<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.Operation}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.Operation#getRightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRightPattern_Operation()
	 * @see mm_hybrid.Operation#getRightPattern
	 * @model opposite="rightPattern"
	 * @generated
	 */
	EList<Operation> getOperation();

} // RightPattern
