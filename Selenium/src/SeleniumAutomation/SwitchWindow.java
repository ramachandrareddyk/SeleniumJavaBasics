package SeleniumAutomation;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchWindow {

	WebDriver driver;
	public SwitchWindow(WebDriver driver){
		this.driver=driver;
		
	}
	public boolean toTitle(String title){
		
		String parrentWindow=driver.getWindowHandle();
		Set<String>windows=driver.getWindowHandles();
		for(String winId:windows){
			if(!winId.equals(parrentWindow)){
				driver.switchTo().window(winId);
				
				if(driver.getTitle().equals(title))
				{
					return true;
				}
				driver.switchTo().window(parrentWindow);
			}
				
		}
		return false;
	}
	
}
