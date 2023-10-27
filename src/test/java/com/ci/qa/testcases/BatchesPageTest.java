package com.ci.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ci.qa.base.TestBase;
import com.ci.qa.pages.BatchesPage;
import com.ci.qa.pages.HomePage;
import com.ci.qa.pages.LoginPage;


public class BatchesPageTest extends TestBase{
	
	
	BatchesPage batchesPage;
	LoginPage loginPage;
	HomePage homePage;
	
	public BatchesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));	
		batchesPage = new BatchesPage();	
		homePage= new HomePage();
	}
	
	
	@Test
	public void fillFormTest() {
	//batchesPage = new BatchesPage();	
	//homePage= new HomePage();
	
	homePage.menuButton();
	homePage.batchManage();
	homePage.batchesLink();
	
	batchesPage.addNewButton();
	batchesPage.fillForm();
	
	}
		
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
