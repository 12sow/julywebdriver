package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblinkandlinktext {

	ChromeDriver driver;
	@Before
	public void setupp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test1()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+li.size());
		
		
	}							
       				
       		
        		
        				
       
}
