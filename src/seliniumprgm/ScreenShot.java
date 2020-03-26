package seliniumprgm;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
	
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_CjwKCAiAj-_xBRBjEiwAmRbqYp6UyPz7RmUvAjmfHd9BCmOY4U7VVQWo6vE6E6lXULarea-2ScQaRhoCT_wQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAiAj-_xBRBjEiwAmRbqYp6UyPz7RmUvAjmfHd9BCmOY4U7VVQWo6vE6E6lXULarea-2ScQaRhoCT_wQAvD_BwE");
		driver.manage().window().maximize();
		
		TakesScreenshot scrsht=(TakesScreenshot) driver;
		File temp=scrsht.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\Selenium\\Selenium\\Screenshots\\image.png");
		
		FileUtils.copyFile(temp, destination);
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','mobiles')",searchbox);
		
		Thread.sleep(15000);
		js.executeScript("arguments[0].click()", searchbox);
		
		
		
	
	}
}