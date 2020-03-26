package SeleniumPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingAccount extends BaseClass {
	
	@FindBy(id="id_gender1")
	private WebElement mr;
	
	public WebElement getMr() {
		return mr;
	}






	public WebElement getFname() {
		return fname;
	}






	public WebElement getSname() {
		return sname;
	}






	public WebElement getMailid() {
		return mailid;
	}






	public WebElement getPassword1() {
		return password1;
	}






	public WebElement getDays() {
		return days;
	}






	public WebElement getMonth() {
		return month;
	}






	public WebElement getYear() {
		return year;
	}






	public WebElement getFnameConfirm() {
		return fnameConfirm;
	}






	public WebElement getSnameConfirm() {
		return snameConfirm;
	}






	public WebElement getCompanyName() {
		return companyName;
	}






	public WebElement getAddress1() {
		return address1;
	}






	public WebElement getAddress2() {
		return address2;
	}






	public WebElement getCity() {
		return city;
	}






	public WebElement getState() {
		return state;
	}






	public WebElement getPincode() {
		return pincode;
	}






	public WebElement getCountry() {
		return country;
	}






	public WebElement getOtherdetails() {
		return otherdetails;
	}






	public WebElement getPhone() {
		return phone;
	}






	public WebElement getLastMobile() {
		return lastMobile;
	}






	public WebElement getSubmitButoon() {
		return submitButoon;
	}




	public WebElement getCreateAccount_Text() {
		return createAccount_Text;
	}




	@FindBy(xpath="//h1[text()='Create an account']")
	private WebElement createAccount_Text;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	private WebElement sname;
	
	@FindBy(xpath="//input[contains(@value,'@gmail.com')]")
	private WebElement mailid;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password1;
	
	@FindBy(xpath="//select[@id='days']")
	private WebElement days;
	
	@FindBy(xpath="//select[@id='months']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='years']")
	private WebElement year;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement fnameConfirm;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement snameConfirm;
	
	@FindBy(xpath="//input[@id='company']")
	private WebElement companyName;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@id='postcode']")
	private WebElement pincode;
	
	@FindBy(xpath="//select[@id='id_country']")
	private WebElement country;
	
	@FindBy(xpath="//textarea[@id='other']")
	private WebElement otherdetails;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	private WebElement lastMobile;
	
	@FindBy(xpath="//button[@name='submitAccount']")
	private WebElement submitButoon;
	
	public WebElement getAlias() {
		return alias;
	}
	@FindBy(xpath="//input[@id='alias']")
	private WebElement alias;
	
	
	
	
	
	public CreatingAccount() {
		PageFactory.initElements(driver, this);
	}
	

}
