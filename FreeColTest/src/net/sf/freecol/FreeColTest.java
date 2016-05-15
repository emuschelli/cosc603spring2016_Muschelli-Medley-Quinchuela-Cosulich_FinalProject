package net.sf.freecol;

import java.io.File;
import net.sf.freecol.common.model.NationOptions;
import java.util.Locale;
import org.apache.commons.cli.Options;
import net.sf.freecol.common.model.StringTemplate;
import net.sf.freecol.common.option.OptionGroup;
import org.junit.*;
import net.sf.freecol.common.io.FreeColTcFile;
import net.sf.freecol.common.model.Specification;
import static org.junit.Assert.*;

/**
 * The class <code>FreeColTest</code> contains tests for the class <code>{@link FreeCol}</code>.
 *
 * @generatedBy CodePro at 5/11/16 4:12 PM
 * @author JQ
 * @version $Revision: 1.0 $
 */
public class FreeColTest {
	/**
	 * Run the StringTemplate badLoad(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testBadLoad_1()
		throws Exception {
		File file = new File("");

		StringTemplate result = FreeCol.badLoad(file);

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: error.couldNotLoad [[%name%: NAME: ]]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("error.couldNotLoad", result.getId());
		assertEquals("couldNotLoad", result.getSuffix());
		assertEquals("<stringTemplate id=\"error.couldNotLoad\" templateType=\"template\"><key value=\"%name%\"></key><stringTemplate id=\"\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getGame());
		assertEquals("error.couldNotLoad", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the StringTemplate badSave(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testBadSave_1()
		throws Exception {
		File file = new File("");

		StringTemplate result = FreeCol.badSave(file);

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: error.couldNotSave [[%name%: NAME: ]]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("error.couldNotSave", result.getId());
		assertEquals("couldNotSave", result.getSuffix());
		assertEquals("<stringTemplate id=\"error.couldNotSave\" templateType=\"template\"><key value=\"%name%\"></key><stringTemplate id=\"\" templateType=\"name\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getGame());
		assertEquals("error.couldNotSave", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getFeatureContainer());
	}

	/**
	 * Run the void fatal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testFatal_1()
		throws Exception {
		String err = null;

		FreeCol.fatal(err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:411)
	}

	/**
	 * Run the void fatal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testFatal_2()
		throws Exception {
		String err = "";

		FreeCol.fatal(err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:411)
	}

	/**
	 * Run the void fatal(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testFatal_3()
		throws Exception {
		String err = "";

		FreeCol.fatal(err);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:411)
	}

	/**
	 * Run the void fatal(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testFatal_4()
		throws Exception {
		StringTemplate template = new StringTemplate();

		FreeCol.fatal(template);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Exit while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkExit(CodeProJUnitSecurityManager.java:57)
		//       at java.lang.Runtime.exit(Unknown Source)
		//       at java.lang.System.exit(Unknown Source)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:411)
		//       at net.sf.freecol.FreeCol.fatal(FreeCol.java:397)
	}

	/**
	 * Run the net.sf.freecol.common.model.NationOptions.Advantages getAdvantages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetAdvantages_1()
		throws Exception {

		net.sf.freecol.common.model.NationOptions.Advantages result = FreeCol.getAdvantages();

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.advantages.selectable.name", result.getNameKey());
		assertEquals("model.advantages.selectable.shortDescription", result.getShortDescriptionKey());
		assertEquals("SELECTABLE", result.name());
		assertEquals("SELECTABLE", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the net.sf.freecol.common.model.NationOptions.Advantages getAdvantages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetAdvantages_2()
		throws Exception {

		net.sf.freecol.common.model.NationOptions.Advantages result = FreeCol.getAdvantages();

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.advantages.selectable.name", result.getNameKey());
		assertEquals("model.advantages.selectable.shortDescription", result.getShortDescriptionKey());
		assertEquals("SELECTABLE", result.name());
		assertEquals("SELECTABLE", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the StringBuilder getConfiguration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetConfiguration_1()
		throws Exception {

		StringBuilder result = FreeCol.getConfiguration();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Configuration:\n  version     null\n  java:       1.8.0_45\n  memory:     1037959168\n  locale:     null\n  data:       data\n  userConfig: NONE\n  userData:   NONE\n  autosave:   NONE\n  logFile:    null\n  options:    NONE\n  save:       NONE\n  userMods:   NONE\n  debug:      ", result.toString());
		assertEquals(267, result.length());
		assertEquals(514, result.capacity());
	}

	/**
	 * Run the StringBuilder getConfiguration() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetConfiguration_2()
		throws Exception {

		StringBuilder result = FreeCol.getConfiguration();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Configuration:\n  version     null\n  java:       1.8.0_45\n  memory:     1037959168\n  locale:     null\n  data:       data\n  userConfig: NONE\n  userData:   NONE\n  autosave:   NONE\n  logFile:    null\n  options:    NONE\n  save:       NONE\n  userMods:   NONE\n  debug:      ", result.toString());
		assertEquals(267, result.length());
		assertEquals(514, result.capacity());
	}

	/**
	 * Run the String getDifficulty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetDifficulty_1()
		throws Exception {

		String result = FreeCol.getDifficulty();

		// add additional test code here
		assertEquals("model.difficulty.medium", result);
	}

	/**
	 * Run the String getDifficulty() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetDifficulty_2()
		throws Exception {

		String result = FreeCol.getDifficulty();

		// add additional test code here
		assertEquals("model.difficulty.medium", result);
	}

	/**
	 * Run the int getEuropeanCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetEuropeanCount_1()
		throws Exception {

		int result = FreeCol.getEuropeanCount();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the Locale getLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetLocale_1()
		throws Exception {

		Locale result = FreeCol.getLocale();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {

		String result = FreeCol.getName();

		// add additional test code here
		assertEquals("JQ", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetName_2()
		throws Exception {

		String result = FreeCol.getName();

		// add additional test code here
		assertEquals("JQ", result);
	}

	/**
	 * Run the String getRevision() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetRevision_1()
		throws Exception {

		String result = FreeCol.getRevision();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getServerHost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetServerHost_1()
		throws Exception {

		String result = FreeCol.getServerHost();

		// add additional test code here
		assertEquals("127.0.0.1", result);
	}

	/**
	 * Run the int getServerPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetServerPort_1()
		throws Exception {

		int result = FreeCol.getServerPort();

		// add additional test code here
		assertEquals(3541, result);
	}

	/**
	 * Run the int getServerPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetServerPort_2()
		throws Exception {

		int result = FreeCol.getServerPort();

		// add additional test code here
		assertEquals(3541, result);
	}

	/**
	 * Run the String getTC() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetTC_1()
		throws Exception {

		String result = FreeCol.getTC();

		// add additional test code here
		assertEquals("freecol", result);
	}

	/**
	 * Run the String getTC() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetTC_2()
		throws Exception {

		String result = FreeCol.getTC();

		// add additional test code here
		assertEquals("freecol", result);
	}

	/**
	 * Run the FreeColTcFile getTCFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetTCFile_1()
		throws Exception {

		FreeColTcFile result = FreeCol.getTCFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FreeColTcFile getTCFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetTCFile_2()
		throws Exception {

		FreeColTcFile result = FreeCol.getTCFile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getTimeout(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetTimeout_1()
		throws Exception {
		boolean singlePlayer = false;

		int result = FreeCol.getTimeout(singlePlayer);

		// add additional test code here
		assertEquals(60, result);
	}

	/**
	 * Run the int getTimeout(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetTimeout_2()
		throws Exception {
		boolean singlePlayer = true;

		int result = FreeCol.getTimeout(singlePlayer);

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the int getTimeout(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetTimeout_3()
		throws Exception {
		boolean singlePlayer = true;

		int result = FreeCol.getTimeout(singlePlayer);

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the String getValidDifficulties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetValidDifficulties_1()
		throws Exception {

		String result = FreeCol.getValidDifficulties();

		// add additional test code here
		assertEquals("model.difficulty.veryEasy.name,model.difficulty.easy.name,model.difficulty.medium.name,model.difficulty.hard.name,model.difficulty.veryHard.name", result);
	}

	/**
	 * Run the String getValidGUIScales() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetValidGUIScales_1()
		throws Exception {

		String result = FreeCol.getValidGUIScales();

		// add additional test code here
		assertEquals("100,125,150,175,200", result);
	}

	/**
	 * Run the String getValidGUIScales() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetValidGUIScales_2()
		throws Exception {

		String result = FreeCol.getValidGUIScales();

		// add additional test code here
		assertEquals("100,125,150,175,200", result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {

		String result = FreeCol.getVersion();

		// add additional test code here
		assertEquals("0.11.6", result);
	}

	/**
	 * Run the void gripe(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGripe_1()
		throws Exception {
		String key = "";

		FreeCol.gripe(key);

		// add additional test code here
	}

	/**
	 * Run the void gripe(StringTemplate) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testGripe_2()
		throws Exception {
		StringTemplate template = new StringTemplate();

		FreeCol.gripe(template);

		// add additional test code here
	}

	/**
	 * Run the void helpOptions(Options,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testHelpOptions_1()
		throws Exception {
		Options options = new Options();
		String help = "";

		FreeCol.helpOptions(options, help);

		// add additional test code here
	}

	/**
	 * Run the Specification loadSpecification(FreeColTcFile,Advantages,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testLoadSpecification_1()
		throws Exception {
		FreeColTcFile tcf = null;
		net.sf.freecol.common.model.NationOptions.Advantages advantages = net.sf.freecol.common.model.NationOptions.Advantages.FIXED;
		String difficulty = "";

		Specification result = FreeCol.loadSpecification(tcf, advantages, difficulty);

		// add additional test code here
		assertEquals(null, result);
		
	}

	/**
	 * Run the Specification loadSpecification(FreeColTcFile,Advantages,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testLoadSpecification_2()
		throws Exception {
		boolean thrown = false;
		try{
		FreeColTcFile tcf = new FreeColTcFile(new File(""));
		net.sf.freecol.common.model.NationOptions.Advantages advantages = net.sf.freecol.common.model.NationOptions.Advantages.FIXED;
		String difficulty = "";

		Specification result = FreeCol.loadSpecification(tcf, advantages, difficulty);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.io.IOException: File  does not exist
		//       at net.sf.freecol.common.io.FreeColDataFile.<init>(FreeColDataFile.java:85)
		//       at net.sf.freecol.common.io.FreeColModFile.<init>(FreeColModFile.java:65)
		//       at net.sf.freecol.common.io.FreeColTcFile.<init>(FreeColTcFile.java:50)
		//assertNotNull(result);
		//assertNull(null, result);
		}catch (java.io.IOException e){
			thrown = true;
		}
		assertTrue(thrown);
	}

	/**
	 * Run the void ordinaryOptions(Options,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testOrdinaryOptions_1()
		throws Exception {
		Options options = new Options();
		String argDirectory = "";

		FreeCol.ordinaryOptions(options, argDirectory);

		// add additional test code here
	}

	/**
	 * Run the String selectDifficulty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSelectDifficulty_1()
		throws Exception {
		String arg = "";

		String result = FreeCol.selectDifficulty(arg);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String selectDifficulty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSelectDifficulty_2()
		throws Exception {
		String arg = "";

		String result = FreeCol.selectDifficulty(arg);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int selectEuropeanCount(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSelectEuropeanCount_1()
		throws Exception {
		String arg = "0";

		int result = FreeCol.selectEuropeanCount(arg);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int selectEuropeanCount(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSelectEuropeanCount_2()
		throws Exception {
		String arg = "0";

		int result = FreeCol.selectEuropeanCount(arg);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int selectEuropeanCount(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSelectEuropeanCount_3()
		throws Exception {
		String arg = "";

		int result = FreeCol.selectEuropeanCount(arg);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the void setAdvantages(Advantages) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetAdvantages_1()
		throws Exception {
		net.sf.freecol.common.model.NationOptions.Advantages advantages = net.sf.freecol.common.model.NationOptions.Advantages.FIXED;

		FreeCol.setAdvantages(advantages);

		// add additional test code here
	}

	/**
	 * Run the void setDifficulty(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetDifficulty_1()
		throws Exception {
		String difficulty = "";

		FreeCol.setDifficulty(difficulty);

		// add additional test code here
	}

	/**
	 * Run the void setDifficulty(OptionGroup) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetDifficulty_2()
		throws Exception {
		OptionGroup difficulty = new OptionGroup("");

		FreeCol.setDifficulty(difficulty);

		// add additional test code here
	}

	/**
	 * Run the void setEuropeanCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetEuropeanCount_1()
		throws Exception {
		int n = 1;

		FreeCol.setEuropeanCount(n);
		assertEquals(1, FreeCol.getEuropeanCount());

		// add additional test code here
	}

	/**
	 * Run the boolean setGUIScale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetGUIScale_1()
		throws Exception {
		String arg = "0";

		boolean result = FreeCol.setGUIScale(arg);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setGUIScale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetGUIScale_2()
		throws Exception {
		String arg = "0";

		boolean result = FreeCol.setGUIScale(arg);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setGUIScale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetGUIScale_3()
		throws Exception {
		String arg = "0";

		boolean result = FreeCol.setGUIScale(arg);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setGUIScale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetGUIScale_4()
		throws Exception {
		String arg = "0";

		boolean result = FreeCol.setGUIScale(arg);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setGUIScale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetGUIScale_5()
		throws Exception {
		String arg = "";

		boolean result = FreeCol.setGUIScale(arg);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setGUIScale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetGUIScale_6()
		throws Exception {
		String arg = null;

		boolean result = FreeCol.setGUIScale(arg);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		String name = "";

		FreeCol.setName(name);

		// add additional test code here
		assertNull(FreeCol.getName());
	}

	/**
	 * Run the boolean setServerPort(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetServerPort_1()
		throws Exception {
		String arg = null;

		boolean result = FreeCol.setServerPort(arg);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setServerPort(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetServerPort_2()
		throws Exception {
		String arg = "";

		boolean result = FreeCol.setServerPort(arg);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setServerPort(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetServerPort_3()
		throws Exception {
		String arg = "0";

		boolean result = FreeCol.setServerPort(arg);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setTC(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetTC_1()
		throws Exception {
		String tc = "";

		FreeCol.setTC(tc);

		// add additional test code here
	//	System.out.println (FreeCol.setTC(tc));
		assertEquals(null, FreeCol.getTC());
	}

	/**
	 * Run the boolean setTimeout(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetTimeout_1()
		throws Exception {
		String timeout = "0";

		boolean result = FreeCol.setTimeout(timeout);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setTimeout(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetTimeout_2()
		throws Exception {
		String timeout = "0";

		boolean result = FreeCol.setTimeout(timeout);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean setTimeout(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSetTimeout_3()
		throws Exception {
		String timeout = "";

		boolean result = FreeCol.setTimeout(timeout);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void specialOptions(Options,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	@Test
	public void testSpecialOptions_1()
		throws Exception {
		Options options = new Options();
		String argDirectory = "";

		FreeCol.specialOptions(options, argDirectory);

		// add additional test code here
	//	assertNull(FreeCol.specialOptions(options, argDirectory));
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/11/16 4:12 PM
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
	 * @generatedBy CodePro at 5/11/16 4:12 PM
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
	 * @generatedBy CodePro at 5/11/16 4:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FreeColTest.class);
	}
}