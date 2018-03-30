package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.Configuration;


public class Driver {
	
	public static void initialize() throws Exception {
		System.out.println("initializing driver");
		if (Configuration.browser.browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Shruti\\Study\\Selenium\\Selenium Downloads\\Driver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			Configuration.driver=new FirefoxDriver();
			Thread.sleep(2000);
		}
	}
	
	public static void close(){
		System.out.println("closing driver");
		Configuration.driver.close();
	}
}
