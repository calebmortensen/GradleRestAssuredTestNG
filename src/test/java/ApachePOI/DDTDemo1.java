package ApachePOI;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTDemo1 {
	public static WebDriver driver;

	@Test(dataProvider = "supplier", dataProviderClass=DataSupplierOne.class)
	public void loginTest(String email, String password) {

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
		driver.findElement(By.id("input-email")).sendKeys(email); // email
		driver.findElement(By.id("input-password")).sendKeys(String.valueOf(password)); // password
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		driver.quit();
	}

	
}
