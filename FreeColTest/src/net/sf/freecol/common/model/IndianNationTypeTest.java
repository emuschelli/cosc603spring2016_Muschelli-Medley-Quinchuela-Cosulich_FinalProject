package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import net.sf.freecol.common.io.FreeColXMLReader;
import net.sf.freecol.common.util.RandomChoice;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>IndianNationTypeTest</code> contains tests for the class <code>{@link IndianNationType}</code>.
 *
 * @generatedBy CodePro at 5/14/16 9:16 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class IndianNationTypeTest {
	/**
	 * Run the IndianNationType(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testIndianNationType_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		IndianNationType result = new IndianNationType(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isEuropean());
		assertEquals(false, result.isREF());
		assertEquals(true, result.isIndian());
		assertEquals("indian-nation-type", result.getXMLTagName());
		assertEquals(null, result.getCapitalType());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<indian-nation-type id=\"\" number-of-settlements=\"average\" aggression=\"average\"></indian-nation-type>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<RandomChoice<UnitType>> generateSkillsForTile(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGenerateSkillsForTile_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		Tile tile = new Tile(new Game(), "");

		List<RandomChoice<UnitType>> result = fixture.generateSkillsForTile(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<UnitType>> generateSkillsForTile(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGenerateSkillsForTile_2()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		Tile tile = new Tile(new Game(), "");

		List<RandomChoice<UnitType>> result = fixture.generateSkillsForTile(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<UnitType>> generateSkillsForTile(Tile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGenerateSkillsForTile_3()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		Tile tile = new Tile(new Game(), "");

		List<RandomChoice<UnitType>> result = fixture.generateSkillsForTile(tile);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Null/empty id.
		//       at net.sf.freecol.common.model.Game.setFreeColGameObject(Game.java:350)
		//       at net.sf.freecol.common.model.FreeColGameObject.internId(FreeColGameObject.java:134)
		//       at net.sf.freecol.common.model.FreeColGameObject.<init>(FreeColGameObject.java:90)
		//       at net.sf.freecol.common.model.UnitLocation.<init>(UnitLocation.java:149)
		//       at net.sf.freecol.common.model.Tile.<init>(Tile.java:251)
		assertNotNull(result);
	}

	/**
	 * Run the List<String> getRegionNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGetRegionNames_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());

		List<String> result = fixture.getRegionNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<String> getRegionNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGetRegionNames_2()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());

		List<String> result = fixture.getRegionNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getSettlementTypeKey(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGetSettlementTypeKey_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		boolean plural = false;

		String result = fixture.getSettlementTypeKey(plural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.IndianNationType.getSettlementTypeKey(IndianNationType.java:97)
		assertNotNull(result);
	}

	/**
	 * Run the String getSettlementTypeKey(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGetSettlementTypeKey_2()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		boolean plural = true;

		String result = fixture.getSettlementTypeKey(plural);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.freecol.common.model.IndianNationType.getSettlementTypeKey(IndianNationType.java:97)
		assertNotNull(result);
	}

	/**
	 * Run the List<RandomChoice<UnitType>> getSkills() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGetSkills_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());

		List<RandomChoice<UnitType>> result = fixture.getSkills();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<RandomChoice<UnitType>> getSkills() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGetSkills_2()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());

		List<RandomChoice<UnitType>> result = fixture.getSkills();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = IndianNationType.getTagName();

		// add additional test code here
		assertEquals("indian-nation-type", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("indian-nation-type", result);
	}

	/**
	 * Run the boolean isEuropean() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testIsEuropean_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());

		boolean result = fixture.isEuropean();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isIndian() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testIsIndian_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());

		boolean result = fixture.isIndian();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isREF() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testIsREF_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());

		boolean result = fixture.isREF();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.IndianNationType.readChild(IndianNationType.java:272)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.IndianNationType.readChild(IndianNationType.java:272)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.IndianNationType.readChild(IndianNationType.java:272)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.IndianNationType.readChild(IndianNationType.java:272)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.IndianNationType.readChild(IndianNationType.java:272)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.IndianNationType.readChild(IndianNationType.java:272)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_6()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_7()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_8()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_9()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_10()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_11()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_12()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_13()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_14()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testReadChildren_15()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.IndianNationType.readChildren(IndianNationType.java:243)
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_9()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_10()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_11()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	@Test
	public void testWriteChildren_12()
		throws Exception {
		IndianNationType fixture = new IndianNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/14/16 9:16 PM
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
	 * @generatedBy CodePro at 5/14/16 9:16 PM
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
	 * @generatedBy CodePro at 5/14/16 9:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(IndianNationTypeTest.class);
	}
}