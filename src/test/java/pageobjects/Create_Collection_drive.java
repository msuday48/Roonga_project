package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Create_Collection_drive extends BasePage {


	public Create_Collection_drive(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"launchNewDriveBtn\"]") 
	WebElement lauchdrive;
	
	@FindBy(css = "div[class='image-container flex-display']") 
	WebElement collection_drive ;
	
	
	@FindBy(xpath = "//button[@id='createBtn']") 
	WebElement create_button;
	
	@FindBy(xpath = "//input[@id='driveName']") 
	WebElement drivename;
	
	@FindBy(xpath = "//input[@id='friendlyUrl']") 
	WebElement driveurl ;
	
	
	@FindBy(css = "input[placeholder='Select Launch Date']") 
	WebElement select_launch_calender;
	
	/*@FindBy(css = "span[aria-label='Sunday, March 31, 2024']") 
	WebElement select_launch_date;*/
	
	@FindBy(xpath = "//input[@id='endDate']") 
	WebElement select_end_calender;
	
	/*@FindBy(xpath = "//span[@aria-label='Tuesday, April 30, 2024']") 
	WebElement select_end_date;*/
	
	@FindBy(xpath="(//div[@class='image'])[1]")
	WebElement media_button;
	
	@FindBy(xpath= "//img[@class='uploadedImage']") 
	WebElement select_image;
	
	@FindBy(css= "#saveBtn") 
	WebElement save_button;

	@FindBy(xpath = "//button[@id='nextStepBtn']") 
	WebElement next_button;
	
	
	
	public void launch_drive_button()  
	{
		lauchdrive.click();
	
	}

	public void launch_collection_drive()  
	{
		collection_drive.click();
	}
	
	public void click_create_button() throws InterruptedException   
	{
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
        act.moveToElement( create_button).click().perform();
		
	}
	
	
	public void setdriveName(String enter_driveName )  {
		drivename.sendKeys(enter_driveName);
	
	}

	public void setdrive_url(String enter_driveurl)   
	{
		driveurl.sendKeys(enter_driveurl);
	}
	
	public void setLaunch_date(String enter_launch_date)   
	{
		
		select_launch_calender.sendKeys(enter_launch_date);

        // Assuming you have a specific date you want to select, here's an example:
      //  String targetDate = "03/31/2024";

        // Locate the date element in the calendar and click on it
      //  Assert.assertEquals(targetPage, expectedHeadingText, "Heading text does not match expected");
       // select_launch_date.click();
	}
	
        public void setEnd_date(String enter_end_date)   
    	{
    		
    		select_end_calender.sendKeys(enter_end_date);
	 		
    	}

        public void image_upload() throws InterruptedException {
      
           
        	media_button.click();
        	
        	
        	select_image.click();
        	

            // Handle the file upload dialog
         
        	select_image.sendKeys("\"C:\\Users\\Admin\\Downloads\\istockphoto-1131608327-1024x1024.jpg\"");

            // Wait for some time for the upload to complete
            Thread.sleep(5000);

            System.out.println("Image uploaded successfully!");
      

        Thread.sleep(5000);

		Actions act = new Actions(driver);
        act.moveToElement( save_button).click().perform();
      
        }
        
        	public void next_step() 
        	{
        		next_button.click();
        	}	    	        	
}  	