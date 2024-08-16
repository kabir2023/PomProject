package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddcustomersPage;
import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class AddCustomersTest {

	WebDriver driver;
	String username = "demo@codefios.com";
	String password = "abc123";
	String customerfullname = "Kamran Abir";
	String phonenumber = "863599";
	String emailaddress = "abc";
	String dropdowntext = "Abir Amz llc";
	String countrysel = "Bangladesh";
	
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
		
		AddcustomersPage customerpg = PageFactory.initElements(driver, AddcustomersPage.class);
		Assert.assertEquals(customerpg.validatecustomerpage(), "New Customer", "New customer page not found !");
		customerpg.customerfullname(customerfullname);
		customerpg.selectDropDown(dropdowntext);
		customerpg.customeremail(emailaddress);
		customerpg.customerphone(phonenumber);
		customerpg.selectcountryDropDown(countrysel);
		customerpg.clicksavebutton();
		
	}

}
