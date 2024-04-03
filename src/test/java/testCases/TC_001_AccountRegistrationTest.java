package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Testbase.BaseClass;
import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass {
    @Test
    public void testAccountRegistration() {
        logger.debug("Starting testAccountRegistration...");
        try {
            // Instantiate the HomePage and click on the Register link
            HomePage homePage = new HomePage(driver);
            homePage.clickRegister();
            logger.info("Clicked on Register link.");

            // Instantiate the AccountRegistrationPage
            AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
            logger.info("Filling registration form...");

            // Fill in registration details
            regPage.clickcheckbox();
           
            regPage.setFirstName(randomString().toUpperCase());
            
            regPage.setLastName(randomString().toUpperCase());
           
            String email = (randomString() + "@gmail.com");
            regPage.setEmail(email);
            logger.info("Email used for registration: " + email);
            
            regPage.clickDropdown();
            
            String value=" Oakland Technical High School";
            regPage.selectDropdownValue(value);
            logger.info("dropdown value selected");
            
                     
            String password = "Uday@151997";
            regPage.setPassword(password);
            
            regPage.setConfirmPassword(password);
            logger.info("Password set for registration.");
                        
            regPage.clickcheckbox();
            
            // Click on Register button
            regPage.clickRegister();
            logger.info("Clicked on Register button.");

            // Check if the registration was successful
            String confMsg = regPage.getConfirmationMsg();
            logger.info("Confirmation message received: " + confMsg);
            Assert.assertEquals(confMsg, "Your registration completed", "Registration confirmation message mismatch.");
            
            logger.info("TestAccountRegistration completed successfully.");
        } 
        catch (Exception e) {
            logger.error("Exception occurred: " + e.getMessage());
            e.printStackTrace();
            Assert.fail("TestAccountRegistration failed: An exception occurred.");
        }}}