package stepDefination;

import browser.Browser;
import io.cucumber.java.en.*;
import pages.Cart;
import pages.Checkout;
import pages.Home;
import pages.Login;
import pages.OrderDetails;

public class EditOrderDetailsScenario extends Browser{
	@Given("User should have placed order")
	public void user_should_have_placed_order() throws Exception {
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

	@And("user is on specific order details page")
	public void user_is_on_specific_order_details_page() throws InterruptedException {
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

	@When("user clicks the Edit Details button")
	public void user_clicks_the_Edit_Details_button() {
		try
		{
			OrderDetails.getOrderNo();
			OrderDetails.editOrderDetails();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@Then("system navigates user to the respected order details edit page")
	public void system_navigates_user_to_the_respected_order_details_edit_page() {
		try
		{
			OrderDetails.editOrderCheckUrl();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
