package seliniumprgm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class WindowHandlingRobotTask {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions a=new Actions(driver);
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		a.contextClick(gmail).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		a.build().perform();
		Set<String> tabs = driver.getWindowHandles();
		List<String> ls=new ArrayList<String>();
		ls.addAll(tabs);
		for(int i=0;i<ls.size();i++) {
			
			WebDriver window = driver.switchTo().window(ls.get(i));
			//System.out.println(window.getTitle());
			if(!window.getTitle().equalsIgnoreCase("Google")) {
				WebElement signinbutton = driver.findElement(By.xpath("(//a[@ga-event-action='sign in'])[2]"));
				signinbutton.click();			
			}
		}
		Set<String> windowHandles = driver.getWindowHandles();
		

		for (String string : windowHandles) {
			driver.switchTo().window(string);
		}
		WebElement signinbut = driver.findElement(By.id("identifierId"));
		signinbut.clear();
		signinbut.sendKeys("dsaf");
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> lss=new ArrayList<String>();
		for (String string : windowHandles2) {
			WebDriver window = driver.switchTo().window(string);
			String title1 = window.getTitle();
			lss.add(title1);
		}
		Set<String> windowHandles3 = driver.getWindowHandles();
		
		List<String> list2=new ArrayList<>();
		list2.addAll(windowHandles3);
		for(int i=0;i<list2.size();i++)
		{
			System.out.println(driver.getTitle());
			driver.switchTo().window(list2.get(1));
		}
		Thread.sleep(5000);
		driver.switchTo().window(list2.get(2));

	}
}
