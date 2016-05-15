package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>NationSummaryTest</code> contains tests for the class <code>{@link NationSummary}</code>.
 *
 * @generatedBy CodePro at 5/14/16 8:55 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class NationSummaryTest {
	/**
	 * Run the NationSummary() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testNationSummary_1()
		throws Exception {

		NationSummary result = new NationSummary();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getNavalStrength());
		assertEquals(null, result.getStance());
		assertEquals(0, result.getNumberOfUnits());
		assertEquals("nationSummary", result.getXMLTagName());
		assertEquals(0, result.getSoL());
		assertEquals(0, result.getGold());
		assertEquals(0, result.getTax());
		assertEquals(0, result.getNumberOfSettlements());
		assertEquals(0, result.getMilitaryStrength());
		assertEquals(0, result.getFoundingFathers());
		assertEquals("net.sf.freecol.common.model.NationSummary:", result.toString());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testNationSummary_2()
		throws Exception {
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.addSettlement(new Colony(new Game(), ""));
		Player requester = new Player(new Game(), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

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
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testNationSummary_3()
		throws Exception {
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.addSettlement(new Colony(new Game(), ""));
		Player requester = new Player(new Game(), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

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
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testNationSummary_4()
		throws Exception {
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.setGold(1);
		player.addSettlement(new Colony(new Game(), ""));
		Player requester = new Player(new Game(), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

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
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testNationSummary_5()
		throws Exception {
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.setGold(1);
		player.addSettlement(new Colony(new Game(), ""));
		Player requester = new Player(new Game(), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

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
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testNationSummary_6()
		throws Exception {
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.setTax(1);
		player.setGold(1);
		player.addSettlement(new Colony(new Game(), ""));
		Player requester = new Player(new Game(), new IIOMetadataNode());
		requester.setTax(1);
		requester.setGold(1);
		requester.addSettlement(new Colony(new Game(), ""));

		NationSummary result = new NationSummary(player, requester);

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
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testNationSummary_7()
		throws Exception {
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.setTax(1);
		player.setGold(1);
		player.addSettlement(new Colony(new Game(), ""));
		Player requester = new Player(new Game(), new IIOMetadataNode());
		requester.setTax(1);
		requester.setGold(1);
		requester.addSettlement(new Colony(new Game(), ""));

		NationSummary result = new NationSummary(player, requester);

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
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testNationSummary_8()
		throws Exception {
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.setTax(1);
		player.setGold(1);
		player.addSettlement(new Colony(new Game(), ""));
		Player requester = new Player(new Game(), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

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
	 * Run the NationSummary(Player,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testNationSummary_9()
		throws Exception {
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.setTax(1);
		player.setGold(1);
		player.addSettlement(new Colony(new Game(), ""));
		Player requester = new Player(new Game(), new IIOMetadataNode());

		NationSummary result = new NationSummary(player, requester);

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
	 * Run the int getFoundingFathers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetFoundingFathers_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		int result = fixture.getFoundingFathers();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getGold() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetGold_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		int result = fixture.getGold();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getMilitaryStrength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetMilitaryStrength_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		int result = fixture.getMilitaryStrength();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getNavalStrength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetNavalStrength_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		int result = fixture.getNavalStrength();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumberOfSettlements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetNumberOfSettlements_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		int result = fixture.getNumberOfSettlements();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getNumberOfUnits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetNumberOfUnits_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		int result = fixture.getNumberOfUnits();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getSoL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetSoL_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		int result = fixture.getSoL();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Stance getStance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetStance_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		Stance result = fixture.getStance();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = NationSummary.getTagName();

		// add additional test code here
		assertEquals("nationSummary", result);
	}

	/**
	 * Run the int getTax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetTax_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		int result = fixture.getTax();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		NationSummary fixture = new NationSummary();

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("nationSummary", result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:394)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:236)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1119)
		//       at net.sf.freecol.common.model.NationSummary.readAttributes(NationSummary.java:191)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:394)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:236)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1119)
		//       at net.sf.freecol.common.model.NationSummary.readAttributes(NationSummary.java:191)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_7()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_8()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_9()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_10()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_11()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_12()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_13()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_14()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_15()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_16()
		throws Exception {
		NationSummary fixture = new NationSummary();
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 8:55 PM
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
	 * @generatedBy CodePro at 5/14/16 8:55 PM
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
	 * @generatedBy CodePro at 5/14/16 8:55 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NationSummaryTest.class);
	}
}