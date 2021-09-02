package mypackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loctors {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://in.pinterest.com/login/");
	 driver.findElement(By.id("email")).sendKeys("abcd");
	 driver.findElement(By.id("password")).sendKeys("Hima@123");
	 Thread.sleep(3000);
	 driver.findElement(By.linkText("Forgot your password?")).click();
	 driver.close();

	}

}
