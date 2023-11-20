package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demoguru {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	}
	@Test
	public void demogurutext()
	{
	
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		actions.contextClick(elementLocator).perform();
		driver.findElement(By.xpath(null))
		
	
	}

}
