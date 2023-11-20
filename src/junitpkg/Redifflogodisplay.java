package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redifflogodisplay {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void dropdowntest()
	{
	
		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("02");
		List <WebElement> cl=daydetails.getOptions();
		System.out.println("day count="+cl.size());
		
		WebElement month=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("JAN");
		List <WebElement> d=monthdetails.getOptions();
		System.out.println("month count="+d.size());
		
		
		WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2022");
		
		List <WebElement> y=yeardetails.getOptions();
		System.out.println("year count="+y.size());
		
		
	}

}
