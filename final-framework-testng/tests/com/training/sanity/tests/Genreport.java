


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
import com.training.pom.GenreportPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class Genreport {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private GenreportPOM GenreportPOM;
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
		GenreportPOM = new GenreportPOM(driver);
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
		 
	    GenreportPOM.reporting();
	    GenreportPOM.teacher();
	    GenreportPOM.teachent("Manzoor");
	    GenreportPOM.submitbtn();
	    Thread.sleep(3000);
	    GenreportPOM.arrow();
	    GenreportPOM.arrow1();
	    GenreportPOM.send();
	    /* PromotionPOM.addprom();
	    PromotionPOM.promnameent("Jarvis");
	    Thread.sleep(1000);
	    PromotionPOM.promsubmit();
	    PromotionPOM.subs();		
	    PromotionPOM.clickses();
		screenShot.captureScreenShot("3");
		Thread.sleep(1000);
		PromotionPOM.arrow();
		PromotionPOM.subbtn();*/
		
		
	}
}
