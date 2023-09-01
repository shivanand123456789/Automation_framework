package exelpackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenersclass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("test case exc started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test case sussufully exc");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("tc failued to exc");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test case skipped");
	}

}
