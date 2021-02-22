package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='email valid']")
	@CacheLookup
	WebElement username;

	@FindBy(xpath = "//input[@class='password valid']")
	@CacheLookup
	WebElement password;
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	@CacheLookup
	WebElement login;
	@FindBy(xpath = "//a[@href='/logout']")
	@CacheLookup
	WebElement logout;

	public void username(String uname) {
		username.clear();
		username.sendKeys(uname);
	}

	public void password(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void clicklogin() {
		login.click();
	}
	public void clicklogout() {
		logout.click();
	}
}
