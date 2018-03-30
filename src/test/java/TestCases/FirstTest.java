package TestCases;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import PageObject.HomePage;
import Utilities.Driver;
import config.Configuration;
import config.Configuration.url;
import PageObject.HomePage;


public class FirstTest {
	
	@Test	
	public void test1() throws InterruptedException {
		try {
		HomePage homePageObj=new HomePage();
		System.out.println("into test1 and url is: "+Configuration.url.app_url);
		System.out.println("into test1 and driver is: "+Configuration.driver);
		Configuration.driver.navigate().to(Configuration.url.app_url);
		homePageObj.clickLink();
		System.out.println("done test1");
		Assert.assertEquals("Hi","H");
		}catch(Exception e) {
			System.out.println("Exception in test1 is: "+e);
			
		}
	}

}
