/**
 */
package tDT4250_asssignment1_2.impl;

import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tDT4250_asssignment1_2.Course;
import tDT4250_asssignment1_2.TDT4250_asssignment1_2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.CourseImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.CourseImpl#getExamDate <em>Exam Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDITS_EDEFAULT = 7.5;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected double credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Calendar startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExamDate() <em>Exam Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamDate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar EXAM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExamDate() <em>Exam Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamDate()
	 * @generated
	 * @ordered
	 */
	protected Calendar examDate = EXAM_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TDT4250_asssignment1_2Package.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.COURSE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.COURSE__CODE, oldCode,
					code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(double newCredits) {
		double oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.COURSE__CREDITS,
					oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Calendar newStartDate) {
		Calendar oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.COURSE__START_DATE,
					oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getExamDate() {
		return examDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamDate(Calendar newExamDate) {
		Calendar oldExamDate = examDate;
		examDate = newExamDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.COURSE__EXAM_DATE,
					oldExamDate, examDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TDT4250_asssignment1_2Package.COURSE__NAME:
			return getName();
		case TDT4250_asssignment1_2Package.COURSE__CODE:
			return getCode();
		case TDT4250_asssignment1_2Package.COURSE__CREDITS:
			return getCredits();
		case TDT4250_asssignment1_2Package.COURSE__START_DATE:
			return getStartDate();
		case TDT4250_asssignment1_2Package.COURSE__EXAM_DATE:
			return getExamDate();
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
		case TDT4250_asssignment1_2Package.COURSE__NAME:
			setName((String) newValue);
			return;
		case TDT4250_asssignment1_2Package.COURSE__CODE:
			setCode((String) newValue);
			return;
		case TDT4250_asssignment1_2Package.COURSE__CREDITS:
			setCredits((Double) newValue);
			return;
		case TDT4250_asssignment1_2Package.COURSE__START_DATE:
			setStartDate((Calendar) newValue);
			return;
		case TDT4250_asssignment1_2Package.COURSE__EXAM_DATE:
			setExamDate((Calendar) newValue);
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
		case TDT4250_asssignment1_2Package.COURSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TDT4250_asssignment1_2Package.COURSE__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case TDT4250_asssignment1_2Package.COURSE__CREDITS:
			setCredits(CREDITS_EDEFAULT);
			return;
		case TDT4250_asssignment1_2Package.COURSE__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case TDT4250_asssignment1_2Package.COURSE__EXAM_DATE:
			setExamDate(EXAM_DATE_EDEFAULT);
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
		case TDT4250_asssignment1_2Package.COURSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TDT4250_asssignment1_2Package.COURSE__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case TDT4250_asssignment1_2Package.COURSE__CREDITS:
			return credits != CREDITS_EDEFAULT;
		case TDT4250_asssignment1_2Package.COURSE__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case TDT4250_asssignment1_2Package.COURSE__EXAM_DATE:
			return EXAM_DATE_EDEFAULT == null ? examDate != null : !EXAM_DATE_EDEFAULT.equals(examDate);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Code: ");
		result.append(code);
		result.append(", Credits: ");
		result.append(credits);
		result.append(", StartDate: ");
		result.append(startDate);
		result.append(", ExamDate: ");
		result.append(examDate);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
