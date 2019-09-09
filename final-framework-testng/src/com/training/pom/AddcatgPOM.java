package com.training.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddcatgPOM {

private WebDriver driver; 
	
	public AddcatgPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration; 
	
	//@FindBy(xpath="/html/body/main/section/div/div[2]/div/section/section[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")
	@FindBy(xpath="//a[contains(text(),'Courses categories')]")
	private WebElement coursecat;
	
	@FindBy(xpath="/html/body/main/section/div/div[2]/a/img")
	private WebElement createcat; 
	
	
	@FindBy(id="course_category_code")
	private WebElement catcode; 
	
	@FindBy(id="course_category_name")
	private WebElement catname;
	
	@FindBy(xpath="//html/body/main/section/div/form/fieldset/div[3]/div[1]/div[1]/label")
	private WebElement yesrad;
	
	@FindBy(id="course_category_submit")
	private WebElement subbut;
	
	
	
	public void administration() {
		
		this.administration.click();
	}
	
	public void coursecat() {
		
		this.coursecat.click(); 
	}
	
	public void createcat() {
		
		this.createcat.click(); 
	}
	
	public void sendcatcode(String catcode) {
		this.catcode.clear();
		this.catcode.sendKeys(catcode);
	}
	
	public void sendcatname(String catname) {
		this.catname.clear(); 
		this.catname.sendKeys(catname); 
	}
    public void selradio() {
		
		this.yesrad.click(); 
	}
     public void clicksub() {
		
		this.subbut.click(); 
	}
}
