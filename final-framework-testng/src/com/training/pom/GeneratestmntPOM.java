package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GeneratestmntPOM {
	private WebDriver driver; 
	
	public GeneratestmntPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	    
	}
	

	
	
	
	
	@FindBy(xpath="//a[contains(text(),'Reporting')]")
	private WebElement Reporting; 
	
	@FindBy(xpath="//a[contains(text(),'Followed students')]")
	private WebElement Followed;
	
	@FindBy(id="search_user_keyword")
	private WebElement userinp;
	
	
	@FindBy(id="search_user_submit")
	private WebElement submitbtn; 
	
	@FindBy(id="details_savitha")
	private WebElement details;
	
	@FindBy(xpath="//html/body/main/section/div/div[7]/table/tbody/tr[1]/td[7]/a/img")
	private WebElement course;
	
	@FindBy(xpath="/html/body/main/section/div/div[2]/a[5]/img")
	private WebElement mail;
	
	
	

	
public void Reporting() {
		
		this.Reporting.click();
	}
	
	public void Followed() {
		
		this.Followed.click(); 
	}
	
	
	public void userinp(String title) {
		this.userinp.clear(); 
		this.userinp.sendKeys(title);
	}
	
	public void submitbtn() {
		
		this.submitbtn.click(); 
	}
   public void details() {
		
		this.details.click(); 
	}
   
   public void course() {
		
		this.course.click(); 
	}
   
   public void mail() {
		
		this.mail.click(); 
	}
	
   

	
}
