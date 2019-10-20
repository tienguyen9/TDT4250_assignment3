/**
 */
package tDT4250_asssignment1_2.impl;

import java.util.Calendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tDT4250_asssignment1_2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TDT4250_asssignment1_2FactoryImpl extends EFactoryImpl implements TDT4250_asssignment1_2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TDT4250_asssignment1_2Factory init() {
		try {
			TDT4250_asssignment1_2Factory theTDT4250_asssignment1_2Factory = (TDT4250_asssignment1_2Factory) EPackage.Registry.INSTANCE
					.getEFactory(TDT4250_asssignment1_2Package.eNS_URI);
			if (theTDT4250_asssignment1_2Factory != null) {
				return theTDT4250_asssignment1_2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TDT4250_asssignment1_2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDT4250_asssignment1_2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TDT4250_asssignment1_2Package.PROGRAM:
			return createProgram();
		case TDT4250_asssignment1_2Package.SPECIALIZATION:
			return createSpecialization();
		case TDT4250_asssignment1_2Package.SEMESTER:
			return createSemester();
		case TDT4250_asssignment1_2Package.SEMESTER_COURSE:
			return createSemester_Course();
		case TDT4250_asssignment1_2Package.COURSE:
			return createCourse();
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE:
			return createProgram_course();
		case TDT4250_asssignment1_2Package.DEPARTMENT:
			return createDepartment();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TDT4250_asssignment1_2Package.FALL_OR_SPRING:
			return createFall_or_springFromString(eDataType, initialValue);
		case TDT4250_asssignment1_2Package.CALENDAR:
			return createCalendarFromString(eDataType, initialValue);
		case TDT4250_asssignment1_2Package.COURSE_CODE:
			return createcourse_codeFromString(eDataType, initialValue);
		case TDT4250_asssignment1_2Package.SEMESTER_CREDITS:
			return createSemester_creditsFromString(eDataType, initialValue);
		case TDT4250_asssignment1_2Package.PROGRAM_CREDITS:
			return createProgram_creditsFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TDT4250_asssignment1_2Package.FALL_OR_SPRING:
			return convertFall_or_springToString(eDataType, instanceValue);
		case TDT4250_asssignment1_2Package.CALENDAR:
			return convertCalendarToString(eDataType, instanceValue);
		case TDT4250_asssignment1_2Package.COURSE_CODE:
			return convertcourse_codeToString(eDataType, instanceValue);
		case TDT4250_asssignment1_2Package.SEMESTER_CREDITS:
			return convertSemester_creditsToString(eDataType, instanceValue);
		case TDT4250_asssignment1_2Package.PROGRAM_CREDITS:
			return convertProgram_creditsToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester_Course createSemester_Course() {
		Semester_CourseImpl semester_Course = new Semester_CourseImpl();
		return semester_Course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program_course createProgram_course() {
		Program_courseImpl program_course = new Program_courseImpl();
		return program_course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fall_or_spring createFall_or_springFromString(EDataType eDataType, String initialValue) {
		Fall_or_spring result = Fall_or_spring.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFall_or_springToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendarFromString(EDataType eDataType, String initialValue) {
		return (Calendar) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createcourse_codeFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertcourse_codeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSemester_creditsFromString(EDataType eDataType, String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemester_creditsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createProgram_creditsFromString(EDataType eDataType, String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgram_creditsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDT4250_asssignment1_2Package getTDT4250_asssignment1_2Package() {
		return (TDT4250_asssignment1_2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TDT4250_asssignment1_2Package getPackage() {
		return TDT4250_asssignment1_2Package.eINSTANCE;
	}

} //TDT4250_asssignment1_2FactoryImpl
