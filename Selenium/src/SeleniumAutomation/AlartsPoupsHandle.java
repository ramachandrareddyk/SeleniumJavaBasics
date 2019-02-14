package SeleniumAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartsPoupsHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("8106660316");
		
		driver.findElement(By.id("pass")).sendKeys("Ramureddy@77");
		
		driver.findElement(By.id("u_0_2")).click();
		
		
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

}
