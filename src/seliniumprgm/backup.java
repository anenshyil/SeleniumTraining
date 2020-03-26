package seliniumprgm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class backup {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("aabcddef@gmail.com");
		
		WebElement pswrd = driver.findElement(By.id("passwd"));
		pswrd.sendKeys("password123");
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions a=new Actions(driver);
		a.moveToElement(women).perform();
		
		WebElement casual=driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]"));
		String mys = casual.getText();
		
		a.moveToElement(casual).click().build().perform();
		
		System.out.println("1. Women is selected -> Casual Dresses is selected");
		
		WebElement dress = driver.findElement(By.xpath("(//span[contains(text(),'Casual Dresses')])[1]"));
		String text = dress.getText();		
		if(text.equals(mys))
		System.out.println("3. Casuals is the selected option");
		else
			System.out.println("Options not same");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File des=new File("D:\\Selenium\\Selenium\\Screenshots\\causlaspic.png");
		File temp = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(temp, des);
		
		System.out.println("Screenshot taken");
		
		
		WebElement filter=driver.findElement(By.id("selectProductSort"));
		
		
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", filter);
*/		
		Select s=new Select(filter);
		s.selectByIndex(0);
		Thread.sleep(2000);
	/*	System.out.println("4. scrolled and filtered");
		Thread.sleep(5000);*/
		
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		
		WebElement imagehover = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[2]"));
		a.moveToElement(imagehover).click().build().perform();		
		/*WebElement doubtfindElement = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[2]"));
		doubtfindElement.click();*/
		Thread.sleep(3000);
		System.out.println("hi");
		
		WebElement buttonplusfindElement = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		buttonplusfindElement.click();
		Thread.sleep(500);
		buttonplusfindElement.click();
		Thread.sleep(2000);
		/*WebElement qqty1 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		qqty1.click();
		
		
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select ss=new Select(size);
		ss.selectByValue("2");*/
		
/*		Thread.sleep(3000);
		
		WebElement prod = driver.findElement(By.xpath("//span[text()='Add to cart']"));	
		Thread.sleep(5000);
		
		a.moveToElement(prod).click().build().perform();
	
		
		System.out.println("7. Product is Selected and Clicked");
	*/
		
		/*WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		proceed.click();
		Thread.sleep(5000);*/
		
	
/*

		js.executeScript("arguments[0].scrollIntoView(true)", qty);
		
		WebElement proceed2 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		proceed2.click();
		
		WebElement proceed3 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		proceed3.click();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		js.executeScript("arguments[0].scrollIntoView(true)", checkbox);
		checkbox.click();
		
		WebElement proceed4=driver.findElement(By.xpath("//button[@name='processCarrier']"));		
		proceed4.click();
		
		
	    WebElement bannkok = driver.findElement(By.xpath("//span[text()='(order processing will be longer)']"));
	    Thread.sleep(5000);
	    js.executeScript("arguments[0].scrollIntoView(true)",bannkok);
	    bannkok.click();
	    
	    WebElement lastclicking = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		js.executeScript("arguments[0].scrollIntoView(true)", lastclicking);
		lastclicking.click();
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		File f=new File("D:\\Selenium\\Selenium\\Screenshots\\ordercompletion.png");
		File fd = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fd, f);
		
		WebElement backtoshop = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		js.executeScript("arguments[0].scrollIntoView(true)", backtoshop);
		backtoshop.click();
		
		TakesScreenshot ttk=(TakesScreenshot) driver;
		File to=new File("D:\\Selenium\\Selenium\\Screenshots\\totalorder.png");
		File tto = ttk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(tto, to);*/
	}

}
