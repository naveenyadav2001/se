package page_element_layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageOR {

	
	
	@FindBy(xpath="//a[text()='Marketing']")
	protected WebElement moveEle ;
	
	@FindBy(xpath="//div[@id='Marketing_sub']//a[text()='Accounts']")
	protected WebElement actModl ;
	
	@FindBy(xpath="//img[contains(@alt,'Create Account')]")
	protected WebElement pluseBt ;
	
	
	@FindBy(xpath="//input[@name='accountname']")
	protected WebElement accountname ;
	
	
	@FindBy(xpath="//textarea[@name='description']")
	protected WebElement discBt ;
	
	//b[text()='Description Information']//parent::td//parent::tr//following-sibling::tr//div//input[@accesskey='S']
	@FindBy(xpath="//b[text()='Description Information']//parent::td//parent::tr//following-sibling::tr//div//input[@accesskey='S']")
	protected WebElement saveBt ;
	
	
	
}
