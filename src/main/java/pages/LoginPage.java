package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	 WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;	
	}
	
	@FindBy(how = How.XPATH,using = "//input[@id='user_name']")
	WebElement username;
	
	@FindBy(how = How.XPATH,using = "//input[@id='password']")
	WebElement password;
	
	@FindBy(how = How.XPATH,using = "//button[@id='login_submit']")
	WebElement login;
	
	public void inputusername(String user) {
		this.username.sendKeys(user);
	}
	public void inputupassword(String password) {
		this.password.sendKeys(password);
	}
	public void clickLogin() {
		this.login.click();
	}
	
}
	


