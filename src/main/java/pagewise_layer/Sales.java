package pagewise_layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import page_element_layer.SalesOR;
import utitity_layer.WebUtil;

public class Sales extends SalesOR {
  public  WebDriver driver;
   public WebUtil we;
   
	public Sales(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void mouseOverOnSales() {
		Actions act=new Actions(driver);
		act.moveToElement(moveEleOnSales).build().perform();
	}
	public void click_on_salesAccount() {
		salesAccountModl.click();
	}

	public void click_on_plus_bt() {
		salesPluseBt.click();
	}

	public void enter_accountname(String  name) {
		salesAccountname.sendKeys(name);
	}
	public void enter_discription(String dis) {
		discriptionBt.sendKeys(dis);
	}

	public void click_on_save_bt() {
		salesSaveBt.click();
	   }
}
