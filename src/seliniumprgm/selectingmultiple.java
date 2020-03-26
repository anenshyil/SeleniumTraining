package seliniumprgm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectingmultiple {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		String ssn = RandomStringUtils.randomAlphanumeric(6);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("aabcddef@gmail.com");
		
		WebElement pswrd = driver.findElement(By.id("passwd"));
		pswrd.sendKeys("password123");
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions a=new Actions(driver);
		a.moveToElement(women).click().build().perform();
		
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		String val;
		Thread.sleep(5000);
		
		
		List<WebElement> womenopt = driver.findElements(By.className("product-name"));
		Set<String> optset= new TreeSet<>();
		for(int i=0;i<womenopt.size();i++) {
	
			val=womenopt.get(i).getText();
			optset.add(val);	 
		}

		List<String> l=new ArrayList<>();
		
		l.addAll(optset);
		for (String xx : l) {
			System.out.println(xx);
		}
		
		System.out.println("**********DESCENDING*****************");
		for(int i=l.size()-1;i>=0;i--) {
			
			System.out.println(l.get(i));
		}
		
		
		
		Map<Integer, String> mp=new HashMap<Integer, String>();
		for (int i = 1; i < l.size(); i++) {
			mp.put(i, l.get(i));
			//System.out.println(mp);
		}
		System.out.println(mp);
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)",womenopt);
		driver.close();
		
	}

}
