package pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Ourdrives extends BasePage
{   
	public Ourdrives(WebDriver driver)
	{
		super(driver);
	}	
	
	    @FindBy(xpath="//*[@id=\"myNavbar\"]/ul/li[5]/a")
	    WebElement ourdrive;
	
	    @FindBy(xpath="//input[@placeholder='Enter Drive Name...']")
		WebElement enter_drive_name;
	
		@FindBy(xpath="//div[@class='webfilters filters-div flex-display']//div[3]//div[2]//img[1]")
		WebElement search_drive;
		
		@FindBy(xpath="//a[@href='https://dev.roonga.com/lkwemkld']//button[@class='btn explore-btn'][normalize-space()='View Drive']")
		WebElement view_drive;
	
		 
        public void clickourdrives() throws InterruptedException {
        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
        	 ourdrive.click();
        	 /* ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",ourdrive);
	    	
          	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
          	Actions act = new Actions(driver);
              act.moveToElement(ourdrive).click().perform(); */
        }
        
        
        
		public void clicksearchfield() throws InterruptedException {
	    	 Thread.sleep(3000);
	    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", enter_drive_name);
	    	
	    	Actions act = new Actions(driver);
	        act.moveToElement(enter_drive_name).click().perform();
	    }
	    
	    public void enterdrivename(String value) throws InterruptedException {
	    	 Thread.sleep(3000);
	        // Selecting the first option by index (assuming it's index 0)
	    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",enter_drive_name);
	    	 enter_drive_name.sendKeys(value);
	    }
	    
		public void clicksearch() throws InterruptedException {
	    	 Thread.sleep(3000);
	    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", search_drive);
	    
	    	Actions act = new Actions(driver);
	        act.moveToElement(search_drive).click().perform();
		}
		
	        public void click_view_drive() throws InterruptedException {
		    	 Thread.sleep(3000);
		    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", view_drive);
		    
		    	Actions act = new Actions(driver);
		        act.moveToElement(view_drive).click().perform()   ; 
	        }	  
	        	}