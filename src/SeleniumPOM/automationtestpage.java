package SeleniumPOM;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class automationtestpage extends BaseClass {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=BrowserLaunch("chrome");
		
		launchBrowser("http://automationpractice.com/index.php");
		
		HomePage hp=new HomePage();		
		
		Isdisplayingcheck(hp.getLogin(), "Login");

		Isdisplayingcheck(hp.getLogo(), "Logo");
		
		clickClick(hp.getLogin());
		phoneNoCheck(hp.getPhone());
		Isdisplayingcheck(hp.getPhone(), "phone number");
		phoneNoCheck(hp.getPhone());
		
		takemMyScreen("Home ");
		
		getPageTitle();
		Isdisplayingcheck(hp.getWomen(), "Women");
		Isdisplayingcheck(hp.getDress(), "Dress");
		Isdisplayingcheck(hp.getTshirt(), "T-Shirt");
		
		String randommail = RandomStringUtils.randomAlphanumeric(6);
		String mail = randommail.concat("@gmail.com");
		sendKeystext(hp.getCreate_account(), mail);
		sendKeystext(hp.getPassword(), "password123");
		
		clickClick(hp.getCreate_button());
		System.out.println("***************Creating Account*************************");
		CreatingAccount ca=new CreatingAccount();
		
		Isdisplayingcheck(ca.getCreateAccount_Text(), "create an Account");
		clickClick(ca.getMr());
		
		getPageTitle();
		
		IsSelectedcheck(ca.getMr(),"Mr");

		sendKeystext(ca.getFname(),"Greens");
		sendKeystext(ca.getSname(),"Tech");
		sendKeystext(ca.getPassword1(),"password123");
		dropDownSelect(ca.getDays(),"value", "2");
		dropDownSelect(ca.getMonth(),"value", "10");
		dropDownSelect(ca.getYear(), "value", "1990");
		
		checkAll();
		
		sendKeystext(ca.getCompanyName(), "Greens Tech");
		sendKeystext(ca.getAddress1(), "10 Main road");
		sendKeystext(ca.getAddress2(), "Anna Nagar");
		sendKeystext(ca.getCity(),"chennai");
		dropDownSelect(ca.getState(),"value","2");
		sendKeystext(ca.getPincode(), "60004");
		dropDownSelect(ca.getCountry(), "value", "21");
		sendKeystext(ca.getOtherdetails(), "helloooo");
		sendKeystext(ca.getPhone(), "9874563210");
		sendKeystext(ca.getLastMobile(), "123456789");
		clearField(ca.getAlias());
		sendKeystext(ca.getAlias(), "my address");
		clickClick(ca.getSubmitButoon());
		System.out.println("***************Order Page*************************");
		OrderPage op=new OrderPage();
		Isdisplayingcheck(op.getOrderHistoryOpt(), "Order History");
		Isdisplayingcheck(op.getMyCredslip(), "My credit slip");
		Isdisplayingcheck(op.getMyAddresses(), "My Address");
		Isdisplayingcheck(op.getMyPersonalinfo(),"My Personal info");
		Isdisplayingcheck(op.getMyWishlist(), "My Wishlist");
		
		mouseActcionHover(op.getWomen());
		mouseActcionclick(op.getCasualdress());
		
		System.out.println("***************Product Ordering*************************");
		
		dropDownSelect(op.getFilter(), "value", "price:asc");
		mouseActcionclick(op.getProduct());
		mouseActcionclick(op.getPlusbutton());
		dropDownSelect(op.getSize(), "value", "2");
		takemMyScreen("Product Order");
		
		
		clickClick(op.getAddtocart());
		clickClick(op.getProceed1());
		comapretwostring(gettingText(op.getMyproductname1()), gettingText(op.getMyproductname2()), "Product Name");
		takemMyScreen("Product Confirmation");
		
		clickClick(op.getProceed2());
		scrollIt(op.getProceed3());
		clickClick(op.getProceed3());
		clickClick(op.getCheckboxtick());
		clickClick(op.getProceed4());
		
		clickClick(op.getBankOk());
		clickClick(op.getFinalclick());
		clickClick(op.getCart());
		
	}
	

}
