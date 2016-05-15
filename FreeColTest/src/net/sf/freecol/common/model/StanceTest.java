package net.sf.freecol.common.model;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StanceTest</code> contains tests for the class <code>{@link Stance}</code>.
 *
 * @generatedBy CodePro at 5/14/16 9:18 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class StanceTest {
	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetKey_1()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;

		String result = fixture.getKey();

		// add additional test code here
		assertEquals("stance.alliance", result);
	}

	/**
	 * Run the String getNameKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetNameKey_1()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;

		String result = fixture.getNameKey();

		// add additional test code here
		assertEquals("model.stance.alliance.name", result);
	}

	/**
	 * Run the String getOtherStanceChangeKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetOtherStanceChangeKey_1()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;

		String result = fixture.getOtherStanceChangeKey();

		// add additional test code here
		assertEquals("model.player.stance.alliance.others", result);
	}

	/**
	 * Run the String getStanceChangeKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetStanceChangeKey_1()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;

		String result = fixture.getStanceChangeKey();

		// add additional test code here
		assertEquals("model.player.stance.alliance.declared", result);
	}

	/**
	 * Run the Stance getStanceFromTension(Tension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetStanceFromTension_1()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Tension tension = new Tension();

		Stance result = fixture.getStanceFromTension(tension);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stance.alliance", result.getKey());
		assertEquals("model.stance.alliance.name", result.getNameKey());
		assertEquals("model.player.stance.alliance.declared", result.getStanceChangeKey());
		assertEquals("model.player.stance.alliance.others", result.getOtherStanceChangeKey());
		assertEquals(false, result.isIncitable());
		assertEquals("ALLIANCE", result.name());
		assertEquals("ALLIANCE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Stance getStanceFromTension(Tension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetStanceFromTension_2()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Tension tension = new Tension();

		Stance result = fixture.getStanceFromTension(tension);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stance.alliance", result.getKey());
		assertEquals("model.stance.alliance.name", result.getNameKey());
		assertEquals("model.player.stance.alliance.declared", result.getStanceChangeKey());
		assertEquals("model.player.stance.alliance.others", result.getOtherStanceChangeKey());
		assertEquals(false, result.isIncitable());
		assertEquals("ALLIANCE", result.name());
		assertEquals("ALLIANCE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Stance getStanceFromTension(Tension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetStanceFromTension_3()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Tension tension = new Tension();

		Stance result = fixture.getStanceFromTension(tension);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stance.alliance", result.getKey());
		assertEquals("model.stance.alliance.name", result.getNameKey());
		assertEquals("model.player.stance.alliance.declared", result.getStanceChangeKey());
		assertEquals("model.player.stance.alliance.others", result.getOtherStanceChangeKey());
		assertEquals(false, result.isIncitable());
		assertEquals("ALLIANCE", result.name());
		assertEquals("ALLIANCE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Stance getStanceFromTension(Tension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetStanceFromTension_4()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Tension tension = new Tension();

		Stance result = fixture.getStanceFromTension(tension);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stance.alliance", result.getKey());
		assertEquals("model.stance.alliance.name", result.getNameKey());
		assertEquals("model.player.stance.alliance.declared", result.getStanceChangeKey());
		assertEquals("model.player.stance.alliance.others", result.getOtherStanceChangeKey());
		assertEquals(false, result.isIncitable());
		assertEquals("ALLIANCE", result.name());
		assertEquals("ALLIANCE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Stance getStanceFromTension(Tension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetStanceFromTension_5()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Tension tension = new Tension();

		Stance result = fixture.getStanceFromTension(tension);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stance.alliance", result.getKey());
		assertEquals("model.stance.alliance.name", result.getNameKey());
		assertEquals("model.player.stance.alliance.declared", result.getStanceChangeKey());
		assertEquals("model.player.stance.alliance.others", result.getOtherStanceChangeKey());
		assertEquals(false, result.isIncitable());
		assertEquals("ALLIANCE", result.name());
		assertEquals("ALLIANCE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Stance getStanceFromTension(Tension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetStanceFromTension_6()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Tension tension = new Tension();

		Stance result = fixture.getStanceFromTension(tension);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stance.alliance", result.getKey());
		assertEquals("model.stance.alliance.name", result.getNameKey());
		assertEquals("model.player.stance.alliance.declared", result.getStanceChangeKey());
		assertEquals("model.player.stance.alliance.others", result.getOtherStanceChangeKey());
		assertEquals(false, result.isIncitable());
		assertEquals("ALLIANCE", result.name());
		assertEquals("ALLIANCE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Stance getStanceFromTension(Tension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetStanceFromTension_7()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Tension tension = new Tension();

		Stance result = fixture.getStanceFromTension(tension);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stance.alliance", result.getKey());
		assertEquals("model.stance.alliance.name", result.getNameKey());
		assertEquals("model.player.stance.alliance.declared", result.getStanceChangeKey());
		assertEquals("model.player.stance.alliance.others", result.getOtherStanceChangeKey());
		assertEquals(false, result.isIncitable());
		assertEquals("ALLIANCE", result.name());
		assertEquals("ALLIANCE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Stance getStanceFromTension(Tension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetStanceFromTension_8()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Tension tension = new Tension();

		Stance result = fixture.getStanceFromTension(tension);

		// add additional test code here
		assertNotNull(result);
		assertEquals("stance.alliance", result.getKey());
		assertEquals("model.stance.alliance.name", result.getNameKey());
		assertEquals("model.player.stance.alliance.declared", result.getStanceChangeKey());
		assertEquals("model.player.stance.alliance.others", result.getOtherStanceChangeKey());
		assertEquals(false, result.isIncitable());
		assertEquals("ALLIANCE", result.name());
		assertEquals("ALLIANCE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_1()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_2()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_3()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_4()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_5()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_6()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_7()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_8()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_9()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_10()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_11()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_12()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_13()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_14()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_15()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTensionModifier(Stance) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testGetTensionModifier_16()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;
		Stance newStance = Stance.ALLIANCE;

		int result = fixture.getTensionModifier(newStance);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isIncitable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testIsIncitable_1()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;

		boolean result = fixture.isIncitable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIncitable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testIsIncitable_2()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;

		boolean result = fixture.isIncitable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIncitable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	@Test
	public void testIsIncitable_3()
		throws Exception {
		Stance fixture = Stance.ALLIANCE;

		boolean result = fixture.isIncitable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 9:18 PM
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
	 * @generatedBy CodePro at 5/14/16 9:18 PM
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
	 * @generatedBy CodePro at 5/14/16 9:18 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StanceTest.class);
	}
}