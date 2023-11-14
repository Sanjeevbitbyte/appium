package org.bitbyte.org.bitbyte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Util.Androidaction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReceiveReturn  extends Androidaction{
	AndroidDriver driver;
	
	
	
	

	@AndroidFindBy(xpath="//*[@text='RECEIVE RETURN']")
	
	private WebElement ReceiveReturn;
	
	
	
	
	
	public ReceiveReturn(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		
	}
	public void ReceiveReturnmodule(String ReceiveReturntext) throws InterruptedException {
		
		

		scrolltoText(ReceiveReturntext); 
		driver.findElement(By.xpath("//*[@text='"+ReceiveReturntext+"']")).click();
		
		
		
		
	}

}
