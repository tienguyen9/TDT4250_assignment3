/**
 */
package tDT4250_asssignment1_2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.Program#getName <em>Name</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Program#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Program#getProgram_course <em>Program course</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Program#getCredits <em>Credits</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.Program#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getProgram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameCharacters'"
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link tDT4250_asssignment1_2.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference list.
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getProgram_Specialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecialization();

	/**
	 * Returns the value of the '<em><b>Program course</b></em>' containment reference list.
	 * The list contents are of type {@link tDT4250_asssignment1_2.Program_course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program course</em>' containment reference list.
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getProgram_Program_course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program_course> getProgram_course();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(int)
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getProgram_Credits()
	 * @model dataType="tDT4250_asssignment1_2.Program_credits"
	 * @generated
	 */
	int getCredits();

	/**
	 * Sets the value of the '{@link tDT4250_asssignment1_2.Program#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(int value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference list.
	 * The list contents are of type {@link tDT4250_asssignment1_2.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference list.
	 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package#getProgram_Semester()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemester();

} // Program
