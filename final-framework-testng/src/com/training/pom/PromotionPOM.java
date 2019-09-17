

package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PromotionPOM {
	private WebDriver driver; 
	
	public PromotionPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	    
	}
	

	
	
	
	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration; 
	
	@FindBy(xpath="//a[contains(text(),'Careers and promotions')]")
	private WebElement promotion;
	
	@FindBy(xpath="//html/body/main/section/div/div[2]/div/div[1]/div/div/a[2]/img")
	private WebElement career;
	
	
	@FindBy(xpath="//html/body/main/section/div/div[2]/a[2]/img")
	private WebElement add; 
	
	@FindBy(id="career_name")
	private WebElement nameent;
	
	@FindBy(xpath="//a[contains(text(),'Careers and promotions')]")
	private WebElement cnp;
	
	@FindBy(xpath="//html/body/main/section/div/div[2]/div/div[1]/div/div/a[3]/img")
	private WebElement promicon;
	
	
	
	
	@FindBy(xpath="//html/body/main/section/div/div[2]/a[2]/img")
	private WebElement addprom;
	
	@FindBy(id="name")
	private WebElement promnameent;
	
	@FindBy(id ="promotion_submit")
	private WebElement promsubmit;
	
	
	@FindBy(xpath ="//html/body/main/section/div/div[4]/div[3]/div[3]/div/table/tbody/tr[18]/td[4]/a[1]/img")
	private WebElement subs;
	
	
	@FindBy(xpath="//html/body/main/section/div/form/table/tbody/tr[3]/td[1]/div/div/select/option[47]")
	private WebElement clickses;
	
	@FindBy(className = "fa fa-arrow-right")
	private WebElement arrow;
	
	@FindBy(className="btn btn-primary")
	private WebElement subbtn;
	
	
	
	
	
	
	

	
public void administration() {
		
		this.administration.click();
	}
	
	public void promotion() {
		
		this.promotion.click(); 
	}
	
public void career() {
		
		this.career.click(); 
	}
	
	
	
   public void add() {
		
		this.add.click(); 
	}
   
   public void nameent(String title) {
		this.nameent.clear(); 
		this.nameent.sendKeys(title);
	}
   
   
   
   public void cnp() {
		
		this.cnp.click(); 
	}
   
   public void promicon() {
		
		this.promicon.click(); 
	}
	
   
	public void addprom() {
		this.addprom.click();
	}
	
	public void promnameent(String prom) {
		this.promnameent.clear(); 
		this.promnameent.sendKeys(prom);
		
	}
	
	
	
	public void promsubmit() {
		this.promsubmit.click(); 
		
	}
	
	
	public void subs() {
		this.subs.click(); 
		
	}
	
	
	public void clickses() {
		this.clickses.click(); 
		
	}
	
	public void arrow() {
		this.arrow.click(); 
			}
	
	
	
	
	
public void subbtn(){
		
		this.subbtn.click();
	}



	
}

