package testCases;
import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base_Setup;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pageObjects.HandleDropDown;
import pageObjects.HorizontalScrolling;
import pageObjects.ToastMessage;
import utilities.Utilities;

@Test
public class demosite extends Base_Setup {
	
	public void APIdemosite() throws MalformedURLException, InterruptedException  {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		Thread.sleep(2000);
	    
		//ToastMessage
		ToastMessage tm = new ToastMessage(driver);
		tm.viewButton.click();
		Thread.sleep(2000);
		
		Utilities utill = new Utilities(driver);
		utill.scrollToText("Spinner");
		Thread.sleep(2000);
		
		tm.colorbtn.click();
		utill.scrollToText("blue");
		Thread.sleep(2000);
		
		String msg = tm.toastMsg.getText();
		Assert.assertEquals("Spinner1: position=4 id=4", msg);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		//HorizontalScrolling
		HorizontalScrolling hs = new HorizontalScrolling(driver);
		utill.scrollToText("Tabs");
		Thread.sleep(2000);
		hs.scrollBtn.click();
		Thread.sleep(2000);
		utill.scrollHorizontalToText("TAB 18");
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		
		//HandleDropDown
		utill.scrollToText("Auto Complete");
		HandleDropDown hd = new HandleDropDown(driver);
		hd.topBtn.click();
		Thread.sleep(2000);
		hd.countryField.sendKeys("United");
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.DEL));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	 
	}

