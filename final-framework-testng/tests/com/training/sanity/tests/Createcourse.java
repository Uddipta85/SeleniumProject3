package com.training.sanity.tests;


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
import com.training.pom.CreatecoursePOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Createcourse {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private CreatecoursePOM CreatecoursePOM;
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
		CreatecoursePOM = new CreatecoursePOM(driver);
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
		 
		CreatecoursePOM.administration();
		CreatecoursePOM.coursecreate();
		CreatecoursePOM.title("TestUG_Stark_Sunny");
		CreatecoursePOM.code("Jarvisneo");
		CreatecoursePOM.remteacher();
		CreatecoursePOM.teacher("manzoor12");
		Thread.sleep(1000);
		CreatecoursePOM.selectteacher();
		//CreatecoursePOM.submit();
		
		screenShot.captureScreenShot("2");
		
		//CreatecoursePOM.submit();
		Thread.sleep(1000);
		CreatecoursePOM.category();
		CreatecoursePOM.catsel();
		screenShot.captureScreenShot("3");
		Thread.sleep(1000);
		CreatecoursePOM.clicklang();
		CreatecoursePOM.lansel();
		Thread.sleep(1000);
		CreatecoursePOM.submit();
	}
}

