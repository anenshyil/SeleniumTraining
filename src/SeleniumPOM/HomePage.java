package SeleniumPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seliniumprgm.BaseClass;

public class HomePage extends SeleniumPOM.BaseClass {

	@FindBy(xpath="//img[@src='http://automationpractice.com/img/logo.jpg']")
	private WebElement logo;
	
	public WebElement getLogo() {
		return logo;
	}

	@FindBy(className="login")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}
	
	@FindBy(xpath="//strong[text()='0123-456-789']")
	private WebElement phone;

	public WebElement getPhone() {
		return phone;
	}
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement contactus;
	
	public WebElement getContactus() {
		return contactus;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getWomen() {
		return women;
	}


	public WebElement getDress() {
		return Dress;
	}


	public WebElement getTshirt() {
		return Tshirt;
	}

	@FindBy(xpath="//input[@class='search_query form-control ac_input']")
	private WebElement searchbox;
	
	@FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
	private WebElement women;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement Dress;
	
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement Tshirt;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCreate_account() {
		return create_account;
	}

	public WebElement getCreate_button() {
		return create_button;
	}

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement create_account;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement create_button;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
}
