package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.testbase.TestBase;
import com.opencart.utilities.UtilClass;

public class LoginPageTest extends TestBase {
	
	
	@Test
	public void validateloggingintotheApplicationusingvalidcredentials() {
		
		HomePage homepage_obj = new HomePage(driver);	
		LoginPage loginpage_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass(driver);
		
		
		String expected_result = "My Account";
		
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.clickOnLoginDropDown();
		
		loginpage_obj.enterEmailID("pravin.pune1990@gmail.com");
		loginpage_obj.enterPassword("Trisha@024");
		loginpage_obj.clickOnLoginButton();
		
		Assert.assertEquals(util_obj.getPageTitle(), expected_result);
		
	}
	
	

}
