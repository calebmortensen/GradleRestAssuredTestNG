package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTest {
	
	@Test
	public void sampleMethod() {
		
		String str1 = "Caleb";
		String str2 = "Mortensen";
		
		//actual,expected
		Assert.assertEquals(str1, str2); //This Fails
		
	}
	@Test
	public void sampleMethod2() {
        WebDriverManager.chromedriver().setup();
		
		//Code for Chrome Security Issue
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//Add 'options' as argument
		WebDriver driver = new ChromeDriver(options);
			
				
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";
		//Soft Assert --> continues even if fails. Have to create the object
		//and place 'soft' in front of existing 'Assert' below
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
		//AssertEquals
		Assert.assertEquals(expectedTitle, actualTitle);
		//import keys and Enter is a click on the Keyboard
		driver.findElement(By.name("search")).sendKeys("HP", Keys.ENTER);
		//AssertTrue
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		//assertNotNull, AssertNull, AssertFalse, AssertNotEquals, Assert.fail (odd scenario)
		//HARD vs SOFT assertions
		//SoftAssert softAssert = new SoftAssert();
		//softAssert.assertAll();
		driver.quit();
		
	}

}
