package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;


import Testbase.BaseClass;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.Ourdrives;
import pageobjects.View_drive;

public class TC_003_Search_drives extends BaseClass {

	@Test(groups= {"master"})
	public void verify_productSearch() throws InterruptedException {
		logger.info(" Starting TC_003_Searchdrives ");

		try {
			
			HomePage hp=new HomePage(driver);
			logger.info("clicked on myaccount link on the home page..");
			hp.clickLoginlink(); //Login link under MyAccount
			logger.info("clicked on login link under myaccount..");

			LoginPage lp=new LoginPage(driver);
			logger.info("Entering valid email and password..");
			lp.setEmail(p.getProperty("email"));
			
			lp.setPassword(p.getProperty("password"));
			
			lp.clickLogin(); //Login button
			logger.info("clicked on ligin button..");
			
			
		Ourdrives dr=new Ourdrives(driver);
		
		 dr.clickourdrives();
		 logger.info("clicked on OurDrives in our drives page");
	
		 dr.clicksearchfield();
         logger.info("clicked on serach field");

         
         String value="test_collection_drive";
         dr.enterdrivename(value);
         logger.info("drive name  entered in serach field");
	
         dr.clicksearch();
         logger.info("clicked serach icon");  
         
         dr.click_view_drive();
         logger.info("clicked on view drive");
        
         View_drive drive=new View_drive(driver);
			
 		boolean targetPage=drive.MydrivePageExists(); 		
 		Assert.assertEquals(targetPage, true,"My drivePage not Exists");			
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
		logger.info("**** Finished TC_002_LoginTest  ****");
	}
}