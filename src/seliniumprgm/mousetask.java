package seliniumprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousetask {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176788768.447732404.1582553990-1828549846.1582553990");
		Thread.sleep(5000);
															WebElement menu = driver.findElement(By.xpath("//input[@class='input_password']"));
		boolean en = menu.isEnabled();
		System.out.println(en);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','12345')",menu);
		
		
	}
}
