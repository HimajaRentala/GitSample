package mypackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
System.out.println(driver.getTitle());
driver.close();
	}

}
