package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriber,chrome,driver", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.xpath("//input[@type='submit' and @name='btnK' and @value='Google Search']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.linkText("ABCD Study")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
