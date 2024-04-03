package pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    // Elements
    @FindBy(css = " div[class='homepagecarousel preview-carousel'] div[class='carousel-item active'] a:nth-child(2) ")
    WebElement lnkRegister;

    @FindBy(xpath = "//a[normalize-space()='Login']")
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
