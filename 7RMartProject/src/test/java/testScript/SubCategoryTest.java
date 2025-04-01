package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import pages.SubCategoryPage;
import utilities.ExcelUtility;

public class SubCategoryTest extends Base {
	
@Test
	public void verifyUserIsAbleToClickSubCategory() throws IOException {
		String username=ExcelUtility.getStringdata(0, 0, "LoginPage");
		String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
		SubCategoryPage subcategory=new SubCategoryPage(driver);
		subcategory.enterUsernameOnUsernameField(username);
		subcategory.enterPasswordOnPasswordField(password);
		subcategory.clickSignInButton();
		subcategory.clickSubCategory();
		String expectedResult="List Sub Categories";
		String actualResult=subcategory.gettextFromSubcategoryPage();
		Assert.assertEquals(actualResult, expectedResult,"User is unable to click on subcategory button");
		
	}
@Test
public void verifyUserIsAbleToAddCategoryFromDropdownOnSubCategory() throws IOException {
	String username=ExcelUtility.getStringdata(0, 0, "LoginPage");
	String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
	SubCategoryPage subcategory=new SubCategoryPage(driver);
	subcategory.enterUsernameOnUsernameField(username);
	subcategory.enterPasswordOnPasswordField(password);
	subcategory.clickSignInButton();
	subcategory.clickSubCategory();
	subcategory.clickNewButton();
	subcategory.clickSelectButton();
	subcategory.clickOption();
	String expectedResult="Toys";
	String actualResult=subcategory.selectoption();
	Assert.assertEquals(actualResult,expectedResult,"user is unable to click on select button" );
	
	
	
	
	
	
}
}
