package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://atlantis-qa3-dashboard.quantela.com");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("savadayal@jaipur.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("anil123");
		driver.findElement(By.xpath("//button[@class='login-button mat-raised-button mat-accent']")).click();
		
	}

}
