package config;

import org.openqa.selenium.WebDriver;

public class Configuration {
	/* This is a configuration class which holds all the configuration variables*/
	public static WebDriver driver=null;
	public static class url{
		
		public static String app_url="http://jusdone.atomic77.in";
	}
	
	public static class browser{
		public static String browser="ff";
	}
}
