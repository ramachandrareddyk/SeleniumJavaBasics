package SeleniumAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElimentsConcept {
	public static void main (String args[])
	{

		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//get the count of links avilable in this page
		//get the text of every link
		
		driver.get("https://www.facebook.com");
		
		List <WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		List <WebElement>inputlist=driver.findElements(By.tagName("input"));
		System.out.println(inputlist.size());
		
		List <WebElement>buttonlist=driver.findElements(By.tagName("button"));
		System.out.println(buttonlist.size());
		
		for (int i = 0; i < linklist.size(); i++) {
			String linktest=linklist.get(i).getText();
			System.out.println(linktest);}
			
			for (int j = 0; j < inputlist.size(); j++) {
				String inputtext=inputlist.get(j).getText();
				System.out.println(inputtext);
			}
			
		
		
	}

}
