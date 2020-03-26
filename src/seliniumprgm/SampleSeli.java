package seliniumprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSeli {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.facebook.com/");
		WebElement email=dr.findElement(By.id("email"));
		email.click();
		email.sendKeys("anenshyil@gmail.com");
		
		WebElement pass=dr.findElement(By.id("pass"));
		pass.click();
		pass.sendKeys("mypassword");
		dr.navigate().to("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_CjwKCAiAyeTxBRBvEiwAuM8dnR6RyT1KrQzkNfmvMMZBEMiDMFpS23uN36eE50CrAsQqdaYZJ8l_5RoCIMQQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAiAyeTxBRBvEiwAuM8dnR6RyT1KrQzkNfmvMMZBEMiDMFpS23uN36eE50CrAsQqdaYZJ8l_5RoCIMQQAvD_BwE");
		Thread.sleep(4000);
		dr.navigate().refresh();
		Thread.sleep(6000);
		dr.navigate().back();
		Thread.sleep(6000);
		dr.navigate().forward();
		String u = dr.getCurrentUrl();//prints current url
		
		System.out.println(u);
		WebElement log=dr.findElement(By.xpath("//input[@value='1']"));
		log.click();
		
		
		//adactin.com
	}

}
