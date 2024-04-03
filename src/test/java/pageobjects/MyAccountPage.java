package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[@class='capitalize']") // MyAccount Page heading
    WebElement msgHeading;

    public String getMyAccountPageHeadingText() {
        try {
            String headingText = msgHeading.getText();
            System.out.println("Account name : " + headingText); // Print the text to the console
            return headingText;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }}