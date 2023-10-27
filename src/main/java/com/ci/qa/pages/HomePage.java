package com.ci.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ci.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//button[@id='vertical-menu-btn']")
	WebElement verticalmenubar;
	
	@FindBy(xpath = "//a[@class='has-arrow']//span[text()='Batch Manage']")
	WebElement batchmanage;
	
	@FindBy(linkText= "Batches")
	WebElement batches;
	
	@FindBy(linkText= "Live Classes")
	WebElement liveclasses;
	
	@FindBy(linkText= "Library")
	WebElement library;
	
	@FindBy(linkText= "Question Bank")
	WebElement questionbank;



	
	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
		public void menuButton() {
			verticalmenubar.click();
			
		}
		
			public void batchManage() {
				batchmanage.click();	
			}	
			
			public void batchesLink() {
				batches.click();	
			}	
			
			public void liveclasseslink() {
				liveclasses.click();
			}
			
			public void libraryLink() {
				library.click();
				
			}
			
			public void questionbankLink() {
				questionbank.click();
				
			}
	

}
