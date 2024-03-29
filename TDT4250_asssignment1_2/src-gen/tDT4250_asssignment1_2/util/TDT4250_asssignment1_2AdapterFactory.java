/**
 */
package tDT4250_asssignment1_2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tDT4250_asssignment1_2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tDT4250_asssignment1_2.TDT4250_asssignment1_2Package
 * @generated
 */
public class TDT4250_asssignment1_2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TDT4250_asssignment1_2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDT4250_asssignment1_2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TDT4250_asssignment1_2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDT4250_asssignment1_2Switch<Adapter> modelSwitch = new TDT4250_asssignment1_2Switch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseSpecialization(Specialization object) {
			return createSpecializationAdapter();
		}

		@Override
		public Adapter caseSemester(Semester object) {
			return createSemesterAdapter();
		}

		@Override
		public Adapter caseSemester_Course(Semester_Course object) {
			return createSemester_CourseAdapter();
		}

		@Override
		public Adapter caseCourse(Course object) {
			return createCourseAdapter();
		}

		@Override
		public Adapter caseProgram_course(Program_course object) {
			return createProgram_courseAdapter();
		}

		@Override
		public Adapter caseDepartment(Department object) {
			return createDepartmentAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link tDT4250_asssignment1_2.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tDT4250_asssignment1_2.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tDT4250_asssignment1_2.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tDT4250_asssignment1_2.Specialization
	 * @generated
	 */
	public Adapter createSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tDT4250_asssignment1_2.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tDT4250_asssignment1_2.Semester
	 * @generated
	 */
	public Adapter createSemesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tDT4250_asssignment1_2.Semester_Course <em>Semester Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tDT4250_asssignment1_2.Semester_Course
	 * @generated
	 */
	public Adapter createSemester_CourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tDT4250_asssignment1_2.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tDT4250_asssignment1_2.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tDT4250_asssignment1_2.Program_course <em>Program course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tDT4250_asssignment1_2.Program_course
	 * @generated
	 */
	public Adapter createProgram_courseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tDT4250_asssignment1_2.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tDT4250_asssignment1_2.Department
	 * @generated
	 */
	public Adapter createDepartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TDT4250_asssignment1_2AdapterFactory
