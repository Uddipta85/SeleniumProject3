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
import com.training.pom.ModifyuserPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Modifyuser {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ModifyuserPOM ModifyuserPOM;
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
		ModifyuserPOM = new ModifyuserPOM(driver);
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
		 
	    ModifyuserPOM.administration();
	    ModifyuserPOM.userlist();
	    ModifyuserPOM.usersearch("Test");
	    ModifyuserPOM.searchbtn();
	    ModifyuserPOM.edit();
	    ModifyuserPOM.email("a@email.com");
	    
		ModifyuserPOM.inactive();		
		
		screenShot.captureScreenShot("2");		
		
		Thread.sleep(1000);
		ModifyuserPOM.saveedit();
		screenShot.captureScreenShot("3");
		Thread.sleep(1000);
		
	}
}

