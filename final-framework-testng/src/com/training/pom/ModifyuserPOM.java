package com.training.pom;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ModifyuserPOM {
	private WebDriver driver; 
	
	public ModifyuserPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	    
	}
	

	
	
	
	@FindBy(xpath="/html/body/main/section/div/div[2]/div/section/form[2]/div/table/tbody/tr[8]/td[11]/a[5]/img")
	private WebElement edit;
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration; 
	
	@FindBy(xpath="//a[contains(text(),'User list')]")
	private WebElement userlist;	
	
	
	@FindBy(id="search_simple_keyword")
	private WebElement usersearch; 
	
	@FindBy(id="search_simple_submit")
	private WebElement searchbtn;
	
	@FindBy(id="user_edit_email")
	private WebElement email;
	
	
	//@FindBy(id="qf_22bee8") inactive
	@FindBy(xpath="//label[contains(text(),'inactive')]")
	private WebElement inactive;
	
	@FindBy(id="user_edit_submit")
	private WebElement saveedit;
	
	
	
	
	
	
	
	

	
public void administration() {
		
		this.administration.click();
	}
	
	public void userlist() {
		
		this.userlist.click(); 
	}
	
	public void usersearch(String title) {
		this.usersearch.clear(); 
		this.usersearch.sendKeys(title);
	}
	
   public void searchbtn() {
		
		this.searchbtn.click(); 
	}
   
   public void edit() {
		
		this.edit.click(); 
	}
	
	public void email(String code) {
		this.email.clear(); 
		this.email.sendKeys(Keys.CONTROL,"a");
		this.email.sendKeys(Keys.DELETE);
		this.email.sendKeys(code);
	}
	
	public void inactive() {
		this.inactive.click(); 
		
	}
	
	
public void saveedit(){
		
		this.saveedit.click();
	}
	
	
	
	
	
}
