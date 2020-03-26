package seliniumprgm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Adactintest {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/Register.php");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://adactin.com/HotelApp/Register.php");
		
	
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.click();
		
		username.sendKeys("AnenShyil");
		
		String x = username.getAttribute("value");
		System.out.println(x);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.click();
		
		pass.sendKeys("anenshyil");
		
		String y = pass.getTagName();
		
		System.out.println(y);
		
		WebElement cpass = driver.findElement(By.xpath("//input[@id='re_password']"));
		pass.click();
		cpass.sendKeys("anenshyil");
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='full_name']"));
		fname.click();
		fname.sendKeys("Anen Shyil");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_add']"));
		email.click();
		email.sendKeys("anen@gmail.com");
		Thread.sleep(5000);
		
		
		
		}

}
