/**
 */
package tDT4250_asssignment1_2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Factory
 * @model kind="package"
 * @generated
 */
public interface TDT4250_asssignment1_2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tDT4250_asssignment1_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tDT4250_asssignment1_2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tDT4250_asssignment1_2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TDT4250_asssignment1_2Package eINSTANCE = tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl.init();

	/**
	 * The meta object id for the '{@link tDT4250_asssignment1_2.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.impl.ProgramImpl
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPECIALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Program course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAM_COURSE = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CREDITS = 3;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SEMESTER = 4;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tDT4250_asssignment1_2.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.impl.SpecializationImpl
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SEMESTER = 1;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SPECIALIZATION = 2;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tDT4250_asssignment1_2.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.impl.SemesterImpl
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Semester course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_COURSE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__CREDITS = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tDT4250_asssignment1_2.impl.Semester_CourseImpl <em>Semester Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.impl.Semester_CourseImpl
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getSemester_Course()
	 * @generated
	 */
	int SEMESTER_COURSE = 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE__MANDATORY = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Fall or spring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE__FALL_OR_SPRING = 2;

	/**
	 * The number of structural features of the '<em>Semester Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tDT4250_asssignment1_2.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.impl.CourseImpl
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__START_DATE = 3;

	/**
	 * The feature id for the '<em><b>Exam Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__EXAM_DATE = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tDT4250_asssignment1_2.impl.Program_courseImpl <em>Program course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.impl.Program_courseImpl
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getProgram_course()
	 * @generated
	 */
	int PROGRAM_COURSE = 5;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_COURSE__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Fall or spring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_COURSE__FALL_OR_SPRING = 1;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_COURSE__MANDATORY = 2;

	/**
	 * The number of structural features of the '<em>Program course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_COURSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tDT4250_asssignment1_2.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.impl.DepartmentImpl
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSE = 1;

	/**
	 * The feature id for the '<em><b>Program</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAM = 2;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tDT4250_asssignment1_2.Fall_or_spring <em>Fall or spring</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.Fall_or_spring
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getFall_or_spring()
	 * @generated
	 */
	int FALL_OR_SPRING = 7;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 8;

	/**
	 * The meta object id for the '<em>course code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getcourse_code()
	 * @generated
	 */
	int COURSE_CODE = 9;

	/**
	 * The meta object id for the '<em>Semester credits</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getSemester_credits()
	 * @generated
	 */
	int SEMESTER_CREDITS = 10;

	/**
	 * The meta object id for the '<em>Program credits</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getProgram_credits()
	 * @generated
	 */
	int PROGRAM_CREDITS = 11;

	/**
	 * Returns the meta object for class '{@link tDT4250_asssignment1_2.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see tDT4250_asssignment1_2.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tDT4250_asssignment1_2.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tDT4250_asssignment1_2.Program#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialization</em>'.
	 * @see tDT4250_asssignment1_2.Program#getSpecialization()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Specialization();

	/**
	 * Returns the meta object for the containment reference list '{@link tDT4250_asssignment1_2.Program#getProgram_course <em>Program course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program course</em>'.
	 * @see tDT4250_asssignment1_2.Program#getProgram_course()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Program_course();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Program#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see tDT4250_asssignment1_2.Program#getCredits()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Credits();

	/**
	 * Returns the meta object for the containment reference list '{@link tDT4250_asssignment1_2.Program#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester</em>'.
	 * @see tDT4250_asssignment1_2.Program#getSemester()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Semester();

	/**
	 * Returns the meta object for class '{@link tDT4250_asssignment1_2.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see tDT4250_asssignment1_2.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tDT4250_asssignment1_2.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tDT4250_asssignment1_2.Specialization#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester</em>'.
	 * @see tDT4250_asssignment1_2.Specialization#getSemester()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Semester();

	/**
	 * Returns the meta object for the reference list '{@link tDT4250_asssignment1_2.Specialization#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialization</em>'.
	 * @see tDT4250_asssignment1_2.Specialization#getSpecialization()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Specialization();

	/**
	 * Returns the meta object for class '{@link tDT4250_asssignment1_2.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see tDT4250_asssignment1_2.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Semester#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see tDT4250_asssignment1_2.Semester#getNumber()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link tDT4250_asssignment1_2.Semester#getSemester_course <em>Semester course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semester course</em>'.
	 * @see tDT4250_asssignment1_2.Semester#getSemester_course()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Semester_course();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Semester#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see tDT4250_asssignment1_2.Semester#getCredits()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Credits();

	/**
	 * Returns the meta object for class '{@link tDT4250_asssignment1_2.Semester_Course <em>Semester Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester Course</em>'.
	 * @see tDT4250_asssignment1_2.Semester_Course
	 * @generated
	 */
	EClass getSemester_Course();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Semester_Course#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see tDT4250_asssignment1_2.Semester_Course#isMandatory()
	 * @see #getSemester_Course()
	 * @generated
	 */
	EAttribute getSemester_Course_Mandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link tDT4250_asssignment1_2.Semester_Course#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see tDT4250_asssignment1_2.Semester_Course#getCourse()
	 * @see #getSemester_Course()
	 * @generated
	 */
	EReference getSemester_Course_Course();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Semester_Course#getFall_or_spring <em>Fall or spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fall or spring</em>'.
	 * @see tDT4250_asssignment1_2.Semester_Course#getFall_or_spring()
	 * @see #getSemester_Course()
	 * @generated
	 */
	EAttribute getSemester_Course_Fall_or_spring();

	/**
	 * Returns the meta object for class '{@link tDT4250_asssignment1_2.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tDT4250_asssignment1_2.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tDT4250_asssignment1_2.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tDT4250_asssignment1_2.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see tDT4250_asssignment1_2.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Course#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see tDT4250_asssignment1_2.Course#getStartDate()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Course#getExamDate <em>Exam Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exam Date</em>'.
	 * @see tDT4250_asssignment1_2.Course#getExamDate()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_ExamDate();

	/**
	 * Returns the meta object for class '{@link tDT4250_asssignment1_2.Program_course <em>Program course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program course</em>'.
	 * @see tDT4250_asssignment1_2.Program_course
	 * @generated
	 */
	EClass getProgram_course();

	/**
	 * Returns the meta object for the containment reference list '{@link tDT4250_asssignment1_2.Program_course#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see tDT4250_asssignment1_2.Program_course#getCourse()
	 * @see #getProgram_course()
	 * @generated
	 */
	EReference getProgram_course_Course();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Program_course#getFall_or_spring <em>Fall or spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fall or spring</em>'.
	 * @see tDT4250_asssignment1_2.Program_course#getFall_or_spring()
	 * @see #getProgram_course()
	 * @generated
	 */
	EAttribute getProgram_course_Fall_or_spring();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Program_course#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see tDT4250_asssignment1_2.Program_course#isMandatory()
	 * @see #getProgram_course()
	 * @generated
	 */
	EAttribute getProgram_course_Mandatory();

	/**
	 * Returns the meta object for class '{@link tDT4250_asssignment1_2.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see tDT4250_asssignment1_2.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link tDT4250_asssignment1_2.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tDT4250_asssignment1_2.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tDT4250_asssignment1_2.Department#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see tDT4250_asssignment1_2.Department#getCourse()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Course();

	/**
	 * Returns the meta object for the containment reference list '{@link tDT4250_asssignment1_2.Department#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Program</em>'.
	 * @see tDT4250_asssignment1_2.Department#getProgram()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Program();

	/**
	 * Returns the meta object for enum '{@link tDT4250_asssignment1_2.Fall_or_spring <em>Fall or spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fall or spring</em>'.
	 * @see tDT4250_asssignment1_2.Fall_or_spring
	 * @generated
	 */
	EEnum getFall_or_spring();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getCalendar();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>course code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>course code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="maxLength='7'"
	 * @generated
	 */
	EDataType getcourse_code();

	/**
	 * Returns the meta object for data type '<em>Semester credits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Semester credits</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="minInclusive='30'"
	 * @generated
	 */
	EDataType getSemester_credits();

	/**
	 * Returns the meta object for data type '<em>Program credits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Program credits</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="minExclusive='30'"
	 * @generated
	 */
	EDataType getProgram_credits();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TDT4250_asssignment1_2Factory getTDT4250_asssignment1_2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tDT4250_asssignment1_2.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.impl.ProgramImpl
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SPECIALIZATION = eINSTANCE.getProgram_Specialization();

		/**
		 * The meta object literal for the '<em><b>Program course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PROGRAM_COURSE = eINSTANCE.getProgram_Program_course();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__CREDITS = eINSTANCE.getProgram_Credits();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SEMESTER = eINSTANCE.getProgram_Semester();

		/**
		 * The meta object literal for the '{@link tDT4250_asssignment1_2.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.impl.SpecializationImpl
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SEMESTER = eINSTANCE.getSpecialization_Semester();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SPECIALIZATION = eINSTANCE.getSpecialization_Specialization();

		/**
		 * The meta object literal for the '{@link tDT4250_asssignment1_2.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.impl.SemesterImpl
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__NUMBER = eINSTANCE.getSemester_Number();

		/**
		 * The meta object literal for the '<em><b>Semester course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__SEMESTER_COURSE = eINSTANCE.getSemester_Semester_course();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__CREDITS = eINSTANCE.getSemester_Credits();

		/**
		 * The meta object literal for the '{@link tDT4250_asssignment1_2.impl.Semester_CourseImpl <em>Semester Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.impl.Semester_CourseImpl
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getSemester_Course()
		 * @generated
		 */
		EClass SEMESTER_COURSE = eINSTANCE.getSemester_Course();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_COURSE__MANDATORY = eINSTANCE.getSemester_Course_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER_COURSE__COURSE = eINSTANCE.getSemester_Course_Course();

		/**
		 * The meta object literal for the '<em><b>Fall or spring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER_COURSE__FALL_OR_SPRING = eINSTANCE.getSemester_Course_Fall_or_spring();

		/**
		 * The meta object literal for the '{@link tDT4250_asssignment1_2.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.impl.CourseImpl
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__START_DATE = eINSTANCE.getCourse_StartDate();

		/**
		 * The meta object literal for the '<em><b>Exam Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__EXAM_DATE = eINSTANCE.getCourse_ExamDate();

		/**
		 * The meta object literal for the '{@link tDT4250_asssignment1_2.impl.Program_courseImpl <em>Program course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.impl.Program_courseImpl
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getProgram_course()
		 * @generated
		 */
		EClass PROGRAM_COURSE = eINSTANCE.getProgram_course();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_COURSE__COURSE = eINSTANCE.getProgram_course_Course();

		/**
		 * The meta object literal for the '<em><b>Fall or spring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_COURSE__FALL_OR_SPRING = eINSTANCE.getProgram_course_Fall_or_spring();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_COURSE__MANDATORY = eINSTANCE.getProgram_course_Mandatory();

		/**
		 * The meta object literal for the '{@link tDT4250_asssignment1_2.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.impl.DepartmentImpl
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSE = eINSTANCE.getDepartment_Course();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAM = eINSTANCE.getDepartment_Program();

		/**
		 * The meta object literal for the '{@link tDT4250_asssignment1_2.Fall_or_spring <em>Fall or spring</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.Fall_or_spring
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getFall_or_spring()
		 * @generated
		 */
		EEnum FALL_OR_SPRING = eINSTANCE.getFall_or_spring();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

		/**
		 * The meta object literal for the '<em>course code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getcourse_code()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getcourse_code();

		/**
		 * The meta object literal for the '<em>Semester credits</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getSemester_credits()
		 * @generated
		 */
		EDataType SEMESTER_CREDITS = eINSTANCE.getSemester_credits();

		/**
		 * The meta object literal for the '<em>Program credits</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tDT4250_asssignment1_2.impl.TDT4250_asssignment1_2PackageImpl#getProgram_credits()
		 * @generated
		 */
		EDataType PROGRAM_CREDITS = eINSTANCE.getProgram_credits();

	}

} //TDT4250_asssignment1_2Package
