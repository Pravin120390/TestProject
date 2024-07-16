package com.opencart.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.utilities.UtilClass;


public class TestBase {
	
	public static  WebDriver driver;
	public UtilClass util_obj;
	
	@BeforeMethod
	public void setUp() 
	{
		
		String br = "Chrome";
		
		if(br.equalsIgnoreCase("Chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("Please provide browser name from Chrome,Firefox and Edge");
		}
		
		
		
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 util_obj = new UtilClass(driver);
	
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	

}
