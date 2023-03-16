package parallelThreads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.MyListeners.class) //listener is like an inherited class with Override
public class Login {
	
	@Test(priority=1)  //, invocationCount=5, threadPool=2 (meaning for ex: 2 browsers will launch)
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
