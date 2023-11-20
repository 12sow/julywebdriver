package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class w3schools {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/");
	
		String src=driver.getPageSource();
		if (src.contains("c++"))
		{
			System.out.println("present");
			
		}
		else
		{
			System.out.println("not present");
		}
		

	}

}
