package testscripts;

import org.testng.annotations.Test;

public class ClassA {

	@Test (priority=1, description="ClassA", groups={"Sanity"}) //ignoreMissingDependencies=true
	public void methodAOne() {
		System.out.println("Class A - methodAOne");
	}
	
	@Test (priority=2, groups={"Sanity"} )
	public void methodATwo() {
		System.out.println("Class A - methodATwo");
	}
	//alwaysRun (won't run if xml is run w/groups
	@Test (priority=3, alwaysRun=true, groups={"Sanity"} )
	public void methodAThree() {
		System.out.println("Class A - methodAThree");
	}
	//dependsOnGroups 
	@Test (priority=4, groups= {"Sanity"})
	public void methodAFour() {
		System.out.println("Class A - methodAFour");
	}
}
