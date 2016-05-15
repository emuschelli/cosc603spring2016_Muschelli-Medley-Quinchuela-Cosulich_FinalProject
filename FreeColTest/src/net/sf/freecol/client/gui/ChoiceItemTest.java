package net.sf.freecol.client.gui;

import javax.swing.ImageIcon;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ChoiceItemTest</code> contains tests for the class <code>{@link ChoiceItem}</code>.
 *
 * @generatedBy CodePro at 5/14/16 6:44 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class ChoiceItemTest {
	/**
	 * Run the ChoiceItem(T) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	
	

	/**
	 * Run the ChoiceItem(T) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testChoiceItem_2()
		throws Exception {

		ChoiceItem result = new ChoiceItem(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.client.gui.ChoiceItem.<init>(ChoiceItem.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the ChoiceItem(T) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testChoiceItem_3()
		throws Exception {

		ChoiceItem result = new ChoiceItem(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.client.gui.ChoiceItem.<init>(ChoiceItem.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the ChoiceItem(T) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testChoiceItem_4()
		throws Exception {

		ChoiceItem result = new ChoiceItem(null);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.client.gui.ChoiceItem.<init>(ChoiceItem.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the ChoiceItem(String,T) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testChoiceItem_5()
		throws Exception {
		String text = "";

		ChoiceItem result = new ChoiceItem(text, null);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getObject());
		assertEquals(false, result.isDefault());
		assertEquals(true, result.isEnabled());
		assertEquals(false, result.isOK());
		assertEquals(null, result.getIcon());
		assertEquals(true, result.isCancel());
	}

	/**
	 * Run the ChoiceItem(String,T,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testChoiceItem_6()
		throws Exception {
		String text = "";
		boolean enable = true;

		ChoiceItem result = new ChoiceItem(text, null, enable);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getObject());
		assertEquals(false, result.isDefault());
		assertEquals(true, result.isEnabled());
		assertEquals(false, result.isOK());
		assertEquals(null, result.getIcon());
		assertEquals(true, result.isCancel());
	}

	/**
	 * Run the ChoiceItem<Object> cancelOption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testCancelOption_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		ChoiceItem<Object> result = fixture.cancelOption();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getObject());
		assertEquals(false, result.isDefault());
		assertEquals(true, result.isEnabled());
		assertEquals(false, result.isOK());
		assertEquals(true, result.isCancel());
	}

	/**
	 * Run the int compareTo(ChoiceItem<T>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());
		ChoiceItem<Object> other = new ChoiceItem((String) null, (Object) null, true);

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(1, result);
	}

	
	/**
	 * Run the ChoiceItem<Object> defaultOption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testDefaultOption_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		ChoiceItem<Object> result = fixture.defaultOption();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getObject());
		assertEquals(true, result.isDefault());
		assertEquals(true, result.isEnabled());
		assertEquals(false, result.isOK());
		assertEquals(true, result.isCancel());
	}

	

	/**
	 * Run the ImageIcon getIcon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testGetIcon_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		ImageIcon result = fixture.getIcon();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDescription());
		assertEquals(null, result.getImage());
		assertEquals(-1, result.getIconHeight());
		assertEquals(-1, result.getIconWidth());
		assertEquals(0, result.getImageLoadStatus());
		assertEquals(null, result.getImageObserver());
	}

	/**
	 * Run the Object getObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testGetObject_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		Object result = fixture.getObject();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean isCancel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testIsCancel_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		boolean result = fixture.isCancel();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCancel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testIsCancel_2()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		boolean result = fixture.isCancel();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testIsDefault_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		boolean result = fixture.isDefault();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testIsDefault_2()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		boolean result = fixture.isDefault();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testIsEnabled_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		boolean result = fixture.isEnabled();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testIsEnabled_2()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, false);
		fixture.setIcon(new ImageIcon());

		boolean result = fixture.isEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOK() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testIsOK_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		boolean result = fixture.isOK();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isOK() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testIsOK_2()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		boolean result = fixture.isOK();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the ChoiceItem<Object> okOption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testOkOption_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		ChoiceItem<Object> result = fixture.okOption();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getObject());
		assertEquals(false, result.isDefault());
		assertEquals(true, result.isEnabled());
		assertEquals(true, result.isOK());
		assertEquals(true, result.isCancel());
	}

	/**
	 * Run the ChoiceItem<Object> setIcon(ImageIcon) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testSetIcon_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());
		ImageIcon icon = new ImageIcon();

		ChoiceItem<Object> result = fixture.setIcon(icon);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getObject());
		assertEquals(false, result.isDefault());
		assertEquals(true, result.isEnabled());
		assertEquals(false, result.isOK());
		assertEquals(true, result.isCancel());
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ChoiceItem fixture = new ChoiceItem("", (Object) null, true);
		fixture.setIcon(new ImageIcon());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 6:44 PM
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
	 * @generatedBy CodePro at 5/14/16 6:44 PM
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
	 * @generatedBy CodePro at 5/14/16 6:44 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ChoiceItemTest.class);
	}
}