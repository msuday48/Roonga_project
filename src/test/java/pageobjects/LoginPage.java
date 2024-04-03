package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@id='loginBtn']")
	WebElement btnLogin;


	public void setEmail(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() throws InterruptedException {
		Thread.sleep(5000);
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnLogin);
	        Actions act = new Actions(driver);
	        act.moveToElement(btnLogin).click().perform();
	}

	

}
