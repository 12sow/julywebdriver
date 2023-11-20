package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationexscersise {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
	
	@Test
	public void test1()

	{
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("arush");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]")).sendKeys("arush2@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("soe2334");
		WebElement day=driver.findElement(By.xpath("//select[@id='days']"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("2");
		
		WebElement month=driver.findElement(By.xpath("//select[@id='months']"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("January");
		
		WebElement year=driver.findElement(By.xpath("//select[@id='years']"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2021");
		driver.findElement(By.xpath("//input[@name='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("sowmya");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("vasudevan");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("lint");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("sdfj,hfoo124");	
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("p.o.34566");

	    WebElement country=driver.findElement(By.xpath("//select[@id='country]"));
		Select countrydetails=new Select(country);
		countrydetails.selectByValue("India");
		driver.findElement(By.xpath("//*[@id='state']")).sendKeys("Kerala");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Thrissur");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("680002");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("7654321987");
		driver.findElement(By.xpath("//*[@action='/signup']/button")).click();

	}	
}
