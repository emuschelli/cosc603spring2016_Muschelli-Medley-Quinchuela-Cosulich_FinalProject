package net.sf.freecol.common;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ServerInfoTest</code> contains tests for the class <code>{@link ServerInfo}</code>.
 *
 * @generatedBy CodePro at 5/14/16 8:41 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class ServerInfoTest {
	/**
	 * Run the ServerInfo() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testServerInfo_1()
		throws Exception {

		ServerInfo result = new ServerInfo();

		// add additional test code here
		assertNotNull(result);
		assertEquals("null(null:0) 0, 0, false, null, 0", result.toString());
		assertEquals(null, result.getAddress());
		assertEquals(null, result.getName());
		assertEquals(0, result.getPort());
		assertEquals(null, result.getVersion());
		assertEquals(0, result.getGameState());
		assertEquals(false, result.getIsGameStarted());
		assertEquals(0, result.getSlotsAvailable());
		assertEquals(0, result.getCurrentlyPlaying());
	}

	/**
	 * Run the String getAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetAddress_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);

		String result = fixture.getAddress();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getCurrentlyPlaying() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetCurrentlyPlaying_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);

		int result = fixture.getCurrentlyPlaying();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getGameState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetGameState_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);

		int result = fixture.getGameState();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean getIsGameStarted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetIsGameStarted_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);

		boolean result = fixture.getIsGameStarted();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean getIsGameStarted() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetIsGameStarted_2()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, false, "", 1);

		boolean result = fixture.getIsGameStarted();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the int getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);

		int result = fixture.getPort();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSlotsAvailable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetSlotsAvailable_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);

		int result = fixture.getSlotsAvailable();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = ServerInfo.getTagName();

		// add additional test code here
		assertEquals("serverInfo", result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);

		String result = fixture.getVersion();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("(:1) 1, 1, true, , 1", result);
	}

	/**
	 * Run the void update(String,String,int,int,int,boolean,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		ServerInfo fixture = new ServerInfo();
		fixture.update("", "", 1, 1, 1, true, "", 1);
		String name = "";
		String address = "";
		int port = 1;
		int slotsAvailable = 1;
		int currentlyPlaying = 1;
		boolean isGameStarted = true;
		String version = "";
		int gameState = 1;

		fixture.update(name, address, port, slotsAvailable, currentlyPlaying, isGameStarted, version, gameState);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 8:41 PM
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
	 * @generatedBy CodePro at 5/14/16 8:41 PM
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
	 * @generatedBy CodePro at 5/14/16 8:41 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServerInfoTest.class);
	}
}