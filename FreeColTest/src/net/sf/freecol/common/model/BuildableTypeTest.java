package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.ArrayList;
import net.sf.freecol.common.io.FreeColXMLReader;
import java.util.HashMap;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BuildableTypeTest</code> contains tests for the class <code>{@link BuildableType}</code>.
 *
 * @generatedBy CodePro at 5/14/16 9:26 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class BuildableTypeTest {
	/**
	 * Run the StringTemplate getCurrentlyBuildingLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testGetCurrentlyBuildingLabel_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		StringTemplate result = fixture.getCurrentlyBuildingLabel();

		// add additional test code here
		assertNotNull(result);
		assertEquals("TEMPLATE: model.buildableType.currentlyBuilding [[%buildable%: KEY: .name]]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(null, result.getDefaultId());
		assertEquals("stringTemplate", result.getXMLTagName());
		assertEquals("model.buildableType.currentlyBuilding", result.getId());
		assertEquals("currentlyBuilding", result.getSuffix());
		assertEquals("<stringTemplate id=\"model.buildableType.currentlyBuilding\" templateType=\"template\"><key value=\"%buildable%\"></key><stringTemplate id=\".name\" templateType=\"key\"></stringTemplate></stringTemplate>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getFeatureContainer());
		assertEquals("model.buildableType.currentlyBuilding", result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the List<Limit> getLimits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testGetLimits_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		List<Limit> result = fixture.getLimits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<Limit> getLimits() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testGetLimits_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		List<Limit> result = fixture.getLimits();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the java.util.Map<String, Boolean> getRequiredAbilities() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testGetRequiredAbilities_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		java.util.Map<String, Boolean> result = fixture.getRequiredAbilities();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the java.util.Map<String, Boolean> getRequiredAbilities() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testGetRequiredAbilities_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		java.util.Map<String, Boolean> result = fixture.getRequiredAbilities();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getRequiredAmountOf(GoodsType) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testGetRequiredAmountOf_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		GoodsType type = new GoodsType("", new Specification());

		int result = fixture.getRequiredAmountOf(type);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the List<AbstractGoods> getRequiredGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testGetRequiredGoods_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		List<AbstractGoods> result = fixture.getRequiredGoods();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<AbstractGoods> getRequiredGoods() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testGetRequiredGoods_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		List<AbstractGoods> result = fixture.getRequiredGoods();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int getRequiredPopulation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testGetRequiredPopulation_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		int result = fixture.getRequiredPopulation();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isAvailableTo(FreeColObject[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testIsAvailableTo_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		boolean result = fixture.isAvailableTo();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAvailableTo(FreeColObject[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testIsAvailableTo_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		boolean result = fixture.isAvailableTo();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAvailableTo(FreeColObject[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testIsAvailableTo_3()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		boolean result = fixture.isAvailableTo();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean needsGoodsToBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testNeedsGoodsToBuild_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		boolean result = fixture.needsGoodsToBuild();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean needsGoodsToBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testNeedsGoodsToBuild_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());

		boolean result = fixture.needsGoodsToBuild();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:394)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:236)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1119)
		//       at net.sf.freecol.common.model.FreeColSpecObjectType.readAttributes(FreeColSpecObjectType.java:214)
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:284)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:394)
		//       at net.sf.freecol.common.io.FreeColXMLReader.readId(FreeColXMLReader.java:236)
		//       at net.sf.freecol.common.model.FreeColObject.readAttributes(FreeColObject.java:1119)
		//       at net.sf.freecol.common.model.FreeColSpecObjectType.readAttributes(FreeColSpecObjectType.java:214)
		//       at net.sf.freecol.common.model.BuildableType.readAttributes(BuildableType.java:284)
		//       at net.sf.freecol.common.model.BuildingType.readAttributes(BuildingType.java:412)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.BuildingType.readChild(BuildingType.java:484)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.BuildableType.readChildren(BuildableType.java:295)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.BuildableType.readChildren(BuildableType.java:295)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.BuildableType.readChildren(BuildableType.java:295)
	}

	/**
	 * Run the boolean requiresAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testRequiresAbility_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		String key = "";

		boolean result = fixture.requiresAbility(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean requiresAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testRequiresAbility_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		String key = "";

		boolean result = fixture.requiresAbility(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean requiresAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testRequiresAbility_3()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		String key = "";

		boolean result = fixture.requiresAbility(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean requiresAbility(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testRequiresAbility_4()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		String key = "";

		boolean result = fixture.requiresAbility(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setLimits(List<Limit>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testSetLimits_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		List<Limit> newLimits = new ArrayList<Limit>();

		fixture.setLimits(newLimits);

		// add additional test code here
	}

	/**
	 * Run the void setRequiredAbilities(Map<String,Boolean>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testSetRequiredAbilities_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		java.util.Map<String, Boolean> abilities = new HashMap<String, Boolean>();

		fixture.setRequiredAbilities(abilities);

		// add additional test code here
	}

	/**
	 * Run the void setRequiredPopulation(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testSetRequiredPopulation_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		int newPopulation = 1;

		fixture.setRequiredPopulation(newPopulation);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_8()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_9()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_10()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_11()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_12()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_13()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_14()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_15()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	@Test
	public void testWriteChildren_16()
		throws Exception {
		BuildableType fixture = new BuildingType("", new Specification());
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
	 * @generatedBy CodePro at 5/14/16 9:26 PM
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
	 * @generatedBy CodePro at 5/14/16 9:26 PM
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
	 * @generatedBy CodePro at 5/14/16 9:26 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BuildableTypeTest.class);
	}
}