package seliniumprgm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableIPL {
	public static void main(String[] args) throws InterruptedException {
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
			for (int j = 0; j < tbrow.size(); j++) {		
				List<WebElement> tbledata = tbrow.get(j).findElements(By.tagName("td"));
				for(int i=0;i<tbledata.size();i++)
				{
					if(tbledata.get(i).getText().equalsIgnoreCase("Sam Curran"))
					System.out.print(tbrow.get(j).getText());
				}
			}
		System.out.println("\n");
		int b=0;
		
		for (int a=0;a<tdata.size();a++) {
			if(tdata.get(a).getText().equalsIgnoreCase("Team"))
			{
				System.out.println(tdata.get(a).getText());
			b=a+1;
			}
		}
		for (int i = b; i < tbrow.size(); i++) {			
			List<WebElement> tbcrows = tbrow.get(i).findElements(By.xpath("td["+b+"]"));			
				for (int j = 0; j < tbcrows.size(); j++) {
				String tcolumn = tbcrows.get(j).getText();
				System.out.println(tcolumn);
				}
		}
		
		driver.close();

	}
}
	
	


