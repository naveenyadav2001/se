package pagewise_layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import page_element_layer.HomePageOR;
import utitity_layer.WebUtil;

public class HomePage extends HomePageOR {
	 public WebDriver driver;
	public WebUtil we;

	public HomePage(WebDriver driver) {
		this. driver=driver;
		//this.we = driver;
		PageFactory.initElements(driver, this);
	}

	public void mouseOverOnmarketing() {

		Actions act = new Actions(driver);
		act.moveToElement(moveEle).build().perform();
	}

	public void click_on_marketingaccount() {
		actModl.click();
	}

	public void clickonplusbt() {
//		we.clickBt(pluseBt);
		pluseBt.click();
	}

	public void enter_accountname(String name) {
		accountname.sendKeys(name);
	}

	public void enter_discription(String dis) {
		discBt.sendKeys(dis);
	}

	public void click_on_save_bt() {
		saveBt.click();
	}

}
