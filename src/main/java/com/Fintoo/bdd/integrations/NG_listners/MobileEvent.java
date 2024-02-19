package com.Fintoo.bdd.integrations.NG_listners;

import java.io.IOException;

import java.net.ServerSocket;

import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;

import com.Fintoo.bdd.ccl.MobileActions;
import com.Fintoo.bdd.integrations.common_utils.ConfigReader;
import com.Fintoo.bdd.integrations.common_utils.DriverFactory;
import com.Fintoo.bdd.integrations.common_utils.MobileUtil;
import com.Fintoo.bdd.integrations.common_utils.VideoRecord;
import com.Fintoo.bdd.integrations.report_utils.ReportManager;

import io.appium.java_client.android.AndroidDriver;

public class MobileEvent implements ITestListener {
	ThreadLocal<AndroidDriver> androidDriver = new ThreadLocal<AndroidDriver>();
	DriverFactory driverFactory = DriverFactory.getInstance();
	private static final String KEY = "platform";
	private static final String KEY1 = "udid";
	private static final String KEY2 = "systemPort";
	private static final String KEY3 = "deviceName";
	public static String Platform;
	public static String Udid;
	public static String SystemPort;
	public static String DeviceName;

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("+++++++++++++++++++onTestStart++++++++++++++++++");

		/*
		 * try { ReportManager.logInfoMobile("Platform: " + Platform);
		 * ReportManager.logInfoMobile("UDID: " + Udid);
		 * ReportManager.logInfoMobile("Appium Port: " + SystemPort);
		 * ReportManager.logInfoMobile("Device Name: " + DeviceName);
		 * driverFactory.setMobileDriver(Platform, Udid, SystemPort, DeviceName); }
		 * catch (Exception e) { e.printStackTrace(); }
		 */
		try {
			VideoRecord.startRecord(arg0.getMethod().getMethodName());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		//System.out.println("Test Success: " + iTestResult.getMethod().getMethodName());
		//ReportManager.logPass(iTestResult.getThrowable().getMessage());
		ReportManager.endCurrentTest();

		// driverFactory.getMobileDriver().close();
		try {
			VideoRecord.stopRecord();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		//System.out.println("Test Fail: " + iTestResult.getMethod().getMethodName());
		try {
			ReportManager.logScreenshotInfo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ReportManager.logFailMobile(iTestResult.getThrowable().getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			VideoRecord.stopRecord();
//			ReportManager.endCurrentTest();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		driverFactory.getMobileDriver().quit();
	}

	@Override
	public void onStart(ITestContext arg0) {
		Platform = arg0.getCurrentXmlTest().getParameter(KEY);
		Udid = arg0.getCurrentXmlTest().getParameter(KEY1);
		SystemPort = arg0.getCurrentXmlTest().getParameter(KEY2);
		DeviceName = arg0.getCurrentXmlTest().getParameter(KEY3);

		try {
			driverFactory.setMobileDriver(Platform, Udid, SystemPort, DeviceName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen", "phone_Number")).click();
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen", "phone_Number")).sendKeys(ConfigReader.getValue("MobileNumber"));
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen", "btn_otp")).click();
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen", "txt_otp")).sendKeys(ConfigReader.getValue("Otp"));
//		DriverFactory.getInstance().getMobileDriver().findElement(MobileUtil.returnByBasedOnPageNameAndObjectName("Mobilescreen","btn_submit")).click();

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
