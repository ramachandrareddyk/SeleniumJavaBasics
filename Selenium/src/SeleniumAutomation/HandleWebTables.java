package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTables {
	
	public static void main(String[]args){
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\USER-PC\\workspace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		String BeforeXpath="//*[@id='customers']/tbody/tr[";
		String AfterXpath="]/th[1]";
		
		for(int i=2;i<=7;i++){
			String actualXpath=BeforeXpath+i+AfterXpath;
			String Company=driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(Company);
			
			//*[@id="customers"]/tbody/tr[5

		}
		
		
	}

}