package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuplodeHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Devp-4\\Downloads\\Bugs Report.docx");
		
	}

}
