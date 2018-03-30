package Utilities;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	@BeforeSuite
	public void setUp() throws Exception {
		System.out.println("into setUp");
		Driver.initialize();
		System.out.println("done setUp");
	}

	@AfterSuite
	public void cleanUp() {
		System.out.println("into cleanUp");
		Driver.close();
	}
	
}
