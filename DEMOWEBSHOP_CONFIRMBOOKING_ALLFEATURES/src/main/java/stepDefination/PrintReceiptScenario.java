package stepDefination;

import browser.Browser;
import io.cucumber.java.en.*;
import pages.Cart;
import pages.Checkout;
import pages.Home;
import pages.Login;
import pages.OrderDetails;

public class PrintReceiptScenario extends Browser{
	@Given("User have completed the buying process")
	public void user_have_completed_the_buying_process() throws Exception {
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

	@And("user is on the order details page")
	public void user_is_on_the_order_details_page() throws Exception {
		try
		{
			Checkout.clickHereForOrderDetails();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@When("user clicks the Print button")
	public void user_clicks_the_Print_button() {
		try
		{
			OrderDetails.print();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	   
	}

	@Then("system navigates the user to print application")
	public void system_navigates_the_user_to_print_application() {
		try
		{
			OrderDetails.verifyPrint();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
