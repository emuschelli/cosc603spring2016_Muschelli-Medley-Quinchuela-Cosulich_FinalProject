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

/**
 * The class <code>InGameInputHandlerTest</code> contains tests for the class <code>{@link InGameInputHandler}</code>.
 *
 * @generatedBy CodePro at 5/15/16 1:12 AM
 * @author JQ
 * @version $Revision: 1.0 $
 */
public class InGameInputHandlerTest {
	/**
	 * Run the InGameInputHandler(FreeColClient) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/15/16 1:12 AM
	 */
	@Test
	public void testInGameInputHandler_1()
		throws Exception {
		FreeColClient freeColClient = new FreeColClient(new PipedInputStream(), "");

		InGameInputHandler result = new InGameInputHandler(freeColClient);

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
	 * @generatedBy CodePro at 5/15/16 1:12 AM
	 */
	@Test
	public void testHandle_1()
		throws Exception {
		InGameInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
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
	 * @generatedBy CodePro at 5/15/16 1:12 AM
	 */
	@Test
	public void testHandle_2()
		throws Exception {
		InGameInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
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
	 * @generatedBy CodePro at 5/15/16 1:12 AM
	 */
	@Test
	public void testHandle_3()
		throws Exception {
		InGameInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
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
	 * @generatedBy CodePro at 5/15/16 1:12 AM
	 */
	@Test
	public void testHandle_4()
		throws Exception {
		InGameInputHandler fixture = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));
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
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/15/16 1:12 AM
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
	 * @generatedBy CodePro at 5/15/16 1:12 AM
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
	 * @generatedBy CodePro at 5/15/16 1:12 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InGameInputHandlerTest.class);
	}
}