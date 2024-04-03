package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Testbase.BaseClass;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;

public class TC_002_LoginTest extends BaseClass
{
	@Test
	public void test_Login()
	{
		logger.info("Starting TC_002_LoginTest");
		
		try
		{				
			HomePage hp=new HomePage(driver);
					
			hp.clickLoginlink();
			logger.info("clicked on login link");
			
			LoginPage lp=new LoginPage(driver);
			
			lp.Email(rb.getString("email")); // valid email, get it from properties file
			
			lp.Password(rb.getString("password")); // valid password, get it from properties file
			
			lp.Loginbtn();
			logger.info("clicked on login button");
			
			MyAccountPage macc=new MyAccountPage(driver);
			
			boolean targetpage=macc.isMyAccountPageExists();
						
			Assert.assertEquals(targetpage, true,"login failed");
			
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info(" Finished TC_002_LoginTest");	
	}	
}