package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontextverificationrediif {

		
		ChromeDriver driver;
		
		@Before
		public void setup()
		{
			driver = new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			
		}
		@Test
		public void  buttontextverification()
		{
		String s=driver.findElement(By.xpath("//*[@id='Register']")).getAttribute("value");
		System.out.println("the button text is "+s);
		
		
		
		}
	

}
