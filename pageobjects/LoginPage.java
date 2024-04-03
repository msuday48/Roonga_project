package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmailAddress;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement btnLogin;

	public void Email(String email) {
		txtEmailAddress.sendKeys(email);
	}

	public void Password(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void Loginbtn() {
		btnLogin.click();
	}
}