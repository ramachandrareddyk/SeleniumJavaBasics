package SeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("http:www.facebook.com");
			
			clickOn(driver, driver.findElement(By.xpath("//*[@id='u_0_2']")), 20);
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
			 
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
			 

	}
	public static void clickOn(WebDriver driver, WebElement locator, int timeout){
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
	

}
