package seliniumprgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mypgm {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");		
		
		WebDriver gr=new ChromeDriver();
		gr.manage().window().maximize();
		
		gr.get("https://adactin.com/HotelApp/");
		
	//	gr.navigate().to("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_CjwKCAiAyeTxBRBvEiwAuM8dnR6RyT1KrQzkNfmvMMZBEMiDMFpS23uN36eE50CrAsQqdaYZJ8l_5RoCIMQQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAiAyeTxBRBvEiwAuM8dnR6RyT1KrQzkNfmvMMZBEMiDMFpS23uN36eE50CrAsQqdaYZJ8l_5RoCIMQQAvD_BwE");
		
		gr.navigate().to("https://adactin.com/HotelApp/Register.php");
		WebElement username = gr.findElement(By.xpath("//input[@id='username']"));
		username.click();
		username.sendKeys("AnenShyil");
		username.getAttribute("value");
		
		WebElement pass = gr.findElement(By.xpath("//input[@id='password']"));
		pass.click();
		pass.sendKeys("anenshyil");
		
		WebElement cpass = gr.findElement(By.xpath("//input[@id='re_password']"));
		pass.click();
		cpass.sendKeys("anenshyil");
		
		WebElement fname = gr.findElement(By.xpath("//input[@id='full_name']"));
		fname.click();
		fname.sendKeys("Anen Shyil");
		
		WebElement email = gr.findElement(By.xpath("//input[@id='email_add']"));
		email.click();
		email.sendKeys("anen@gmail.com");
		Thread.sleep(15000);
		
		WebElement checkbox = gr.findElement(By.xpath("//input[@id='tnc_box']"));
		checkbox.click();
		checkbox.sendKeys("anen@gmail.com");
		
		WebElement submit=gr.findElement(By.xpath("//input[@id='Submit']"));
		submit.click();
		Thread.sleep(15000);
		gr.close();
	
		
		
	}

}
