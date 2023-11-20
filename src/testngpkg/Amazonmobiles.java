package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonmobiles {
	 WebDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 
	 }
	 @Test
	 public void test()
	 {
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
		 String expectedresult="Amazon.in:mobilephones";
		 String actualtitle=driver.getTitle();
		 System.out.println(actualtitle);
		 if(actualtitle.equalsIgnoreCase(expectedresult))  // uppercase and lowercase equalsignorecase
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
		 
		 
		
	 }
	 
}
