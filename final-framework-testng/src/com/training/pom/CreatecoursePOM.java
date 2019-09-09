package com.training.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreatecoursePOM {
	private WebDriver driver; 
	
	public CreatecoursePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	    
	}
	

	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration; 
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement coursecreate;	
	
	
	@FindBy(id="update_course_title")
	private WebElement title; 
	
	@FindBy(id="visual_code")
	private WebElement code;
	
	@FindBy(className="select2-selection__choice__remove")
	private WebElement remteacher;
	
	@FindBy(className="select2-search__field")
	private WebElement teacher;
	
	@FindBy(className="select2-search__field")
	private WebElement selectteacher;
	
	@FindBy(className="filter-option-inner-inner")
	private WebElement category;
	
	@FindBy(xpath="//html/body/main/section/div/div[2]/div/section/form/fieldset/div[3]/div[1]/div/div/div[2]/ul/li[8]/a/span")
	private WebElement catsel;
	
	@FindBy(xpath="//html/body/main/section/div/div[2]/div/section/form/fieldset/div[7]/div[1]/div/button/div/div/div")
	private WebElement lang;
	
	
	@FindBy(xpath="//html/body/main/section/div/div[2]/div/section/form/fieldset/div[17]/div[1]/button/em")
	private WebElement submit; 
	
	@FindBy(xpath="//span[contains(text(),'English')]")
	private WebElement lansel; 
	
	
	
	

	
public void administration() {
		
		this.administration.click();
	}
	
	public void coursecreate() {
		
		this.coursecreate.click(); 
	}
	
	public void title(String title) {
		this.title.clear(); 
		this.title.sendKeys(title);
	}
	
	public void code(String code) {
		this.code.clear(); 
		this.code.sendKeys(code);
	}
	
	public void remteacher() {
		this.remteacher.click(); 
		
	}
	public void teacher(String code) throws InterruptedException {
		this.teacher.clear(); 
		this.teacher.sendKeys(code);
		Thread.sleep(1000);
		this.teacher.sendKeys(Keys.RETURN);
	}
	
	public void selectteacher() {
		
		this.selectteacher.sendKeys(Keys.RETURN);
	}
	
public void submit(){
		
		this.submit.click();
	}
	
	public void category() {
		this.category.click();
	}
	
	public void catsel() {
		this.catsel.click();
	}
	
	public void clicklang() {
		this.lang.click();
	}
	
	public void lansel() {
		this.lansel.click();
	}
	
	
	
}

