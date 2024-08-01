package utitity_layer;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebUtil {

	public WebDriver driver;
	public ExtentReports exRepo;
	public ExtentSparkReporter extspark;
	public ExtentTest ext;

	public void launchBrowser(String browserName) {
		if(browserName=="chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName=="firefox") {
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}

	}

	public void setup() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

	}

	public WebDriver getdriver() {

		return driver;
	}

	public void hitUrl(String url) {
		try {
			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendData(WebElement we, String str) {
		try {
			we.clear();
			we.sendKeys(str);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void clickBt(WebElement we) {
		try {
			we.click();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void mouseOver(WebElement we) {
		Actions act = new Actions(driver);
		try {
			act.moveToElement(we).build().perform();
			//			ext.log(Status.PASS, "successfully move on element");
		} catch (Exception e) {
			e.printStackTrace();
			//			ext.log(Status.FAIL, "successfully not move on element");

		}
	}

	public void validateText(String actual, String expt) {
		if (actual.equals(expt)) {
			System.out.println("Text is successfully match");
		} else {
			System.out.println("Text is not match");

		}
	}

	public void handlewindow() {

		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			driver.switchTo().window(handle);
			break;
		}
		driver.close();

	}

	public void takeSnapShot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("BDD_mondh_automation//ScreenShot.jpg");

		try {
			Files.copy(source, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void verifyTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("title is matched");
		} else {
			System.out.println("title is not matched");
		}
	}

	public void extentRepo() {
		extspark = new ExtentSparkReporter("report\\new report.html");
		exRepo = new ExtentReports();
		exRepo.attachReporter(extspark);
		//	createReport("tc002");
		//return exRepo;
	}

	public void createReport(ExtentReports exRepo,String name) {
		ext = exRepo.createTest(name);
	}

	public void flushReport() {
		exRepo.flush();
	}
}
