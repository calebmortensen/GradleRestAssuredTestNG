package reports;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo {

	public static void main(String[] args) {
		
		ExtentReports extent = new ExtentReports();
		
		File file = new File(System.getProperty("user.dir")+"./reports/eReport.html");
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		
		extent.attachReporter(sparkReporter);
		
		extent.flush();

	}

}
