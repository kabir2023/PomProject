package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class DashBoardTest {

	
	WebDriver driver;
	String username = "demo@codefios.com";
	String password = "abc123";
	
	@Test
	public void dashvalidation() {
		
		driver=BrowserFactory.init();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.inputusername(username);
		login.inputupassword(password);
		login.clickLogin();
		
		DashboardPage ds = PageFactory.initElements(driver, DashboardPage.class);
		Assert.assertEquals(ds.dashboardgettext(), "Dashboard", "Dashboard page not found !");
		ds.clickcustomers();
		ds.clickaddcustomers();
	}
}
