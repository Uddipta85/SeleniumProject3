

package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.CreatemuluserPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class CreateMulUser {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private CreatemuluserPOM CreatemuluserPOM;
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
		CreatemuluserPOM = new CreatemuluserPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);
		// open the browser
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String firstname, String lastname, String email,String phone,String login,String password) {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		CreatemuluserPOM.administration();
		CreatemuluserPOM.user();
		CreatemuluserPOM.firstnameent(firstname);
		CreatemuluserPOM.lastnameent(lastname);
		CreatemuluserPOM.emailent(email);
		CreatemuluserPOM.phoneent(phone);
		CreatemuluserPOM.loginent(login);
		CreatemuluserPOM.passradio();
		CreatemuluserPOM.passwordent(password);
		CreatemuluserPOM.catsel();
		CreatemuluserPOM.clickrole();
		CreatemuluserPOM.addbtn();
		
		
		
	}

}
