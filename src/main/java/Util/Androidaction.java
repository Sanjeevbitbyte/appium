package Util;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Androidaction {
AndroidDriver driver;
	
	public Androidaction(AndroidDriver driver) {
		this.driver=driver;
		
	}
	public void scrolltoText(String text) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
		 //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));"));
	}

}
