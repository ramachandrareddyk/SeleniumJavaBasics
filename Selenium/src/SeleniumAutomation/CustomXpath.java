package SeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String args[]) throws Throwable
	{
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//input[contains(@class,'_2zrpKA')]")).sendKeys("81066660316");
		
		driver.findElement(By.xpath("//input[starts-with(@class,'_2zrpKA _3v41xv')]")).sendKeys("Ramureddy@77");
		
		
		Thread.sleep(30000);
		
		driver.close();
		
	}
}
