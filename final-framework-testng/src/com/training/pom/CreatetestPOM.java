

package com.training.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreatetestPOM {
	private WebDriver driver; 
	
	public CreatetestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	    
	}
	

	
	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement administration; 
	
	@FindBy(xpath="//a[contains(text(),'Course list')]")
	private WebElement courseclist;		
	
	
	@FindBy(xpath="//a[contains(text(),'seelenium')]")
	private WebElement course;		
	
		
	@FindBy(xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/64/quiz.png']")
	private WebElement test; 
	
	
		
	@FindBy(xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/32/new_exercice.png']")
	private WebElement newtest; 
	
	@FindBy(id="exercise_title")
	private WebElement testnameent; 
	
	@FindBy(id="advanced_params")
	private WebElement advbtn;
	
	
	
	@FindBy(xpath="//label[contains(text(),'At end of test')]")
	private WebElement endradio; 
	
	@FindBy(xpath="//label[contains(text(),'Enable start time')]")
	private WebElement enablecheck;	
	
	
	
	@FindBy(id="pass_percentage")
	private WebElement passperent;	
	
	
	@FindBy(id="exercise_admin_submitExercise")
	private WebElement qtnbtn;
	
	
	@FindBy(xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/64/mcua.png']")
	private WebElement mulch;
	
	
	
	@FindBy(id="question_admin_form_questionName")
	private WebElement quesent;
	
	
	
	
	
	@FindBy(id="qf_1c019c")
	private WebElement correct;
	
	@FindBy(id="question_admin_form_weighting[2]")
	private WebElement marksent;
	
	@FindBy(id="submit-question")
	private WebElement sbmbtn;
	
	
		
	@FindBy(xpath="//img[@src='http://elearningm1.upskills.in/main/img/icons/32/back.png']")
	private WebElement preview;
	
	

	
	
	
	

	
public void administration() {
		
		this.administration.click();
	}
	
	public void courselist() {
		
		this.course.click(); 
	}
	
	
public void test() {
		
		this.test.click(); 
	}

public void newtest() {
	
	this.newtest.click(); 
}
	public void testnameent(String testnameent) {
		this.testnameent.clear(); 
		this.testnameent.sendKeys(testnameent);
	}
	
	public void advbtn() {
		
		this.advbtn.click();
	}
	
	public void endradio() {
		this.endradio.click(); 
		
	}
	
	public void enablecheck() {
		
		this.enablecheck.click();
	}
	
public void passperent(String passperent){
		this.passperent.clear();
		this.passperent.sendKeys(passperent);
	}
	
	public void qtnbtn() {
		this.qtnbtn.click();
	}
	
	public void mulch() {
		this.mulch.click();
	}
	
	public void quesent(String quesent) {
		this.quesent.clear();
		this.quesent.sendKeys(quesent);
	}
	
	public void correct() {
		this.correct.click();
	}
	
	public void marksent(String marksent) {
		this.marksent.clear();
		this.marksent.sendKeys(marksent);
	}
	
	public void sbmbtn() {
		this.sbmbtn.click();
	}
	
	public void preview()
	{
		this.preview.click();
	}
	
	
}

