package SeleniumAutomation;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {
	
	public static WebDriver driver;
	public static void main (String args[]) throws Throwable
	{
		Properties prop = new Properties();
		 FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\workspace\\NaveenAutomation\\src\\SeleniumAutomation\\objects.properties");
		 
		 prop.load(fis);
		 
		 System.out.println(prop.getProperty("from"));
		 
		 String url = prop.getProperty("url");
		 
		 System.out.println(url);
		 
		 String browse =prop.getProperty("browser");
		 
		 System.out.println(browse);
		 
		 if(browse.equalsIgnoreCase("chrome")){
			
		 System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
			 driver = new ChromeDriver();
			}else if (browse.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\workspace\\NaveenAutomation\\geckodriver.exe");
				 driver = new FirefoxDriver();
			}
		 
		 driver.get(url);
	}

}
