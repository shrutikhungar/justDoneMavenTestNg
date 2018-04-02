package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Configuration;

public class HomePage {
	/*all objects belonging to Home page*/
	WebDriver driver=Configuration.driver;
	By loginLink=By.xpath("//label[@for='c1']");
	
	public void clickLink(){
		driver.findElement(loginLink).click();
	}
	
}