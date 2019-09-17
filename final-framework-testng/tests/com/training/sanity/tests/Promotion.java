package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.PromotionPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class Promotion {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private PromotionPOM PromotionPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	     
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.FIREFOX);
		loginPOM = new LoginPOM(driver); 
		PromotionPOM = new PromotionPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void validcreatecourse() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn();
	    Thread.sleep(3000);
		 
	    PromotionPOM.administration();
	    PromotionPOM.promotion();
	    PromotionPOM.career();
	    PromotionPOM.add();
	    PromotionPOM.nameent("Stark3000");
	    Thread.sleep(1000);
	    PromotionPOM.cnp();
	    PromotionPOM.promicon();
	    PromotionPOM.addprom();
	    PromotionPOM.promnameent("Jarvis");
	    Thread.sleep(1000);
	    PromotionPOM.promsubmit();
	    PromotionPOM.subs();		
	    PromotionPOM.clickses();
		screenShot.captureScreenShot("3");
		Thread.sleep(1000);
		PromotionPOM.arrow();
		PromotionPOM.subbtn();
		
		
	}
}
