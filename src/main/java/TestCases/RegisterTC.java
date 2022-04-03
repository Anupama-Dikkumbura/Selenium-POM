package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTC {
	
	WebDriver driver;
	SoftAssert sa;
	WebDriverWait wait;
		
	LoginPage loginObj;
	RegisterPage registerObj;
	
	@BeforeTest
	public void setup() {
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(op);
		sa = new SoftAssert();
		wait = new WebDriverWait(driver, 20);
		
		loginObj = new LoginPage(driver);
		registerObj = new RegisterPage(driver);
		
	}
	
	@Test
	public void registerTest() {
		
		// URL
		driver.get("https://demo.guru99.com/insurance/v1/");
		
		
		loginObj.clickRegisterBtn();
		
		sa.assertEquals(registerObj.getHeaderTxt(), "Sign up as a new user");
		
		registerObj.setUserTitle("Mr");
		
		
		
		
	}
	
	@AfterTest
	public void tearDown() {
		sa.assertAll();
		driver.close();
		driver.quit();
		
	}

	
}
