/**
 */
package tDT4250_asssignment1_2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.Semester_Course#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Semester_Course#getCourse <em>Course</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Semester_Course#getFall_or_spring <em>Fall or spring</em>}</li>
 * </ul>
 *
 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSemester_Course()
 * @model
 * @generated
 */
public interface Semester_Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSemester_Course_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Semester_Course#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link tDT4250_asssignment1_2.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSemester_Course_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

	/**
	 * Returns the value of the '<em><b>Fall or spring</b></em>' attribute.
	 * The literals are from the enumeration {@link tDT4250_asssignment1_2.Fall_or_spring}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fall or spring</em>' attribute.
	 * @see tDT4250_asssignment1_2.Fall_or_spring
	 * @see #setFall_or_spring(Fall_or_spring)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getSemester_Course_Fall_or_spring()
	 * @model
	 * @generated
	 */
	Fall_or_spring getFall_or_spring();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Semester_Course#getFall_or_spring <em>Fall or spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fall or spring</em>' attribute.
	 * @see tDT4250_asssignment1_2.Fall_or_spring
	 * @see #getFall_or_spring()
	 * @generated
	 */
	void setFall_or_spring(Fall_or_spring value);

} // Semester_Course
