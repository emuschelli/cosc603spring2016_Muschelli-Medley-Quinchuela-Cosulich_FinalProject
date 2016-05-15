package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>GoldTradeItemTest</code> contains tests for the class <code>{@link GoldTradeItem}</code>.
 *
 * @generatedBy CodePro at 5/14/16 9:46 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class GoldTradeItemTest {
	/**
	 * Run the GoldTradeItem(Game,FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testGoldTradeItem_1()
		throws Exception {
		Game game = new Game();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		GoldTradeItem result = new GoldTradeItem(game, xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1099)
		//       at net.sf.freecol.common.model.FreeColGameObject.readFromXML(FreeColGameObject.java:336)
		//       at net.sf.freecol.common.model.TradeItem.<init>(TradeItem.java:67)
		//       at net.sf.freecol.common.model.GoldTradeItem.<init>(GoldTradeItem.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the GoldTradeItem(Game,Player,Player,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testGoldTradeItem_2()
		throws Exception {
		Game game = new Game();
		Player source = new Player(new Game(), new IIOMetadataNode());
		Player destination = new Player(new Game(), new IIOMetadataNode());
		int gold = 1;

		GoldTradeItem result = new GoldTradeItem(game, source, destination, gold);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		Object other = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		Object other = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		Object other = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		Object other = new Object();

		boolean result = fixture.equals(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertTrue(result);
	}

	/**
	 * Run the int evaluateFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testEvaluateFor_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		Player player = new Player(new Game(), new IIOMetadataNode());

		int result = fixture.evaluateFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertEquals(0, result);
	}

	/**
	 * Run the int evaluateFor(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testEvaluateFor_2()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		Player player = new Player(new Game(), new IIOMetadataNode());

		int result = fixture.evaluateFor(player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertEquals(0, result);
	}

	/**
	 * Run the int getGold() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testGetGold_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;

		int result = fixture.getGold();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertEquals(0, result);
	}

	/**
	 * Run the StringTemplate getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;

		StringTemplate result = fixture.getLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertNotNull(result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = GoldTradeItem.getTagName();

		// add additional test code here
		assertEquals("goldTradeItem", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;

		String result = fixture.getXMLTagName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;

		int result = fixture.hashCode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isUnique() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testIsUnique_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;

		boolean result = fixture.isUnique();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), -1);
		fixture.initialized = true;

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testIsValid_3()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;

		boolean result = fixture.isValid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertTrue(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
	}

	/**
	 * Run the void setGold(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testSetGold_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		int gold = 1;

		fixture.setGold(gold);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
		assertNotNull(result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testWriteAttributes_1()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testWriteAttributes_2()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	@Test
	public void testWriteAttributes_3()
		throws Exception {
		GoldTradeItem fixture = new GoldTradeItem(new Game(), new Player(new Game(), new IIOMetadataNode()), new Player(new Game(), new IIOMetadataNode()), 1);
		fixture.initialized = true;
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: Reader creation failure
		//       at net.sf.freecol.common.networking.DOMMessage.makeElementReader(DOMMessage.java:802)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:817)
		//       at net.sf.freecol.common.networking.DOMMessage.readFromXMLElement(DOMMessage.java:778)
		//       at net.sf.freecol.common.model.Player.<init>(Player.java:450)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 9:46 PM
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
	 * @generatedBy CodePro at 5/14/16 9:46 PM
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
	 * @generatedBy CodePro at 5/14/16 9:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(GoldTradeItemTest.class);
	}
}