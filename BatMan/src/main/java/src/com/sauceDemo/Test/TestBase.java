package src.com.sauceDemo.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import src.com.sauceDemo.POM.POM_Home;
import src.com.sauceDemo.POM.POM_Login;
import src.com.sauceDemo.utility.excel;

public class TestBase
{
   public static WebDriver driver;

	//@Parameters("browser")
	@BeforeClass //Browser& URL Open
	public void beforeClass()
	{

//		if(browser.equals("chrome"))
//		{
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver2.exe");
			driver = new ChromeDriver();
//		}
//		else
//		{
//			System.setProperty("webdriver.gecko.driver", "D:\\Chrome\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Browser is open");

		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");	
	}

	@BeforeMethod //Login
	public void setUp() throws InterruptedException, IOException
	{
		POM_Login logIn = new POM_Login(driver);
		logIn.sendUsername(excel.excelip(0, 0));
		logIn.sendPassword(excel.excelip(3, 2));
		logIn.clickOnLoginButton();
	}


	@AfterMethod  //logOut
	public  void tearDown()
	{
		POM_Home logOut = new POM_Home(driver);
		logOut.clickOnMenuButton();
		logOut.clickOnLogoutButton();
	}

	@AfterClass //BrowserClose
	public void afterMethod()
	{
		driver.close();
	}


}
