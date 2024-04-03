package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class View_drive extends BasePage{



	public View_drive(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h4[normalize-space()='test_collection_drive']") // Mydrivepage Page heading
	WebElement msgHeading;
	
	public boolean MydrivePageExists()   // Mydrive Page heading display status
	{
		try 
		{
			return (msgHeading.isDisplayed());
		} 
		catch (Exception e)
		{
			return (false);
		}
	}}