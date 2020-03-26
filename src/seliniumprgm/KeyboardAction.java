package seliniumprgm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

		
		public static void main(String[] args) throws Throwable {
		
	
//				System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");		
//						
//						WebDriver driver=new ChromeDriver();
//						driver.get("https://www.amazon.in/");
//						driver.manage().window().maximize();
//						driver.navigate().refresh();
//						
//						WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
//						searchbox.click();
//						
//						searchbox.sendKeys("mobiles",Keys.ENTER);
//						
			
			
			
				
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");		
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			WebElement mail = driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
			
			Actions a=new Actions(driver);
			
			a.contextClick(mail).perform();
			
			Robot key=new Robot();
			
			key.keyPress(KeyEvent.VK_DOWN);//virtual key
			key.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(1500);
			
			key.keyPress(KeyEvent.VK_DOWN);//virtual key
			key.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(1500);
			
			key.keyPress(KeyEvent.VK_DOWN);//virtual key
			key.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(1500);
			
			key.keyPress(KeyEvent.VK_ENTER);
			key.keyRelease(KeyEvent.VK_ENTER);
			
}
}
