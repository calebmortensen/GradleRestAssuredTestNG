package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import base.Base;

public class MyListeners extends Base implements ITestListener{        //extends TestListenerAdapter
	public WebDriver driver;
	
	@Override
	public void onTestStart(ITestResult result) {
	   
		String testName = result.getTestContext().getName()+"-"+result.getName(); //test tag & test name retrieved
		System.out.println(testName+ " startedX");
	  }

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName+ " successX");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getTestContext().getName()+"-"+result.getName();
		
		System.out.println(testName+ " failedX");
		
		WebDriver driver = null;
		
		takeScreenShot(driver, testName);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName+ "X");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName+ " failed with timeoutX");
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("start contextX");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("finish contextX");
	}

	
}
