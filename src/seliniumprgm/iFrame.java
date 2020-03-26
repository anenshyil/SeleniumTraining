package seliniumprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		
	driver.switchTo().frame("IF1");
	Thread.sleep(5000);
	
		WebElement e = driver.findElement(By.className("menu-item-text"));//("(//span[text()='Software Testing Tutorial'])[2]"));
		Thread.sleep(10000);
		e.click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		
		
		}

}
