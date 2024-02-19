package com.Fintoo.bdd.integrations.common_utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {
	private static DriverFactory instance = null;
	WebDriver driver;
	ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	ThreadLocal<AppiumDriver> appiumDriver = new ThreadLocal<AppiumDriver>();
	String strMobileExecutiontype = "android";

	private DriverFactory() {

	}

	public static DriverFactory getInstance() {
		if (instance == null) {
			instance = new DriverFactory();
		}
		return instance;
	}

//mobile
	public final void setMobileDriver(String platform, String udid, String systemPort, String deviceName)
			throws Exception {

		if (strMobileExecutiontype.contains("ios")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
			// capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
			// deviceVersion);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			capabilities.setCapability(MobileCapabilityType.UDID, udid);
			capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
			capabilities.setCapability("Connect Hardware Keyboard", true);
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
			capabilities.setCapability(MobileCapabilityType.SUPPORTS_LOCATION_CONTEXT, true);
			capabilities.setCapability("app", System.getProperty("user.dir") + ConfigReader.getValue("iOSAppLocation"));
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			appiumDriver.set(new AppiumDriver(url, capabilities));
			// AppiumDriver<WebElement> driver = new AppiumDriver(url,capabilities);
			getMobileDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else if (strMobileExecutiontype.contains("android")) {

			String[] platformInfo = platform.split(" ");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiAutomator2");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformInfo[0]);
			//capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformInfo[1]);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
			capabilities.setCapability(MobileCapabilityType.UDID, udid);
//			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

//		    capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);

			capabilities.setCapability(MobileCapabilityType.APP,
					System.getProperty("user.dir") + ConfigReader.getValue("AppLocation"));
			 capabilities.setCapability("adbExecTimeout", 90000);
			 capabilities.setCapability("appPackage", "com.curebay.medicare");
			capabilities.setCapability("appActivity", "com.curebay.medicare.MainActivity");
//			capabilities.setCapability("appPackage", "in.android.vyapar");
//			capabilities.setCapability("appActivity", "in.android.vyapar.MainActivity");
			capabilities.setCapability("resetKeyboard", true);
			capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability(MobileCapabilityType.ORIENTATION, "PORTRAIT");
			capabilities.setCapability(MobileCapabilityType.NO_RESET, false);

			appiumDriver.set(new AppiumDriver(new URL("http://0.0.0.0:" + systemPort + "/wd/hub"), capabilities));

			getMobileDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

	}

	public WebDriver getWebDriver() {
		return webDriver.get();
	}

	public AppiumDriver getMobileDriver() {
		return appiumDriver.get();
	}
}
