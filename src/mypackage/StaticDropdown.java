package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select dropdown=new Select(staticDropdown);
		 dropdown.selectByIndex(2);
		 Thread.sleep(4000);
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 Thread.sleep(4000);
		 dropdown.selectByVisibleText("INR");
		 Thread.sleep(4000);
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 Thread.sleep(4000);
		 dropdown.selectByValue("USD");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 driver.close();
		 
		 
	}

}
