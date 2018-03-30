package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.loginPage;
import config.Configuration;

public class SecondTest {
	String loginPageLabel;
	
	@Test
	public void testSecond() {
		loginPage loginPageObj=new loginPage();
		System.out.println("into testSecond and driver is: "+Configuration.driver);
		//loginPageLabel=Configuration.driver.driver.findElement(By.xpath("//h3[@class='card-title text-left mb-3']")).getAttribute("value");
		
		loginPageObj.typeUserName("shrutikhungar@gmail.com");
		loginPageObj.typePassword("infyinfy");
		loginPageObj.clickLoginButton();
		
		System.out.println("end testSecond");
	}
}
