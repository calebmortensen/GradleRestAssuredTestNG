package screenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeSS {
	public static WebDriver driver;
	
	public static String takeScreenShot(String filename) throws IOException {
		String base64Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		String destinationScreenshotFilePath = System.getProperty("user.dir")+"./Screenshots/"+filename+""+generateTimeStamp()+ ".png";
		File destinationScreenshotFile = new File(destinationScreenshotFilePath);
		FileOutputStream fos = new FileOutputStream(destinationScreenshotFile);
		fos.write(Base64.decode(base64Screenshot));
		
		return destinationScreenshotFilePath;
		
	}
	
	public static String generateTimeStamp() {
		
		Date date = new Date ();
		System.out.println(date.toString().replace(" ", "_").replace(":","_"));
		return date.toString().replace(" ", "_").replace(":","_");
	}
	
	
	
	
	
}
/* THIS WORKS!!!
 * File sourceScreenshot =
 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); String
 * destinationScreenshotPath =
 * System.getProperty("user.dir")+"./Screenshots/TutorialNinjaHome.png";
 * FileUtils.copyFile(sourceScreenshot, new File(destinationScreenshotPath));
 */
