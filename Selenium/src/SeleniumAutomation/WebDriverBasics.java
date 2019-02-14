package SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	public static void main(String args [])
	{	System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		String title=driver.getTitle();
		System.out.println(title);
		if (title.equals("Gmail")) {
			System.out.println("Correct title");
		}else {
			System.out.println("Wrong tilte");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String source=driver.getPageSource();
		System.out.println(source);
		driver.close();
	}

}
