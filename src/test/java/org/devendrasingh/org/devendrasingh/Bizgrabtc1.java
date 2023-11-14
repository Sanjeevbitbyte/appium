package org.devendrasingh.org.devendrasingh;

import org.bitbyte.org.bitbyte.Loginpage;
import org.bitbyte.org.bitbyte.ReceiveReturn;
import org.bitbyte.org.bitbyte.Return;
import org.bitbyte.org.bitbyte.Routeplanning;
import org.bitbyte.org.bitbyte.ScanON;
import org.bitbyte.org.bitbyte.Scanoff;
import org.testng.annotations.Test;




public class Bizgrabtc1 extends BaseTest{
	
	@Test
	public void LogonForm() throws InterruptedException {
		Loginpage loginpage=new Loginpage(driver);
		loginpage.loginpage("gulshan.kumar@solcall.com.au", "Password");
		ScanON scanon=new ScanON(driver);
		scanon.scanonmodule("ref23276", "DELIVERED");
	    Scanoff scanoff=new Scanoff(driver);
		scanoff.scanoffmmodule("ref23276", "PARTIALLY DELIVERED");
		Routeplanning routeplanning=new Routeplanning(driver);
		routeplanning.Routeplanningmodule("#SO492726");
		Return ret=new Return(driver);
		ret.Returnsplanningmodule("25860493");
		ReceiveReturn reciveret=new ReceiveReturn(driver);
		reciveret.ReceiveReturnmodule("ReceiveReturntext");
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
//		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("sanjeev kumar");
//		//driver.hideKeyboard();
//		driver.findElement(By.xpath("//*[@text='Female']")).click();
//		driver.findElement(By.id("android:id/text1")).click();
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
//		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
//		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
//		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(Expectedcondition.attributecontains(driver.findElements(By.id("com.androidsample.generalstore:id/toolbar_title")),"Text","Cart"));
//	
    	//Thread.sleep(3000);
//		String lastpageproduct=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
//		Assert.assertEquals(lastpageproduct, "Jordan 6 Rings");
//    	
//    	List<WebElement> productprices=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
//    	int count=productprices.size();
//    	
//    	for(int i=0; i<count; i++) {
//    		double totalsum=0;
//    		String  amountString=productprices.get(i).getText();
//    		Double price=Double.parseDouble(amountString.substring(1));
//    		
//    		totalsum=totalsum + price;
//    	}
//    	String displaysum=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
//    	Double displayformattedsum=getFormattedAmout(displaysum);
//    	Assert.assertEquals(totalsum, displayformattedsum);
//    	WebElement ele=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
//    	longpressAction(ele);
//    	driver.findElement(By.id("android:id/button1")).click();
//    	driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
//    	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
//    	Thread.sleep(6000);
//    	Set<String> contexts=driver.getContextHandles();
//    	for(String contextsName:contexts) {
//    		System.out.println(contextsName); 
//    	}
//    	driver.context("WEBVIEW_com.androidsample.generalstore ");
//    	driver.findElement(By.name("q")).sendKeys("sanjeev kumar");
//    	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//    	driver.pressKey(new KeyEvent(AndroidKey.BACK));
//    	driver.context("Native_App");
//		
	}


}
