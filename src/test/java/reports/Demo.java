package reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		ExtentReports extent = new ExtentReports();
		
		File file = new File(System.getProperty("user.dir")+"./ExtentReports/eReport.html");
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		
		extent.attachReporter(sparkReporter);
		
		ExtentTest eTest1 = extent.createTest("TestOne");
		
		//eTest1.pass("TestOne passed");
		eTest1.log(Status.PASS, "TestOne Passed");
		
		ExtentTest eTest2 = extent.createTest("TestTwo");
		
		//eTest2.fail("TestTwo Failed");
		eTest2.log(Status.FAIL, "TestTwo Failed");
		
		ExtentTest eTest3 = extent.createTest("TestThree");
		
		//eTest3.skip("TestThree Skipped");
		eTest3.log(Status.SKIP, "TestThree Skipped");
		
        ExtentTest eTest4 = extent.createTest("TestFour");
		
		eTest4.log(Status.INFO, "TestFour INFO -> Browser Launched");
		eTest4.log(Status.INFO, "TestFour INFO -> Credentials Passed");
		eTest4.log(Status.INFO, "TestFour INFO -> Valid Search");
		
		ExtentTest eTest5 = extent.createTest("TestFive");
		eTest5.log(Status.WARNING, "TestFive WARNING -> Alignment of button off");
		
		extent.flush();
					
		Desktop.getDesktop().browse(file.toURI());

	}

}
