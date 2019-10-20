/**
 */
package tDT4250_asssignment1_2;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.Course#getName <em>Name</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Course#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Course#getExamDate <em>Exam Date</em>}</li>
 * </ul>
 *
 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getCourse_Code()
	 * @model dataType="tDT4250_asssignment1_2.course_code"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * The default value is <code>"7.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(double)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getCourse_Credits()
	 * @model default="7.5"
	 * @generated
	 */
	double getCredits();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(double value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Calendar)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getCourse_StartDate()
	 * @model dataType="tDT4250_asssignment1_2.Calendar"
	 * @generated
	 */
	Calendar getStartDate();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Course#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Calendar value);

	/**
	 * Returns the value of the '<em><b>Exam Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Date</em>' attribute.
	 * @see #setExamDate(Calendar)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getCourse_ExamDate()
	 * @model dataType="tDT4250_asssignment1_2.Calendar"
	 * @generated
	 */
	Calendar getExamDate();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Course#getExamDate <em>Exam Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam Date</em>' attribute.
	 * @see #getExamDate()
	 * @generated
	 */
	void setExamDate(Calendar value);

} // Course
