package testscripts;

import org.testng.annotations.Test;

public class ClassC {


	@Test (priority=1)
	public void methodCOne() {
		System.out.println("Class C - methodCOne");
	}
	
	@Test (priority=2)
	public void methodCTwo() {
		System.out.println("Class C - methodCTwo");
	}
	
	@Test (priority=3)
	public void methodCThree() {
		System.out.println("Class C - methodCThree");
	}
	
	@Test (priority=4)
	public void methodCFour() {
		System.out.println("Class C - methodCFour");
	}
	
}
