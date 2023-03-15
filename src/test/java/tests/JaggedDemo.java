package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JaggedDemo {

	

	@Test(dataProvider="supplier")
	public void sampleTest(Object[] a) {
		
		for (int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("----------");
	}
	
	@DataProvider(name="supplier", indices= {0,2}) //indices attribute
	public Object[][] dataSupplier() {
		//JAGGED 2 Dimensional array with different value counts
		Object[][] data = {
				{"Caleb", "Mortensen", "is", "awesome"},
				{"Joe", "Blow"},
				{"John", "Doe","seven", "eight", "nine", "ten"}};
		
		return data;
	}
	
	
}
