package org.bitbyte.org.bitbyte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Util.Androidaction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScanON extends  Androidaction{
	AndroidDriver driver;
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("sanjeev kumar");
	
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
	
	
	@AndroidFindBy(xpath="//*[@text='SCAN ON']")
	private WebElement scanon;
	

	@AndroidFindBy(xpath="//*[@text='Search']")
	private WebElement searchfld;
	
	
	@AndroidFindBy(xpath="//*[@text='PARTIALLY DELIVERED']")
	private WebElement partilaydeverd;
	
	
	@AndroidFindBy(xpath="//*[@text='Allow']")
	
	private WebElement Alw;

	public ScanON(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	
	
		
	
	public void loginpage(String un,String psw) throws InterruptedException {
		username.sendKeys(un);
		Next.click();
		aberdeenbtn.click();
		password.sendKeys(psw);
		loginbtn.click();
		//Thread.sleep(9000);
		
		
		
		
	}
	public void scanonmodule(String sf, String flagname) throws InterruptedException {
	Thread.sleep(15000);
	scanon.click();
	searchfld.sendKeys(sf);
	Thread.sleep(3000);
	partilaydeverd.click();
	Thread.sleep(3000);

		scrolltoText(flagname); 
		driver.findElement(By.xpath("//*[@text='"+flagname+"']")).click();
	   Thread.sleep(3000);
	   Alw.click();
	   Thread.sleep(3000);
	   Alw.click();
	   driver.navigate().back();
	   Thread.sleep(3000);
	   driver.navigate().back();
	   Thread.sleep(3000);
	   driver.navigate().back();
	   
	   
	   
		
	}
		
		
		
	}
	
	
	
	
	


