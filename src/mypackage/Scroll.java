package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(4000);
		 js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for (int i=0;i<=values.size();i++)
		{
			
			sum = sum +Integer.parseInt(values.get(i).getText());
		}
		 

	}

}
