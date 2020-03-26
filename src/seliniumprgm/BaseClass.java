package seliniumprgm;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void BrowserLaunch(String browsername) {
		
		try {
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\gecko.exe");
				driver=new FirefoxDriver();
						}
			else if(browsername.equals("ie"))
			{
				System.setProperty("webdriver.internetexplorer.driver",System.getProperty("user.dir")+"\\Drivers\\internetexplorer.exe");
				driver=new InternetExplorerDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
			}
	
	public static void launchBrowser(String url) {
		
		driver.get(url);
	}
	
	public static void currentUrl() {
		driver.getCurrentUrl();
	}
	
	public static String getPageTitle() {
		String pagetitle = driver.getTitle();
		System.out.println("13. Page Title is "+pagetitle);
		return pagetitle;
	}
	
	public static void clearField(WebElement element) {
		
		element.clear();
	}

	
	public static String Isdisplayingcheck(WebElement element,String text) {
		boolean displayed = element.isDisplayed();
		if(displayed==true)
			System.out.println(text+"is  present");
		else
			System.out.println(text+"not present");
		return text;
	}
	
	public static boolean IsSelectedcheck(WebElement element,String text) {
		boolean selected = element.isSelected();
		if(selected==true)
			System.out.println(text+"  is selected");
		else
			System.out.println(text+" is not selected");
		return selected;

	}
	public static void takemMyScreen(String filename) throws Throwable {
		
		File destination=new File(System.getProperty("user.dir")+"//Screenshots//"+filename+".png");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(temp, destination);		
		System.out.println(filename+"Screen captured ");

	}
	
	public static void checkAll() {
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement check : checkbox) {
			check.click();				
		}

	}

	public static void scrollIt(WebElement element) {
		//waitForVisibility(element, 5);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	
	public static void scrollByPixel(int val1,int val2) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("(window.scrollTo("+val1+","+val2+"))");
		
	}
	
	public static void explicitwait(WebElement element,int timeinseconds)
	{
		WebDriverWait w=new WebDriverWait(driver, timeinseconds);
		w.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForVisibility(WebElement element,int time)
	{
		WebDriverWait w=new WebDriverWait(driver, time);
		w.until(ExpectedConditions.visibilityOf(element));
	}
	public static void poolwait(WebElement element,int time)
	{
		WebDriverWait w=new WebDriverWait(driver, time);
		w.pollingEvery(5,TimeUnit.SECONDS);
		w.ignoring(NoSuchElementException.class);
	}
	

	
	public static String mailCheck(WebElement element) {
		
		String mailtext  = element.getAttribute("value");
		String emailcom = mailtext.substring(mailtext.length()-4);
		if(mailtext.contains("@") && emailcom.equals(".com"))
		{
			System.out.println("14. Valid email Id");
		}else
			System.out.println("14. Invalid email id");
		return mailtext;

	}
	
	public static void mouseActcionHover(WebElement element) {
		Actions a =new Actions(driver);		
		a.moveToElement(element).build().perform();
	}
	
	public static void mouseActcionclick(WebElement element) {
		Actions a =new Actions(driver);		
		a.moveToElement(element).click().build().perform();
	}
	
	public static void mouseActciondoubleclick(WebElement element) {
		Actions a =new Actions(driver);		
		a.moveToElement(element).doubleClick().build().perform();
	}
	


	public static String compareWebelementString(WebElement element1,WebElement element2,String values) {
		String string1 = element1.getAttribute("value");
		String string2 = element2.getAttribute("value");
		if(string1.equalsIgnoreCase(string2))
			System.out.println(values+" are same");
		else 
			System.out.println(values+" are different");
		return values;
	}
	
	public static void comapretwostring(String string1,String string2,String value) {
		
		if(string1.equals(string2))
			System.out.println(value+ " is same-comparison complete");
		else
			System.out.println(value+" Does not match");
		return ;
	}
	
	public static String phoneNoCheck(WebElement element) {
		
		String phno = element.getText();			
		String nphno = phno.replace("-","");
		int phlength = nphno.length();		
		int ph=Integer.parseInt(nphno);
		if(ph==(int)ph && phlength==10)
		{
			System.out.println("3. " +phno+" Valid mobile number");
		}
		else
		{
			System.out.println("3. Invalid mobile number");
		}
		return phno;

	}
	
	public static void sendKeystext(WebElement element,String text) {
		if (element.isDisplayed() && element.isEnabled())
		{
			clearField(element);
			element.sendKeys(text);
		}
		
		//return text ;
	}
	
	public static void clickClick(WebElement element) {
		element.click();
	}
	
	public static String gettingText(WebElement element) {
		return element.getText();
		
	}
	
	public static String getAttrib(WebElement element) {
			return element.getAttribute("value");
	}
	
	public static void dropDownSelect(WebElement element,String method,String value) {

		Select s= new Select(element);
		
		if(method.equalsIgnoreCase("value"))
		{
			s.selectByValue(value);			
		}
		else if(method.equalsIgnoreCase("index"))
		{
			int value1=Integer.parseInt(value);
			s.selectByIndex(value1);
		}
		else if(method.equalsIgnoreCase("text"))
		{
			s.selectByVisibleText(value);
		}
		
	}
	
	public static void selectbyid(WebElement element,String value) {
		
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	public static String stringConcat(String string1,String string2) {
			return string1.concat(string2);
	}
	
	
/*	public static String comparemailid(WebElement element1,WebElement element2) {
		
		String mail1=element1.getAttribute("value");
		String mail2=element2.getAttribute("value");
		if(mail1.equals(mail2))
			System.out.println("21. Both mail Id`s are same");
		else
			System.out.println("21. Both mail Id`s are different");
		return mail1;
		*/
	
}