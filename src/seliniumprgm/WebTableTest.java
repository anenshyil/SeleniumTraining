package seliniumprgm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.iplt20.com/auction/2020");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		WebElement table = driver.findElement(By.xpath("(//table)[2]"));
		WebElement thead = table.findElement(By.tagName("thead"));
		WebElement trow = thead.findElement(By.tagName("tr"));
		List<WebElement> tabledata = trow.findElements(By.tagName("td"));

		for (WebElement header : tabledata) {
			System.out.print(header.getText()+"\t");
		}
		
		System.out.println("");
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> tablebrow = tbody.findElements(By.tagName("tr"));
		for (WebElement tablerow : tablebrow) {
			List<WebElement> tablebdata = tablerow.findElements(By.tagName("td"));
			
			for (WebElement tbrowdata : tablebdata) {				
				String text = tbrowdata.getText();
				System.out.print(text+"\t");
			}
			System.out.println("");
		}
		
	}

}
