package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.xpath("//input[@value='radio1']")).click();
		 System.out.println(driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());
		 driver.findElement(By.xpath("//input[@value='radio1']")).click();
		 System.out.println(driver.findElement(By.xpath("//input[@value='radio1']")).isSelected());
		 driver.close();


	}

}
