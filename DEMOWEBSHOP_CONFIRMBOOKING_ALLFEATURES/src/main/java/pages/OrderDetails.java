package pages;


import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;

import browser.Browser;

public class OrderDetails extends Browser{
	
	public static String parent;
	public static int orderNo;
	
	public static void getOrderNo()
	{
		String orderText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/div[1]/strong")).getText();
		orderNo = Integer.parseInt(orderText.replaceAll("[^0-9]", ""));
	}
	
	public static void pdfInvoice()
	{
		locators.Locators.clickPDFInvoice().click();
	}
		
	public static void verifyPdfDownload()
	{
		String pathStart = "C:\\Users\\seth\\Downloads\\order_";
		String orderText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/div[1]/strong")).getText();
		orderNo = Integer.parseInt(orderText.replaceAll("[^0-9]", ""));
		String pathEnd = ".pdf";
		String filepath = pathStart + orderNo + pathEnd;
		File f = new File(filepath);
		if(f.exists())
		{
			System.out.println("PASS!");
		}
		else
		{
			System.out.println("FAIL!");
		}
		
	}
	
	public static void print()
	{
		parent=driver.getWindowHandle();
		String orderText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/div[1]/strong")).getText();
		orderNo = Integer.parseInt(orderText.replaceAll("[^0-9]", ""));
		locators.Locators.clickPrint().click();
	}
	
	public static void verifyPrint()
	{

				// It will return the parent window name as a String
				Set<String>s=driver.getWindowHandles();

				// Now iterate using Iterator
				Iterator<String> I1= s.iterator();

				String child_window=I1.next();
				String printing=I1.next();
				String actualUrl = driver.switchTo().window(printing).getCurrentUrl();
				String expectedUrl = "http://demowebshop.tricentis.com/orderdetails/print/" + orderNo;
				try {
					Assert.assertTrue((actualUrl.equals(expectedUrl)) ? true : false);
					System.out.println("Pass");
					}
				catch (AssertionError e) 
					{
					System.out.println(e);
					System.out.println("Fail");
					}
				
				//switch to the parent window
				driver.switchTo().window(parent);
	}
	
	public static void editOrderDetails()
	{
//		locators.Locators.clickEditOrderDetails().click();
		
		boolean itemvisibility = false;
		if(itemvisibility)
		{
			System.out.println("PASS!");
		}
		else
		{
			System.out.println("FAIL!");
		}
//		if(locators.Locators.clickEditOrderDetails().isDisplayed())
//		{
//			System.out.println("PASS!");
//		}
//		else
//		{
//			System.out.println("FAIL!");
//		}
	}
	
	public static void editOrderCheckUrl()
	{
		String actUrl = driver.getCurrentUrl();
		String expUrl = "http://demowebshop.tricentis.com/orderdetails/EditOrder_" + orderNo;
		try {
			Assert.assertTrue((actUrl.equals(expUrl)) ? true : false);
			System.out.println("Pass");
			}
		catch (AssertionError e) 
			{
			System.out.println(e);
			System.out.println("Fail");
			}
	}
	
	public static void cancelOrder()
	{
//		locators.Locators.clickCancelOrder().click();
		boolean itemvisibility = false;
		if(itemvisibility)
		{
			System.out.println("PASS!");
		}
		else
		{
			System.out.println("FAIL!");
		}
//		if(locators.Locators.clickCancelOrder().isDisplayed())
//		{
//			System.out.println("PASS!");
//		}
//		else
//		{
//			System.out.println("FAIL!");
//		}
	}
	public static void cancelCheckUrl()
	{
		
		
		String actUrl = driver.getCurrentUrl();
		String expUrl = "http://demowebshop.tricentis.com/orderdetails/CancelOrder_" + orderNo;
		try {
			Assert.assertTrue((actUrl.equals(expUrl)) ? true : false);
			System.out.println("Pass");
			}
		catch (AssertionError e) 
			{
			System.out.println(e);
			System.out.println("Fail");
			}
	}
	
	

}
