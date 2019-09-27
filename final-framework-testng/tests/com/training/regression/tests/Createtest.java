
package com.training.regression.tests;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.CreatetestPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Createtest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private CreatetestPOM CreatetestPOM;
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
		CreatetestPOM = new CreatetestPOM(driver);
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
		 
	    CreatetestPOM.administration();
	    CreatetestPOM.courselist();
	    CreatetestPOM.test();
		CreatetestPOM.newtest();
		CreatetestPOM.testnameent("Jarvisneo");
		CreatetestPOM.advbtn();
		CreatetestPOM.endradio();		
		CreatetestPOM.enablecheck();
		CreatetestPOM.passperent("50");
		CreatetestPOM.qtnbtn();
		
		CreatetestPOM.mulch();
		CreatetestPOM.quesent("What is Selenium?");
		
		CreatetestPOM.correct();
		CreatetestPOM.marksent("1");
	
		CreatetestPOM.sbmbtn();
		
		CreatetestPOM.preview();
	}
}


