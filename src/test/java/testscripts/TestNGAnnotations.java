package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotations {
	public static WebDriver driver;
	
	@Parameters({ "Url", "Email", "Password"})
	@Test(groups={"smoke"})
	public void login(@Optional("http://tutorialsninja.com/demo/")String Url, String Email, String Password) {
		WebDriverManager.chromedriver().setup();
		
		//Code for Chrome Security Issue
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//Add 'options' as argument
		driver = new ChromeDriver(options);
			
				
		driver.manage().window().maximize();
		driver.get(Url);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.id("input-email")).sendKeys(Email);
		driver.findElement(By.id("input-password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		System.out.println("Login completed");
		
	}
	//@Ignore
	@AfterMethod(enabled=true, groups="smoke")
	public void tearDown() {
		System.out.println("AfterMethod tearDown");
		driver.quit();
	}
	

}
