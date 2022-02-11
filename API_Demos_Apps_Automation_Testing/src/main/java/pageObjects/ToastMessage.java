package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ToastMessage {
	
AndroidDriver<AndroidElement> driver;
	
	public ToastMessage(AndroidDriver<AndroidElement> driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@AndroidFindBy(xpath = "//*[@text='Views']")
	public WebElement viewButton;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/spinner1")
	public WebElement colorbtn;
	
	@AndroidFindBy(xpath= "//android.widget.Toast[1]")
	public WebElement toastMsg;

}



