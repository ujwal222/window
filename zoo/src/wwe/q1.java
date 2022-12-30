package wwe;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class q1
{
	@BeforeClass
	public void d1()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void v1()
	{
		System.out.println("before method");
	}
	
	
	@Test
	public void m1()
	{
		System.out.println("Test");
	}
	
	@Test
	public void m2()
	{
		System.out.println("delhi");
	}
	
	
	@AfterMethod
	public void v2()
	{
		System.out.println("After method");
	}
	
	@AfterClass
	public void d2()
	{
		System.out.println("After class");
	}
	
}
