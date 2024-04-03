package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    // Elements
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement lnkRegister;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement lnkLogin;

    // Action Methods
    public void clickRegister() {
        lnkRegister.click();
    }

    // Action Methods
    public void clickLoginlink()  {
      lnkLogin.click();
    }
}