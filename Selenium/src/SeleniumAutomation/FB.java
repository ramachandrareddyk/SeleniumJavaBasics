package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		driver.findElement(By.id("email")).sendKeys("8106660316");
		driver.findElement(By.id("pass")).sendKeys("Ramureddy@77");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println(title);
	}
}
