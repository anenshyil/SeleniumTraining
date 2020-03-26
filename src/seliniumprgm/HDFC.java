package seliniumprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://traininginchennai.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement login = driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]"));
		login.click();
		
		
		Thread.sleep(1000);
		WebElement name=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,600)");	
		js.executeScript("arguments[0].scrollIntoView()",name);	
	}

}
