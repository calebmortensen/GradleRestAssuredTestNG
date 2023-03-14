package testscripts;

import org.testng.annotations.Test;

public class ClassA {

	@Test (priority=1, description="ClassA", groups={"Sanity"})
	public void methodAOne() {
		System.out.println("Class A - methodAOne");
	}
	
	@Test (priority=2, groups={"Sanity"} )
	public void methodATwo() {
		System.out.println("Class A - methodATwo");
	}
	
	@Test (priority=3)
	public void methodAThree() {
		System.out.println("Class A - methodAThree");
	}
}
