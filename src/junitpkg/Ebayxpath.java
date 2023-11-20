package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebayxpath {
	
	ChromeDriver driver;
	@Before
	public void setupp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void ebaysearch()
	{
		
		
	driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Mobiles",Keys.ENTER);
	//driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	driver.findElement(By.xpath("//*[@id='s0-53-17-6-3-4[0]-3-2-1-list']/li[2]/div/a")).click();
	driver.findElement(By.xpath("//*[@id='x-refine__group__0']/ul/li/ul/li[1]/a")).click();
	}
	@Test
	public void test1()
	{
String actualtitle=driver.getTitle();
System.out.println(actualtitle);
String exp="electonics";
if(actualtitle.equalsIgnoreCase(exp))
		{
	System.out.println("pass");
		}
else
{
	System.out.println("fail");
}
	}
	
	@Test
	public void test2()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total  no of links="+li.size());
		for(WebElement element:li)
		{
			String link=element.getAttribute("href");
			String text=element.getText();
			System.out.println(link+"---"+text);
		}
		
	}
	

}
