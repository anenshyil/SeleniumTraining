package SeleniumPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BaseClass {

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}

	public WebElement getFilter() {
		return filter;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getPlusbutton() {
		return plusbutton;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceed4() {
		return proceed4;
	}

	public WebElement getBankOk() {
		return bankOk;
	}

	public WebElement getFinalclick() {
		return finalclick;
	}

	public WebElement getCart() {
		return cart;
	}

	@FindBy(xpath="//a[text()='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[text()='Casual Dresses'])[1]")
	private WebElement casualdress;
	
	@FindBy(id="selectProductSort")
	private WebElement filter;
	
	@FindBy(xpath="(//a[@title='Printed Dress'])[2]")
	private WebElement product;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusbutton;
	
	@FindBy(xpath="//select[@name='group_1']")
	private	WebElement size;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement proceed1;
	
	/*@FindBy(xpath="(//a[text()='Printed Dress'])[2]")
	private WebElement proceed2;*/
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceed2;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proceed3;	
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement proceed4;
	
	@FindBy(xpath="//span[text()='(order processing will be longer)']")
	private WebElement bankOk;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement finalclick;
	
	@FindBy(xpath="//b[text()='Cart']")
	private WebElement cart;
	
	
	
	public WebElement getProceed1() {
		return proceed1;
	}

	
	
	public WebElement getOrderHistoryOpt() {
		return orderHistoryOpt;
	}

	public WebElement getMyCredslip() {
		return myCredslip;
	}

	public WebElement getMyAddresses() {
		return myAddresses;
	}

	public WebElement getMyPersonalinfo() {
		return myPersonalinfo;
	}

	public WebElement getMyWishlist() {
		return myWishlist;
	}

	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkboxtick;

	@FindBy(xpath="//span[text()='Order history and details']")
	private WebElement orderHistoryOpt;
	
	@FindBy(xpath="//span[text()='My credit slips']")
	private WebElement myCredslip;
	
	@FindBy(xpath="//span[text()='My addresses']")
	private WebElement myAddresses;
	
	@FindBy(xpath="//span[text()='My personal information']")
	private WebElement myPersonalinfo;
	
	@FindBy(xpath="//span[text()='My wishlists']")
	private WebElement myWishlist;
	
	@FindBy(xpath="//h1[text()='Printed Dress']")
	private WebElement myproductname1;
	
	@FindBy(xpath="(//a[text()='Printed Dress'])[2]")
	private WebElement myproductname2;
	

	public WebElement getMyproductname2() {
		return myproductname2;
	}

	public WebElement getMyproductname1() {
		return myproductname1;
	}

	public WebElement getCheckboxtick() {
		return checkboxtick;
	}
	
	
	public OrderPage() {
		PageFactory.initElements(driver, this);	
		}
}
