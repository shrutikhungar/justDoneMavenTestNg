package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.Configuration;

public class loginPage {
	WebDriver driver=Configuration.driver;
	
	By userName=By.id("email");
	By password=By.xpath("//input[@id='password']");
	By loginButton=By.xpath("//button[@class='btn btn-primary btn-block enter-btn']"); 
	
	public void typeUserName(String userId) {
		driver.findElement(userName).sendKeys(userId);
	}
	public void typePassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);	
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
}
