package src.com.sauceDemo.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import src.com.sauceDemo.POM.POM_Home;



public class TC003_VerifyAllProduct extends TestBase
{
	@Test
	public void VerifyAllProduct()
	{
		POM_Home home = new POM_Home(driver);
		home.selectAllProduct();
		
		String actual = home.cartText();
		System.out.println(actual);
		
		String expected="6";
		Assert.assertEquals(actual, expected);
		
	}

}
