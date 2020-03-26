package seliniumprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollBy(0,500)");
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(src, dest).perform();
		
		WebElement five = driver.findElement(By.xpath(("(//a[@class='button button-orange'])[2]")));
		
		WebElement loc2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.clickAndHold(five).moveToElement(loc2).release().perform();
		
	}
	//http://demo.guru99.com/test/drag_drop.html

}
