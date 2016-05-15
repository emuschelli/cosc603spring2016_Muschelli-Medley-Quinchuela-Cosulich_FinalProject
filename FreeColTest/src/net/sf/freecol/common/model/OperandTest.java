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
 * The class <code>OperandTest</code> contains tests for the class <code>{@link Operand}</code>.
 *
 * @generatedBy CodePro at 5/14/16 9:00 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class OperandTest {
	/**
	 * Run the Operand() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testOperand_1()
		throws Exception {

		Operand result = new Operand();

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Operand type=NONE scopeLevel=NONE null matches-null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getType());
		assertEquals(null, result.getMethodName());
		assertEquals(null, result.getMethodValue());
		assertEquals(null, result.getAbilityId());
		assertEquals(false, result.isMatchNegated());
		assertEquals(true, result.getAbilityValue());
		assertEquals(true, result.isMatchesNull());
		assertEquals("scope", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<scope match-negated=\"false\" matches-null=\"true\" operand-type=\"none\" scope-level=\"none\"></scope>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the Operand(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testOperand_2()
		throws Exception {
		int value = 1;

		Operand result = new Operand(value);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals(new Integer(1), result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getType());
		assertEquals(null, result.getMethodName());
		assertEquals(null, result.getMethodValue());
		assertEquals(null, result.getAbilityId());
		assertEquals(false, result.isMatchNegated());
		assertEquals(true, result.getAbilityValue());
		assertEquals(true, result.isMatchesNull());
		assertEquals("scope", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<scope match-negated=\"false\" matches-null=\"true\" operand-type=\"none\" scope-level=\"none\" value=\"1\"></scope>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the Operand(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testOperand_3()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		Operand result = new Operand(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1099)
		//       at net.sf.freecol.common.model.Operand.<init>(Operand.java:103)
		assertNotNull(result);
	}

	/**
	 * Run the Operand(FreeColXMLReader) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testOperand_4()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		Operand result = new Operand(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1099)
		//       at net.sf.freecol.common.model.Operand.<init>(Operand.java:103)
		assertNotNull(result);
	}

	/**
	 * Run the Operand(OperandType,ScopeLevel) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testOperand_5()
		throws Exception {
		Operand.OperandType operandType = Operand.OperandType.BUILDINGS;
		Operand.ScopeLevel scopeLevel = Operand.ScopeLevel.GAME;

		Operand result = new Operand(operandType, scopeLevel);

		// add additional test code here
		assertNotNull(result);
		assertEquals("[Operand type=BUILDINGS scopeLevel=GAME null matches-null]", result.toString());
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.getType());
		assertEquals(null, result.getMethodName());
		assertEquals(null, result.getMethodValue());
		assertEquals(null, result.getAbilityId());
		assertEquals(false, result.isMatchNegated());
		assertEquals(true, result.getAbilityValue());
		assertEquals(true, result.isMatchesNull());
		assertEquals("scope", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<scope match-negated=\"false\" matches-null=\"true\" operand-type=\"buildings\" scope-level=\"game\"></scope>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Operand o = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		o.setValue(new Integer(1));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Operand o = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		o.setValue(new Integer(1));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Object o = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Object o = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Operand o = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		o.setValue(new Integer(1));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Operand o = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		o.setValue(new Integer(1));

		boolean result = fixture.equals(o);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Operand.OperandType getOperandType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetOperandType_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));

		Operand.OperandType result = fixture.getOperandType();

		// add additional test code here
		assertNotNull(result);
		assertEquals("BUILDINGS", result.name());
		assertEquals("BUILDINGS", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the Operand.ScopeLevel getScopeLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetScopeLevel_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));

		Operand.ScopeLevel result = fixture.getScopeLevel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("GAME", result.name());
		assertEquals("GAME", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Integer getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));

		Integer result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getValue(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_2()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Game game = new Game();

		Integer result = fixture.getValue(game);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getValue(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_3()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Game game = new Game();

		Integer result = fixture.getValue(game);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getValue(Game) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_4()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Game game = new Game();

		Integer result = fixture.getValue(game);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getValue(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_5()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Player player = new Player(new Game(), new IIOMetadataNode());

		Integer result = fixture.getValue(player);

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
	 * Run the Integer getValue(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_6()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Player player = new Player(new Game(), new IIOMetadataNode());

		Integer result = fixture.getValue(player);

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
	 * Run the Integer getValue(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_7()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Player player = new Player(new Game(), new IIOMetadataNode());

		Integer result = fixture.getValue(player);

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
	 * Run the Integer getValue(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_8()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Player player = new Player(new Game(), new IIOMetadataNode());

		Integer result = fixture.getValue(player);

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
	 * Run the Integer getValue(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_9()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Player player = new Player(new Game(), new IIOMetadataNode());

		Integer result = fixture.getValue(player);

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
	 * Run the Integer getValue(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_10()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.addSettlement(new Colony(new Game(), ""));

		Integer result = fixture.getValue(player);

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
	 * Run the Integer getValue(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_11()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.addSettlement(new Colony(new Game(), ""));

		Integer result = fixture.getValue(player);

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
	 * Run the Integer getValue(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_12()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Player player = new Player(new Game(), new IIOMetadataNode());
		player.addFather(new FoundingFather("", new Specification()));

		Integer result = fixture.getValue(player);

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
	 * Run the Integer getValue(Player) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_13()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Player player = new Player(new Game(), new IIOMetadataNode());

		Integer result = fixture.getValue(player);

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
	 * Run the Integer getValue(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_14()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Settlement settlement = new Colony(new Game(), "");

		Integer result = fixture.getValue(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getValue(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_15()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Settlement settlement = new Colony(new Game(), "");

		Integer result = fixture.getValue(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getValue(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_16()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Settlement settlement = new Colony(new Game(), "");

		Integer result = fixture.getValue(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getValue(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_17()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Settlement settlement = new Colony(new Game(), "");

		Integer result = fixture.getValue(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getValue(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_18()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Settlement settlement = new Colony(new Game(), "");

		Integer result = fixture.getValue(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the Integer getValue(Settlement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testGetValue_19()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
		Settlement settlement = new Colony(new Game(), "");

		Integer result = fixture.getValue(settlement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.GoodsLocation.<init>(GoodsLocation.java:66)
		//       at net.sf.freecol.common.model.Settlement.<init>(Settlement.java:96)
		//       at net.sf.freecol.common.model.Colony.<init>(Colony.java:171)
		assertNotNull(result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
		//       at net.sf.freecol.common.model.Operand.readAttributes(Operand.java:341)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
		//       at net.sf.freecol.common.model.Operand.readAttributes(Operand.java:341)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testReadAttributes_3()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
		//       at net.sf.freecol.common.model.Operand.readAttributes(Operand.java:341)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testReadAttributes_4()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
		//       at net.sf.freecol.common.model.Operand.readAttributes(Operand.java:341)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testReadAttributes_5()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
		//       at net.sf.freecol.common.model.Operand.readAttributes(Operand.java:341)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testReadAttributes_6()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
		//       at net.sf.freecol.common.model.Operand.readAttributes(Operand.java:341)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testReadAttributes_7()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
		//       at net.sf.freecol.common.model.Operand.readAttributes(Operand.java:341)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testReadAttributes_8()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
		//       at net.sf.freecol.common.model.Operand.readAttributes(Operand.java:341)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testReadAttributes_9()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.Scope.readAttributes(Scope.java:342)
		//       at net.sf.freecol.common.model.Operand.readAttributes(Operand.java:341)
	}

	/**
	 * Run the void setOperandType(OperandType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testSetOperandType_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Operand.OperandType newOperandType = Operand.OperandType.BUILDINGS;

		fixture.setOperandType(newOperandType);

		// add additional test code here
	}

	/**
	 * Run the void setScopeLevel(ScopeLevel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testSetScopeLevel_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Operand.ScopeLevel newScopeLevel = Operand.ScopeLevel.GAME;

		fixture.setScopeLevel(newScopeLevel);

		// add additional test code here
	}

	/**
	 * Run the void setValue(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		Integer newValue = new Integer(1);

		fixture.setValue(newValue);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));

		String result = fixture.toString();

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("[Operand type=BUILDINGS scopeLevel=GAME null matches-null]", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue(new Integer(1));
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_6()
		throws Exception {
		Operand fixture = new Operand(Operand.OperandType.BUILDINGS, Operand.ScopeLevel.GAME);
		fixture.setValue((Integer) null);
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
	 * @generatedBy CodePro at 5/14/16 9:00 PM
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
	 * @generatedBy CodePro at 5/14/16 9:00 PM
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
	 * @generatedBy CodePro at 5/14/16 9:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OperandTest.class);
	}
}