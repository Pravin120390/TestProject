package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.pageLayer.ProductPage;
import com.opencart.pageLayer.WishListPage;
import com.opencart.testbase.TestBase;

public class WishlistTest extends TestBase{
	
	@Test
	public void validateAddingProductoWishListPage() {
		
		HomePage homepage_obj = new HomePage(driver);	
		LoginPage loginpage_obj = new LoginPage(driver);
		ProductPage product_obj = new ProductPage(driver);
		WishListPage wishlist_obj = new WishListPage(driver);
		
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.clickOnLoginDropDown();
		
		loginpage_obj.enterEmailID("pravin.pune1990@gmail.com");
		loginpage_obj.enterPassword("Trisha@024");
		loginpage_obj.clickOnLoginButton(); 
		
		homepage_obj.clickOnHomePageLogo();
		homepage_obj.clickOniPhoneProductLink();
		product_obj.clickOnWishListIcon();
		wishlist_obj.getProductName();
		homepage_obj.clickOnWishlistLink();
		
		Assert.assertEquals(wishlist_obj.getProductName(), "iPhone");
		
	}
	
	

}
