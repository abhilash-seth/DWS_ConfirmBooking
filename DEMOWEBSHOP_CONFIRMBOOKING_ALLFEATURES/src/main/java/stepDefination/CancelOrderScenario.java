package stepDefination;

import browser.Browser;
import io.cucumber.java.en.*;
import pages.Cart;
import pages.Checkout;
import pages.Home;
import pages.Login;
import pages.OrderDetails;

public class CancelOrderScenario extends Browser{
	@Given("User have completed the order placing process")
	public void user_have_completed_the_order_placing_process() throws Exception {
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
	
	@And("user is on cancelling order details page")
	public void user_is_on_cancelling_order_details_page() throws InterruptedException {
		try
		{
			Checkout.clickHereForOrderDetails();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	@When("user clicks the Cancel Order button")
	public void user_clicks_the_Cancel_Order_button() {
		try
		{
			OrderDetails.cancelOrder();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	  
	}

	@Then("user is navigated to the order cancellation page")
	public void user_is_navigated_to_the_order_cancellation_page() {
		try
		{
			OrderDetails.cancelCheckUrl();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
