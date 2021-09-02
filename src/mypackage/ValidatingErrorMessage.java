package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Himaja");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("error")).getText());
        driver.close();
	}

}
