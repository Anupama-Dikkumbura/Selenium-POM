package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By userEmailTxt = By.tagName("h4");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	// Get User's email
	public String getUserEmail() {
		return driver.findElement(userEmailTxt).getText();
	}
}
