package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NationTypeTest</code> contains tests for the class <code>{@link NationType}</code>.
 *
 * @generatedBy CodePro at 5/14/16 8:56 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class NationTypeTest {
	/**
	 * Run the NationType.AggressionLevel getAggression() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testGetAggression_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());

		NationType.AggressionLevel result = fixture.getAggression();

		// add additional test code here
		assertNotNull(result);
		assertEquals("aggressionLevel.average", result.getKey());
		assertEquals("AVERAGE", result.name());
		assertEquals("AVERAGE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the SettlementType getCapitalType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testGetCapitalType_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());

		SettlementType result = fixture.getCapitalType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the NationType.SettlementNumber getNumberOfSettlements() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testGetNumberOfSettlements_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());

		NationType.SettlementNumber result = fixture.getNumberOfSettlements();

		// add additional test code here
		assertNotNull(result);
		assertEquals("settlementNumber.average", result.getKey());
		assertEquals("AVERAGE", result.name());
		assertEquals("AVERAGE", result.toString());
		assertEquals(1, result.ordinal());
	}

	/**
	 * Run the SettlementType getSettlementType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testGetSettlementType_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		String id = "";

		SettlementType result = fixture.getSettlementType(id);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the SettlementType getSettlementType(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testGetSettlementType_2()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		boolean isCapital = true;

		SettlementType result = fixture.getSettlementType(isCapital);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List<SettlementType> getSettlementTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testGetSettlementTypes_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());

		List<SettlementType> result = fixture.getSettlementTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the List<SettlementType> getSettlementTypes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testGetSettlementTypes_2()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());

		List<SettlementType> result = fixture.getSettlementTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
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
		//       at net.sf.freecol.common.model.NationType.readAttributes(NationType.java:223)
		//       at net.sf.freecol.common.model.EuropeanNationType.readAttributes(EuropeanNationType.java:204)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
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
		//       at net.sf.freecol.common.model.NationType.readAttributes(NationType.java:223)
		//       at net.sf.freecol.common.model.EuropeanNationType.readAttributes(EuropeanNationType.java:204)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChild(EuropeanNationType.java:242)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChild(EuropeanNationType.java:242)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChild(EuropeanNationType.java:242)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChild(EuropeanNationType.java:242)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_3()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_4()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_5()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_6()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_7()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_8()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_9()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_10()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testReadChildren_11()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.io.FreeColXMLReader.shouldClearContainers(FreeColXMLReader.java:850)
		//       at net.sf.freecol.common.model.EuropeanNationType.readChildren(EuropeanNationType.java:220)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		NationType fixture = new EuropeanNationType("", new Specification());
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
	 * @generatedBy CodePro at 5/14/16 8:56 PM
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
	 * @generatedBy CodePro at 5/14/16 8:56 PM
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
	 * @generatedBy CodePro at 5/14/16 8:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NationTypeTest.class);
	}
}