package tests;

import org.testng.annotations.DataProvider;

public class SampleProvider {
	
	@DataProvider(name="getTestData")
	public String[][] dataSupplier() {
		
		String[][] data = 
			{{"amotooricap9@gmail.com","12345"},
			{"amotooricap3@gmail.com","12345"},
			{"amotooricap7@gmail.com","12345"}};
		
		return data;
		
	}

}
