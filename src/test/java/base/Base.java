package base;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.util.Date;


public class Base {
	
	
	public void takeScreenShot(WebDriver driver, String testName) {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destFilePath = System.getProperty("C:\\Users\\caleb\\EWS\\GradleRestAssuredTestNG\\lib\\screenshots"+testName+generateTimeStamp()+".png");
		try {
			FileUtils.copyFile(srcFile, new File(destFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String generateTimeStamp() {
		Date date = new Date();
		//System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		return date.toString().replace(" ", "_").replace(":", "_");
	}

}
