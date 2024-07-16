package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	private WebDriver driver;
	   public ProductPage(WebDriver d)
	   {
		    driver = d;
			PageFactory.initElements(driver, this);
		}

	   
	   @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")
	   private WebElement wishlist_icon;	
	
	   public void clickOnWishListIcon() 
	   {
		   wishlist_icon.getText();
	   }
	
	
	
	
	
	
	
}
