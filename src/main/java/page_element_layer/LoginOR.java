package page_element_layer;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utitity_layer.WebUtil;

public class LoginOR {
	WebUtil we;
	
	@FindBy(xpath="//input[@name='user_name']")
	protected WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	protected WebElement pwd;
	
	@FindBy(xpath="//input[@name='Login']")
	protected WebElement loginBt;
	

	
	
	
	
	
	
}
