/**
 */
package TSHS_Ecore.tests;

import TSHS_Ecore.EventGuard;
import TSHS_Ecore.TSHS_EcoreFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Guard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventGuardTest extends GuardTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventGuardTest.class);
	}

	/**
	 * Constructs a new Event Guard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventGuardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Guard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventGuard getFixture() {
		return (EventGuard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TSHS_EcoreFactory.eINSTANCE.createEventGuard());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EventGuardTest
