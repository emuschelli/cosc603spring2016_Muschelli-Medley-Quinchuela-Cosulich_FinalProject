package net.sf.freecol.common.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TensionTest</code> contains tests for the class <code>{@link Tension}</code>.
 *
 * @generatedBy CodePro at 5/14/16 9:19 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class TensionTest {
	/**
	 * Run the Tension() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testTension_1()
		throws Exception {

		Tension result = new Tension();

		// add additional test code here
		assertNotNull(result);
		assertEquals("HAPPY", result.toString());
		assertEquals(100, result.getValue());
		assertEquals("tension.happy", result.getKey());
		assertEquals("model.tension.happy.name", result.getNameKey());
	}

	/**
	 * Run the Tension(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testTension_2()
		throws Exception {
		int newTension = 1;

		Tension result = new Tension(newTension);

		// add additional test code here
		assertNotNull(result);
		assertEquals("HAPPY", result.toString());
		assertEquals(1, result.getValue());
		assertEquals("tension.happy", result.getKey());
		assertEquals("model.tension.happy.name", result.getNameKey());
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		Tension fixture = new Tension();

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("tension.happy", result);
	}

	/**
	 * Run the Tension.Level getLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testGetLevel_1()
		throws Exception {
		Tension fixture = new Tension();

		Tension.Level result = fixture.getLevel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("happy", result.getKey());
		assertEquals(100, result.getLimit());
		assertEquals("HAPPY", result.name());
		assertEquals("HAPPY", result.toString());
		assertEquals(0, result.ordinal());
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		Tension fixture = new Tension();

		String result = fixture.getNameKey();

		// add additional test code here
		assertEquals("model.tension.happy.name", result);
	}

	/**
	 * Run the int getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		Tension fixture = new Tension();

		int result = fixture.getValue();

		// add additional test code here
		assertEquals(100, result);
	}

	/**
	 * Run the void modify(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testModify_1()
		throws Exception {
		Tension fixture = new Tension();
		int newTension = 1;

		fixture.modify(newTension);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		Tension fixture = new Tension();
		int newValue = 1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testSetValue_2()
		throws Exception {
		Tension fixture = new Tension();
		int newValue = 1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the void setValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testSetValue_3()
		throws Exception {
		Tension fixture = new Tension();
		int newValue = -1;

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Tension fixture = new Tension();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("HAPPY", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 9:19 PM
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
	 * @generatedBy CodePro at 5/14/16 9:19 PM
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
	 * @generatedBy CodePro at 5/14/16 9:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TensionTest.class);
	}
}