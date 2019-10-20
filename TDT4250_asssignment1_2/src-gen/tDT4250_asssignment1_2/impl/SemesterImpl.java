/**
 */
package tDT4250_asssignment1_2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tDT4250_asssignment1_2.Semester;
import tDT4250_asssignment1_2.Semester_Course;
import tDT4250_asssignment1_2.TDT4250_asssignment1_2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.impl.SemesterImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.SemesterImpl#getSemester_course <em>Semester course</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.SemesterImpl#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemester_course() <em>Semester course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester_course()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester_Course> semester_course;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected int credits = CREDITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TDT4250_asssignment1_2Package.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.SEMESTER__NUMBER,
					oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester_Course> getSemester_course() {
		if (semester_course == null) {
			semester_course = new EObjectContainmentEList<Semester_Course>(Semester_Course.class, this,
					TDT4250_asssignment1_2Package.SEMESTER__SEMESTER_COURSE);
		}
		return semester_course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(int newCredits) {
		int oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.SEMESTER__CREDITS,
					oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TDT4250_asssignment1_2Package.SEMESTER__SEMESTER_COURSE:
			return ((InternalEList<?>) getSemester_course()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TDT4250_asssignment1_2Package.SEMESTER__NUMBER:
			return getNumber();
		case TDT4250_asssignment1_2Package.SEMESTER__SEMESTER_COURSE:
			return getSemester_course();
		case TDT4250_asssignment1_2Package.SEMESTER__CREDITS:
			return getCredits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TDT4250_asssignment1_2Package.SEMESTER__NUMBER:
			setNumber((Integer) newValue);
			return;
		case TDT4250_asssignment1_2Package.SEMESTER__SEMESTER_COURSE:
			getSemester_course().clear();
			getSemester_course().addAll((Collection<? extends Semester_Course>) newValue);
			return;
		case TDT4250_asssignment1_2Package.SEMESTER__CREDITS:
			setCredits((Integer) newValue);
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
		case TDT4250_asssignment1_2Package.SEMESTER__NUMBER:
			setNumber(NUMBER_EDEFAULT);
			return;
		case TDT4250_asssignment1_2Package.SEMESTER__SEMESTER_COURSE:
			getSemester_course().clear();
			return;
		case TDT4250_asssignment1_2Package.SEMESTER__CREDITS:
			setCredits(CREDITS_EDEFAULT);
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
		case TDT4250_asssignment1_2Package.SEMESTER__NUMBER:
			return number != NUMBER_EDEFAULT;
		case TDT4250_asssignment1_2Package.SEMESTER__SEMESTER_COURSE:
			return semester_course != null && !semester_course.isEmpty();
		case TDT4250_asssignment1_2Package.SEMESTER__CREDITS:
			return credits != CREDITS_EDEFAULT;
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
		result.append(" (Number: ");
		result.append(number);
		result.append(", Credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
