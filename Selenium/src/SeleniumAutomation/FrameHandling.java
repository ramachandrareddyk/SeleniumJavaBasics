package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("Ramachandra");
		
		driver.findElement(By.name("password")).sendKeys("Ramureddy@77");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		driver.findElement(By.name("cs_name")).sendKeys("DataScience");
		
		Thread.sleep(2000);
		
		Select select=new Select(driver.findElement(By.xpath("//select[@name='cs_category']")));
		select.deselectByVisibleText("Friend");
	}
}
