package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	 private WebDriver driver;
	   public RegisterPage(WebDriver d)
	   {
		    driver = d;
			PageFactory.initElements(driver, this);
		}

	   @FindBy(xpath = "//*[@id=\"input-firstname\"]")
	   private WebElement firstname_txtbox;
	   
	   @FindBy(xpath="//*[@id=\"input-lastname\"]")
	   private WebElement lastname_txtbox;
	   
	   @FindBy(xpath="//*[@id=\"input-email\"]")
	   private WebElement email_txtbox;
	   
	   
	   @FindBy(xpath="//*[@id=\"input-telephone\"]")
	   private WebElement telephone_txtbox;
	   
	   @FindBy(xpath="//*[@id=\"input-password\"]")
	   private WebElement password_txtbox;
	   
	   @FindBy(xpath="//*[@id=\"input-confirm\"]")
	   private WebElement cpassword_txtbox;
	   
	   @FindBy(xpath="//input[@name='agree']")
	   private WebElement privacy_policy_checkbox;
	   
	   @FindBy(xpath="//input[@value='Continue']")
	   private WebElement continue_btn;
	   
	   public void enterFirstname(String firstname) 
	   {
		   firstname_txtbox.sendKeys(firstname);
	   }
	
	   public void enterLastname(String lastname) 
	   {
		   lastname_txtbox.sendKeys(lastname);
	   }
	
	   
	   public void enterEmailID(String email) 
	   {
		   email_txtbox.sendKeys(email);;
	   }
	   
	   public void enterTelephone(String telephone) 
	   {
		   telephone_txtbox.sendKeys(telephone);
	   }
	   
	   public void enterPassword(String password) 
	   {
		   password_txtbox.sendKeys(password);
	   } 
	   
	    public void enterConfirmPassword(String cpassword) 
	   {
		   cpassword_txtbox.sendKeys(cpassword);
	   } 
	   
	   public void clickOnPrivacyPolicy() 
	   {
		   privacy_policy_checkbox.click();
	   } 
	   
	   public void clickOnContinueButton() 
	   {
		   continue_btn.click();
	   } 
	   
	   
	   
	   
	   
	   
}

