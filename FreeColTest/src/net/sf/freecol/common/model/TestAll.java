package net.sf.freecol.common.model;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/15/16 6:13 AM
 * @author emusc_000
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	OperandTest.class,
	StanceTest.class,
	BuildableTypeTest.class,
	NationTypeTest.class,
	DisasterTest.class,
	AbstractUnitTest.class,
	AbstractGoodsTest.class,
	TensionTest.class,
	GoldTradeItemTest.class,
	ResourceTypeTest.class,
	NationOptionsTest.class,
	NationSummaryTest.class,
	TileItemTest.class,
	IndianNationTypeTest.class,
	EuropeWasTest.class,
	LimitTest.class,
	NationTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/15/16 6:13 AM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
