package testscripts;

import org.testng.annotations.Test;

public class ClassC {


	@Test (priority=1, groups={"Sanity"})
	public void methodCOne() {
		System.out.println("Class C - methodCOne");
	}
	
	@Test (priority=2, groups={"Sanity"})
	public void methodCTwo() {
		System.out.println("Class C - methodCTwo");
	}
	
	@Test (priority=3, groups={"Sanity"})
	public void methodCThree() {
		System.out.println("Class C - methodCThree");
	}
	
	@Test (priority=4, groups={"Sanity"})
	public void methodCFour() {
		System.out.println("Class C - methodCFour");
	}
	
}
