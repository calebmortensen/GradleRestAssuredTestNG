package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WrapperDemo {
	
	@Test(dataProvider="supplier")
	public void sampleTest(Object a, Object b, Object c) {
		
		System.out.println(a+" - "+b);
	}
	
	@DataProvider(name="supplier")
	public Object[][] dataSupplier(){
		
		Object[][] data = {{"Caleb", 5, true},
				{"Arthur", 3, false},
				{"Mortensen", 4, true}};
		
		return data;
	}

}
