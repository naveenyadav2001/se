package step_Definition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pagewise_layer.HomePage;
import pagewise_layer.LoginPage;
import pagewise_layer.Sales;
import utitity_layer.WebUtil;



public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public HomePage home;
	public Sales sales;
	public WebUtil we=new WebUtil();

	
	public static String randomString() {
		String str = RandomStringUtils.randomAlphabetic(5);
		return str;
	}

}
