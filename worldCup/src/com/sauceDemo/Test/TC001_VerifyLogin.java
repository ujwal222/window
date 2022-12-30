package com.sauceDemo.Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POM.POM_Home;
import com.sauceDemo.POM.POM_YourCart;
import com.sauceDemo.POM.POM_YourInformation;

public class TC001_VerifyLogin extends TestBase
{
	@Test (priority=1, invocationCount=6, timeOut=200)
	public void verifyLogin() throws InterruptedException
	{
		String expected="Swag Labs";
		String actual = driver.getTitle();
		System.out.println(actual);
		
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
	}

	@Test (priority=2)
	public void verifyAddToCart()
	{
		POM_Home home = new POM_Home(driver);
		home.clickBagpackProduct();
		home.clickOnAddToCart();

		String actual = home.cartText();
		System.out.println(actual);
		String expected = "1";

		Assert.assertEquals(actual, expected);

	}
	
	@Test (priority=3)
	public void VerifyAllProduct()
	{
		POM_Home home = new POM_Home(driver);
		home.selectAllProduct();
		
		String actual = home.cartText();
		System.out.println(actual);
		
		String expected="6";
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test (priority=4)
	public void VerifyOrderPlaced()
	{
		POM_Home home = new POM_Home(driver);
		home.selectAllProduct();
		home.clickOnCart();

		POM_YourCart check = new POM_YourCart(driver);
		check.clickOnCheckOuts();

		POM_YourInformation info = new POM_YourInformation(driver);
		info.sendFirstName("Ujwal");
		info.sendLastName("Chaudhari");
		info.sendPostalCode("400605");
		info.clickOnContinue();

		String expected=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]")).getText();
		System.out.println(expected);

		String actual="FREE PONY EXPRESS DELIVERY!";

		Assert.assertEquals(actual, expected);

	}

}
