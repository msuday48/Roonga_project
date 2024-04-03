package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Testbase.BaseClass;
import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass {

    @Test
    public void testAccountRegistration() throws InterruptedException {
        logger.debug("application logs");
    	try {
            // Instantiate the HomePage and click on the Register link
            HomePage homePage = new HomePage(driver);
            homePage.clickRegister();
            logger.info("clicked on register link");
            
            // Instantiate the AccountRegistrationPage
            AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
            logger.info("Providing customer data");
            // Click on the Register button without entering any details
            regPage.clickRegister();


            // Log registration details
           regPage.clickGenderButton();
            regPage.setFirstName(randomString().toUpperCase());
            regPage.setLastName(randomString().toUpperCase());
            regPage.setEmail(randomString() + "@gmail.com");
         
           
            regPage.setPassword("Uday@151997");
         
            regPage.setConfirmPassword("Uday@151997");

            // Click on Register button again
            regPage.clickRegister();
            logger.info("clicked on register button");
            
            // Check if the registration was successful
            String confMsg = regPage.getConfirmationMsg();
            logger.info("validating some message");
            Assert.assertEquals(confMsg, "Your registration completed","not getting expected message");

            // Click on Continue button
            regPage.clickContinue();

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Test failed: An exception occurred.");
        }
    }
}