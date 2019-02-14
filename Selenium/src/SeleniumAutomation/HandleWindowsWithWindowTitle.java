package SeleniumAutomation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleWindowsWithWindowTitle {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.goibibo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			String parrent=driver.getTitle();
			WebElement flights=driver.findElement(By.xpath("//span[text()='Flights']"));
			WebElement bus= driver.findElement(By.xpath("//span[@class='iconText '][text()='Bus']"));
			WebElement Trains=driver.findElement(By.xpath("//span[@class='iconText '][text()='Trains']"));
			WebElement cabs=driver.findElement(By.xpath("//span[@class='iconText '][text()='Cabs']"));
			
			Actions action= new Actions(driver);
			action.keyDown(Keys.SHIFT).click(flights).keyUp(Keys.SHIFT).build().perform();Thread.sleep(5000);
			action.keyDown(Keys.SHIFT).click(bus).keyUp(Keys.SHIFT).build().perform();Thread.sleep(5000);
			action.keyDown(Keys.SHIFT).click(Trains).keyUp(Keys.SHIFT).build().perform();Thread.sleep(5000);
			//action.keyDown(Keys.SHIFT).click(cabs).keyUp(Keys.SHIFT).build().perform();Thread.sleep(5000);
			
			Set<String>Window=driver.getWindowHandles();
			System.out.println("Totel windows openes = "+Window.size());
			
			Thread.sleep(5000);
			
			SwitchWindow switchToWindow=new SwitchWindow(driver);
			switchToWindow.toTitle("Flight booking, cheap flight tickets, lowest prices - Goibibo");System.out.println("now switched window is:"+driver.getTitle());Thread.sleep(5000);
			switchToWindow.toTitle("Bus ticket booking online, Book AC Volvo Bus Tickets at discounted prices - Goibibo");System.out.println("now switched window is:"+driver.getTitle());Thread.sleep(5000);
			switchToWindow.toTitle("Train Ticket Booking, IRCTC Ticket Booking, Indian Railways Reservation-Goibibo");System.out.println("now switched window is:"+driver.getTitle());Thread.sleep(5000);
			//switchToWindow.toTitle("Online Cab Booking, Cheap Taxi Booking & Car Rental Services-Goibibo");System.out.println("now switched window is:"+driver.getTitle());Thread.sleep(5000);
			
	}

}
