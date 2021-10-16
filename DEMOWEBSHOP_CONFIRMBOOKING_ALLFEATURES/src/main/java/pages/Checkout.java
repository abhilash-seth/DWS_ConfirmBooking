package pages;

import org.junit.Assert;

import browser.Browser;

public class Checkout extends Browser{
	public static void billingAddressContinueButton()
	{
		locators.Locators.cartBillingAddressContinueButton().click();
	}
	
	public static void shippingAddressContinueButton()
	{
		locators.Locators.cartShippingAddressContinueButton().click();
	}

	public static void shippingMethodContinueButton()
	{
		locators.Locators.cartShippingMethodContinueButton().click();
	}
	
	public static void paymentMethodContinueButton()
	{
		locators.Locators.cartPaymentMethodContinueButton().click();
	}
	
	public static void paymentInformationContinueButton()
	{
		locators.Locators.cartPaymentInformationContinueButton().click();
	}
	
	public static void confirmOrderContinueButton()
	{
		locators.Locators.cartConfirmOrderContinueButton().click();
	}
	
	public static void confirmOrderPageUrl() throws Exception
	{
		String expectedUrl = readers.ReadLocators.getData("expectedOrderConfirmationUrl");
		String actualUrl = driver.getCurrentUrl();
		try {
			Assert.assertTrue((expectedUrl.equals(actualUrl)) ? true : false);
			System.out.println("Pass");
			}
		catch (AssertionError e) 
			{
			System.out.println(e);
			System.out.println("Fail");
			}
	}
	
	public static void orderVerification() throws Exception
	{
		String expectedNote = readers.ReadLocators.getData("checkout_expectedorder_text");
		String actualNote = locators.Locators.checkoutActualOrderCommentText().getText();
		try {
			Assert.assertTrue((expectedNote.equals(actualNote)) ? true : false);
			System.out.println("Pass");
			}
		catch (AssertionError e) 
			{
			System.out.println(e);
			System.out.println("Fail");
			}
	}
	
	public static void clickHereForOrderDetails()
	{
		locators.Locators.checkoutClickHereForOrderDetails().click();
	}

}
