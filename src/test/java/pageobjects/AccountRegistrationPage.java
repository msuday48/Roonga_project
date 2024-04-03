package pageobjects;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

    public AccountRegistrationPage(WebDriver driver) {
        super(driver);
    }

    // Elements

    @FindBy(xpath= "//input[@id='firstName']")
    WebElement txtFirstName;

    @FindBy(xpath= "//input[@id='lastName']")
    WebElement txtLastName;

    @FindBy(css = "#email")
    WebElement txtEmail;

    @FindBy(css="input[placeholder='Organization Name *']")
    WebElement selectDropdown;
    
    @FindBy(css = "#password")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    WebElement txtConfirmPassword;
    
    @FindBy(xpath= "(//label[@for='c1'])")
    WebElement checkbox;
        
    @FindBy(xpath = "//button[@id='registerBtn']")
    WebElement btnRegister;

    @FindBy(xpath = "//div[@class='result']")
    WebElement msgConfirmation;

    // Action Methods
 

    public void setFirstName(String FirstName) throws InterruptedException {
        Thread.sleep(300);
        // Scroll the txtFirstName element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFirstName);
        txtFirstName.sendKeys(FirstName);
    }

    public void setLastName(String lname) throws InterruptedException {
        Thread.sleep(300);
        // Scroll the txtLastName element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLastName);
        txtLastName.sendKeys(lname);
    }

    public void setEmail(String email) throws InterruptedException {
        Thread.sleep(300);
        // Scroll the txtEmail element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtEmail);
        txtEmail.sendKeys(email);
    }
   
 // Modified dropdown method to select the first value by default
    public void clickDropdown() throws InterruptedException {
    	 Thread.sleep(300);
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectDropdown);
    	// Making sure the dropdown is clickable
    	Actions act = new Actions(driver);
        act.moveToElement(selectDropdown).click().perform();
    }
      
    public void selectDropdownValue(String value) throws InterruptedException {
    	 Thread.sleep(300);
        // Selecting the first option by index (assuming it's index 0)
    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectDropdown);
    	selectDropdown.sendKeys(value);
    }
    

    public void setPassword(String pwd) throws InterruptedException {
        Thread.sleep(300);
        // Scroll the txtPassword element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPassword);
        txtPassword.sendKeys(pwd);
    }

    public void setConfirmPassword(String pwd) throws InterruptedException {
        Thread.sleep(300);
        // Scroll the txtConfirmPassword element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtConfirmPassword);
        txtConfirmPassword.sendKeys(pwd);
    }

    
    public void clickcheckbox() throws InterruptedException {
        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
        Actions act = new Actions(driver);
       act.moveToElement(checkbox).click().perform();
    }
    
    public void clickRegister() throws InterruptedException {
    	   Thread.sleep(300);
    	// Scroll the btnRegister element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnRegister);
        Actions act = new Actions(driver);
        act.moveToElement(btnRegister).click().perform();
    }

    public String getConfirmationMsg() {
        try {
            return msgConfirmation.getText();
        } catch (Exception e) {
            return e.getMessage();
        }
    }   
}