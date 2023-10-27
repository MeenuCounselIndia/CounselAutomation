package com.ci.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ci.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - Object Repository(OR)
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement useremail;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath= "//button[@type= 'submit']")
	WebElement loginBtn;
	
	//@FindBy(xpath = "//img[contains(@class, 'd-block auth-logo')]")
	//WebElement ciLogo;
	
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	 
	//public boolean validateCiImage() {
	//	return ciLogo.isDisplayed(); }
	

	public HomePage login(String ue, String pwd) {
		useremail.sendKeys(ue);
		password.sendKeys(pwd);
		loginBtn.click();
		
		
		return new HomePage();
	}
		
}
