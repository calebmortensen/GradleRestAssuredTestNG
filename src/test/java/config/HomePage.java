package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
			
	public void clickOnMyAccountDropMenu() {
		myAccountDropMenu.click();
	}
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
	public void selectLoginOption() {
		loginOption.click();
	}
	
}

