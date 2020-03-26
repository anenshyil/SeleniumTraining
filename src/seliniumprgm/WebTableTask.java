package seliniumprgm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTask {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Programming_languages_used_in_most_popular_websites");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	WebElement table = driver.findElement(By.xpath("(//table)[1]"));
	WebElement tableheader = table.findElement(By.tagName("thead"));
	WebElement tablerow = tableheader.findElement(By.tagName("tr"));
	 List<WebElement> tablehead = tablerow.findElements(By.tagName("th"));
	//WebElement tableHeader = tablehead.findElement(By.tagName("a"));
	
	for (WebElement Headertext : tablehead) {
		String text=Headertext.getText();
		String textfinal = text.replaceAll("\n", "");
		System.out.print(textfinal+"\t");	
	}
	System.out.println("");
	WebElement tablebody=table.findElement(By.tagName("tbody"));
	List<WebElement> tablerows = tablebody.findElements(By.tagName("tr"));
	for (WebElement tbrow : tablerows) {
		List<WebElement> tdata = tbrow.findElements(By.tagName("td"));
		for(int i=0;i<tdata.size()-1;i++) {
			WebElement str = tdata.get(i);
			String text = str.getText();
			
		if(text.equalsIgnoreCase("Google.com[2]"))
		{
		WebElement resultdata = tablerows.get(i);
			String result = resultdata.getText();
			String[] split = result.split(" ");
			//for (int j = 0; j < args.length; j++) {
				System.out.println(split[9]+split[10]);
			//}
			//System.out.print(result+"           ");	
			
			
		}
		
		}		
	}
	}
	
}
