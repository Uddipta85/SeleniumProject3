package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SessionlistPOM {
	private WebDriver driver; 
	
	public SessionlistPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	    
	}
	

	
	
	
	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration; 
	
	@FindBy(xpath="//a[contains(text(),'Sessions categories list')]")
	private WebElement catlist;
	
	@FindBy(xpath="/html/body/main/section/div/div[2]/div/div[1]/a[1]/img")
	private WebElement addcat;
	
	
	@FindBy(name="name")
	private WebElement catname; 
	
	@FindBy(className="btn btn-success")
	private WebElement addbtn;
	
	@FindBy(xpath="/html/body/main/section/div/div[3]/div/div[1]/a[2]/img")
	private WebElement seslist;
	
	@FindBy(xpath="/html/body/main/section/div/div[2]/a[1]/img")
	private WebElement addtrain;
	
	
	
	
	@FindBy(id="add_session_name")
	private WebElement entsesname;
	
	@FindBy(id="select2-coach_username-container")
	private WebElement clickcoach;
	
	@FindBy(className ="select2-search__field")
	private WebElement coachenter;
	
	
	@FindBy(id ="advanced_params")
	private WebElement advance;
	
	
	@FindBy(className="filter-option-inner-inner")
	private WebElement clickses;
	
	@FindBy(className = "form-control")
	private WebElement sesenter;
	
	@FindBy(className="add_session_submit")
	private WebElement addsesbtn;
	
	@FindBy(xpath="//option[contains(text(),'Automation Testing (AUTOMATIONTESTING)')]")
	private WebElement course;
	
	@FindBy(className="fa fa-chevron-right")
	private WebElement inclcourse;
	
	@FindBy(className="btn btn-success")
	private WebElement next;
	
	@FindBy(className="btn btn-success")
	private WebElement finish;
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	

	
public void administration() {
		
		this.administration.click();
	}
	
	public void catlist() {
		
		this.catlist.click(); 
	}
	
public void addcat() {
		
		this.addcat.click(); 
	}
	
	
	public void catname(String title) {
		this.catname.clear(); 
		this.catname.sendKeys(title);
	}
	
   public void addbtn() {
		
		this.addbtn.click(); 
	}
   
   public void seslist() {
		
		this.seslist.click(); 
	}
   
   public void addtrain() {
		
		this.addtrain.click(); 
	}
	
   
	public void entsesname(String name) {
		this.entsesname.clear(); 
		this.entsesname.sendKeys(name);
	}
	
	public void clickcoach() {
		this.clickcoach.click(); 
		
	}
	
	public void coachenter(String coach) {
		this.coachenter.clear(); 
		this.coachenter.sendKeys(coach);
		this.coachenter.sendKeys(Keys.ENTER);
	}
	
	public void advance() {
		this.advance.click(); 
		
	}
	
	public void clickses() {
		this.clickses.click(); 
		
	}
	
	public void sesenter(String ses) {
		this.sesenter.clear(); 
		this.sesenter.sendKeys(ses);
		this.sesenter.sendKeys(Keys.ENTER);
	}
	
	
	
	
	
public void addsesbtn(){
		
		this.addsesbtn.click();
	}
public void course(){
	
	this.course.click();
}

public void inclcourse(){
	
	this.inclcourse.click();
}


public void next(){
	
	this.next.click();
}


public void finish(){
	
	this.finish.click();
}


	
}

