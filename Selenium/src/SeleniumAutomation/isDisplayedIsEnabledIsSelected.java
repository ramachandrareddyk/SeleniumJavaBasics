package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedIsEnabledIsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Administrator\\workspace\\Selenium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/register/");
		
		//isDisplayed() it is used for all the elements in webpage
		boolean b1=driver.findElement(By.xpath("//div[@class='myButton']")).isDisplayed();
		System.out.println(b1);
		
		//isEnabled()
		boolean b2=driver.findElement(By.id("submitButton")).isEnabled();
		
		System.out.println(b2);
		
		//isSelected()
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean b3=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);
		
		boolean b4=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(b4);
	}

}
