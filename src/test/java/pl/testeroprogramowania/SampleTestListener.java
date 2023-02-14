package pl.testeroprogramowania;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("I am starting test");
    }
    @Override
    public void onTestSuccess(ITestResult result) {
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("I am taking screenshot");

    }
    @Override
    public void onTestSkipped(ITestResult result) {
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }
    @Override
    public void onStart(ITestContext context) {
    }
    @Override
    public void onFinish(ITestContext context) {
    }
}

