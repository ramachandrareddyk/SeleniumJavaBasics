package SeleniumAutomation;

import java.util.List;

import org.apache.poi.ss.formula.functions.Vlookup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class SelectByMore {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Devp-4\\workspace\\NaveenAutomatuin\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		/*Select select=new Select(day);
		select.selectByVisibleText("24");
		
		Select select1=new Select(month);
		select1.selectByVisibleText("May");
		
		Select select2=new Select(year);
		select2.selectByVisibleText("1994");*/
		
		String DOB="10-May-2010";
				String Dob[]=DOB.split("-");
		seletValueFromDropDown(day, Dob[0]);
		seletValueFromDropDown(month, Dob[1]);
		seletValueFromDropDown(year, Dob[2]);
		
	
			
	}
	public static void seletValueFromDropDown(WebElement element, String value){
		Select select=new Select(element);
		select.selectByVisibleText(value);
	System.out.println(select.isMultiple());
	List<WebElement>daylist=select.getOptions();
	
	System.out.println(daylist.size());
	}
	

}
