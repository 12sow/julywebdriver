package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class blazedemorelativexpath {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
		
	}
	@Test
		public void blazedemoregister()
		
		{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sow123");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lint");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("lint1234");
		driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("lint1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
	}

}
