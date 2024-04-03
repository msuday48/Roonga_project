package testCases;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Testbase.BaseClass;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.Create_Collection_drive;

public class TC_004_Collection_Drive extends BaseClass {

    @Test(groups= {"master"})
    public void verify_productSearch() throws InterruptedException {
        logger.info("Starting TC_004_Collection_Drive");

        try {

            HomePage hp=new HomePage(driver);
            logger.info("Navigating to the login page...");
            hp.clickLoginlink(); // Clicking on the login link

            LoginPage lp=new LoginPage(driver);
            logger.info("Entering valid email and password...");
            lp.setEmail(p.getProperty("email"));
            lp.setPassword(p.getProperty("password"));
            lp.clickLogin(); // Clicking on the login button

            // Now, we need to create a collection drive
            Create_Collection_drive createDrive = new Create_Collection_drive(driver);
            logger.info("Launching the new drive...");
            createDrive.launch_drive_button(); // Clicking on the button to launch a new drive

            logger.info("Selecting the collection drive...");
            createDrive.launch_collection_drive(); // Clicking on the collection drive

            logger.info("Clicking on the create button...");
            createDrive.click_create_button(); // Clicking on the create button

            // Set the drive name
           
            logger.info("Setting the drive name...");
            createDrive.setdriveName(randomString().toUpperCase());

            // Set the drive URL
            String driveURL = "https://udayroonga.com";
            logger.info("Setting the drive URL...");
            createDrive.setdrive_url(driveURL);

            // Set the launch date
            String launchdate="03/31/2024";
            logger.info("Setting the launch date...");
            createDrive.setLaunch_date(launchdate);
           
            // Set the end date
            String enddate="04/30/2024";
            logger.info("Setting the end date...");
            createDrive.setEnd_date(enddate);

            // Upload image
            logger.info("Uploading the image...");
            createDrive.image_upload();

            // Click on next step
            logger.info("Clicking on next step button...");
            createDrive.next_step();

        } catch (Exception e) {
            // Handle any exceptions that might occur during the test
            logger.error("An error occurred: " + e.getMessage());
            Assert.fail("Test case failed: " + e.getMessage());
        }
    }
}
