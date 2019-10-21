package StepDeffintion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDeffination {
	static WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page()  {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\USER-PC\\workspace\\FreeCRMBDDFramework\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.get("https://www.crmpro.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@When("^title of Login page Free CRM$")
	public void title_of_Login_page_Free_CRM()  {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		
	    
	}

	@Then("^Usr enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void usr_enters_username_and_password(String username,String password)  {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	    
	}

	@Then("^user clicks on login Button$")
	public void user_clicks_on_login_Button()  {
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^user on Homepage$")
	public void user_on_Homepage()  {
		
		String HomepageTitle=driver.getTitle();
		Assert.assertEquals(HomepageTitle, "CRMPRO");
	    
	}
	@Then("^close the browser$")
	public void close_the_browser(){
		driver.quit();
	}

	
	
}
