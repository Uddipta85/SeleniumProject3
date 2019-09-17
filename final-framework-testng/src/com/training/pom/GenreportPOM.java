


package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GenreportPOM {
	private WebDriver driver; 
	
	public GenreportPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	    
	}
	

	
	
	
	
	@FindBy(xpath="//a[contains(text(),'Reporting')]")
	private WebElement reporting; 
	
	@FindBy(xpath="//a[contains(text(),'Followed teachers')]")
	private WebElement teacher;
	
	@FindBy(id="search_user_keyword")
	private WebElement teachent;
	
	@FindBy(id="search_user_submit")
	private WebElement submitbtn;
	
	
	 
	
	@FindBy(xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/22/2rightarrow.png']")
	private WebElement arrow; 
	@FindBy(xpath="//a[@href='/main/mySpace/myStudents.php?student=15&details=true&course=SEL&origin=teacher_details&id_session=0#infosStudent']")
	private WebElement arrow1;
	
	
	@FindBy(xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/32/mail_send.png")
	private WebElement send; 
	
	
	
	
	
	
	
	
	

	
public void reporting() {
		
		this.reporting.click();
	}
	
	public void teacher() {
		
		this.teacher.click(); 
	}
	

   
   public void teachent(String title) {
		this.teachent.clear(); 
		this.teachent.sendKeys(title);
	}
   
   
   
   public void submitbtn() {
		
		this.submitbtn.click(); 
	}
   
   public void arrow() {
		
		this.arrow.click(); 
	}
	
   public void arrow1() {
		
		this.arrow1.click(); 
	}
   
	
	
	
	
	
public void send(){
		
		this.send.click();
	}



	
}


