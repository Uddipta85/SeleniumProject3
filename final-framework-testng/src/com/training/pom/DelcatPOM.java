package com.training.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelcatPOM {

private WebDriver driver; 
	
	public DelcatPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="/html/body/main/header/nav/div/div[2]/ul[1]/li[7]/a")
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration; 
	
	//@FindBy(xpath="/html/body/main/section/div/div[2]/div/section/section[1]/div[2]/div/div[2]/div[2]/ul/li[1]/a")
	@FindBy(xpath="//a[contains(text(),'Courses categories')]")
	private WebElement cat;
	
	@FindBy(xpath="/html/body/main/section/div/table/tbody/tr[10]/td[4]/a[3]/img")
	private WebElement delete; 
	
	public void administration() {
		
		this.administration.click();
	}
	
	public void cat() {
		
		this.cat.click(); 
	}
	
	public void delete() {
		
		this.delete.click(); 
	}
}

