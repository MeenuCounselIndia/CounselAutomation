package com.ci.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ci.qa.base.TestBase;

public class CreateOrderForCoursePage extends TestBase {
		
	@FindBy(linkText = "Submit form")
	WebElement submitbtn;
	
	
	/*
	@findBy(xpath="")
	WebElement ; */
	
	
	
	//Initializing the Page Objects:
	public CreateOrderForCoursePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:

		public void addOrderForm(String slectCourse, String slectBatch, String slectUseris) {
			
			Select selectCourse = new Select(driver.findElement(By.id("course_id")));
			//Select selectCourse = new Select(driver.findElement(By.xpath("//span[@id='select2-course_id-container']")));
			//selectCourse.selectByIndex(1);
			selectCourse.selectByVisibleText(slectCourse);
			
			Select selectBatch = new Select(driver.findElement(By.xpath("//span[@id='select2-batch_id-container']")));
			selectBatch.selectByVisibleText(slectBatch);
			
			Select selectUseris = new Select(driver.findElement(By.id("useris")));
			selectUseris.selectByVisibleText(slectUseris);

			
			//submitbtn.click();
			
		}
		

	
	
	
/*

public void addOrder(String slectCourse, String slectBatch, String ltName, String comp) {
	Select selectCourse = new Select(driver.findElement(By.xpath("//span[@id='select2-course_id-container']")));
	selectCourse.selectByVisibleText(slectCourse);
	
	Select selectBatch = new Select(driver.findElement(By.xpath("//span[@id='select2-batch_id-container']")));
	selectBatch.selectByVisibleText(slectBatch);
	
	firstName.sendKeys(ftName);
	lastName.sendKeys(ltName);
}
	
	
*/

}