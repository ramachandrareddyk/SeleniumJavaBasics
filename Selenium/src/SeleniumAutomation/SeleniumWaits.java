package SeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebDriverWait wait= new WebDriverWait(driver, 15);
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA']")).sendKeys("8106660316");
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv']")).sendKeys("Ramureddy@77");
		
		WebElement loginButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")));

		loginButton.click();
		
		
	}

}
