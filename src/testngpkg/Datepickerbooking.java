package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerbooking {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		
		
	}
	@Test
	public void datepicker() throws Exception 
	
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]/span")).click();
		datepickermethod("0ctober 2023","30");
		datepickermethod("october 2023","31");
	
		//driver.navigate().refresh();
	}
	private void datepickermethod(String expmonth, String expdate) {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		
		while(true)
		{
			
		String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
		if(month.equals(expmonth))
		{
			System.out.println("month=" +month);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[2]/h3")).getText();
			break;
		}
		}
		List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
		for(WebElement dateelement:alldates)
		{
			String date=dateelement.getText();
			if(date.equals(expdate))
			{
				dateelement.click();
				break;
			}
		}
		
		
		
	}
	

}
