package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import Testbase.BaseClass;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;

public class TC_002_LoginTest extends BaseClass
{
	@Test(groups= {"sanity","master"})
	public void verify_login()
	{
		logger.info("**** Starting TC_002_LoginTest  ****");
		logger.debug("capturing application debug logs....");
		try
		{
		//Home page
		HomePage hp=new HomePage(driver);
		logger.info("clicked on myaccount link on the home page..");
		hp.clickLoginlink(); //Login link under MyAccount
		logger.info("clicked on login link under myaccount..");		
		//Login page
		
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin(); //Login button
		logger.info("clicked on ligin button..");
		
		 // My Account Page
        MyAccountPage macc = new MyAccountPage(driver);
        String targetPage = macc.getMyAccountPageHeadingText();
        
        // Asserting against expected heading text
        String expectedHeadingText = "Uday"; // Modify this to the expected heading text
        Assert.assertEquals(targetPage, expectedHeadingText, "Heading text does not match expected");
    } catch(Exception e) {
        Assert.fail("An exception occurred: " + e.getMessage());
    }
    logger.info("**** Finished TC_002_LoginTest  ****");
}}