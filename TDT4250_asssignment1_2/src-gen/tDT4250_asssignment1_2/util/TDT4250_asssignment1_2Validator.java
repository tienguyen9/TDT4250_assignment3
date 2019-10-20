/**
 */
package tDT4250_asssignment1_2.util;

import java.util.Calendar;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tDT4250_asssignment1_2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package
 * @generated
 */
public class TDT4250_asssignment1_2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TDT4250_asssignment1_2Validator INSTANCE = new TDT4250_asssignment1_2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tDT4250_asssignment1_2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDT4250_asssignment1_2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TDT4250_asssignment1_2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TDT4250_asssignment1_2Package.PROGRAM:
			return validateProgram((Program) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.SPECIALIZATION:
			return validateSpecialization((Specialization) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.SEMESTER:
			return validateSemester((Semester) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.SEMESTER_COURSE:
			return validateSemester_Course((Semester_Course) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE:
			return validateProgram_course((Program_course) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.DEPARTMENT:
			return validateDepartment((Department) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.FALL_OR_SPRING:
			return validateFall_or_spring((Fall_or_spring) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.CALENDAR:
			return validateCalendar((Calendar) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.COURSE_CODE:
			return validatecourse_code((String) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.SEMESTER_CREDITS:
			return validateSemester_credits((Integer) value, diagnostics, context);
		case TDT4250_asssignment1_2Package.PROGRAM_CREDITS:
			return validateProgram_credits((Integer) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram(Program program, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(program, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(program, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(program, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(program, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(program, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(program, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(program, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(program, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(program, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProgram_nameCharacters(program, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameCharacters constraint of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_nameCharacters(Program program, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "nameCharacters", getObjectLabel(program, context) },
								new Object[] { program }, context));
			}
			return false;
		}
		return true;
	}

	public boolean isCharAndInt(String name) {
		return name.matches("[a-zA-Z0-9]+");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_Course(Semester_Course semester_Course, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester_Course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_course(Program_course program_course, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(program_course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFall_or_spring(Fall_or_spring fall_or_spring, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalendar(Calendar calendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecourse_code(String course_code, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatecourse_code_MaxLength(course_code, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>course code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecourse_code_MaxLength(String course_code, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		int length = course_code.length();
		boolean result = length <= 7;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(TDT4250_asssignment1_2Package.Literals.COURSE_CODE, course_code, length, 7,
					diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_credits(int semester_credits, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateSemester_credits_Min(semester_credits, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSemester_credits_Min
	 */
	public static final int SEMESTER_CREDITS__MIN__VALUE = 30;

	/**
	 * Validates the Min constraint of '<em>Semester credits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_credits_Min(int semester_credits, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = semester_credits >= SEMESTER_CREDITS__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(TDT4250_asssignment1_2Package.Literals.SEMESTER_CREDITS, semester_credits,
					SEMESTER_CREDITS__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_credits(int program_credits, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateProgram_credits_Min(program_credits, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateProgram_credits_Min
	 */
	public static final int PROGRAM_CREDITS__MIN__VALUE = 30;

	/**
	 * Validates the Min constraint of '<em>Program credits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgram_credits_Min(int program_credits, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = program_credits > PROGRAM_CREDITS__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(TDT4250_asssignment1_2Package.Literals.PROGRAM_CREDITS, program_credits,
					PROGRAM_CREDITS__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TDT4250_asssignment1_2Validator
