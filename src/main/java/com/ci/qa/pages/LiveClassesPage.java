package com.ci.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ci.qa.base.TestBase;

public class LiveClassesPage  extends TestBase {
	
	//Page Factory - Object Repository(OR)
		
	@FindBy(name ="order_no")
	WebElement meetingid;
	
	@FindBy(xpath= "//button[@value='Submit']" )
	WebElement submitbtn;
	
	@FindBy(xpath = "//i[@class ='bx bxs-add-to-queue font-size-16 align-middle me-2']")
	WebElement addbtn;
	
	
	//Initializing the Page Objects:
		public LiveClassesPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions:	
			
			public void liveClassesList() {
				meetingid.sendKeys(prop.getProperty("meetingID"));
			}
					
				
			public void searchForLiveClass() {
				//meetingid.click();
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			    String timeStamp = df.format(new Date());
			   // driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Test_Automated_Batch"+timeStamp);
			    driver.findElement(By.xpath("//input[@name= 'start_date']")).click();
			    driver.findElement(By.xpath("//input[@name= 'end_date']")).click();
			    Actions ac=new Actions(driver);
			    ac.sendKeys(Keys.SPACE).perform();
			    ac.sendKeys(Keys.ENTER).perform();   
			   
			    submitbtn.click();
				}	
	
					
			
			public void addLiveClassForm() {
			addbtn.click();
			
			Select batches=new Select(driver.findElement(By.xpath("//input[@type='search']")));
			batches.selectByIndex(1);
			
			driver.findElement(By.id("class_title")).sendKeys("123");
			
			Select subject=new Select(driver.findElement(By.id("subject_id")));
			subject.selectByIndex(1);
			
			Select faculty =new Select(driver.findElement(By.id("creater_id")));
			faculty.selectByIndex(1);
			
			//SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy.HH:mm:ss");
		   // String timeStamp = df.format(new Date());
		   // driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Test_Automated_Batch"+timeStamp);
			}		

}
