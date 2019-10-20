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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tDT4250_asssignment1_2.Semester;
import tDT4250_asssignment1_2.Specialization;
import tDT4250_asssignment1_2.TDT4250_asssignment1_2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tDT4250_asssignment1_2.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.SpecializationImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link tDT4250_asssignment1_2.impl.SpecializationImpl#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
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
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semester;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specialization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TDT4250_asssignment1_2Package.Literals.SPECIALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TDT4250_asssignment1_2Package.SPECIALIZATION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemester() {
		if (semester == null) {
			semester = new EObjectContainmentEList<Semester>(Semester.class, this,
					TDT4250_asssignment1_2Package.SPECIALIZATION__SEMESTER);
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecialization() {
		if (specialization == null) {
			specialization = new EObjectResolvingEList<Specialization>(Specialization.class, this,
					TDT4250_asssignment1_2Package.SPECIALIZATION__SPECIALIZATION);
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TDT4250_asssignment1_2Package.SPECIALIZATION__SEMESTER:
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
		case TDT4250_asssignment1_2Package.SPECIALIZATION__NAME:
			return getName();
		case TDT4250_asssignment1_2Package.SPECIALIZATION__SEMESTER:
			return getSemester();
		case TDT4250_asssignment1_2Package.SPECIALIZATION__SPECIALIZATION:
			return getSpecialization();
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
		case TDT4250_asssignment1_2Package.SPECIALIZATION__NAME:
			setName((String) newValue);
			return;
		case TDT4250_asssignment1_2Package.SPECIALIZATION__SEMESTER:
			getSemester().clear();
			getSemester().addAll((Collection<? extends Semester>) newValue);
			return;
		case TDT4250_asssignment1_2Package.SPECIALIZATION__SPECIALIZATION:
			getSpecialization().clear();
			getSpecialization().addAll((Collection<? extends Specialization>) newValue);
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
		case TDT4250_asssignment1_2Package.SPECIALIZATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TDT4250_asssignment1_2Package.SPECIALIZATION__SEMESTER:
			getSemester().clear();
			return;
		case TDT4250_asssignment1_2Package.SPECIALIZATION__SPECIALIZATION:
			getSpecialization().clear();
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
		case TDT4250_asssignment1_2Package.SPECIALIZATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TDT4250_asssignment1_2Package.SPECIALIZATION__SEMESTER:
			return semester != null && !semester.isEmpty();
		case TDT4250_asssignment1_2Package.SPECIALIZATION__SPECIALIZATION:
			return specialization != null && !specialization.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
