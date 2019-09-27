

package com.training.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreatemuluserPOM {
	private WebDriver driver; 
	
	public CreatemuluserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		// WebElement element = null;
		// element = (WebElement) js.executeScript("input[id='password']");
	    
	}
	

	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration; 
	
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement user;	
	
	
	//@FindBy(xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/22/2rightarrow.png']")
	//private WebElement arrow; 
	
	@FindBy(id="firstname")
	private WebElement firstnameent;
	
	@FindBy(id="lastname")
	private WebElement lastnameent;
	
	@FindBy(id="email")
	private WebElement emailent;
	
	@FindBy(id="phone")
	private WebElement phoneent;
	
	@FindBy(id="username")
	private WebElement loginent;
	
	@FindBy(xpath="//label[contains(text(),'Enter password')]")
	private WebElement passradio; 
	
	@FindBy(id="password")
	private WebElement passwordent;
	
	
	
	@FindBy(className="filter-option-inner-inner")
	private WebElement profile;
	
	@FindBy(xpath="//span[contains(text(),'Sessions administrator')]")
	private WebElement admin; 
	
	
	
	@FindBy(className=" btn btn-primary ")
	private WebElement addbtn;
	
	
	

	
	

	
	
	
	

	
public void administration() {
		
		this.administration.click();
	}
	
	public void user() {
		
		this.user.click(); 
	}
	
	public void firstnameent(String title) {
		this.firstnameent.clear(); 
		this.firstnameent.sendKeys(title);
	}
	
	public void lastnameent(String lastnameent) {
		this.lastnameent.clear(); 
		this.lastnameent.sendKeys(lastnameent);
	}
	
	public void emailent(String emailent) {
		this.emailent.clear(); 
		this.emailent.sendKeys(emailent);
		
	}
	public void phoneent(String phoneent)  {
		this.phoneent.clear(); 
		this.phoneent.sendKeys(phoneent);
		
	}
	
	public void loginent(String loginent) {
		this.loginent.clear();
		this.loginent.sendKeys(loginent);
	}
	
public void passradio(){
		
		this.passradio.click();
	}
	
	public void passwordent(String element) {
		this.passwordent.clear();
		this.passwordent.sendKeys();
	}
	
	public void catsel() {
		this.profile.click();
	}
	
	public void clickrole() {
		this.admin.click();
	}
	
	public void addbtn() {
		this.addbtn.click();
	}
	
	
	
}
