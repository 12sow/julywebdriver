package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragnddrop {
	ChromeDriver driver;
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
}
@Test
public void dragdrop()
{              //des1
	WebElement AccountDebit=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
	            //scrc1
	WebElement Bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement AmountDebit=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	WebElement Number=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement AccountCredit=driver.findElement(By.xpath("//*[@id=\"loan\"]"));
	WebElement Sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement AmountCredit=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));	 
	Actions act=new Actions(driver);
	act.dragAndDrop(Bank, AccountDebit);//source and destination
	act.dragAndDrop(Number, AmountDebit);
	act.dragAndDrop(Sales, AccountCredit);
	act.dragAndDrop(Number, AmountCredit);
	act.perform();
	
}

}
