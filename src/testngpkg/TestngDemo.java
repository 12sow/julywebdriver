package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	
	//@before suite
	//@before class
	//@before test
	//@before method
	//@test
	
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Browser open");
		}
	
@BeforeMethod
public void urlloading()
{
	System.out.println("url details");
}

@Test(priority=2,enabled=false,invokation Count=3)   // @TEST import into testng
public void test1()
{
	System.out.println("test1");
	
}
@Test(priority=1)
public void test2()
{
	System.out.println("test2");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("after method");
	
}
@AfterTest
public void browserclose()
{
	System.out.println("browserclose");
}
}
