package net.sf.freecol.client.gui;

import java.awt.Font;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FontLibraryTest</code> contains tests for the class <code>{@link FontLibrary}</code>.
 *
 * @generatedBy CodePro at 5/14/16 8:09 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class FontLibraryTest {
	/**
	 * Run the FontLibrary() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testFontLibrary_1()
		throws Exception {

		FontLibrary result = new FontLibrary();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FontLibrary(float) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testFontLibrary_2()
		throws Exception {
		float scaleFactor = 1.0f;

		FontLibrary result = new FontLibrary(scaleFactor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Font createCompatibleFont(String,FontType,FontSize) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateCompatibleFont_1()
		throws Exception {
		String string = "";
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;

		Font result = FontLibrary.createCompatibleFont(string, fontType, fontSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:245)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:181)
		assertNotNull(result);
	}

	/**
	 * Run the Font createCompatibleFont(String,FontType,FontSize,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateCompatibleFont_2()
		throws Exception {
		String string = "";
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createCompatibleFont(string, fontType, fontSize, scaleFactor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:245)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:192)
		assertNotNull(result);
	}

	/**
	 * Run the Font createCompatibleFont(String,FontType,FontSize,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateCompatibleFont_3()
		throws Exception {
		String string = "";
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		int style = 1;

		Font result = FontLibrary.createCompatibleFont(string, fontType, fontSize, style);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:245)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:186)
		assertNotNull(result);
	}

	/**
	 * Run the Font createCompatibleFont(String,FontType,FontSize,int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateCompatibleFont_4()
		throws Exception {
		String string = "";
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		int style = 1;
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createCompatibleFont(string, fontType, fontSize, style, scaleFactor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:245)
		assertNotNull(result);
	}

	/**
	 * Run the Font createCompatibleFont(String,FontType,FontSize,int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateCompatibleFont_5()
		throws Exception {
		String string = "";
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		int style = 1;
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createCompatibleFont(string, fontType, fontSize, style, scaleFactor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:245)
		assertNotNull(result);
	}

	/**
	 * Run the Font createCompatibleFont(String,FontType,FontSize,int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateCompatibleFont_6()
		throws Exception {
		String string = "";
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		int style = 1;
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createCompatibleFont(string, fontType, fontSize, style, scaleFactor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:245)
		assertNotNull(result);
	}

	/**
	 * Run the Font createCompatibleScaledFont(String,FontType,FontSize) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateCompatibleScaledFont_1()
		throws Exception {
		FontLibrary fixture = new FontLibrary(1.0f);
		String string = "";
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;

		Font result = fixture.createCompatibleScaledFont(string, fontType, fontSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:245)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleScaledFont(FontLibrary.java:143)
		assertNotNull(result);
	}

	/**
	 * Run the Font createCompatibleScaledFont(String,FontType,FontSize,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateCompatibleScaledFont_2()
		throws Exception {
		FontLibrary fixture = new FontLibrary(1.0f);
		String string = "";
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		int style = 1;

		Font result = fixture.createCompatibleScaledFont(string, fontType, fontSize, style);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleFont(FontLibrary.java:245)
		//       at net.sf.freecol.client.gui.FontLibrary.createCompatibleScaledFont(FontLibrary.java:149)
		assertNotNull(result);
	}

	/**
	 * Run the Font createFont(FontType,FontSize) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateFont_1()
		throws Exception {
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;

		Font result = FontLibrary.createFont(fontType, fontSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:216)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the Font createFont(FontType,FontSize,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateFont_2()
		throws Exception {
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createFont(fontType, fontSize, scaleFactor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:216)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:176)
		assertNotNull(result);
	}

	/**
	 * Run the Font createFont(FontType,FontSize,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateFont_3()
		throws Exception {
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		int style = 1;

		Font result = FontLibrary.createFont(fontType, fontSize, style);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:216)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the Font createFont(FontType,FontSize,int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateFont_4()
		throws Exception {
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		int style = 1;
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createFont(fontType, fontSize, style, scaleFactor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Font createFont(FontType,FontSize,int,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateFont_5()
		throws Exception {
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		int style = 1;
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createFont(fontType, fontSize, style, scaleFactor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:216)
		assertNotNull(result);
	}

	/**
	 * Run the Font createMainFont(String,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateMainFont_1()
		throws Exception {
		String fontName = "";
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createMainFont(fontName, scaleFactor);

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Font[family=Dialog,name=,style=plain,size=12]", result.toString());
		assertEquals("", result.getName());
		assertEquals(12, result.getSize());
		assertEquals("Dialog", result.getFamily());
		assertEquals(0, result.getStyle());
		assertEquals("Dialog.plain", result.getFontName());
		assertEquals(0.0f, result.getItalicAngle(), 1.0f);
		assertEquals(0, result.getMissingGlyphCode());
		assertEquals("Dialog.plain", result.getPSName());
		assertEquals(12.0f, result.getSize2D(), 1.0f);
		assertEquals(false, result.hasLayoutAttributes());
		assertEquals(false, result.hasUniformLineMetrics());
		assertEquals(false, result.isItalic());
		assertEquals(true, result.isPlain());
		assertEquals(false, result.isTransformed());
		assertEquals(false, result.isBold());
		assertEquals(4101, result.getNumGlyphs());
	}

	/**
	 * Run the Font createMainFont(String,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateMainFont_2()
		throws Exception {
		String fontName = "";
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createMainFont(fontName, scaleFactor);

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Font[family=Dialog,name=,style=plain,size=12]", result.toString());
		assertEquals("", result.getName());
		assertEquals(12, result.getSize());
		assertEquals("Dialog", result.getFamily());
		assertEquals(0, result.getStyle());
		assertEquals("Dialog.plain", result.getFontName());
		assertEquals(0.0f, result.getItalicAngle(), 1.0f);
		assertEquals(0, result.getMissingGlyphCode());
		assertEquals("Dialog.plain", result.getPSName());
		assertEquals(12.0f, result.getSize2D(), 1.0f);
		assertEquals(false, result.hasLayoutAttributes());
		assertEquals(false, result.hasUniformLineMetrics());
		assertEquals(false, result.isItalic());
		assertEquals(true, result.isPlain());
		assertEquals(false, result.isTransformed());
		assertEquals(false, result.isBold());
		assertEquals(4101, result.getNumGlyphs());
	}

	/**
	 * Run the Font createMainFont(String,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateMainFont_3()
		throws Exception {
		String fontName = null;
		float scaleFactor = 1.0f;

		Font result = FontLibrary.createMainFont(fontName, scaleFactor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createMainFont(FontLibrary.java:121)
		assertNotNull(result);
	}

	/**
	 * Run the Font createScaledFont(FontType,FontSize) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateScaledFont_1()
		throws Exception {
		FontLibrary fixture = new FontLibrary(1.0f);
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;

		Font result = fixture.createScaledFont(fontType, fontSize);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:216)
		//       at net.sf.freecol.client.gui.FontLibrary.createScaledFont(FontLibrary.java:125)
		assertNotNull(result);
	}

	/**
	 * Run the Font createScaledFont(FontType,FontSize,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	@Test
	public void testCreateScaledFont_2()
		throws Exception {
		FontLibrary fixture = new FontLibrary(1.0f);
		FontLibrary.FontType fontType = FontLibrary.FontType.HEADER;
		FontLibrary.FontSize fontSize = FontLibrary.FontSize.BIG;
		int style = 1;

		Font result = fixture.createScaledFont(fontType, fontSize, style);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.resources.ResourceManager.getFontResource(ResourceManager.java:312)
		//       at net.sf.freecol.common.resources.ResourceManager.getFont(ResourceManager.java:541)
		//       at net.sf.freecol.client.gui.FontLibrary.createFont(FontLibrary.java:216)
		//       at net.sf.freecol.client.gui.FontLibrary.createScaledFont(FontLibrary.java:138)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 8:09 PM
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
	 * @generatedBy CodePro at 5/14/16 8:09 PM
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
	 * @generatedBy CodePro at 5/14/16 8:09 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FontLibraryTest.class);
	}
}