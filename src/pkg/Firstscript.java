package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
String actualtitle=driver.getTitle();
String exp="google";
if(actualtitle.equals(exp))
		{
	System.out.println("pass");
		}
else
{
	System.out.println("fail");
}
	}

}
