package Utilities;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import config.Configuration;

public class screenshots {
	
	static WebDriver driver=Configuration.driver; 
	public static void screenshotFn(String testCaseName,String status) throws Exception {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMM_hmmss");
		String formattedDate = sdf.format(date);

		System.out.println("formattedDate is: "+formattedDate); // 12/01/2011 4:48:16 PM
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./Screenshots/" + testCaseName +"_" +status+"_"+formattedDate+".png");
		FileUtils.copyFile(sourceFile, destFile);
	}
}
