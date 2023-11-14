package org.bitbyte.org.bitbyte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Util.Androidaction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Loginpage extends Androidaction {

	AndroidDriver driver;
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("sanjeev kumar");
	
	public Loginpage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	@AndroidFindBy(xpath="//*[@text='gulshan.kumar@solcall.com.au']")
	private WebElement gulshan;
	
//	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
//	private WebElement namefield;
	
	
	@AndroidFindBy(xpath="//*[@text='Username']")
	private WebElement username;
	//driver.findElement(By.xpath("//*[@ text='Female']")).click();
	
	@AndroidFindBy(xpath="//*[@text='Next']")
	private WebElement Next;
	
	@AndroidFindBy(xpath="//*[@text='Aberdeen Paper Sandbox']")
	private WebElement aberdeenbtn;
	
	@AndroidFindBy(xpath="//*[@text='Password']")
	private WebElement password; 
	
	@AndroidFindBy(xpath="//*[@text='Login']")
	private WebElement loginbtn; 
	
	
		
	
	public void loginpage(String un,String psw) throws InterruptedException {
		Thread.sleep(3000);
		gulshan.clear();
		
		username.sendKeys(un);
		Next.click();
		aberdeenbtn.click();
		password.sendKeys(psw);
		loginbtn.click();
		
		
		
		
	}
	
	
	

}
