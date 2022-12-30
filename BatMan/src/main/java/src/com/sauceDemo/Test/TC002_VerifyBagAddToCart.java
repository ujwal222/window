package src.com.sauceDemo.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import src.com.sauceDemo.POM.POM_Home;



public class TC002_VerifyBagAddToCart extends TestBase
{
	@Test
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

}
