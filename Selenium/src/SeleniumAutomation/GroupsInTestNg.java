package SeleniumAutomation;

import org.testng.annotations.Test;

public class GroupsInTestNg {
	
	@Test(groups="Methods")
	public void method1(){
		System.out.println("Methods 1");
	}
	@Test(groups="Tests")
	public void test1(){
		System.out.println("Test 1");
	}
	
	@Test(groups="Methods")
	public void methods(){
		System.out.println("Methods 2");
	}
	@Test(groups="Tests")
	public void test2(){
		System.out.println("Test 2");
	}

}
