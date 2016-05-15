package net.sf.freecol.client.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.junit.*;
import net.sf.freecol.tools.FlagTest;
import static org.junit.Assert.*;

/**
 * The class <code>TerrainCursorTest</code> contains tests for the class <code>{@link TerrainCursor}</code>.
 *
 * @generatedBy CodePro at 5/14/16 8:20 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class TerrainCursorTest {
	/**
	 * Run the TerrainCursor() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testTerrainCursor_1()
		throws Exception {

		TerrainCursor result = new TerrainCursor();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isActive());
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);
		ActionEvent ae = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(ae);

		// add additional test code here
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testActionPerformed_2()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);
		ActionEvent ae = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(ae);

		// add additional test code here
	}

	/**
	 * Run the void addActionListener(ActionListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testAddActionListener_1()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);
		ActionListener listener = new FlagTest();

		fixture.addActionListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void fireActionEvent(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testFireActionEvent_1()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);
		ActionEvent ae = new ActionEvent(new Object(), 1, "");

		fixture.fireActionEvent(ae);

		// add additional test code here
	}

	/**
	 * Run the void fireActionEvent(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testFireActionEvent_2()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);
		ActionEvent ae = new ActionEvent(new Object(), 1, "");

		fixture.fireActionEvent(ae);

		// add additional test code here
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testIsActive_1()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testIsActive_2()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(false);

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void removeActionListener(ActionListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testRemoveActionListener_1()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);
		ActionListener listener = new FlagTest();

		fixture.removeActionListener(listener);

		// add additional test code here
	}

	/**
	 * Run the void setActive(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testSetActive_1()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);
		boolean newState = true;

		fixture.setActive(newState);

		// add additional test code here
	}

	/**
	 * Run the void startBlinking() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testStartBlinking_1()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);

		fixture.startBlinking();

		// add additional test code here
	}

	/**
	 * Run the void startBlinking() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testStartBlinking_2()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);

		fixture.startBlinking();

		// add additional test code here
	}

	/**
	 * Run the void stopBlinking() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testStopBlinking_1()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);

		fixture.stopBlinking();

		// add additional test code here
	}

	/**
	 * Run the void stopBlinking() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	@Test
	public void testStopBlinking_2()
		throws Exception {
		TerrainCursor fixture = new TerrainCursor();
		fixture.setActive(true);

		fixture.stopBlinking();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 8:20 PM
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
	 * @generatedBy CodePro at 5/14/16 8:20 PM
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
	 * @generatedBy CodePro at 5/14/16 8:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TerrainCursorTest.class);
	}
}