package pageobjects;

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
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement btnRegister;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement buttonGender;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement txtFirstName;

    @FindBy(xpath = "(//input[@id='LastName'])[1]")
    WebElement txtLastName;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement txtConfirmPassword;

    @FindBy(xpath = "//div[@class='result']")
    WebElement msgConfirmation;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

    // Action Methods
    public void clickGenderButton() throws InterruptedException {
        Thread.sleep(300);
        Actions act = new Actions(driver);
        // Scroll the buttonGender element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonGender);
        act.moveToElement(buttonGender).click().perform();
    }

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

    public void clickRegister() {
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

    public void clickContinue() {
        continueButton.click();
    }
}
