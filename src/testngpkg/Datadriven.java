package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	ChromeDriver driver;
	@BeforeTest
	public  void setup()

	{
		driver=new ChromeDriver();
		driver.get("https://wwww.facebook.com");
	}
	@Test
	public void test() throws IOException 
	{
		FileInputStream ob=new FileInputStream("/Users/arunk/Desktop/book5.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pswd="+pswd);
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(pswd);
			driver.navigate().refresh();
			driver.findElement(By.name("login")).click();
			driver.navigate().back();
			
			
			
		}
		
		
		
	}
	

}
