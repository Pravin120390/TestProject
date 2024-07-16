package com.opencart.utilities;

import java.io.File; 
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class UtilClass {

	private WebDriver driver;
	public UtilClass(WebDriver d) {
		
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		
		
		String title = 	driver.getTitle();
		return title; 
	}
	
	
	
}
