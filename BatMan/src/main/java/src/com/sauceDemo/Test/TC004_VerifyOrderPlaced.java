package src.com.sauceDemo.Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import src.com.sauceDemo.POM.POM_Home;
import src.com.sauceDemo.POM.POM_YourCart;
import src.com.sauceDemo.POM.POM_YourInformation;

public class TC004_VerifyOrderPlaced extends TestBase
{
	@Test
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
