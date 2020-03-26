package seliniumprgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googinabkvernac-21&ascsubtag=_k_CjwKCAiAj-_xBRBjEiwAmRbqYp6UyPz7RmUvAjmfHd9BCmOY4U7VVQWo6vE6E6lXULarea-2ScQaRhoCT_wQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAiAj-_xBRBjEiwAmRbqYp6UyPz7RmUvAjmfHd9BCmOY4U7VVQWo6vE6E6lXULarea-2ScQaRhoCT_wQAvD_BwE");
	driver.manage().window().maximize();

}
	}
