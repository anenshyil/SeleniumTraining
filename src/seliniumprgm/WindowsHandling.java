package seliniumprgm;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver111.exe");		
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
				searchbox.click();
				
				searchbox.sendKeys("mobiles",Keys.ENTER);
				String fid = driver.getWindowHandle();
				
				WebElement pro1 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[2]"));
				pro1.click();
				WebElement pro2 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[3]"));
				pro2.click();
//				WebElement pro3 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[3]"));
//				pro3.click();
//				WebElement pro4 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[4]"));
//				pro4.click();
//				WebElement pro5 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[7]"));
//				pro5.click();
//				WebElement pro6 = driver.findElement(By.xpath("(//div[@class='s-include-content-margin s-border-bottom'])[8]"));
//				pro6.click();
				
				//Set<String> pid = driver.getWindowHandles();		
				
				//static-title
				//dynamic-index

}
}
