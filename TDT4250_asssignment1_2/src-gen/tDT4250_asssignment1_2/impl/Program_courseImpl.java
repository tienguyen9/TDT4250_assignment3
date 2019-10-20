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

import tDT4250_asssignment1_2.Course;
import tDT4250_asssignment1_2.Fall_or_spring;
import tDT4250_asssignment1_2.Program_course;
import tDT4250_asssignment1_2.TDT4250_asssignment1_2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.impl.Program_courseImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.Program_courseImpl#getFall_or_spring <em>Fall or spring</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.Program_courseImpl#isMandatory <em>Mandatory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Program_courseImpl extends MinimalEObjectImpl.Container implements Program_course {
	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> course;

	/**
	 * The default value of the '{@link #getFall_or_spring() <em>Fall or spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFall_or_spring()
	 * @generated
	 * @ordered
	 */
	protected static final Fall_or_spring FALL_OR_SPRING_EDEFAULT = Fall_or_spring.FALL;

	/**
	 * The cached value of the '{@link #getFall_or_spring() <em>Fall or spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFall_or_spring()
	 * @generated
	 * @ordered
	 */
	protected Fall_or_spring fall_or_spring = FALL_OR_SPRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Program_courseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TDT4250_asssignment1_2Package.Literals.PROGRAM_COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourse() {
		if (course == null) {
			course = new EObjectContainmentEList<Course>(Course.class, this,
					TDT4250_asssignment1_2Package.PROGRAM_COURSE__COURSE);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fall_or_spring getFall_or_spring() {
		return fall_or_spring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFall_or_spring(Fall_or_spring newFall_or_spring) {
		Fall_or_spring oldFall_or_spring = fall_or_spring;
		fall_or_spring = newFall_or_spring == null ? FALL_OR_SPRING_EDEFAULT : newFall_or_spring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TDT4250_asssignment1_2Package.PROGRAM_COURSE__FALL_OR_SPRING, oldFall_or_spring, fall_or_spring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TDT4250_asssignment1_2Package.PROGRAM_COURSE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__COURSE:
			return ((InternalEList<?>) getCourse()).basicRemove(otherEnd, msgs);
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
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__COURSE:
			return getCourse();
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__FALL_OR_SPRING:
			return getFall_or_spring();
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__MANDATORY:
			return isMandatory();
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
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__COURSE:
			getCourse().clear();
			getCourse().addAll((Collection<? extends Course>) newValue);
			return;
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__FALL_OR_SPRING:
			setFall_or_spring((Fall_or_spring) newValue);
			return;
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__MANDATORY:
			setMandatory((Boolean) newValue);
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
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__COURSE:
			getCourse().clear();
			return;
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__FALL_OR_SPRING:
			setFall_or_spring(FALL_OR_SPRING_EDEFAULT);
			return;
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__MANDATORY:
			setMandatory(MANDATORY_EDEFAULT);
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
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__COURSE:
			return course != null && !course.isEmpty();
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__FALL_OR_SPRING:
			return fall_or_spring != FALL_OR_SPRING_EDEFAULT;
		case TDT4250_asssignment1_2Package.PROGRAM_COURSE__MANDATORY:
			return mandatory != MANDATORY_EDEFAULT;
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
		result.append(" (Fall_or_spring: ");
		result.append(fall_or_spring);
		result.append(", Mandatory: ");
		result.append(mandatory);
		result.append(')');
		return result.toString();
	}

} //Program_courseImpl
