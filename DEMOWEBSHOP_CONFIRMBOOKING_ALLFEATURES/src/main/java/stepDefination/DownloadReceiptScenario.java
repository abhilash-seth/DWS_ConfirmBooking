package stepDefination;

import browser.Browser;
import io.cucumber.java.en.*;
import pages.Cart;
import pages.Checkout;
import pages.Home;
import pages.Login;
import pages.OrderDetails;

public class DownloadReceiptScenario extends Browser {
	@Given("User have completed buying process")
	public void user_have_completed_buying_process() throws Exception 
	{
		try
		{
			setDriver();
			getUrl("http://demowebshop.tricentis.com/");
			Thread.sleep(2000);		
			Home.clickLogin();
			Thread.sleep(2000);		
			Login.enterCredentials();
			Login.clickLogin();
			Thread.sleep(2000);		
			Home.laptopAddToCart();
			Thread.sleep(5000);		
			Home.clickShoppingCart();
			Thread.sleep(2000);		
			Cart.termsAndServiceCheckbox();
			Cart.checkoutButton();
			Thread.sleep(2000);	
			Checkout.billingAddressContinueButton();
			Thread.sleep(2000);		
			Checkout.shippingAddressContinueButton();
			Thread.sleep(2000);		
			Checkout.shippingMethodContinueButton();
			Thread.sleep(2000);		
			Checkout.paymentMethodContinueButton();
			Thread.sleep(2000);		
			Checkout.paymentInformationContinueButton();
			Thread.sleep(2000);		
			Checkout.confirmOrderContinueButton();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	    
	}

	@And("user is on order details page")
	public void user_is_on_order_details_page() 
	{
		try
		{
			 Checkout.clickHereForOrderDetails();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	  
	   
	}

	@When("user clicks the PDF Invoice button")
	public void user_clicks_the_PDF_Invoice_button() throws Exception 
	{
		try
		{
			OrderDetails.pdfInvoice();
		    Thread.sleep(4000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@Then("system downloads the respected order details pdf")
	public void system_downloads_the_respected_order_details_pdf() 
	{
		try
		{
			OrderDetails.verifyPdfDownload();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
