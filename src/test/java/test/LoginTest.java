package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	String username = "demo@codefios.com";
	String password = "abc123";
	
	@Test
	public void validusershouldLogin() {
		
		driver=BrowserFactory.init();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.inputusername(username);
		login.inputupassword(password);
		login.clickLogin();
	}
	
}
