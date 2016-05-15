package net.sf.freecol.client.control;

import java.io.InputStream;
import java.io.PipedInputStream;
import net.sf.freecol.common.networking.MessageHandler;
import java.net.Socket;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.networking.Connection;
import net.sf.freecol.client.FreeColClient;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.networking.NetworkRequestHandler;

/**
 * The class <code>ClientInputHandlerTest</code> contains tests for the class <code>{@link ClientInputHandler}</code>.
 *
 * @generatedBy CodePro at 5/15/16 12:14 AM
 * @author JQ
 * @version $Revision: 1.0 $
 */
public class ClientInputHandlerTest {
	/**
	 * Run the Element disconnect(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 12:14 AM
	 */
	@Test
	public void testDisconnect_1()
		throws Exception {
		ClientInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
		Element element = new IIOMetadataNode();

		Element result = fixture.disconnect(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the Element handle(Connection,Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 12:14 AM
	 */
	@Test
	public void testHandle_1()
		throws Exception {
		ClientInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
		Connection connection = new Connection(new Socket(), new InGameInputHandler(new FreeColClient(new PipedInputStream(), "")), "");
		Element element = null;

		Element result = fixture.handle(connection, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the Element handle(Connection,Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 12:14 AM
	 */
	@Test
	public void testHandle_2()
		throws Exception {
		ClientInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
		Connection connection = new Connection(new Socket(), new InGameInputHandler(new FreeColClient(new PipedInputStream(), "")), "");
		Element element = new IIOMetadataNode();

		Element result = fixture.handle(connection, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the Element handle(Connection,Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 12:14 AM
	 */
	@Test
	public void testHandle_3()
		throws Exception {
		ClientInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
		Connection connection = new Connection(new Socket(), new InGameInputHandler(new FreeColClient(new PipedInputStream(), "")), "");
		Element element = new IIOMetadataNode();

		Element result = fixture.handle(connection, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the Element handle(Connection,Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 12:14 AM
	 */
	@Test
	public void testHandle_4()
		throws Exception {
		ClientInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
		Connection connection = new Connection(new Socket(), new InGameInputHandler(new FreeColClient(new PipedInputStream(), "")), "");
		Element element = new IIOMetadataNode();

		Element result = fixture.handle(connection, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertNotNull(result);
	}

	/**
	 * Run the void register(String,NetworkRequestHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 12:14 AM
	 */
	@Test
	public void testRegister_1()
		throws Exception {
		ClientInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
		String name = "";
		NetworkRequestHandler handler = null;

		fixture.register(name, handler);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
	}

	/**
	 * Run the boolean unregister(String,NetworkRequestHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 12:14 AM
	 */
	@Test
	public void testUnregister_1()
		throws Exception {
		ClientInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
		String name = "";
		NetworkRequestHandler handler = null;

		boolean result = fixture.unregister(name, handler);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertTrue(result);
	}

	/**
	 * Run the boolean unregister(String,NetworkRequestHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 12:14 AM
	 */
	@Test
	public void testUnregister_2()
		throws Exception {
		ClientInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
		String name = "";
		NetworkRequestHandler handler = null;

		boolean result = fixture.unregister(name, handler);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:138)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/16 12:14 AM
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
	 * @generatedBy CodePro at 5/15/16 12:14 AM
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
	 * @generatedBy CodePro at 5/15/16 12:14 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClientInputHandlerTest.class);
	}
}