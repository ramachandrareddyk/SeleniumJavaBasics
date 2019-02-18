package SeleniumAutomation;

import org.testng.annotations.Test;

public class TestNgPriority {

	
	@Test(priority=1)
	public void M2(){
		System.out.println("Priority one");
	}
	@Test(priority=2)
	public void M3(){
		System.out.println("Priority Two");
	}
	@Test
	public void method1(){
		System.out.println("No priority");
	}

}
