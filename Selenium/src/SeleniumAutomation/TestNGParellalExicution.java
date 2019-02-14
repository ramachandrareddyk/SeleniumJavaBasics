package SeleniumAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGParellalExicution {

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod");
	}
	@Test
	public void testOne() throws InterruptedException{
		for(int i=0;i<=10;i++){
		
			System.out.println("testOne"+i);
			Thread.sleep(2000);
		}
		
	}
	@Test
	public void testTwo() throws InterruptedException{
		for(int i=100;i<=110;i++){
			
			System.out.println("testTwo"+i);
			Thread.sleep(2000);
		}
	}
	@Test(priority=3)
	public void testThree(){
		System.out.println("testThree");
	}
	@Test(priority=4)
	public void testFour(){
		System.out.println("testFour");
	}
	@Test(priority=5)
	public void testFive(){
		System.out.println("testFive");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
	}
}
