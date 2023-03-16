package parallelThreads;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1)
	public void loginWithValidCredentials() {
		
		System.out.println("Login -> loginWithValidCredentials -> "+Thread.currentThread().getId());
	}
	
	@Test(priority=2)
	public void loginWithValidEmailAndInvalidPassword() {
		
		System.out.println("Login -> loginWithValidEmailAndInvalidPassword -> "+Thread.currentThread().getId());
	}
	
	@Test(priority=3)
	public void loginWithValidEmailAndValidPassword() {
		
		System.out.println("Login -> loginWithValidEmailAndValidPassword -> "+Thread.currentThread().getId());
	}
	
	@Test(priority=4)
	public void loginWithInvalidCredentials() {
		
		System.out.println("Login -> loginWithInvalidCredentials -> "+Thread.currentThread().getId());
	}
	
	@Test(priority=5)
	public void loginWithoutCredentials() {
		
		System.out.println("Login -> loginWithoutCredentials -> "+Thread.currentThread().getId());
	}
}
