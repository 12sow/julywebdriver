package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;
import pagepkg.Fbloginpage;

public class Fblogintest {
WebDriver driver;
@BeforeTest
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void test()
{
	Fbloginpage ob=new Fbloginpage(driver);
	ob.setValues("ash123@gmail.com", "abc123");
	ob.login();
	//driver.navigate().back();
	Fbcreatepage nv=new Fbcreatepage(driver);
	nv.pageclick();
	nv.getstartbutton();
}
}
