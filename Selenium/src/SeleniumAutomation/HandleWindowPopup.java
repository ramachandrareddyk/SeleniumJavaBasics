package SeleniumAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();

		Thread.sleep(2000);
		Set<String>handilar=driver.getWindowHandles();
		
		Iterator<String>it=handilar.iterator();
		
		String ParentwindowId=it.next();
		
		System.out.println("parent window id= "+ParentwindowId);
		
		String chaildWindowId=it.next();
		
		System.out.println("chaild window id= "+chaildWindowId);
		
		driver.switchTo().window(chaildWindowId);
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(ParentwindowId);
		
		System.out.println("Parent window name "+driver.getTitle());
		
		
		
	}

}
