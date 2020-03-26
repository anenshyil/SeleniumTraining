package seliniumprgm;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://traininginchennai.in/");
		driver.manage().window().maximize();
		
		WebElement courses=driver.findElement(By.xpath("//a[text()='Courses '][1]"));	
		
		Actions a=new Actions(driver);
		
		a.moveToElement(courses).perform();
		
		WebElement sftweretest=driver.findElement(By.xpath("//a[text()='Software Testing Training '][1]"));		
		a.moveToElement(sftweretest).perform();
		
		WebElement software=driver.findElement(By.xpath("//a[text()='Selenium Training'][1]"));		
		a.moveToElement(software).perform();
		a.click().perform();
	}

}
