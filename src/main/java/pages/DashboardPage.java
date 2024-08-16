package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.LINK_TEXT, using = "Dashboard")
	WebElement dashboardText;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span")
	WebElement customers;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Add Customer']")
	WebElement addcustomers;

	public String dashboardgettext() {

		String dashboardtext1 = dashboardText.getText();
		return dashboardtext1;

	}

	public void clickcustomers() {
		customers.click();
	}

	public void clickaddcustomers() {
		addcustomers.click();
	}

}
