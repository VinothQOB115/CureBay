package com.Fintoo.bdd.integrations.report_utils;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.Fintoo.bdd.constants.FrameworkConstants;
import com.Fintoo.bdd.integrations.common_utils.DriverFactory;
import com.Fintoo.bdd.integrations.report_utils.ScreenshotUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportManager {
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static Map<Long, ExtentTest> testMap = new HashMap<>();
	public static Map<String, ExtentTest> extentMap = new HashMap<>();
	public static String str_Execution_TYPE = System.getProperty("execType");

	public static void startReport() {

		if (Objects.isNull(extent)) {
			extent = new ExtentReports();

			/****
			 * String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new
			 * Date()); String dateStamp = new SimpleDateFormat("dd.MM.yyyy").format(new
			 * Date()); htmlReporterWeb = new
			 * ExtentSparkReporter(System.getProperty("user.dir") +
			 * "/Execution_Reports/Web_Reports/Web.html"+ dateStamp + "/" + "QOBOX-" +
			 * timeStamp + ".html");
			 * 
			 ****/

			ExtentSparkReporter spark = null;
			if (str_Execution_TYPE.equalsIgnoreCase("Web_UI")) {
				spark = new ExtentSparkReporter(FrameworkConstants.extent_reportPath);
			} else if (str_Execution_TYPE.equalsIgnoreCase("Mobile_UI")) {
				spark = new ExtentSparkReporter(FrameworkConstants.extent_mobilereportPath);
			}else if (str_Execution_TYPE.equalsIgnoreCase("API")) {
				spark = new ExtentSparkReporter(FrameworkConstants.extent_apireportPath);
			}
			else {
				System.out.println("[-] Please set exection type [Web_UI or Mobile_UI or API] value in cucumberhooks");
			}
			extent.attachReporter(spark);

			// spark.config().setEncoding("utf-8");
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("CureBay");
			
			if (str_Execution_TYPE.equalsIgnoreCase("Web_UI")) {
				spark.config().setReportName("CureBay_Web");
			} else if (str_Execution_TYPE.equalsIgnoreCase("Mobile_UI")) {
				spark.config().setReportName("CureBay_Mobile");
			}else if (str_Execution_TYPE.equalsIgnoreCase("API")) {
				spark.config().setReportName("CureBay_API");
			}
			else {
				System.out.println("[-] Please set exection type [Web_UI or Mobile_UI or API] value in cucumberhooks");
			}

			extent.setSystemInfo("Organization", "DEMO");
			extent.setSystemInfo("Employee", "<b> Test User1</b>" + " " + FrameworkConstants.ICON_SOCIAL_LINKEDIN + " "
					+ FrameworkConstants.ICON_SOCIAL_GITHUB);
			extent.setSystemInfo("Domain", "Engineering (IT - Software)" + "  " + FrameworkConstants.ICON_LAPTOP);
			extent.setSystemInfo("Skill", "Test Automation Engineer");

		}

	}

	public static void startTest(String testName, String categories) {
//                      if(extentMap.containsKey(testName)) {
//                                 extent.removeTest(extentMap.get(testName));
//                                 testName = "Rerun - "+testName;
//                      }
		ExtentTest test = extent.createTest(testName);
		test.assignCategory(categories);
		testMap.put(Thread.currentThread().getId(), test);
		extentMap.put(testName, test);
	}

	public static void logWebScreenshot() throws IOException { //
		getCurrentTest().addScreenCaptureFromBase64String(ScreenshotUtil.takeScreenshot());
		Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.takeScreenshot())
				.build();
		getCurrentTest().fail("", mediaModel);

	}

	public static void logMobileScreenshot() throws IOException { //
		getCurrentTest().addScreenCaptureFromBase64String(
				ScreenshotUtil.takeScreenshot(DriverFactory.getInstance().getWebDriver()));
		Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(
				ScreenshotUtil.takeScreenshot(DriverFactory.getInstance().getWebDriver())).build();
		getCurrentTest().fail("", mediaModel);

	}
	public static void logScreenshotInfo() throws IOException {
        Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(
                ScreenshotUtil.takeScreenshot(DriverFactory.getInstance().getMobileDriver())).build();
        getCurrentTest().info("", mediaModel);

    }

	public static void logPass(String message) {
		getCurrentTest().log(Status.PASS, message);

	}

	public static void logFail(String message) {
		getCurrentTest().log(Status.FAIL, message);
	}
	public static void logFailMobile(String message) throws IOException {
		getCurrentTest().log(Status.FAIL, message);
		Media mediaModel = MediaEntityBuilder.createScreenCaptureFromBase64String(
				ScreenshotUtil.takeScreenshot(DriverFactory.getInstance().getMobileDriver())).build();
		getCurrentTest().fail("", mediaModel);

	}

	public static void logInfo(String message) {
		getCurrentTest().log(Status.INFO, message);

	}

	public static void endCurrentTest() {
		getCurrentTest().getExtent().flush();

		testMap.remove(Thread.currentThread().getId());
	}

	public static ExtentTest getCurrentTest() {
		return testMap.get(Thread.currentThread().getId());

	}

	public static void endReport() {

		extent.flush();
	}
}
