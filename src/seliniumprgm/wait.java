package seliniumprgm;

import java.sql.Driver;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
		
		WebDriverWait w=new WebDriverWait(dr,20);
		
		
		dr.get("https://www.facebook.com/");
		WebElement email=dr.findElement(By.id("email"));
		
		
		w.until(ExpectedConditions.elementToBeClickable(email));
		
		email.click();
		
		email.sendKeys("anenshyil@gmail.com");
		WebElement pass=dr.findElement(By.id("pass"));
		pass.click();
		pass.sendKeys("mypassword");
		dr.navigate().to("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_CjwKCAiAyeTxBRBvEiwAuM8dnR6RyT1KrQzkNfmvMMZBEMiDMFpS23uN36eE50CrAsQqdaYZJ8l_5RoCIMQQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAiAyeTxBRBvEiwAuM8dnR6RyT1KrQzkNfmvMMZBEMiDMFpS23uN36eE50CrAsQqdaYZJ8l_5RoCIMQQAvD_BwE");
		//Thread.sleep(4000);
		
		dr.navigate().refresh();
		//Thread.sleep(6000);
		dr.navigate().back();
		//Thread.sleep(6000);
		dr.navigate().forward();
		String u = dr.getCurrentUrl();
		System.out.println(u);
		
		dr.navigate().to("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver");
		Alert alert=dr.switchTo().alert();
		alert.accept();
		
	
		
	}

}
