package com.ci.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ci.qa.base.TestBase;

public class BatchesPage extends TestBase{
	
	//Page Factory - Object Repository(OR)
	   
	@FindBy(linkText = "Add New")
	WebElement addnewbtn;
	
//	@FindBy(xpath = "//a[@class='btn btn-primary waves-effect waves-light']")
	
	@FindBy(linkText = "Add Student Booking")
	WebElement addstudentbtn;
	
	
	
	
	//Initializing the Page Objects:
	public BatchesPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:

		public void addNewButton() {
			addnewbtn.click();
		}
		
		public void addStudentBookingButton() {
			addstudentbtn.click();
		}
		
		
		public void fillForm() {
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy.HH:mm:ss");
		    String timeStamp = df.format(new Date());
		    driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Test_Automated_Batch"+timeStamp);
		    driver.findElement(By.id("datepicker-basic")).click();
		    Actions ac=new Actions(driver);
		    ac.sendKeys(Keys.SPACE).perform();
		    ac.sendKeys(Keys.ENTER).perform();   
		    driver.findElement(By.name("batch_quantity")).sendKeys("10");
		    driver.findElement(By.xpath("//button[@id='sa-success']")).click();
			}	
			
	
	

}
