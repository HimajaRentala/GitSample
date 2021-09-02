package mypackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		 driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentID=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		 System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String EmailID= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentID);
		driver.findElement(By.name("username")).sendKeys(EmailID);
		driver.findElement(By.name("password")).sendKeys("Password");
		/*driver.findElement(By.xpath("//span[@css='1']")).click();
		WebElement staticDropdown = driver.findElement(By.cssSelector(".form-control"));
		 Select dropdown=new Select(staticDropdown);
		 dropdown.selectByIndex(1);*/
		 driver.findElement(By.name("terms")).click();
		 driver.findElement(By.name("signin")).click();
		 driver.close();
		 
		
		
	}

}
