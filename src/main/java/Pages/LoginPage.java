package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By registerBTN = By.linkText("Register");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Click on Register button
	public void clickRegisterBtn() {
		driver.findElement(registerBTN).click();
	}

}
