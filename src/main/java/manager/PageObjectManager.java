package manager;

import org.openqa.selenium.WebDriver;

import pagewise_layer.HomePage;
import pagewise_layer.LoginPage;
import pagewise_layer.Sales;

public class PageObjectManager {

	WebDriver driver;
	private LoginPage lp;
	private HomePage hm;
	private Sales sale;
	
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	public LoginPage getLoginPage() {
		if(lp==null) {
			lp = new LoginPage(driver);
			return lp;
		}
		return lp;
	}

	public HomePage getHomePage() {
		if(hm==null) {
			hm = new HomePage(driver);
			return hm;
		}
		return hm;
	}
	
	public Sales getSalesPage() {
		if(sale==null) {
			sale = new Sales(driver);
			return sale;
		}
//		return (hm == null) ? hm = new HomePage(driver) : hm;
		return sale;
	}
}
