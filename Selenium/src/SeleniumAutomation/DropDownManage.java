package SeleniumAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownManage {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		
		//handle dropdown
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jan");
		System.out.println(title);
		
		
		
		

	}

}
