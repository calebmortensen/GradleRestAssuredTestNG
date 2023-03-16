package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
	   
		String testName = result.getName();
		System.out.println(testName+ " startedX");
	  }

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName+ " successX");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName+ " failureX");
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
