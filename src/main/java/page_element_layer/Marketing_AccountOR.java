package page_element_layer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Marketing_AccountOR {

	
	@FindBy(xpath="//input[@name='accountname']")
	protected WebElement accountname;
	
	@FindBy(xpath="//input[@value='T']")
	protected WebElement radioBt;
	
	@FindBy(xpath="//textarea[@name='description']")
	protected WebElement discription;
	
	@FindBy(xpath="//textarea[@name='description']")
	protected WebElement saveBt;
	
	
	
	
	
	
	
	
	
	
	
}
