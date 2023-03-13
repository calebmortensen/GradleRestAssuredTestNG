package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAnnotations {
	public static WebDriver driver;
	
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		
		//Code for Chrome Security Issue
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//Add 'options' as argument
		driver = new ChromeDriver(options);
			
				
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
