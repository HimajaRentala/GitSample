package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnXpathAndCss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("himaja");
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("jakjjhjhgdf");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Password");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.close();
		

	}
}