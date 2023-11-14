package org.devendrasingh.org.devendrasingh;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {

	public AndroidDriver driver;
	
	
	

	@BeforeClass
	 public void setUp() throws Exception {
	 

	 UiAutomator2Options options=new UiAutomator2Options();
	 options.setDeviceName("Sanjeeviphone");
	 options.setApp("/Users/bitbyte/Desktop/app-release.apk");
	 options.setAppActivity("com.bizgrab.MainActivity");
	 
	 
	


	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
//	public Double getFormattedAmout(String Amount) {
//		Double price=Double.parseDouble(Amount.substring(1));
//		return price;
//	}
	
	public void longpressAction(WebElement ele) {
		 ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) ele).getId(),"duration",2000));
		   
	}
	@AfterClass
	public void teardown()  {
		//driver.quit();
} 

}
