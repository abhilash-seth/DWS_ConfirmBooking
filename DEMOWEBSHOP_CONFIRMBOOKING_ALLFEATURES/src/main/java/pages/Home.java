package pages;

import browser.Browser;

public class Home extends Browser {
	
	//to click login link
	public static void clickLogin()
	{
		locators.Locators.homeLoginlink().click();
	}
	//to add laptop in cart
	public static void laptopAddToCart()
	{
		locators.Locators.homeLaptopAddToCartButton().click();
	}
	//to click shopping cart link
	public static void clickShoppingCart()
	{
		locators.Locators.homeShoppingCartLink().click();
	}
	
	
	
}
