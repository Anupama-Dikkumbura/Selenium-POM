package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By headerTxt = By.tagName("h3");
	
	By registerBTN = By.linkText("Register");
	
	By emailTxtBox = By.id("email");
	
	By passwordTxtBox = By.id("password");
	
	By loginBtn = By.name("submit");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Click on Register button
	public void clickRegisterBtn() {
		driver.findElement(registerBTN).click();
	}
	
	// Return header text
	public String getHeaderTxt() {
		return driver.findElement(headerTxt).getText();
	}
	
	// Set email
	public void setEmail(String email) {
		driver.findElement(emailTxtBox).sendKeys(email);
	}
	
	// Set password
	public void setPassword(String password) {
		driver.findElement(passwordTxtBox).sendKeys(password);
	}
	
	// Click Login Button
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	

}
