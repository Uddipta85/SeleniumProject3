package com.training.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UseraddtocoursePOM {

private WebDriver driver; 
	
	public UseraddtocoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration; 
	
	//@FindBy(xpath="/html/body/main/section/div/div[2]/div/section/section[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")
	@FindBy(xpath="//a[contains(text(),'Add users to course')]")
	private WebElement page;
	
	@FindBy(xpath="/html/body/main/section/div/form[2]/table/tbody/tr[2]/td[1]/select/option[5]")
	private WebElement user; 
	
	@FindBy(xpath="/html/body/main/section/div/form[2]/table/tbody/tr[2]/td[3]/select/option[4]")
	private WebElement course;
	
	
	
	@FindBy(xpath="/html/body/main/section/div/form[2]/table/tbody/tr[2]/td[2]/button")
	private WebElement button;
	
	
	
	public void administration() {
		
		this.administration.click();
	}
	
	public void page() {
		
		this.page.click(); 
	}
	
	public void user() {
		
		this.user.click(); 
	}
	
    public void course() {
		
		this.course.click(); 
	}
     public void button() {
		
		this.button.click(); 
	}
}
