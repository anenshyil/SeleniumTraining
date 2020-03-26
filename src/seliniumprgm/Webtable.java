package seliniumprgm;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the city name: ");
	String s = sc.nextLine();
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-table/");

	WebElement table = driver.findElement(By.tagName("table"));
	WebElement tbody = table.findElement(By.tagName("tbody"));
	 List<WebElement> trow = table.findElements(By.tagName("tr"));
	for(int i=0;i<trow.size();i++) {
		List<WebElement> th = trow.get(i).findElements(By.tagName("th"));
		List<WebElement> td = trow.get(i).findElements(By.tagName("td"));
		for(int j=0;j<th.size();j++) {
			
			String t = th.get(j).getText();
			if(s.equals(t))
			{
			System.out.println(t);
			
			for(int k=0;k<td.size();k++) {
				String t1 = td.get(k).getText();
				
				System.out.println(t1);
			}
			}
			
			
		}
	}
	
	
	
	
}
}
