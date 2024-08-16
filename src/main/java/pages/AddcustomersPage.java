package pages;

import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddcustomersPage {

    WebDriver driver;
    
    public AddcustomersPage(WebDriver driver) {
        this.driver = driver;
    }
    
    @FindBy(how = How.XPATH , using = "//strong[normalize-space()='New Customer']")
    WebElement customerdashboard;
    
    @FindBy(how = How.XPATH , using = "//input[@name='name']")
    WebElement fullname;
    
    @FindBy(how = How.XPATH , using = "//*[@id='general_compnay']/div[2]/div/select")
    WebElement dropdown;
    
    @FindBy(how = How.XPATH , using = "//input[@name='email']")
    WebElement email;
    
    @FindBy(how = How.XPATH , using = "//input[@id='phone']")
    WebElement phone;
    
    @FindBy(how = How.XPATH , using = "//select[@name=\"country\"]")
    WebElement countrydropdown;
    
    @FindBy(how = How.XPATH , using = "//button[@id='save_btn']")
    WebElement clicksave;
    
    public String validatecustomerpage() {
        String dashboardelement = customerdashboard.getText();
        return dashboardelement;
    }
    
    public void customerfullname(String name) {
        fullname.sendKeys(name);
    }
    
    public void selectDropDown(String dropdownsel) {
        Select sel = new Select(dropdown);
        sel.selectByVisibleText(dropdownsel);
    }
    
    public void customeremail(String email) {
        Random rnd = new Random();
        int number = rnd.nextInt(9999);
        this.email.sendKeys(email + number + "@gmail.com");
    }
    
    public void customerphone(String num) {
        Random rnd = new Random();
        int number = rnd.nextInt(9999);
        this.phone.sendKeys(num + String.valueOf(number));
    }
    
    public void selectcountryDropDown(String countrydropdownsel) {
        Select sel = new Select(countrydropdown);
        sel.selectByVisibleText(countrydropdownsel);
    }
    
    public void clicksavebutton() {
    	clicksave.click();
    }
}
