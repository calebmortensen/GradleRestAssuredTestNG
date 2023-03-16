package parallelThreads;

import org.testng.annotations.Test;

public class Search {
	
	@Test(priority=1)
	public void searchAValidProduct() {
		
		System.out.println("Search -> searchAValidProduct -> "+Thread.currentThread().getId());
	}
	
	@Test(priority=2)
	public void searchAnInValidProduct() {
		
		System.out.println("Search -> searchAnInValidProduct -> "+Thread.currentThread().getId());
	}
	
	
	@Test(priority=3)
	public void searchNoProduct() {
		
		System.out.println("Search -> searchNoProduct -> "+Thread.currentThread().getId());
	}
}
