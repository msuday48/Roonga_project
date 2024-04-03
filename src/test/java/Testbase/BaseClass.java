package Testbase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
public class BaseClass {
  
	public static WebDriver driver;
public Logger logger;
public Properties p;
public ResourceBundle rb;   
@BeforeClass
    @Parameters({"os" , "browser"})
    public void setup(String os,String br) throws IOException 
{
FileReader file=new FileReader(".//src/test/resources/config.properties");
     p=new Properties();	
p.load(file);
	

	logger=LogManager.getLogger(this.getClass());  //logging

	switch (br.toLowerCase())
	{
	case "chrome" : 
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		driver=new ChromeDriver(opt);
	      break;
	
	case "Edge" :
		driver=new EdgeDriver();
		break;
	
	default : System.out.println("no matching browser");
	return;
	}
	
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get(p.getProperty("appURL"));

driver.manage().window().maximize();

    }


    public String randomString() {
        return RandomStringUtils.randomAlphabetic(5);
    }

    
    public String randomNumber() {
        return RandomStringUtils.randomNumeric(10);
    }

    
    public String randomAlphaNumeric() {
        String st = RandomStringUtils.randomAlphabetic(4);
        String num = RandomStringUtils.randomNumeric(3);
        return st + "@" + num;
    }

    
    public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
}
}