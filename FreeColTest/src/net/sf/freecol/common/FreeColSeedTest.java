package net.sf.freecol.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FreeColSeedTest</code> contains tests for the class <code>{@link FreeColSeed}</code>.
 *
 * @generatedBy CodePro at 5/14/16 8:40 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class FreeColSeedTest {
	/**
	 * Run the FreeColSeed() constructor test.
	 *
	 * @generatedBy CodePro at 5/14/16 8:40 PM
	 */
	@Test
	public void testFreeColSeed_1()
		throws Exception {
		FreeColSeed result = new FreeColSeed();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the long getFreeColSeed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:40 PM
	 */
	@Test
	public void testGetFreeColSeed_1()
		throws Exception {
		boolean generate = true;

		long result = FreeColSeed.getFreeColSeed(generate);

		// add additional test code here
		assertEquals(6427481308715629959L, result);
	}

	/**
	 * Run the long getFreeColSeed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:40 PM
	 */
	@Test
	public void testGetFreeColSeed_2()
		throws Exception {
		boolean generate = false;

		long result = FreeColSeed.getFreeColSeed(generate);

		// add additional test code here
		assertEquals(6427481308715629959L, result);
	}

	/**
	 * Run the void incrementFreeColSeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:40 PM
	 */
	@Test
	public void testIncrementFreeColSeed_1()
		throws Exception {

		FreeColSeed.incrementFreeColSeed();

		// add additional test code here
	}

	/**
	 * Run the void setFreeColSeed(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:40 PM
	 */
	@Test
	public void testSetFreeColSeed_1()
		throws Exception {
		String arg = "";

		FreeColSeed.setFreeColSeed(arg);

		// add additional test code here
	}

	/**
	 * Run the void setFreeColSeed(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:40 PM
	 */
	@Test
	public void testSetFreeColSeed_2()
		throws Exception {
		String arg = "";

		FreeColSeed.setFreeColSeed(arg);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 8:40 PM
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
	 * @generatedBy CodePro at 5/14/16 8:40 PM
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
	 * @generatedBy CodePro at 5/14/16 8:40 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColSeedTest.class);
	}
}