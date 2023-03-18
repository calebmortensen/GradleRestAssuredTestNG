package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search extends LoadConfig{
		
	public WebDriver driver;

	@Test
	public void login()  {

		HomePage homePage = new HomePage(driver);
		
		try {
			loadProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverManager.chromedriver().setup();

		// Code for Chrome Security Issue
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		// Add 'options' as argument
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
		homePage.clickOnMyAccountDropMenu();
		//driver.findElement(By.xpath("//span[text()='My Account']")).click();
		homePage.selectLoginOption();
		//driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		System.out.println("Login completed");
		//SEARCH
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();

		// driver.quit();

	}

}
