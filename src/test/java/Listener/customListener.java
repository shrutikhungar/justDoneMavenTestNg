package Listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Utilities.screenshots;
import config.Configuration;
import Utilities.Driver;

public class customListener implements ITestListener {
String status;	
String testCaseName;

	public void onTestSuccess(ITestResult result) {
		testCaseName=result.getName();
		System.out.println("Test Case passed and details are: "+testCaseName);
		status="Passed";
		try {
			Utilities.screenshots.screenshotFn(testCaseName, status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestStart(ITestResult result) {
		testCaseName=result.getName();
		System.out.println("Test Case started and details are: "+testCaseName);
		status="Started";
	}

	public void onTestFailure(ITestResult result) {
		testCaseName=result.getName();
		System.out.println("Test Case failed and details are: "+testCaseName);
		status="Failed";
		try {
			Utilities.screenshots.screenshotFn(testCaseName, status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
