package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {
	AndroidDriver<AndroidElement> driver;
	
	 public  Utilities(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
	}
	 
	 public void scrollToText(String value) 
		{
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+value+"\"));").click();;
			
		}
	 public void scrollHorizontalToText(String value) 
		{
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/tabs\")).setAsHorizontalList().scrollIntoView(new UiSelector().text(\""+value+"\"));").click();;
			
		}
	 
}


