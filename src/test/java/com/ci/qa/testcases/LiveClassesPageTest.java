package com.ci.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ci.qa.base.TestBase;
import com.ci.qa.pages.BatchesPage;
import com.ci.qa.pages.HomePage;
import com.ci.qa.pages.LiveClassesPage;
import com.ci.qa.pages.LoginPage;

public class LiveClassesPageTest extends TestBase {
	
	BatchesPage batchesPage;
	LoginPage loginPage;
	HomePage homePage;
	LiveClassesPage liveclassPage;
	
	
	public LiveClassesPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		//batchesPage = new BatchesPage();		
		homePage=new HomePage();
		liveclassPage= new LiveClassesPage();
	}
	
	
	@Test(priority=1)
	public void liveClassSearchSubmit() {
		//homePage=new HomePage();
		homePage.menuButton();
		homePage.batchManage();
		homePage.liveclasseslink();
		
		//liveclassPage= new LiveClassesPage();
		liveclassPage.liveClassesList();
		liveclassPage.searchForLiveClass();	
	}
	
	
	@Test(priority=2)	
	public void addNewFormDetails() {
	//	homePage=new HomePage();
		homePage.menuButton();
		homePage.batchManage();
		homePage.liveclasseslink();
		
		//liveclassPage= new LiveClassesPage();
		liveclassPage.addLiveClassForm();			
	}
			
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
