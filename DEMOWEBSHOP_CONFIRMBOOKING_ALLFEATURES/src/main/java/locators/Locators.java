package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;

public class Locators extends Browser{
	
	public static WebElement homeLoginlink()
	{
		WebElement home_login_link = driver.findElement(By.xpath("//a[@class='ico-login']"));
		return home_login_link;

	}

	public static WebElement loginEmailTextbox () throws Exception
	{
		String emailid = readers.ReadLocators.getData("emailTextBoxID");
		WebElement login_email_textbox = driver.findElement(By.id(emailid));
		return login_email_textbox;

	}

	public static WebElement loginPasswordTextbox () throws Exception
	{
		String passwordid = readers.ReadLocators.getData("passwordTextBoxID");
		WebElement login_password_textbox = driver.findElement(By.id(passwordid));
		return login_password_textbox;

	}

	public static WebElement loginLoginButton()
	{
		WebElement login_login_button = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		return login_login_button;

	}

	public static WebElement homeLaptopAddToCartButton ()
	{
		WebElement home_laptop_addtocart_button  = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input"));
		return home_laptop_addtocart_button;
	}

	public static WebElement homeShoppingCartLink()
	{
		WebElement home_shoppingcart_link = driver.findElement(By.xpath("//*[@id=\"topcartlink\"]"));
		return home_shoppingcart_link;
	}

	public static WebElement cartTermsAndServiceCheckbox()
	{
		WebElement cart_termsandservice_checkbox = driver.findElement(By.xpath("//*[@id='termsofservice']"));
		return cart_termsandservice_checkbox;
	}

	public static WebElement cartCheckoutButton()
	{
		WebElement cart_checkout_button = 	driver.findElement(By.xpath("//*[@id='checkout']"));
		return cart_checkout_button;

	}

	public static WebElement cartBillingAddressContinueButton()
	{
		WebElement cart_billingaddress_continue_button = driver.findElement(By.xpath("//*[@id='billing-buttons-container']/input"));
		return cart_billingaddress_continue_button;
	}

	public static WebElement cartShippingAddressContinueButton()
	{
		WebElement cart_shippingaddress_continue_button = driver.findElement(By.xpath("//*[@id=\'shipping-buttons-container\']/input"));
		return cart_shippingaddress_continue_button;
	}
	
	public static WebElement cartShippingMethodContinueButton()
	{
		WebElement cart_shippingmethod_continue_button = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input"));
		return cart_shippingmethod_continue_button;
	}
	
	public static WebElement cartPaymentMethodContinueButton()
	{
		WebElement cart_paymentmethod_continue_button = driver.findElement(By.xpath("//*[@id='payment-method-buttons-container']/input"));
		return cart_paymentmethod_continue_button;
	}
	
	public static WebElement cartPaymentInformationContinueButton()
	{
		WebElement cart_paymentinformation_continue_button = driver.findElement(By.xpath("//*[@id=\'payment-info-buttons-container\']/input"));
		return cart_paymentinformation_continue_button;
	}
	
	public static WebElement cartConfirmOrderContinueButton()
	{
		WebElement cart_confirmorder_continue_button = driver.findElement(By.xpath("//*[@id=\'confirm-order-buttons-container\']/input"));
		return cart_confirmorder_continue_button;
	}
	public static WebElement checkoutActualCheckoutThankYouHeader()
	{
		WebElement checkout_actualthankyou_h1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[1]/h1"));
		return checkout_actualthankyou_h1;
	}

	public static WebElement checkoutActualOrderCommentText()
	{
		WebElement checkout_actualorder_text = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong"));
		return checkout_actualorder_text;
	}

	public static WebElement checkoutClickHereForOrderDetails()
	{
		WebElement checkout_clickherefororderdetails_text = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[2]/a")); 
		return checkout_clickherefororderdetails_text;

	}

	public static WebElement clickPDFInvoice()
	{
		WebElement orderdetails_pdfinvoice = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[1]/a[2]"));
		return orderdetails_pdfinvoice;

	}



	public static WebElement clickPrint()
	{
		WebElement  orderdetails_print= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[1]/a[1]"));
		return orderdetails_print;

	}

	public static WebElement clickReOrder()
	{
		WebElement  orderdetails_reorder = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[3]/div[2]/input")); 
		return orderdetails_reorder;
	}

	public static WebElement clickEditOrderDetails()
	{
		WebElement  orderdetails_editorderdetails = driver.findElement(By.xpath("//input[@type='button' and @value='Edit - Order Details']"));
		return orderdetails_editorderdetails;
	}
	
	public static WebElement clickCancelOrder()
	{
		WebElement  orderdetails_cancelorder = driver.findElement(By.xpath("//input[@type='button' and @value='Cancel - Order']"));
		return orderdetails_cancelorder;
	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}

//	public static WebElement ()
//	{
//		WebElement  = 
//		return ;
//
//	}
	
}
