package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com");
		
			driver.findElement(By.xpath("//*[@class='_2zrpKA']")).sendKeys("8106660316");
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv']")).sendKeys("Ramureddy@77");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@class='_2cyQi_']"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Orders")).click();
		
		Thread.sleep(30000);
		Actions action1=new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//*[@class='_2cyQi_']"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(3000);	
		driver.close();
		

	}

}
