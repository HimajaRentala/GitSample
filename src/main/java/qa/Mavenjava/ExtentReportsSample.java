package qa.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportsSample {
	@BeforeTest

	public void config()

	{ 
		
		
	}
	
	
	@Test

	public void repots()

	{

	

	System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();

	driver.get("https://rahulshettyacademy.com");

	System.out.println(driver.getTitle());

	driver.close();

	//test.fail("Result do not match");

	

	}

}
