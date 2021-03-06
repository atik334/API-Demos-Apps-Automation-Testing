package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HandleDropDown {
	AndroidDriver<AndroidElement> driver;
	
	
	public HandleDropDown(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@AndroidFindBy(xpath = "//*[@text='1. Screen Top']")
	 public WebElement topBtn;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/edit")
	 public WebElement countryField;
	
	
}
