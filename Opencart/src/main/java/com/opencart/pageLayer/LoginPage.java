package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	   private WebDriver driver;
	   public LoginPage(WebDriver d)
	   {
		    driver = d;
			PageFactory.initElements(driver, this);
		}

	   @FindBy(xpath = "//input[@id='input-email']")
	   private WebElement emailid_txtbox;
	   
	   @FindBy(xpath = "//input[@id='input-password']")
	   private WebElement password_txtbox;
	   
	   @FindBy(xpath = "//input[@value='Login']")
	   private WebElement login_btn;
	   
	   public void enterEmailID(String emailid) 
	   {
		   emailid_txtbox.sendKeys(emailid);
	   }
	   public void enterPassword(String password) 
	   {
		   password_txtbox.sendKeys(password);
	   }
	   public void clickOnLoginButton() 
	   {
		   login_btn.click(); 
	   }
	   
}
