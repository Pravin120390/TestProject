package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.RegisterPage;
import com.opencart.testbase.TestBase;
import com.opencart.utilities.UtilClass;

public class RegisterTest extends TestBase {

	
	@Test
	public void ValidateRegisteringAccountbyprovidingonlytheMandatoryfields() 
	{
		String expected = "Your Account Has Been Created!";
		HomePage homepage_obj = new HomePage(driver);
		RegisterPage register_obj = new RegisterPage(driver);
		UtilClass util_obj = new UtilClass(driver);
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.clickOnRegisterLink();
		
		register_obj.enterFirstname("Pravin");
		register_obj.enterLastname("Pha");
		register_obj.enterEmailID("pravin.mum1990@gmail.com");
		register_obj.enterTelephone("9284379622");
		register_obj.enterPassword("Trisha@024");
		register_obj.enterConfirmPassword("Trisha@024");
		register_obj.clickOnPrivacyPolicy();
		register_obj.clickOnContinueButton();
		
		Assert.assertEquals(util_obj.getPageTitle(), expected);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
