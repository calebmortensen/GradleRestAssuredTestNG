package parallelThreads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(listeners.MyListeners.class) //listener is like an inherited class with Override
public class Login extends Base {
	public WebDriver driver = null;

	@Test(priority = 1) // , invocationCount=5, threadPool=2 (meaning for ex: 2 browsers will launch)
	public void loginWithValidCredentials() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Code for Chrome Security Issue
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// Add 'options' as argument
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("amotooricap9@gmail.com"); // email
		driver.findElement(By.id("input-password")).sendKeys(String.valueOf("12345")); // password
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		//Thread.sleep(10000);
		driver.quit();
		// System.out.println("Login -> loginWithValidCredentials ->
		// "+Thread.currentThread().getId());
	}

	/*
	 * @Test(priority=2) public void loginWithValidEmailAndInvalidPassword() {
	 * 
	 * System.out.println("Login -> loginWithValidEmailAndInvalidPassword -> "
	 * +Thread.currentThread().getId()); }
	 */

	/*
	 * @Test(priority=3) public void loginWithValidEmailAndValidPassword() {
	 * 
	 * System.out.println("Login -> loginWithValidEmailAndValidPassword -> "+Thread.
	 * currentThread().getId()); }
	 */

	@Test(priority = 2, dependsOnMethods = { "loginWithValidCredentials" })//,retryAnalyzer=listeners.MyRetryAnalyzer.class
	public void loginWithInvalidCredentials() {
		WebDriverManager.chromedriver().setup();
		// Code for Chrome Security Issue
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// Add 'options' as argument
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("NOTHING.com"); // email
		driver.findElement(By.id("input-password")).sendKeys(String.valueOf("NOTHING")); // password
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());

		// System.out.println("Login -> loginWithInvalidCredentials ->
		// "+Thread.currentThread().getId());
	}

	/*
	 * public void loginWithoutCredentials() {
	 * 
	 * System.out.println("Login -> loginWithoutCredentials -> "+Thread.
	 * currentThread().getId()); }
	 */

	/*
	 * @AfterMethod public void tearDown(ITestResult result) { if
	 * (result.getStatus() == ITestResult.FAILURE) { String testName =
	 * result.getName(); System.out.println(testName + " TEST FAILED");
	 * takeScreenShot(driver, testName); } driver.quit(); }
	 */
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
