package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
         driver.findElement(By.id("checkBoxOption1")).click();
         System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
         driver.findElement(By.id("checkBoxOption2")).click();
         driver.findElement(By.id("checkBoxOption1")).click();
         System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
         System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
         driver.close();
	}

}
