package seliniumprgm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableipl1 {
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
		List<WebElement> tdata = trow.findElements(By.tagName("td"));
		
		for (WebElement theadData : tdata) 
			System.out.print(theadData.getText()+"\t");
		
		System.out.println();
		
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> tbrow = tbody.findElements(By.tagName("tr"));

		for (WebElement tbrows : tbrow) {
			List<WebElement> trows = tbrows.findElements(By.tagName("td"));
			
			for(int i=0;i<trows.size();i++)
			{			
			for (int j = 0; j < trows.size(); j++) {
				if(trows.get(j).getText().equalsIgnoreCase("Bowler"))
					System.out.print(trows.get(i).getText()+"\t");
			}
		}
			System.out.println("");
		}
		
	}		

}
