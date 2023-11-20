package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationproduct {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
	}
	
	@Test
	public void test1() throws Exception
	
	{
		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(6);
		driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a/span/i")).click();
		
		driver.manage().window().maximize();
		Thread.sleep(4);
		driver.navigate().refresh();
		
	}

}
