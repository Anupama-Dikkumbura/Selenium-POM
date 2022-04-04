package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	WebDriver driver;
	
	By headerTXT = By.tagName("h1");
	
	By userTitleDROP = By.id("user_title");
	
	By userFirstNameTxtBox = By.id("user_firstname");
	
	By userSurnameTxtBox = By.id("user_surname");
	
	By userPhoneTxtBox = By.id("user_phone");
	
	// DOB
	By birthYearDrop = By.id("user_dateofbirth_1i");
	By birthMonthDrop = By.id("user_dateofbirth_2i");
	By birthDateDrop = By.id("user_dateofbirth_3i");
	
	By licenceTypeFullRadio = By.id("licencetype_f");
	
	By licencePeriodDrop = By.id("user_licenceperiod");
	
	By occupationDrop = By.id("user_occupation_id");
	
	// Address
	By streetTxtBox = By.id("user_address_attributes_street");
	By cityTxtBox = By.id("user_address_attributes_city");
	By countryTxtBox = By.id("user_address_attributes_county");
	By postCodeTxtBox = By.id("user_address_attributes_postcode");
	
	By emailTxtBox = By.id("user_user_detail_attributes_email");
	
	// Password
	By passwordTxtBox = By.id("user_user_detail_attributes_password");
	By confirmPasswordTxtBox = By.id("user_user_detail_attributes_password_confirmation");
	
	By createBtn = By.name("submit");
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Get Header
	public String getHeaderTxt() {
		return driver.findElement(headerTXT).getText();
	}
	
	// Set user title
	public void setUserTitle(String userTitle) {
		Select userTitleDrop = new Select(driver.findElement(userTitleDROP));
		userTitleDrop.selectByVisibleText(userTitle);
	}
	
	// Set first name
	public void setFirstName(String firstName) {
		driver.findElement(userFirstNameTxtBox).sendKeys(firstName);
	}
	
	// Set surname
	public void setSurname(String surname) {
		driver.findElement(userSurnameTxtBox).sendKeys(surname);
	}
	
	// Set phone number
	public void setPhoneNumber(String phoneNumber) {
		driver.findElement(userPhoneTxtBox).sendKeys(phoneNumber);
	}
	
	// Set Year
	public void setDOBYear(String year) {
		Select yearDrop = new Select(driver.findElement(birthYearDrop));
		yearDrop.selectByVisibleText(year);
	}
	
	// Set month
	public void setDOBMonth(String month) {
		Select monthDrop = new Select(driver.findElement(birthMonthDrop));
		monthDrop.selectByVisibleText(month);
	}
	
	// Set date
	public void setDOBDate(String date) {
		Select dateDrop = new Select(driver.findElement(birthDateDrop));
		dateDrop.selectByVisibleText(date);
	}
	
	// Select licence type as full
	public void setLicenceTypeAsFull() {
		driver.findElement(licenceTypeFullRadio).click();
	}
	
	// Set license period
	public void setLicencePeriod(String licencePeriod) {
		Select licencePeriodDropDown = new Select(driver.findElement(licencePeriodDrop));
		licencePeriodDropDown.selectByVisibleText(licencePeriod);
	}
	
	// Set occupation
	public void setOccupation(String occupation) {
		Select occupationDropDown = new Select(driver.findElement(occupationDrop));
		occupationDropDown.selectByVisibleText(occupation);
	}
	
	// Set street
	public void setStreet(String street) {
		driver.findElement(streetTxtBox).sendKeys(street);
	}
	
	// Set city
	public void setCity(String city) {
		driver.findElement(cityTxtBox).sendKeys(city);
	}
	
	// Set country
	public void setCountry(String country) {
		driver.findElement(countryTxtBox).sendKeys(country);
	}
	
	// Set postcode
	public void setPostcode(String postcode) {
		driver.findElement(postCodeTxtBox).sendKeys(postcode);
	}
	
	// Set email
	public void setEmail(String email) {
		driver.findElement(emailTxtBox).sendKeys(email);
	}
	
	// Set Password
	public void setPassword(String password) {
		driver.findElement(passwordTxtBox).sendKeys(password);
	}
	
	// Set confirm password
	public void setConfirmPassword(String confirmPassword) {
		driver.findElement(confirmPasswordTxtBox).sendKeys(confirmPassword);
	}
	
	// Click on create button
	public void clickCreateBtn() {
		driver.findElement(createBtn).click();
	}
	
	
}
