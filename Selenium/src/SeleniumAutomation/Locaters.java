package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
	public static void main(String args [])
	{	System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		//1.Xpath
		//driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Ramachandra");
		/*driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rooparamu");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Ramureddy@77");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Ramureddy@77");*/
		//2.id
		//driver.findElement(By.id("u_0_j")).sendKeys("Ramachandra");
		//3.Name
		/*driver.findElement(By.name("lastName")).sendKeys("Ramachandra");
		driver.findElement(By.name("Username")).sendKeys("ramuroopa");
		//4 link*/
		//driver.findElement(By.linkText("Why do I need to provide my date of birth?")).click();
		
		//driver.findElement(By.id("birthday-help")).click();
		//5.CSS selector
		driver.findElement(By.cssSelector("#u_0_j")).sendKeys("Ramu");
		// 6. partialLinkText
		driver.findElement(By.partialLinkText("Why do I need")).click();
		// 7. Class - not recomanded
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Reddy");
		//driver.close();
	}


}
