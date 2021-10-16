package pages;

import browser.Browser;

public class Login extends Browser {
	
	//fill email and password
	public static void enterCredentials() throws Exception
	{
		locators.Locators.loginEmailTextbox().sendKeys(readers.ReadExcel.readExcel(0, 0));
		locators.Locators.loginPasswordTextbox().sendKeys(readers.ReadExcel.readExcel(0, 1));
	}
	
	//click login button
	public static void clickLogin()
	{
		locators.Locators.loginLoginButton().click();
	}

}
