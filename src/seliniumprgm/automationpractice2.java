package seliniumprgm;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class automationpractice2 extends BaseClass{
	public static void main(String[] args) throws Throwable {
		
		BrowserLaunch("chrome");
		launchBrowser("http://automationpractice.com/index.php");
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickClick(signin);
		String ssn = RandomStringUtils.randomAlphanumeric(6);
		
		WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(5000);
		email.sendKeys("aabcddef@gmail.com");
	//	sendKeystext(email, "aabcddef@gmail.com");
		
		Thread.sleep(5000);
		scrollIt(email);
		WebElement pswrd = driver.findElement(By.id("passwd"));
		Thread.sleep(5000);
		
		pswrd.sendKeys("password123");
		//sendKeystext(pswrd, "password123");
		Thread.sleep(5000);
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		clickClick(submit);
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		mouseActcionHover(women);
	
		WebElement casual=driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]"));
		String mys = gettingText(casual);		
		mouseActcionclick(casual);
		
		System.out.println("1. Women is selected -> Casual Dresses is selected");
		
		WebElement dress = driver.findElement(By.xpath("(//span[contains(text(),'Casual Dresses')])[1]"));
		String text = gettingText(dress);		
		comapretwostring(text, mys, "3. Text given");
		
		takemMyScreen("casualpic");		
		
		System.out.println("Screenshot taken");
		
		WebElement filter=driver.findElement(By.id("selectProductSort"));			
		scrollIt(filter);		
		dropDownSelect(filter,"value","price:asc");
		
		WebElement imghovr = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[2]"));
		mouseActcionclick(imghovr);
		
		WebElement buttonplusfindElement = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickClick(buttonplusfindElement);
		
		WebElement prodnme = driver.findElement(By.xpath("//h1[text()='Printed Dress']"));
		String podnamf = gettingText(prodnme);
		System.out.println(podnamf);
		
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		dropDownSelect(size, "value", "2");

		WebElement prod = driver.findElement(By.xpath("//span[text()='Add to cart']"));	
		scrollIt(prod);
		clickClick(prod);
	
		System.out.println("7. Product is Selected and Clicked");
		
		WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		clickClick(proceed);
		
		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickClick(qty);
		
		WebElement dressname = driver.findElement(By.xpath("(//a[text()='Printed Dress'])[2]"));
		String dressnam = gettingText(dressname);
		comapretwostring(podnamf, dressnam, " 8. Product Name");

		takemMyScreen("Orderprocess");
		scrollIt(qty);		
		
		WebElement addr = driver.findElement(By.xpath("//ul[@class='address first_item item box']"));
		String aaa = gettingText(addr);
		WebElement addr1 = driver.findElement(By.xpath("//ul[@class='address last_item alternate_item box']"));
		String bbb = gettingText(addr1);
		
		String	aaa1=aaa.substring(35);
		String	bbb1=bbb.substring(34);
		System.out.println(aaa1+"/n"+bbb1);
		comapretwostring(aaa1, bbb1, "Address ");		
		System.out.println("9. Qty+size+cash added");
		
		WebElement proceed2 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		clickClick(proceed2);
				
		WebElement proceed3 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		clickClick(proceed3);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		scrollIt(checkbox); 
		clickClick(checkbox);
		
		WebElement proceed4=driver.findElement(By.xpath("//button[@name='processCarrier']"));		
		clickClick(proceed4);
		
		
	    WebElement bannkok = driver.findElement(By.xpath("//span[text()='(order processing will be longer)']"));
	    scrollIt(bannkok);
	    clickClick(bannkok);
	    
	    WebElement lastclicking = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		scrollIt(lastclicking);
		clickClick(lastclicking);
		
		takemMyScreen("ordercomplete");		
		
		WebElement backtoshop = driver.findElement(By.xpath("//b[text()='Cart']"));
		scrollIt(backtoshop);
		clickClick(backtoshop);
		
		takemMyScreen("totalorder");	
		driver.close();
		
	}
}