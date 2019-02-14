package Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.Utils;
import bsh.classpath.BshClassPath.GeneratedClassSource;
import net.bytebuddy.asm.Advice.Return;

public class LoginTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\USER-PC\\workspace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@DataProvider
	public Object[][] getCellData() throws Throwable{
		Object data[][]=Utils.getTestdata("Login");
		return data;
	}
	
	@Test(dataProvider="getCellData")
	public void loginTest(String Username, String Password){
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).sendKeys(Password);
	}
	
	
	
	
	
	/*@AfterMethod
	public void teardown(){
		driver.quit();
	}*/
}
