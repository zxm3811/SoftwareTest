package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import commons.MyArrayUtils;
import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ MyArrayUtilsTest.class })
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("All JUnit test");
		suite.addTest(new JUnit4TestAdapter(MyArrayUtils.class));
		return suite;
	}
}
