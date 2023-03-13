package testscripts;

import org.testng.annotations.Test;

public class ClassB {

	
	@Test (priority=1)
	public void methodBOne() {
		System.out.println("Class B - methodBOne");
	}
	
	@Test (priority=2)
	public void methodBTwo() {
		System.out.println("Class B - methodBTwo");
	}
	
	@Test (priority=3)
	public void methodBThree() {
		System.out.println("Class B - methodBThree");
	}
	
	@Test (priority=4)
	public void methodBFour() {
		System.out.println("Class B - methodBFour");
	}
	
}
