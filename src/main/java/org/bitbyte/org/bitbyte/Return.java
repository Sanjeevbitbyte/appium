package org.bitbyte.org.bitbyte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Util.Androidaction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Return extends Androidaction{
	AndroidDriver driver;
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("sanjeev kumar");
	

	

	@AndroidFindBy(xpath="//*[@text='RETURNS']")
	
	private WebElement returns;
	
	@AndroidFindBy(xpath="//*[@text='Search']")
	private WebElement returnsearch;
	
	
	
	@AndroidFindBy(xpath="//*[@text='20LT MACHINE DISHWASH LIQUID']")
	private WebElement productname;
	
	@AndroidFindBy(xpath="//*[@text='SUBBED ITEM NOT REQ']")
	private WebElement selctreason;
	
	
	@AndroidFindBy(xpath="//*[@text='Drum']")
	private WebElement selectuom;
	
	

	@AndroidFindBy(xpath="//*[@text='Second time']")
	private WebElement secondtime;
	
	@AndroidFindBy(xpath="//*[@text='Comments']")
	private WebElement comment;
	
	
	@AndroidFindBy(xpath="//*[@text='Submit']")
	private WebElement submit;
	
	@AndroidFindBy(xpath="//*[@text='0']")
	private WebElement  qrtreturn;
	
	
	// driver.findElement(By.xpath("//*[@text='0']")).sendKeys("2");
	
	
//	@AndroidFindBy(xpath="//*[@text='SUBMIT']")
//	private WebElement submitbtn;
//	
//	
//	@AndroidFindBy(xpath="//*[@text='SUBMIT']")
//	private WebElement DISCARDbtn;
//	
//	
//	@AndroidFindBy(xpath="//*[@text='PARTIALLY DELIVERED']")
//	private WebElement partialdeliverd1;
//	
//	@AndroidFindBy(xpath="//*[@text='YES']")
//	private WebElement confirmationpopno;
	
	
	

	public Return(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	public void Returnsplanningmodule(String sf2 ) throws InterruptedException {
		returns.click();
		Thread.sleep(2000);
		returnsearch.sendKeys(sf2);
		Thread.sleep(2000);
		productname.click();
		
		Thread.sleep(2000);
		selctreason.click();
		Thread.sleep(1000);
		selctreason.click();
		Thread.sleep(3000);
		selectuom.click();
		Thread.sleep(1000);
		selectuom.click();
		Thread.sleep(1000);
		secondtime.clear();
		comment.sendKeys("Testing");
		qrtreturn.sendKeys("1");
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		
//		
//		scrolltoText(reasonname); 
//		driver.findElement(By.xpath("//*[@text='"+reasonname+"']")).click();
//		
//		Thread.sleep(2000);
//		driver.navigate().back();
//		DISCARDbtn.click();
//		Thread.sleep(2000);
//		submitbtn.click();
//		driver.navigate().back();
//		public void setCountrySelection(String countryName) {
//			countryselection.click();
//			scrolltoText(countryName); 
//			driver.findElement(By.xpath("//*[@text='"+countryName+"']")).click();
//			
//		}
       
			
//		
//	}
//	public void setselectreason(String reasonname) throws InterruptedException {
//		selctreason.click();
//		Thread.sleep(3000);
//		scrolltoText(reasonname);
//		
//		driver.findElement(By.xpath("//*[@text='"+reasonname+"']")).click();
//		
	}
	

	
		
		

}



