package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTC {
	
	WebDriver driver;
	SoftAssert sa;
	WebDriverWait wait;
		
	LoginPage loginObj;
	RegisterPage registerObj;
	HomePage homeObj;
	
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
		homeObj = new HomePage(driver);
		
	}
	
	@Test
	public void registerTest() {
		
		// URL
		driver.get("https://demo.guru99.com/insurance/v1/");
		
		loginObj.clickRegisterBtn();
		sa.assertEquals(registerObj.getHeaderTxt(), "Sign up as a new user");
		
		registerObj.setUserTitle("Mr");
		registerObj.setFirstName("Anupama");
		registerObj.setSurname("Dikkumbura");
		registerObj.setPhoneNumber("0761306338");
		
		// Set DOB
		registerObj.setDOBYear("1990");
		registerObj.setDOBMonth("May");
		registerObj.setDOBDate("20");
		
		// Select Full as licence type
		registerObj.setLicenceTypeAsFull();
		
		// Set Licence period
		registerObj.setLicencePeriod("5");
		
		// Set Occupation
		registerObj.setOccupation("Engineer");
		
		// Set Address
		registerObj.setStreet("test");
		registerObj.setCity("Wellawaya");
		registerObj.setCountry("Sri Lanka");
		registerObj.setPostcode("91100");
		
		// Set Email
		registerObj.setEmail("abc@abc.com");
		
		// Set Password & Confirm password
		registerObj.setPassword("abc123");
		registerObj.setConfirmPassword("abc123");
		
		// Click on create
		registerObj.clickCreateBtn();
		
		// Verify Login page
		sa.assertEquals(loginObj.getHeaderTxt(), "Login");
		
		loginObj.setEmail("abc@abc.com");
		loginObj.setPassword("abc123");
		loginObj.clickLoginBtn();
		
		// Verify user logged in
		sa.assertEquals(homeObj.getUserEmail(), "abc@abc.com");
		
	}
	
	@AfterTest
	public void tearDown() {
		sa.assertAll();
		driver.close();
		driver.quit();
		
	}

	
}
