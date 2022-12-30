package src.com.sauceDemo.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import src.com.sauceDemo.utility.excel;

public class TC001_VerifyLogin extends TestBase
{
	@Test
	public void verifyLogin() throws IOException
	{
		String expected="Swag Labs";
		String actual = driver.getTitle();
		System.out.println(actual);
		
		Assert.assertEquals(actual, expected);
		
		excel.sc("login");
		
	}


}
