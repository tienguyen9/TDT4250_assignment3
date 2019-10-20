/**
 */
package tDT4250_asssignment1_2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Specialization#getSemester <em>Semester</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Specialization#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference list.
	 * The list contents are of type {@link tDT4250_asssignment1_2.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference list.
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSpecialization_Semester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemester();

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' reference list.
	 * The list contents are of type {@link tDT4250_asssignment1_2.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' reference list.
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSpecialization_Specialization()
	 * @model
	 * @generated
	 */
	EList<Specialization> getSpecialization();

} // Specialization
