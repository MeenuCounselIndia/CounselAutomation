package com.ci.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestUtil {

	
	 public static long PAGE_LOAD_TIMEOUT = 20;
	 public static long IMPLICIT_WAIT = 10;
	 
	 
}



//mouse hover 

/*public void clickOnNewContactLink() {
	Actions action = new Actions(driver);
	sction.moveToElement(contactsLink).build().perform();
	newContactLink.click();
}*/



/*
public void createNewContact(String title, String ftName, String ltName, String comp) {
	Select select = new Select(driver.findElement(By.name("title")));
	
	select.selectByVisibleText(title);
	firstName.sendKeys(ftName);
	lastName.sendKeys(ltName);
}
*/


/*
Select company=new Select(driver.findElement(By.id("iCompanyID")));
company.selectByIndex(1);
Select branch=new Select(driver.findElement(By.id("BranchID")));
branch.selectByIndex(1);

*/

/*
@DataProvider
public Object[][] getCRMTestData(){
	Object data[][] = TestUtil.getTestData(sheetName);
	return data;
}


@Test(priority=4, dataProvider="getCRMTestData")
public void validateCreateNewContact(String title, String firstName, String lastName, String company){
	homePage.clickOnNewContactLink();
	//contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
	contactsPage.createNewContact(title, firstName, lastName, company);
	
}

*/