package net.sf.freecol.common.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TileItemTest</code> contains tests for the class <code>{@link TileItem}</code>.
 *
 * @generatedBy CodePro at 5/14/16 9:41 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class TileItemTest {
	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	@Test
	public void testCheckIntegrity_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(), new Tile(new Game(), ""));
		fixture.setTile((Tile) null);
		fixture.initialized = true;
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertEquals(0, result);
	}

	/**
	 * Run the int checkIntegrity(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	@Test
	public void testCheckIntegrity_2()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(), new Tile(new Game(), ""));
		fixture.setTile(new Tile(new Game(), ""));
		fixture.initialized = true;
		boolean fix = true;

		int result = fixture.checkIntegrity(fix);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertEquals(0, result);
	}

	/**
	 * Run the Location getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(), new Tile(new Game(), ""));
		fixture.setTile(new Tile(new Game(), ""));
		fixture.initialized = true;

		Location result = fixture.getLocation();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the int getSpaceTaken() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	@Test
	public void testGetSpaceTaken_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(), new Tile(new Game(), ""));
		fixture.setTile(new Tile(new Game(), ""));
		fixture.initialized = true;

		int result = fixture.getSpaceTaken();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertEquals(0, result);
	}

	/**
	 * Run the Tile getTile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	@Test
	public void testGetTile_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(), new Tile(new Game(), ""));
		fixture.setTile(new Tile(new Game(), ""));
		fixture.initialized = true;

		Tile result = fixture.getTile();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isInEurope() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	@Test
	public void testIsInEurope_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(), new Tile(new Game(), ""));
		fixture.setTile(new Tile(new Game(), ""));
		fixture.initialized = true;

		boolean result = fixture.isInEurope();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertTrue(result);
	}

	/**
	 * Run the boolean setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(), new Tile(new Game(), ""));
		fixture.setTile(new Tile(new Game(), ""));
		fixture.initialized = true;
		Location newLocation = null;

		boolean result = fixture.setLocation(newLocation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertTrue(result);
	}

	/**
	 * Run the boolean setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	@Test
	public void testSetLocation_2()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(), new Tile(new Game(), ""));
		fixture.setTile(new Tile(new Game(), ""));
		fixture.initialized = true;
		Location newLocation = new Tile(new Game(), "");

		boolean result = fixture.setLocation(newLocation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertTrue(result);
	}

	/**
	 * Run the boolean setLocation(Location) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetLocation_3()
		throws Exception {
		LostCityRumour fixture = new LostCityRumour(new Game(), new Tile(new Game(), ""));
		fixture.setTile(new Tile(new Game(), ""));
		fixture.initialized = true;
		Location newLocation = new HighSeas(new Game());

		boolean result = fixture.setLocation(newLocation);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 9:41 PM
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
	 * @generatedBy CodePro at 5/14/16 9:41 PM
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
	 * @generatedBy CodePro at 5/14/16 9:41 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TileItemTest.class);
	}
}