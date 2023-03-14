package testscripts;

import org.testng.annotations.Test;

public class ClassB {

	
	@Test (priority=1, groups={"Sanity"})
	public void methodBOne() {
		System.out.println("Class B - methodBOne");
	}
	
	@Test (priority=2, groups={"Sanity"})
	public void methodBTwo() {
		System.out.println("Class B - methodBTwo");
	}
	
	@Test (priority=3, groups={"Sanity"})
	public void methodBThree() {
		System.out.println("Class B - methodBThree");
	}
	
	@Test (priority=4, groups={"Sanity"})
	public void methodBFour() {
		System.out.println("Class B - methodBFour");
	}
	
}
