package stepDefination;

import browser.Browser;
import io.cucumber.java.en.*;
import pages.Cart;
import pages.Checkout;
import pages.Home;
import pages.Login;
import pages.OrderDetails;

public class ConfirmOrderScenario extends Browser {
	@Given("User have completed filling order details till payment information")
	public void user_have_completed_filling_order_details_till_payment_information() throws Exception {
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
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

	@And("user is on checkout page - confirm order part")
	public void user_is_on_checkout_page_confirm_order_part() throws Exception {
		try
		{
			Checkout.paymentInformationContinueButton();
			Thread.sleep(2000);		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	   
	}

	@When("user clicks the Confrim button")
	public void user_clicks_the_Confrim_button() throws Exception {
		try
		{
			Checkout.confirmOrderContinueButton();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	
	}

	@Then("user is navigated to the order processed page")
	public void user_is_navigated_to_the_order_processed_page() throws Exception {
		try
		{
			Checkout.confirmOrderPageUrl();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@And("page displays Thankyou and order Note.")
	public void page_displays_Thankyou_and_order_details() throws Exception {
		try
		{
			Checkout.orderVerification();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
