package net.sf.freecol.common.model;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import net.sf.freecol.common.io.FreeColXMLWriter;
import javax.xml.stream.XMLStreamException;
import org.junit.*;
import net.sf.freecol.common.io.FreeColXMLReader;
import static org.junit.Assert.*;

/**
 * The class <code>ResourceTypeTest</code> contains tests for the class <code>{@link ResourceType}</code>.
 *
 * @generatedBy CodePro at 5/14/16 9:42 PM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
public class ResourceTypeTest {
	/**
	 * Run the ResourceType(String,Specification) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test
	public void testResourceType_1()
		throws Exception {
		String id = "";
		Specification specification = new Specification();

		ResourceType result = new ResourceType(id, specification);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getMaxValue());
		assertEquals(0, result.getMinValue());
		assertEquals("resource-type", result.getXMLTagName());
		assertEquals(null, result.getBestGoodsType());
		assertEquals("", result.toString());
		assertEquals(".description", result.getDescriptionKey());
		assertEquals(".name", result.getNameKey());
		assertEquals(false, result.isAbstractType());
		assertEquals("", result.getId());
		assertEquals("", result.getSuffix());
		assertEquals("<resource-type id=\"\" maximum-value=\"0\" minimum-value=\"0\"></resource-type>", result.serialize());
		assertEquals("", result.getIdType());
		assertEquals(-1, result.getIdNumber());
		assertEquals(null, result.getGame());
	}

	/**
	 * Run the GoodsType getBestGoodsType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test
	public void testGetBestGoodsType_1()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());

		GoodsType result = fixture.getBestGoodsType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the GoodsType getBestGoodsType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test
	public void testGetBestGoodsType_2()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());

		GoodsType result = fixture.getBestGoodsType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getMaxValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test
	public void testGetMaxValue_1()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());

		int result = fixture.getMaxValue();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getMinValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test
	public void testGetMinValue_1()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());

		int result = fixture.getMinValue();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test
	public void testGetTagName_1()
		throws Exception {

		String result = ResourceType.getTagName();

		// add additional test code here
		assertEquals("resource-type", result);
	}

	/**
	 * Run the String getXMLTagName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test
	public void testGetXMLTagName_1()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());

		String result = fixture.getXMLTagName();

		// add additional test code here
		assertEquals("resource-type", result);
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test
	public void testReadAttributes_1()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());
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
		//       at net.sf.freecol.common.model.ResourceType.readAttributes(ResourceType.java:111)
	}

	/**
	 * Run the void readAttributes(FreeColXMLReader) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test
	public void testReadAttributes_2()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());
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
		//       at net.sf.freecol.common.model.ResourceType.readAttributes(ResourceType.java:111)
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_1()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_2()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_3()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_4()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());
		FreeColXMLWriter xw = new FreeColXMLWriter(new StringWriter(), net.sf.freecol.common.io.FreeColXMLWriter.WriteScope.CLIENT);

		fixture.writeAttributes(xw);

		// add additional test code here
	}

	/**
	 * Run the void writeAttributes(FreeColXMLWriter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	@Test(expected = javax.xml.stream.XMLStreamException.class)
	public void testWriteAttributes_5()
		throws Exception {
		ResourceType fixture = new ResourceType("", new Specification());
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
	 * @generatedBy CodePro at 5/14/16 9:42 PM
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
	 * @generatedBy CodePro at 5/14/16 9:42 PM
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
	 * @generatedBy CodePro at 5/14/16 9:42 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResourceTypeTest.class);
	}
}