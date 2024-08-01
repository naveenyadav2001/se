package page_element_layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOR {

	
	
	@FindBy(xpath="//a[text()='Sales']")
	protected WebElement moveEleOnSales ;
	
	@FindBy(xpath="//div[@id='Sales_sub']//a[text()='Accounts']")
	protected WebElement salesAccountModl ;
	
	@FindBy(xpath="//img[contains(@alt,'Create Account')]")
	protected WebElement salesPluseBt ;
	
	
	@FindBy(xpath="//input[@name='accountname']")
	protected WebElement salesAccountname ;
	
	
	@FindBy(xpath="//textarea[@name='description']")
	protected WebElement discriptionBt ;
	
	//b[text()='Description Information']//parent::td//parent::tr//following-sibling::tr//div//input[@accesskey='S']
	@FindBy(xpath="//b[text()='Description Information']//parent::td//parent::tr//following-sibling::tr//div//input[@accesskey='S']")
	protected WebElement salesSaveBt ;
	
	
	
}
