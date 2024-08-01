package step_Definition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageObjectManager;
import pagewise_layer.HomePage;
import pagewise_layer.LoginPage;
import pagewise_layer.Sales;
import utitity_layer.WebUtil;


public class Steps {
	public WebDriver driver;
	public LoginPage lp;
	public HomePage home;
	public Sales sales;
	public PageObjectManager POM;
	public WebUtil we=new WebUtil();

	@Given("user is launch browser")
	public void user_is_launch_browser() {
		we.launchBrowser("chrome");

	}

	@Given("open url {string}")
	public void open_url(String url) {
		we.hitUrl(url);

	}

	@When("enter username {string} and password {string}")
	public void enter_username_and_password(String uname, String pwd) {
		POM= new PageObjectManager(driver); 
		lp=POM.getLoginPage();
//		lp = new LoginPage(driver);
		lp.validInputData(uname, pwd);
	}

	@When("click on login")
	public void click_on_login() {
		lp.loginClick();
	}

	@Then("title should be {string}")
	public void title_should_be(String expectedTitle) {
		we.verifyTitle(expectedTitle);
	}

	@Then("mouseOver on markerting")
	public void mouse_over_on_markerting() {
		POM= new PageObjectManager(driver); 
		home=POM.getHomePage();
		home = new HomePage(driver);
		home.mouseOverOnmarketing();

	}

	@When("click on marketingaccount")
	public void click_on_marketingAccount() {
		home.click_on_marketingaccount();

	}

	@When("click on plusBt")
	public void click_on_plus_bt() {
		home.clickonplusbt();
	}

	@When("enter accountname")
	public void enter_accountname() {
//		String s = randomString() + "sunil";
//		home.enter_accountname(s);
	}

	@When("enter discription")
	public void enter_discription() {
		home.enter_discription("abcd");
	}

	@When("click on saveBt")
	public void click_on_save_bt() {
		home.click_on_save_bt();
	}

	////////////// sales/////////////

	@Then("mouseOver on sales")
	public void mouse_over_on_sales() throws InterruptedException {
		Thread.sleep(2000);
		sales = new Sales(driver);
		sales.mouseOverOnSales();
	}

	@When("click on salesAccount")
	public void click_on_sales_Account() {
		sales.click_on_salesAccount();
	}

	@When("click on salesplusBt")
	public void click_on_salesPlus_bt() {
		sales.click_on_plus_bt();
	}

	@When("enter salesAccountname {string}")
	public void enter_sales_Accountname(String name) {
//		sales.enter_accountname(randomString() + name);
	}

	@When("enter salesDiscription {string}")
	public void enter_sales_Discription(String str) {
//		sales.enter_discription(randomString() + str);
	}

	@When("click on salesSaveBt")
	public void click_on_salesSave_bt() {
		sales.click_on_save_bt();
	}

}
