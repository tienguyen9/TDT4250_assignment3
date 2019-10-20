/**
 */
package tDT4250_asssignment1_2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.Semester#getNumber <em>Number</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Semester#getSemester_course <em>Semester course</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Semester#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSemester_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Semester#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Semester course</b></em>' containment reference list.
	 * The list contents are of type {@link tDT4250_asssignment1_2.Semester_Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester course</em>' containment reference list.
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSemester_Semester_course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester_Course> getSemester_course();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(int)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSemester_Credits()
	 * @model dataType="tDT4250_asssignment1_2.Semester_credits"
	 * @generated
	 */
	int getCredits();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Semester#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(int value);

} // Semester
