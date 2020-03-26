package seliniumprgm;


import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class automationpractice extends BaseClass{

	public static void main(String[] args) throws Throwable {
		BrowserLaunch("chrome");
		launchBrowser("http://automationpractice.com/index.php");
		
		WebElement logo = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/logo.jpg']"));
		Isdisplayingcheck(logo,"1. logo");
		
		WebElement phoneno=driver.findElement(By.xpath("//strong[text()='0123-456-789']"));		
		phoneNoCheck(phoneno);
		
		WebElement contactus = driver.findElement(By.xpath("//a[text()='Contact us']"));			
		WebElement search = driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']"));		
		Isdisplayingcheck(search, "4. Search Field");
		Isdisplayingcheck(contactus, "5. Contact Us");
		
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));	
		Isdisplayingcheck(login, "6. Login");
		
		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		Isdisplayingcheck(women, "7a. Women Field");
		
		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Isdisplayingcheck(dress, "7b. Dress Field");
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));	
		Isdisplayingcheck(tshirt, "7c. T-shirt Field");	
		
		takemMyScreen("Homepage");	
		
		System.out.println("8. Home screen shot taken in location");
		explicitwait(tshirt, 10);
		clickClick(login);
		System.out.println("9. Signin clicked");
			
		WebElement authenti=driver.findElement(By.xpath("//h1[text()='Authentication']"));
		Isdisplayingcheck(authenti, "10. Authentication");	
		
		WebElement createacc=driver.findElement(By.xpath("//h3[text()='Create an account']"));
		Isdisplayingcheck(createacc, "11. Create");
		scrollIt(createacc);
		
		WebElement alregd=driver.findElement(By.xpath("//h3[text()='Already registered?']"));
		Isdisplayingcheck(alregd, "12. Already Registered");
		
		getPageTitle();
					
		String ssnamee = RandomStringUtils.randomAlphanumeric(6);	
			
		String finalstr=stringConcat(ssnamee,"@gmail.com");
		
		System.out.println(finalstr);		
		
		WebElement eml = driver.findElement(By.id("email"));		
		eml.sendKeys(finalstr);
		mailCheck(eml);
		String mail  = getAttrib(eml);
	
		WebElement pswd = driver.findElement(By.id("passwd"));
		sendKeystext(pswd, "password123");
			
		WebElement createac=driver.findElement(By.xpath("//input[@id='email_create']"));
		sendKeystext(createac, finalstr);
	
		WebElement createbutton=driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		clickClick(createbutton);
		
		System.out.println("15. Account Created");
			
		
		scrollByPixel(0, -150);
			
			WebElement createe=driver.findElement(By.xpath("//h1[text()='Create an account']"));
			explicitwait(createe, 10);
			Isdisplayingcheck(createe, "16. Create an Account");		
			
			WebElement mr=driver.findElement(By.id("id_gender1"));
			clickClick(mr);
			System.out.println("17. `Mr` is choosen & ");
			
			IsSelectedcheck(mr,"18. Mr. Button");
		
			WebElement fname = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
			sendKeystext(fname,"Greens");
			System.out.println("19. First name is "+getAttrib(fname));

			WebElement sname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
			sendKeystext(sname, "Tech");
			System.out.println("20. Last name is "+getAttrib(sname));
			
			WebElement pgmail=driver.findElement(By.xpath("//input[contains(@value,'@gmail.com')]"));
			
			String pgmailid = getAttrib(pgmail);
			comapretwostring(pgmailid, mail, "21. Mail Id`s");
			
			WebElement pswrd = driver.findElement(By.xpath("//input[@id='passwd']"));
			sendKeystext(pswrd, "password123");
			
			WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
			dropDownSelect(days, "value", "20");
			
			WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
			dropDownSelect(month, "value","11");
			
			WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
			dropDownSelect(year, "value", "1994");
			System.out.println("23. DOB entered");	
			
			scrollIt(year);
			
			checkAll();
			System.out.println("25. Checkbox has been selected");
			
			WebElement ffname = driver.findElement(By.xpath("//input[@id='firstname']"));
			String ffname1 = getAttrib(ffname);
			
			WebElement ssname = driver.findElement(By.xpath("//input[@id='lastname']"));
			String ssname1 = getAttrib(ssname);
			
			compareWebelementString(ffname, fname,"26. Username");

			scrollIt(ssname);
			
			WebElement compname = driver.findElement(By.xpath("//input[@id='company']"));
			sendKeystext(compname, "GreensTEch");
			
			WebElement cmpaddr = driver.findElement(By.xpath("//input[@id='address1']"));
			sendKeystext(cmpaddr, "50,Tall building.");
			
			WebElement cmpaddr2 = driver.findElement(By.xpath("//input[@id='address2']"));
			sendKeystext(cmpaddr2, "Annanagar,Chennai.");
			
			WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
			sendKeystext(city, "Annanagar,Chennai.");
			
			WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
			dropDownSelect(state, "value", "14");
			
			WebElement pstcode = driver.findElement(By.xpath("//input[@id='postcode']"));
			sendKeystext(pstcode, "60004");
			explicitwait(pstcode, 10);
			scrollIt(pstcode);
			
			WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
			
			dropDownSelect(country, "value", "21");
			
			System.out.println("27. Country ,postal,state ,city and address printed");		
			
			WebElement otherdet = driver.findElement(By.xpath("//textarea[@id='other']"));
			sendKeystext(otherdet, "9874563210");
			
			WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
			sendKeystext(phone, "1234567890");
			
			WebElement mobile = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
			sendKeystext(mobile, "1234567890");
			
			WebElement aliasadd = driver.findElement(By.xpath("//input[@id='alias']"));
			aliasadd.clear();
			sendKeystext(aliasadd, "my same address");
			
			
			WebElement submit = driver.findElement(By.xpath("//button[@name='submitAccount']"));
			clickClick(submit);
			
			System.out.println("27. Entry details has been given");
			
			WebElement usename = driver.findElement(By.xpath("//span[text()='Greens Tech']"));
			String username = gettingText(usename);
			String newstring = username.replace(" ","");
			String names=ffname1.concat(ssname1);
			comapretwostring(newstring, names, "28. Username");
						
			WebElement orderhis = driver.findElement(By.xpath("//span[text()='Order history and details']"));
			Isdisplayingcheck(orderhis, "29.a Order history ");
		
			WebElement mywish = driver.findElement(By.xpath("//span[text()='My wishlists']"));
			Isdisplayingcheck(mywish, "29.b Wish List ");
			
			WebElement mycredslip = driver.findElement(By.xpath("//span[text()='My credit slips']"));
			Isdisplayingcheck(mycredslip, "29.c My Credit Slip");
			
			WebElement MyAddress = driver.findElement(By.xpath("//span[text()='My addresses']"));
			Isdisplayingcheck(MyAddress, "29.d MyAddress");
			
			WebElement mrper = driver.findElement(By.xpath("//span[text()='My personal information']"));			
			Isdisplayingcheck(mrper, "29.e my personal info ");	
			
			takemMyScreen("lastscreenn");
			driver.close();
		}	
	}