package net.sf.freecol.client;

import java.awt.Dimension;
import java.io.File;
import java.io.InputStream;
import net.sf.freecol.client.gui.action.ActionManager;
import net.sf.freecol.common.model.Specification;
import java.io.PipedInputStream;
import java.util.List;
import net.sf.freecol.client.control.ConnectController;
import net.sf.freecol.client.control.InGameController;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.client.gui.GUI;
import net.sf.freecol.client.control.MapEditorController;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.client.networking.UserServerAPI;
import net.sf.freecol.server.FreeColServer;
import org.junit.*;
import net.sf.freecol.client.control.PreGameController;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.client.control.SoundController;
import net.sf.freecol.common.networking.MessageHandler;
import net.sf.freecol.client.control.PreGameInputHandler;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.client.control.InGameInputHandler;
import net.sf.freecol.common.model.Player;

/**
 * The class <code>FreeColClientTest</code> contains tests for the class <code>{@link FreeColClient}</code>.
 *
 * @generatedBy CodePro at 5/13/16 4:40 PM
 * @author JQ
 * @version $Revision: 1.0 $
 */
public class FreeColClientTest {
	/**
	 * Run the FreeColClient(InputStream,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	
	@Test
	public void testFreeColClient_1()
		throws Exception {
		boolean thrown  = false;
		try{
		InputStream splashStream = new PipedInputStream();
		String fontName = "";

		FreeColClient result = new FreeColClient(splashStream, fontName);
		assertNotNull(splashStream.available());

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
	//	assertNotNull(result);
		}catch (NullPointerException e){
			thrown = true;
			assertTrue(thrown);
		}
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_2()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = false;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_3()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = true;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_4()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = false;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_5()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = true;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_6()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = false;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_7()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = true;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_8()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = false;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_9()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = true;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_10()
		throws Exception {
		boolean thrown = false;
		try{
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = false;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		assertNotNull(result);
		}catch (NullPointerException e){
			thrown = true;
			assertTrue(thrown);
		}
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_11()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = true;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_12()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = false;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_13()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = true;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_14()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = false;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_15()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = true;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_16()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = false;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:179)
		assertNotNull(result);
	}

	/**
	 * Run the FreeColClient(InputStream,String,float,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFreeColClient_17()
		throws Exception {
		InputStream splashStream = new PipedInputStream();
		String fontName = "";
		float scale = 1.0f;
		boolean headless = true;

		FreeColClient result = new FreeColClient(splashStream, fontName, scale, headless);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
		//       at net.sf.freecol.client.FreeColClient.<init>(FreeColClient.java:158)
		assertNotNull(result);
	}

	/**
	 * Run the void addSpecificationActions(Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testAddSpecificationActions_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		Specification specification = new Specification();

		fixture.addSpecificationActions(specification);

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
	 * Run the UserServerAPI askServer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testAskServer_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		UserServerAPI result = fixture.askServer();

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
	 * Run the void askToQuit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testAskToQuit_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.askToQuit();

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
	 * Run the void askToQuit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testAskToQuit_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.askToQuit();

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
	 * Run the boolean canSaveCurrentGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testCanSaveCurrentGame_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.canSaveCurrentGame();

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
	 * Run the boolean canSaveCurrentGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testCanSaveCurrentGame_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.canSaveCurrentGame();

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
	 * Run the boolean canSaveCurrentGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testCanSaveCurrentGame_3()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer((FreeColServer) null);
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.canSaveCurrentGame();

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
	 * Run the boolean canSaveCurrentGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testCanSaveCurrentGame_4()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.canSaveCurrentGame();

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
	 * Run the void continuePlaying() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testContinuePlaying_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.continuePlaying();

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
	 * Run the boolean currentPlayerIsMyPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testCurrentPlayerIsMyPlayer_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.currentPlayerIsMyPlayer();

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
	 * Run the boolean currentPlayerIsMyPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testCurrentPlayerIsMyPlayer_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(false);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.currentPlayerIsMyPlayer();

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
	 * Run the boolean currentPlayerIsMyPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testCurrentPlayerIsMyPlayer_3()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame((Game) null);
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.currentPlayerIsMyPlayer();

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
	 * Run the boolean currentPlayerIsMyPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testCurrentPlayerIsMyPlayer_4()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer((Player) null);

		boolean result = fixture.currentPlayerIsMyPlayer();

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
	 * Run the boolean currentPlayerIsMyPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testCurrentPlayerIsMyPlayer_5()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.currentPlayerIsMyPlayer();

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
	 * Run the void fatal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testFatal_1()
			throws Exception {
	boolean thrown = false;
	try{
		
		String err = "";

		FreeColClient.fatal(err);
	}catch(SecurityException e){
		thrown = true;
		assertTrue(true);
	}

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:468)
		//       at net.sf.freecol.client.FreeColClient.fatal(FreeColClient.java:374)
	}

	/**
	 * Run the ActionManager getActionManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetActionManager_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		ActionManager result = fixture.getActionManager();

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
	 * Run the int getAnimationSpeed(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetAnimationSpeed_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		Player player = new Player(new Game(), new IIOMetadataNode());

		int result = fixture.getAnimationSpeed(player);

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
		assertEquals(0, result);
	}

	/**
	 * Run the int getAnimationSpeed(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetAnimationSpeed_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		Player player = new Player(new Game(), new IIOMetadataNode());

		int result = fixture.getAnimationSpeed(player);

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
		assertEquals(0, result);
	}

	/**
	 * Run the ClientOptions getClientOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetClientOptions_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		ClientOptions result = fixture.getClientOptions();

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
	 * Run the ConnectController getConnectController() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetConnectController_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		ConnectController result = fixture.getConnectController();

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
	 * Run the FreeColServer getFreeColServer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetFreeColServer_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		FreeColServer result = fixture.getFreeColServer();

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
	 * Run the GUI getGUI() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetGUI_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		GUI result = fixture.getGUI();

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
	 * Run the Game getGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetGame_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		Game result = fixture.getGame();

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
	 * Run the InGameController getInGameController() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetInGameController_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		InGameController result = fixture.getInGameController();

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
	 * Run the InGameInputHandler getInGameInputHandler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetInGameInputHandler_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		InGameInputHandler result = fixture.getInGameInputHandler();

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
	 * Run the MapEditorController getMapEditorController() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetMapEditorController_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		MapEditorController result = fixture.getMapEditorController();

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
	 * Run the Player getMyPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetMyPlayer_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		Player result = fixture.getMyPlayer();

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
	 * Run the List<Colony> getMySortedColonies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetMySortedColonies_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		List<Colony> result = fixture.getMySortedColonies();

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
	 * Run the List<Colony> getMySortedColonies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetMySortedColonies_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		List<Colony> result = fixture.getMySortedColonies();

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
	 * Run the List<Colony> getMySortedColonies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetMySortedColonies_3()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer((Player) null);

		List<Colony> result = fixture.getMySortedColonies();

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
	 * Run the PreGameController getPreGameController() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetPreGameController_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		PreGameController result = fixture.getPreGameController();

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
	 * Run the PreGameInputHandler getPreGameInputHandler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetPreGameInputHandler_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		PreGameInputHandler result = fixture.getPreGameInputHandler();

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
	 * Run the SoundController getSoundController() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testGetSoundController_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		SoundController result = fixture.getSoundController();

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
	 * Run the boolean isAdmin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsAdmin_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isAdmin();

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
	 * Run the boolean isAdmin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsAdmin_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer((Player) null);

		boolean result = fixture.isAdmin();

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
	 * Run the boolean isAdmin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsAdmin_3()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isAdmin();

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
	 * Run the boolean isHeadless() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsHeadless_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isHeadless();

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
	 * Run the boolean isHeadless() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsHeadless_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isHeadless();

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
	 * Run the boolean isInGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsInGame_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isInGame();

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
	 * Run the boolean isInGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsInGame_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(false);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isInGame();

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
	 * Run the boolean isLoggedIn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsLoggedIn_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isLoggedIn();

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
	 * Run the boolean isLoggedIn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsLoggedIn_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(false);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isLoggedIn();

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
	 * Run the boolean isMapEditor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsMapEditor_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isMapEditor();

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
	 * Run the boolean isMapEditor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsMapEditor_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(false);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isMapEditor();

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
	 * Run the boolean isSinglePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsSinglePlayer_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isSinglePlayer();

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
	 * Run the boolean isSinglePlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testIsSinglePlayer_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(false);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.isSinglePlayer();

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
	 * Run the void newGame(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testNewGame_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(false);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		boolean prompt = true;

		fixture.newGame(prompt);

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
	 * Run the void newGame(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testNewGame_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(false);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		boolean prompt = false;

		fixture.newGame(prompt);

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
	 * Run the void newGame(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testNewGame_3()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(false);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		boolean prompt = true;

		fixture.newGame(prompt);

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
	 * Run the void newGame(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testNewGame_4()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		boolean prompt = true;

		fixture.newGame(prompt);

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
	 * Run the void newGame(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testNewGame_5()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame((Game) null);
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		boolean prompt = true;

		fixture.newGame(prompt);

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
	 * Run the void quit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testQuit_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.quit();

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
	 * Run the void quit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testQuit_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.quit();

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
	 * Run the void quit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testQuit_3()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.quit();

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
	 * Run the void quit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testQuit_4()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.quit();

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
	 * Run the void quit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testQuit_5()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.quit();

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
	 * Run the void quit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testQuit_6()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.quit();

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
	 * Run the void quit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testQuit_7()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.quit();

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
	 * Run the void retire() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testRetire_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.retire();

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
	 * Run the void retire() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testRetire_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.retire();

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
	 * Run the void setFreeColServer(FreeColServer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSetFreeColServer_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		FreeColServer freeColServer = new FreeColServer(true, true, new Specification(), 1, "");

		fixture.setFreeColServer(freeColServer);

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
	 * Run the void setGame(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSetGame_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		Game game = new Game();

		fixture.setGame(game);

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
	 * Run the void setInGame(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSetInGame_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		boolean inGame = true;

		fixture.setInGame(inGame);

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
	 * Run the void setLoggedIn(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSetLoggedIn_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		boolean loggedIn = true;

		fixture.setLoggedIn(loggedIn);

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
	 * Run the void setMapEditor(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSetMapEditor_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		boolean mapEditor = true;

		fixture.setMapEditor(mapEditor);

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
	 * Run the void setMessageHandler(MessageHandler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSetMessageHandler_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		MessageHandler messageHandler = new InGameInputHandler(new FreeColClient(new PipedInputStream(), ""));

		fixture.setMessageHandler(messageHandler);

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
	 * Run the void setMyPlayer(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSetMyPlayer_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		Player player = new Player(new Game(), new IIOMetadataNode());

		fixture.setMyPlayer(player);

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
	 * Run the void setSinglePlayer(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSetSinglePlayer_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		boolean singlePlayer = true;

		fixture.setSinglePlayer(singlePlayer);

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
	 * Run the void setWork(Runnable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSetWork_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		Runnable runnable = new Thread();

		fixture.setWork(runnable);

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
	 * Run the void skipTurns(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSkipTurns_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer((FreeColServer) null);
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		int turns = 1;

		fixture.skipTurns(turns);

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
	 * Run the void skipTurns(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSkipTurns_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		int turns = 0;

		fixture.skipTurns(turns);

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
	 * Run the void skipTurns(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testSkipTurns_3()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		int turns = 1;

		fixture.skipTurns(turns);

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
	 * Run the void startClient(Dimension,String,boolean,boolean,File,Specification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testStartClient_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));
		Dimension size = new Dimension();
		String userMsg = "";
		boolean sound = true;
		boolean showOpeningVideo = true;
		File savedGame = new File("");
		Specification spec = new Specification();

		fixture.startClient(size, userMsg, sound, showOpeningVideo, savedGame, spec);

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
	 * Run the boolean tutorialMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testTutorialMode_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.tutorialMode();

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
	 * Run the boolean tutorialMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testTutorialMode_2()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		boolean result = fixture.tutorialMode();

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
	 * Run the void updateActions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Test
	public void testUpdateActions_1()
		throws Exception {
		FreeColClient fixture = new FreeColClient(new PipedInputStream(), "");
		fixture.setSinglePlayer(true);
		fixture.setFreeColServer(new FreeColServer(true, true, new Specification(), 1, ""));
		fixture.setMapEditor(true);
		fixture.setInGame(true);
		fixture.setGame(new Game());
		fixture.setLoggedIn(true);
		fixture.setMyPlayer(new Player(new Game(), new IIOMetadataNode()));

		fixture.updateActions();

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
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		InputStream splashStream;
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/13/16 4:40 PM
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
	 * @generatedBy CodePro at 5/13/16 4:40 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColClientTest.class);
	}
}
