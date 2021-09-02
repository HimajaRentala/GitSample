package mypackage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("uk");
		Thread.sleep(6000);
		List<WebElement> options=driver.findElements(By.cssSelector("ul[id='ui-id-1'] a"));
		for(WebElement item:options)
		{
			if(item.getText().equalsIgnoreCase("Ukraine"))
			{
				item.click();
				break;
			}
		}
	}

}
