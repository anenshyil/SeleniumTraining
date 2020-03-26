package seliniumprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement daydd= driver.findElement(By.id("day"));
		
		Select s=new Select(daydd);
		s.selectByValue("9");	
		
		WebElement monthdd= driver.findElement(By.id("month"));
		Select m=new Select(monthdd);
		m.selectByValue("0");
		
		WebElement year=driver.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByValue("2018");
		
		
		WebDriver newdriver=new ChromeDriver();
		newdriver.get("https://adactin.com/HotelApp/Register.php");
		newdriver.manage().window().maximize();
		
	
		m.selectByValue("2");
		
	}

}
