package stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class steps {
	public WebDriver driver;
	public LoginPage lp;

	@Given("user launch Chrome browser")
	
	 @Given("^user launch Chrome browser$")
	    public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		lp = new LoginPage(driver);

	}

	@When("user launch URL {string}")
	public void user_launch_url(String url) {
		driver.get(url);
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		lp.username(username);
		lp.password(password);
	}

	@When("click on login")
	public void click_on_login() {
		lp.clicklogin();
	}

	@Then("page title should be displayed {string}")
	public void page_title_should_be_displayed(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title,driver.getTitle());
		}

	}

	@When("user click on logout link")
	public void user_click_on_logout_link() {
		lp.clicklogout();

	}

	@Then("page titleshould be {string}")
	public void age_titleshould_be(String string) {

	}

	@Then("close browser")
	public void close_browser() {
		driver.close();

	}

}
