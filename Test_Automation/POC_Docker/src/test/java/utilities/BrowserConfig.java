package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserConfig {
    public static Properties TestConfig=null;
    public static WebDriver driver=null;
    public static EventFiringWebDriver usedriver=null;
    static Properties prop = new Properties();
	public BrowserConfig() throws IOException
	{
	}
public static WebDriver openbrowser()
{
    if(driver==null)
    {  
     try {
		prop.load(new FileInputStream("Configurations.properties/"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     Properties testconfig= prop;
     if(testconfig.getProperty("browser").equals("chrome"))
         {
          String exePath = "./ChromeDriver/chromedriver.exe";
          System.setProperty("webdriver.chrome.driver", exePath);
             ChromeOptions options = new ChromeOptions();
             options.addArguments("headless");
             options.addArguments("window-size=1200x600");
             driver = new ChromeDriver(options);
             //driver = new ChromeDriver();
             //driver.manage().window().maximize();
         
         }
     //usedriver = new EventFiringWebDriver(driver);
    }
	
   return driver;
  }
}

