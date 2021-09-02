package mypackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https:\\google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	driver.get("https://www.eenadu.net/");
	driver.navigate().back();
	//Thread.sleep(30000);
	driver.navigate().forward();
	driver.close();
	}

}
