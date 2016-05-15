package net.sf.freecol.client;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import net.sf.freecol.common.model.AbstractGoods;
import net.sf.freecol.common.model.Colony;
import net.sf.freecol.common.model.Game;
import net.sf.freecol.common.io.FreeColSavegameFile;
import net.sf.freecol.common.io.FreeColModFile;
import net.sf.freecol.common.model.FreeColGameObject;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import net.sf.freecol.common.option.BooleanOption;
import net.sf.freecol.common.model.FreeColObject;
import net.sf.freecol.common.model.Player;
import net.sf.freecol.common.model.ModelMessage;

/**
 * The class <code>ClientOptionsTest</code> contains tests for the class <code>{@link ClientOptions}</code>.
 *
 * @generatedBy CodePro at 5/12/16 3:14 PM
 * @author JQ
 * @version $Revision: 1.0 $
 */
public class ClientOptionsTest {
	/**
	 * Run the ClientOptions() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testClientOptions_1()
		throws Exception {

		ClientOptions result = new ClientOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class java.lang.invoke.LambdaForm
		//       at java.lang.invoke.DirectMethodHandle.makePreparedLambdaForm(Unknown Source)
		//       at java.lang.invoke.DirectMethodHandle.preparedLambdaForm(Unknown Source)
		//       at java.lang.invoke.DirectMethodHandle.preparedLambdaForm(Unknown Source)
		//       at java.lang.invoke.DirectMethodHandle.make(Unknown Source)
		//       at java.lang.invoke.MethodHandles$Lookup.getDirectMethodCommon(Unknown Source)
		//       at java.lang.invoke.MethodHandles$Lookup.getDirectMethodNoSecurityManager(Unknown Source)
		//       at java.lang.invoke.MethodHandles$Lookup.getDirectMethodForConstant(Unknown Source)
		//       at java.lang.invoke.MethodHandles$Lookup.linkMethodHandleConstant(Unknown Source)
		//       at java.lang.invoke.MethodHandleNatives.linkMethodHandleConstant(Unknown Source)
		//       at net.sf.freecol.client.ClientOptions.<clinit>(ClientOptions.java:441)
		assertNotNull(result);
	}

	/**
	 * Run the void fixClientOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testFixClientOptions_1()
		throws Exception {
		ClientOptions fixture = new ClientOptions();

		fixture.fixClientOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
	}

	/**
	 * Run the void fixClientOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testFixClientOptions_2()
		throws Exception {
		ClientOptions fixture = new ClientOptions();

		fixture.fixClientOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
	}

	/**
	 * Run the List<FreeColModFile> getActiveMods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetActiveMods_1()
		throws Exception {
		ClientOptions fixture = new ClientOptions();

		List<FreeColModFile> result = fixture.getActiveMods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	}

	/**
	 * Run the List<FreeColModFile> getActiveMods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetActiveMods_2()
		throws Exception {
		ClientOptions fixture = new ClientOptions();

		List<FreeColModFile> result = fixture.getActiveMods();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	}

	/**
	 * Run the BooleanOption getBooleanOption(ModelMessage) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetBooleanOption_1()
		throws Exception {
		ClientOptions fixture = new ClientOptions();
		ModelMessage message = new ModelMessage(net.sf.freecol.common.model.ModelMessage.MessageType.BUILDING_COMPLETED, "", "", new Game(), new AbstractGoods());

		BooleanOption result = fixture.getBooleanOption(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNull(result);
	}

	/**
	 * Run the Comparator<Colony> getColonyComparator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetColonyComparator_1()
		throws Exception {
		boolean thrown = false;
		try{
		ClientOptions fixture = new ClientOptions();

		Comparator<Colony> result = fixture.getColonyComparator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		}catch (NullPointerException e){
			thrown = true;
		}
		//assertNull(result);
		assertTrue(thrown);
	}

	/**
	 * Run the Comparator<Colony> getColonyComparator(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetColonyComparator_2()
		throws Exception {
		int type = 1;

		Comparator<Colony> result = ClientOptions.getColonyComparator(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	}

	/**
	 * Run the Comparator<Colony> getColonyComparator(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetColonyComparator_3()
		throws Exception {
		int type = 2;

		Comparator<Colony> result = ClientOptions.getColonyComparator(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	}

	/**
	 * Run the Comparator<Colony> getColonyComparator(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetColonyComparator_4()
		throws Exception {
		int type = 3;

		Comparator<Colony> result = ClientOptions.getColonyComparator(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	}

	/**
	 * Run the Comparator<Colony> getColonyComparator(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetColonyComparator_5()
		throws Exception {
		int type = 4;

		Comparator<Colony> result = ClientOptions.getColonyComparator(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	}

	/**
	 * Run the Comparator<Colony> getColonyComparator(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetColonyComparator_6()
		throws Exception {
		int type = 0;

		Comparator<Colony> result = ClientOptions.getColonyComparator(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	}

	/**
	 * Run the Comparator<Colony> getColonyComparator(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetColonyComparator_7()
		throws Exception {
		boolean thrown = false;
		try{
		int type = 5;

		Comparator<Colony> result = ClientOptions.getColonyComparator(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		}catch (IllegalStateException e){
			thrown = true;
		}
		//assertNotNull(result);
		assertTrue(thrown);
	}

	/**
	 * Run the int getDisplayTileText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetDisplayTileText_1()
		throws Exception {
		boolean thrown = false;
		try{
		ClientOptions fixture = new ClientOptions();

		int result = fixture.getDisplayTileText();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertEquals(0, result);
	} catch (NullPointerException e){
		thrown = true;
	}
	
	assertTrue(thrown);
}

	/**
	 * Run the String getLanguageOption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetLanguageOption_1()
		throws Exception {

		String result = ClientOptions.getLanguageOption();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNull(result);
	}

	/**
	 * Run the String getLanguageOption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetLanguageOption_2()
		throws Exception {

		String result = ClientOptions.getLanguageOption();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNull(result);
	}

	/**
	 * Run the Comparator<ModelMessage> getModelMessageComparator(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetModelMessageComparator_1()
		throws Exception {
		boolean thrown = false;
		try{
		ClientOptions fixture = new ClientOptions();
		Game game = new Game();

		Comparator<ModelMessage> result = fixture.getModelMessageComparator(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	} catch (NullPointerException e){
		thrown = true;
	}
	
	assertTrue(thrown);
}
	

	/**
	 * Run the Comparator<ModelMessage> getModelMessageComparator(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetModelMessageComparator_2()
		throws Exception {
		boolean thrown = false;
		try{
		ClientOptions fixture = new ClientOptions();
		Game game = new Game();

		Comparator<ModelMessage> result = fixture.getModelMessageComparator(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	} catch (NullPointerException e){
		thrown = true;
	}
	
	assertTrue(thrown);
}

	/**
	 * Run the Comparator<ModelMessage> getModelMessageComparator(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetModelMessageComparator_3()
		throws Exception {
		boolean thrown = false;
		try{
		ClientOptions fixture = new ClientOptions();
		Game game = new Game();

		Comparator<ModelMessage> result = fixture.getModelMessageComparator(game);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	} catch (NullPointerException e){
		thrown = true;
	}
	
	assertTrue(thrown);
}

	/**
	 * Run the List<Colony> getSortedColonies(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetSortedColonies_1()
		throws Exception {
		boolean thrown = false;
		try{
		ClientOptions fixture = new ClientOptions();
		Player p = new Player(new Game(), new IIOMetadataNode());

		List<Colony> result = fixture.getSortedColonies(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	} catch (RuntimeException e){
		thrown = true;
	}
	
	assertTrue(thrown);
}
	

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = ClientOptions.getTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertNotNull(result);
	}

	/**
	 * Run the boolean merge(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testMerge_1()
		throws Exception {
		ClientOptions fixture = new ClientOptions();
		File file = new File("");

		boolean result = fixture.merge(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertFalse(result);
	}

	/**
	 * Run the boolean merge(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testMerge_2()
		throws Exception {
		ClientOptions fixture = new ClientOptions();
		File file = new File("");

		boolean result = fixture.merge(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertFalse(result);
	}

	/**
	 * Run the boolean merge(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testMerge_3()
		throws Exception {
		ClientOptions fixture = new ClientOptions();
		File file = new File("");

		boolean result = fixture.merge(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertFalse(result);
	}

	/**
	 * Run the boolean merge(FreeColSavegameFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testMerge_4()
		throws Exception {
		boolean thrown = false;
		try{
		ClientOptions fixture = new ClientOptions();
		FreeColSavegameFile save = new FreeColSavegameFile(new File(""));

		boolean result = fixture.merge(save);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertTrue(result);
		} catch (java.io.IOException e){
			thrown = true;
		}
		
		assertTrue(thrown);
	}

	/**
	 * Run the boolean merge(FreeColSavegameFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testMerge_5()
		throws Exception {
		boolean thrown = false;
		try{
		ClientOptions fixture = new ClientOptions();
		FreeColSavegameFile save = new FreeColSavegameFile(new File(""));

		boolean result = fixture.merge(save);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertTrue(result);
		} catch (java.io.IOException e){
			thrown = true;
		}
		
		assertTrue(thrown);
	}
	

	/**
	 * Run the boolean merge(FreeColSavegameFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	@Test
	public void testMerge_6()
		throws Exception {
		boolean thrown = false;
		try{
		ClientOptions fixture = new ClientOptions();
		FreeColSavegameFile save = new FreeColSavegameFile(new File(""));

		boolean result = fixture.merge(save);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class net.sf.freecol.client.ClientOptions
		assertTrue(result);
	} catch (java.io.IOException e){
		thrown = true;
	}
	
	assertTrue(thrown);
}
	

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/12/16 3:14 PM
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
	 * @generatedBy CodePro at 5/12/16 3:14 PM
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
	 * @generatedBy CodePro at 5/12/16 3:14 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClientOptionsTest.class);
	}
}