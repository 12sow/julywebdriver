package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	ChromeDriver driver;
	
	@Before
	public void setup()
	
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("sow12@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		
	}

}
