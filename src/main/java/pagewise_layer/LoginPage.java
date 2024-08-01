package pagewise_layer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import page_element_layer.LoginOR;
import utitity_layer.WebUtil;


public class LoginPage {
	WebDriver driver;
	WebUtil we;

	@FindBy(xpath="//input[@name='user_name']")
	protected WebElement username;

	@FindBy(xpath="//input[@name='user_password']")
	protected WebElement pwd;

	@FindBy(xpath="//input[@name='Login']")
	protected WebElement loginBt;

	public LoginPage(WebDriver driver){
		this.driver=driver;
		we=new WebUtil();
		PageFactory.initElements(driver,this);

	}

	public void validInputData(String uname,String password) {
		we.sendData(username,uname );
//		we.sendData(pwd,password);
		System.out.println("-----------");

//				username.sendKeys(uname);
		//		System.out.println("-----------");
		//
		//		pwd.sendKeys(password);
	}
	public void loginClick() {
		we.clickBt(loginBt);
	}









}
