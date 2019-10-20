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
import tDT4250_asssignment1_2.Program;
import tDT4250_asssignment1_2.Program_course;
import tDT4250_asssignment1_2.Semester;
import tDT4250_asssignment1_2.Specialization;
import tDT4250_asssignment1_2.TDT4250_asssignment1_2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.ProgramImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.ProgramImpl#getProgram_course <em>Program course</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.ProgramImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.ProgramImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
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
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specialization;

	/**
	 * The cached value of the '{@link #getProgram_course() <em>Program course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram_course()
	 * @generated
	 * @ordered
	 */
	protected EList<Program_course> program_course;

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
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TDT4250_asssignment1_2Package.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.PROGRAM__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecialization() {
		if (specialization == null) {
			specialization = new EObjectContainmentEList<Specialization>(Specialization.class, this,
					TDT4250_asssignment1_2Package.PROGRAM__SPECIALIZATION);
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program_course> getProgram_course() {
		if (program_course == null) {
			program_course = new EObjectContainmentEList<Program_course>(Program_course.class, this,
					TDT4250_asssignment1_2Package.PROGRAM__PROGRAM_COURSE);
		}
		return program_course;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.PROGRAM__CREDITS,
					oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemester() {
		if (semester == null) {
			semester = new EObjectContainmentEList<Semester>(Semester.class, this,
					TDT4250_asssignment1_2Package.PROGRAM__SEMESTER);
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TDT4250_asssignment1_2Package.PROGRAM__SPECIALIZATION:
			return ((InternalEList<?>) getSpecialization()).basicRemove(otherEnd, msgs);
		case TDT4250_asssignment1_2Package.PROGRAM__PROGRAM_COURSE:
			return ((InternalEList<?>) getProgram_course()).basicRemove(otherEnd, msgs);
		case TDT4250_asssignment1_2Package.PROGRAM__SEMESTER:
			return ((InternalEList<?>) getSemester()).basicRemove(otherEnd, msgs);
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
		case TDT4250_asssignment1_2Package.PROGRAM__NAME:
			return getName();
		case TDT4250_asssignment1_2Package.PROGRAM__SPECIALIZATION:
			return getSpecialization();
		case TDT4250_asssignment1_2Package.PROGRAM__PROGRAM_COURSE:
			return getProgram_course();
		case TDT4250_asssignment1_2Package.PROGRAM__CREDITS:
			return getCredits();
		case TDT4250_asssignment1_2Package.PROGRAM__SEMESTER:
			return getSemester();
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
		case TDT4250_asssignment1_2Package.PROGRAM__NAME:
			setName((String) newValue);
			return;
		case TDT4250_asssignment1_2Package.PROGRAM__SPECIALIZATION:
			getSpecialization().clear();
			getSpecialization().addAll((Collection<? extends Specialization>) newValue);
			return;
		case TDT4250_asssignment1_2Package.PROGRAM__PROGRAM_COURSE:
			getProgram_course().clear();
			getProgram_course().addAll((Collection<? extends Program_course>) newValue);
			return;
		case TDT4250_asssignment1_2Package.PROGRAM__CREDITS:
			setCredits((Integer) newValue);
			return;
		case TDT4250_asssignment1_2Package.PROGRAM__SEMESTER:
			getSemester().clear();
			getSemester().addAll((Collection<? extends Semester>) newValue);
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
		case TDT4250_asssignment1_2Package.PROGRAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TDT4250_asssignment1_2Package.PROGRAM__SPECIALIZATION:
			getSpecialization().clear();
			return;
		case TDT4250_asssignment1_2Package.PROGRAM__PROGRAM_COURSE:
			getProgram_course().clear();
			return;
		case TDT4250_asssignment1_2Package.PROGRAM__CREDITS:
			setCredits(CREDITS_EDEFAULT);
			return;
		case TDT4250_asssignment1_2Package.PROGRAM__SEMESTER:
			getSemester().clear();
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
		case TDT4250_asssignment1_2Package.PROGRAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TDT4250_asssignment1_2Package.PROGRAM__SPECIALIZATION:
			return specialization != null && !specialization.isEmpty();
		case TDT4250_asssignment1_2Package.PROGRAM__PROGRAM_COURSE:
			return program_course != null && !program_course.isEmpty();
		case TDT4250_asssignment1_2Package.PROGRAM__CREDITS:
			return credits != CREDITS_EDEFAULT;
		case TDT4250_asssignment1_2Package.PROGRAM__SEMESTER:
			return semester != null && !semester.isEmpty();
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
		result.append(", Credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
