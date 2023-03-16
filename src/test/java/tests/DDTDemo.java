package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTDemo {
	public static WebDriver driver;                             //expectedException=NoSuchElementException.class
	@Test(dataProvider="getTestData", dataProviderClass=SampleProvider.class) //, timeOut=8000
	public void verifyLogin(String [] str) {  //String email, String password
         WebDriverManager.chromedriver().setup();		
		//Code for Chrome Security Issue
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");	
		//Add 'options' as argument
		driver = new ChromeDriver(options);				
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(str[0]);      //email
		driver.findElement(By.id("input-password")).sendKeys(str[1]);   //password
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		
	}
		@AfterMethod
		public void tearDown() {
			
			driver.quit();
		}
	
	
	/*
	 * @DataProvider(name="getTestData") public String[][] dataSupplier() {
	 * 
	 * String[][] data = {{"amotooricap9@gmail.com","12345"},
	 * {"amotooricap3@gmail.com","12345"}, {"amotooricap7@gmail.com","12345"}};
	 * 
	 * return data;
	 * 
	 * }
	 */

}
