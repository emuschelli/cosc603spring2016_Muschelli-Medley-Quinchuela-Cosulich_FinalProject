package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.xml.stream.XMLStreamException;
import net.sf.freecol.common.io.FreeColXMLReader;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NationOptionsTest</code> contains tests for the class <code>{@link NationOptions}</code>.
 *
 * @generatedBy CodePro at 5/14/16 8:53 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class NationOptionsTest {
	/**
	 * Run the NationOptions(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_1()
		throws Exception {
		Specification specification = new Specification();

		NationOptions result = new NationOptions(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nationalAdvantages: SELECTABLE\n", result.toString());
		assertEquals("nationOptions", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<nationOptions nationalAdvantages=\"selectable\"></nationOptions>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationOptions(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_2()
		throws Exception {
		Specification specification = new Specification();

		NationOptions result = new NationOptions(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nationalAdvantages: SELECTABLE\n", result.toString());
		assertEquals("nationOptions", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<nationOptions nationalAdvantages=\"selectable\"></nationOptions>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationOptions(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_3()
		throws Exception {
		Specification specification = new Specification();

		NationOptions result = new NationOptions(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nationalAdvantages: SELECTABLE\n", result.toString());
		assertEquals("nationOptions", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<nationOptions nationalAdvantages=\"selectable\"></nationOptions>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationOptions(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_4()
		throws Exception {
		Specification specification = new Specification();

		NationOptions result = new NationOptions(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nationalAdvantages: SELECTABLE\n", result.toString());
		assertEquals("nationOptions", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<nationOptions nationalAdvantages=\"selectable\"></nationOptions>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationOptions(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_5()
		throws Exception {
		Specification specification = new Specification();

		NationOptions result = new NationOptions(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nationalAdvantages: SELECTABLE\n", result.toString());
		assertEquals("nationOptions", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<nationOptions nationalAdvantages=\"selectable\"></nationOptions>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationOptions(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_6()
		throws Exception {
		Specification specification = new Specification();

		NationOptions result = new NationOptions(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nationalAdvantages: SELECTABLE\n", result.toString());
		assertEquals("nationOptions", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<nationOptions nationalAdvantages=\"selectable\"></nationOptions>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationOptions(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_7()
		throws Exception {
		Specification specification = new Specification();

		NationOptions result = new NationOptions(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nationalAdvantages: SELECTABLE\n", result.toString());
		assertEquals("nationOptions", result.getXMLTagName());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<nationOptions nationalAdvantages=\"selectable\"></nationOptions>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationOptions(Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_8()
		throws Exception {
		Specification specification = null;

		NationOptions result = new NationOptions(specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals("nationalAdvantages: SELECTABLE\n", result.toString());
		assertEquals("nationOptions", result.getXMLTagName());
		assertEquals(null, result.getSpecification());
		assertEquals(null, result.getId());
		assertEquals(null, result.getSuffix());
		assertEquals("<nationOptions nationalAdvantages=\"selectable\"></nationOptions>", result.serialize());
		assertEquals(null, result.getGame());
		assertEquals(null, result.getFeatureContainer());
		assertEquals(null, result.getIdType());
		assertEquals(-1, result.getIdNumber());
	}

	/**
	 * Run the NationOptions(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_9()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));
		Specification specification = new Specification();

		NationOptions result = new NationOptions(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1099)
		//       at net.sf.freecol.common.model.NationOptions.<init>(NationOptions.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the NationOptions(FreeColXMLReader,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testNationOptions_10()
		throws Exception {
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));
		Specification specification = new Specification();

		NationOptions result = new NationOptions(xr, specification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.hasAttribute(FreeColXMLReader.java:306)
		//       at net.sf.freecol.common.model.FreeColObject.readFromXML(FreeColObject.java:1099)
		//       at net.sf.freecol.common.model.NationOptions.<init>(NationOptions.java:154)
		assertNotNull(result);
	}

	/**
	 * Run the NationOptions.NationState getNationState(Nation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testGetNationState_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		Nation nation = new Nation("", new Specification());

		NationOptions.NationState result = fixture.getNationState(nation);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the NationOptions.Advantages getNationalAdvantages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testGetNationalAdvantages_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());

		NationOptions.Advantages result = fixture.getNationalAdvantages();

		// add additional test code here
		assertNotNull(result);
		assertEquals("model.advantages.selectable.name", result.getNameKey());
		assertEquals("model.advantages.selectable.shortDescription", result.getShortDescriptionKey());
		assertEquals("SELECTABLE", result.name());
		assertEquals("SELECTABLE", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the java.util.Map<Nation, NationOptions.NationState> getNations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testGetNations_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());

		java.util.Map<Nation, NationOptions.NationState> result = fixture.getNations();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = NationOptions.getTagName();

		// add additional test code here
		assertEquals("nationOptions", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("nationOptions", result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readAttributes(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Current state is not among the states START_ELEMENT , ATTRIBUTEvalid for getAttributeValue()
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getAttributeValue(Unknown Source)
		//       at net.sf.freecol.common.io.FreeColXMLReader.getAttribute(FreeColXMLReader.java:412)
		//       at net.sf.freecol.common.model.NationOptions.readAttributes(NationOptions.java:247)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_2()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_3()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_4()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_5()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_6()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_7()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_8()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_9()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_10()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_11()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_12()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_13()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChild(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChild_14()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChild(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.NationOptions.readChild(NationOptions.java:285)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChildren_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1130)
		//       at net.sf.freecol.common.model.NationOptions.readChildren(NationOptions.java:259)
	}

	/**
	 * Run the void readChildren(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testReadChildren_2()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLReader xr = new FreeColXMLReader(new BufferedInputStream(new ByteArrayInputStream("".getBytes())));

		fixture.readChildren(xr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: Method getLocalName() cannot be called for START_DOCUMENT event.
		//       at com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl.getLocalName(Unknown Source)
		//       at javax.xml.stream.util.StreamReaderDelegate.getLocalName(Unknown Source)
		//       at net.sf.freecol.common.model.FreeColObject.readChildren(FreeColObject.java:1130)
		//       at net.sf.freecol.common.model.NationOptions.readChildren(NationOptions.java:259)
	}

	/**
	 * Run the void setNationState(Nation,NationState) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testSetNationState_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		Nation nation = new Nation("", new Specification());
		NationOptions.NationState state = NationOptions.NationState.AI_ONLY;

		fixture.setNationState(nation, state);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("nationalAdvantages: SELECTABLE\n", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());

		String result = fixture.toString();

		// add additional test code here
		assertEquals("nationalAdvantages: SELECTABLE\n", result);
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testWriteChildren_1()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testWriteChildren_2()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testWriteChildren_3()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testWriteChildren_4()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testWriteChildren_5()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testWriteChildren_6()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeChildren(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeChildren(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	@Test
	public void testWriteChildren_7()
		throws Exception {
		NationOptions fixture = new NationOptions(new Specification());
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
	 * @generatedBy CodePro at 5/14/16 8:53 PM
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
	 * @generatedBy CodePro at 5/14/16 8:53 PM
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
	 * @generatedBy CodePro at 5/14/16 8:53 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NationOptionsTest.class);
	}
}