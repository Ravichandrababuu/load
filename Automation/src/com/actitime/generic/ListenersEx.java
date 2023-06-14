package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Ignore;
import com.actitime.generic.BaseClass;
public class ListenersEx extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String nameoftestcase=result.getName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./ScreenShot/"+nameoftestcase+".png");
		try {
			FileUtils.copyFile(src, des);
		}
		catch (Exception e) {
		}
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res=result.getName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./ScreenShot/"+res+".png");
		try {
		FileUtils.copyFile(src, des);
		            }
		catch(IOException e) {
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

}
