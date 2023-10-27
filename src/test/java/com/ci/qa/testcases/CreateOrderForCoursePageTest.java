package com.ci.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ci.qa.base.TestBase;
import com.ci.qa.pages.BatchesPage;
import com.ci.qa.pages.CreateOrderForCoursePage;
import com.ci.qa.pages.HomePage;
import com.ci.qa.pages.LoginPage;

public class CreateOrderForCoursePageTest extends TestBase {
	
	BatchesPage batchesPage;
	LoginPage loginPage;
	HomePage homePage;
	CreateOrderForCoursePage createOrderForCoursePage;
	
	public CreateOrderForCoursePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));	
		batchesPage = new BatchesPage();	
		homePage = new HomePage();
		createOrderForCoursePage = new CreateOrderForCoursePage(); 
	}
	
	@Test
	public void addOrderFormTest() {

		homePage.menuButton();
		homePage.batchManage();
		homePage.batchesLink();
		batchesPage.addStudentBookingButton();
		//createOrderForCoursePage.addOrderForm("Diploma in Child Psychology", "meenu,Capacity:100,Total Students:3", "Already User");	
		
		
		
	}
	

	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
