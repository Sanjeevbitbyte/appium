package org.bitbyte.org.bitbyte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Util.Androidaction;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Routeplanning extends Androidaction{
	AndroidDriver driver;
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("sanjeev kumar");
	

	

	@AndroidFindBy(xpath="//*[@text='ROUTE PLANNING']")
	
	private WebElement routeplanning;
	
	@AndroidFindBy(xpath="//*[@text='Allow only while using the app']")
	private WebElement awua;
	
	
	
	@AndroidFindBy(xpath="//*[@text='PLANNED']")
	private WebElement planbtn;
	
	@AndroidFindBy(xpath="//*[@text='OPEN MAP']")
	private WebElement mapcta;
	
//	
//	
//	@AndroidFindBy(xpath="//*[@text='PARTIALLY DELIVERED']")
//	private WebElement partialdeliverd1;
//	
//	@AndroidFindBy(xpath="//*[@text='YES']")
//	private WebElement confirmationpopno;
	
	
	

	public Routeplanning(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	public void Routeplanningmodule(String text) throws InterruptedException {
		routeplanning.click();
		Thread.sleep(3000);
		awua.click();
		Thread.sleep(3000);
		planbtn.click();
		Thread.sleep(3000);
		scrolltoText(text); 
		driver.findElement(By.xpath("//*[@text='"+text+"']"));
		Thread.sleep(3000);
		mapcta.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		   
		
		
		
		
	}
	

	
		
		

}
