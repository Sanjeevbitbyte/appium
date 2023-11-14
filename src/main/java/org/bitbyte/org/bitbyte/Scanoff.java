package org.bitbyte.org.bitbyte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Util.Androidaction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Scanoff extends Androidaction{
	AndroidDriver driver;
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("sanjeev kumar");
	

	

	@AndroidFindBy(xpath="//*[@text='SCAN OFF']")
	
	private WebElement scanoff;
	
	
	@AndroidFindBy(xpath="//*[@text='Search']")
	private WebElement searchfiled1;
	
	
	@AndroidFindBy(xpath="//*[@text='PARTIALLY DELIVERED']")
	private WebElement partialdeliverd1;
	
	@AndroidFindBy(xpath="//*[@text='YES']")
	private WebElement confirmationpopno;
	
	
	

	public Scanoff(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	

	public void scanoffmmodule(String sf1,String flagname1) throws InterruptedException {
		Thread.sleep(3000);
		scanoff.click();
		searchfiled1.sendKeys(sf1);
		Thread.sleep(3000);
		partialdeliverd1.click();
		Thread.sleep(3000);
		scrolltoText(flagname1); 
		driver.findElement(By.xpath("//*[@text='"+flagname1+"']")).click();
		Thread.sleep(3000);
		
		
		   driver.navigate().back();
		   Thread.sleep(3000);
		   confirmationpopno.click();
		   Thread.sleep(3000);
		   
		   driver.navigate().back();
		   Thread.sleep(3000);
		   driver.navigate().back();
		    
		   
		
		
		
	}
		
		
		

}
