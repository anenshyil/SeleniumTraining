package seliniumprgm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)");
	
	WebElement simplealert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
	simplealert.click();
	
	Alert alert = driver.switchTo().alert();
	
	String s = alert.getText();
	System.out.println(s);
	
	alert.accept();
	
	
}
}
