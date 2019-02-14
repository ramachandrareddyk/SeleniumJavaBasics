package SeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		WebElement uname= driver.findElement(By.id("email"));
		WebElement pass= driver.findElement(By.id("pass"));
		
		uname.sendKeys("8106660316");
		pass.sendKeys("Ramureddy@77");
		
		System.out.println(uname.getAttribute("value"));
		WebElement text=driver.findElement(By.className("_5iyx"));
		System.out.println(text.getText());

	}

}
