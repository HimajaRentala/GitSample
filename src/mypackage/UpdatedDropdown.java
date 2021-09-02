package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(4000);
		 //driver.findElement(By.id("hrefIncInf")).click();
		 for(int i=1;i<9;i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click(); 
		 }
		 driver.findElement(By.id("hrefDecAdt")).click();
		 driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 driver.close();
	}

}
