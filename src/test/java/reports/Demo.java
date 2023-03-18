package reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
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
		
		eTest4.log(Status.INFO, "TestFour INFO -> <u>Browser Launched</u>");
		eTest4.log(Status.INFO, "TestFour INFO -> <b>Credentials Passed</b>");
		eTest4.log(Status.INFO, "TestFour INFO -> <i>Valid Search</i>");
		
		ExtentTest eTest5 = extent.createTest("TestFive");
		eTest5.log(Status.WARNING, "TestFive WARNING -> Alignment of button off");
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Sunday");
		alist.add("Monday");
		alist.add("Tuesday");
		alist.add("Wednesday");
		alist.add("Thursday");
		alist.add("Friday");
		alist.add("Saturday");
		
		ExtentTest eTest6 = extent.createTest("TestSix");
		eTest6.log(Status.INFO, MarkupHelper.createOrderedList(alist)); //numbers
		eTest6.log(Status.INFO, MarkupHelper.createUnorderedList(alist)); //bullet points
		
		HashMap<String,Object> hmap1 = new HashMap<String,Object>();
		hmap1.put("First Name", "Caleb");
		hmap1.put("Last Name", "Mortensen");
		hmap1.put("Experience", "44");
		hmap1.put("City", "San Diego");
		
		ExtentTest eTest7 = extent.createTest("TestSeven");
		eTest7.log(Status.INFO, MarkupHelper.createOrderedList(hmap1)); //hashmap outputs in ANY order
		
		extent.flush();
		
		Desktop.getDesktop().browse(file.toURI());
		
	}

}
