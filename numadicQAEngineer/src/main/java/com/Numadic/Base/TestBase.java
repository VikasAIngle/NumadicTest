package com.Numadic.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase 
{
	
	public static WebDriver driver;
	public static ObjectRepo repo;
	public static String workingDir;
	
	
	
	
	

	public static void initialazation()
	{
		workingDir = System.getProperty("user.dir");
		repo  = new ObjectRepo(workingDir + "/application.properties");
		
		
		driver = new SafariDriver();
		
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		
	}
	
	
	
	
	
	
	
	
	
	@BeforeSuite
	public void setUp()
	{
		
		initialazation();
		
	}
	
//	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
}
