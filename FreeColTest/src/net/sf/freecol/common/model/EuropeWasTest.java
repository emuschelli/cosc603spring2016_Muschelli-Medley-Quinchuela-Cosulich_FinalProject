package net.sf.freecol.common.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EuropeWasTest</code> contains tests for the class <code>{@link EuropeWas}</code>.
 *
 * @generatedBy CodePro at 5/14/16 9:45 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class EuropeWasTest {
	/**
	 * Run the EuropeWas(Europe) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Test
	public void testEuropeWas_1()
		throws Exception {
		Europe europe = new Europe(new Game(), "");

		EuropeWas result = new EuropeWas(europe);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the boolean fireChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Test
	public void testFireChanges_1()
		throws Exception {
		EuropeWas fixture = new EuropeWas(new Europe(new Game(), ""));

		boolean result = fixture.fireChanges();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
		assertTrue(result);
	}

	/**
	 * Run the boolean fireChanges() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Test
	public void testFireChanges_2()
		throws Exception {
		EuropeWas fixture = new EuropeWas(new Europe(new Game(), ""));

		boolean result = fixture.fireChanges();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
		assertTrue(result);
	}

	/**
	 * Run the Unit getNewUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Test
	public void testGetNewUnit_1()
		throws Exception {
		EuropeWas fixture = new EuropeWas(new Europe(new Game(), ""));

		Unit result = fixture.getNewUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getNewUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Test
	public void testGetNewUnit_2()
		throws Exception {
		EuropeWas fixture = new EuropeWas(new Europe(new Game(), ""));

		Unit result = fixture.getNewUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getNewUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Test
	public void testGetNewUnit_3()
		throws Exception {
		EuropeWas fixture = new EuropeWas(new Europe(new Game(), ""));

		Unit result = fixture.getNewUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getNewUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Test
	public void testGetNewUnit_4()
		throws Exception {
		EuropeWas fixture = new EuropeWas(new Europe(new Game(), ""));

		Unit result = fixture.getNewUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getNewUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Test
	public void testGetNewUnit_5()
		throws Exception {
		EuropeWas fixture = new EuropeWas(new Europe(new Game(), ""));

		Unit result = fixture.getNewUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the Unit getNewUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Test
	public void testGetNewUnit_6()
		throws Exception {
		EuropeWas fixture = new EuropeWas(new Europe(new Game(), ""));

		Unit result = fixture.getNewUnit();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Europe.<init>(Europe.java:179)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/14/16 9:45 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EuropeWasTest.class);
	}
}