package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aleertpgmm {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///Applications/alertprogram.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		//String alerttext=a.getText();
		//System.out.println(alerttext);
		//a.accept();
				
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("frg");
		//Alert a=driver.switchTo().alert();
		//a.accept();
		
	}
}
