package src.com.sauceDemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_YourCart
{
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"checkout\"]") private WebElement checkOut;


	public void clickOnCheckOuts()
	{
		checkOut.click();
	}

	public POM_YourCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
