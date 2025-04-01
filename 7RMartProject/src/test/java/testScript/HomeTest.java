package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {


@Test(description="whether user  is successfully able to logout from the home page",retryAnalyzer=retry.Retry.class)
public void verifyUserIsAbleToClickAdminButton() throws IOException {
	String username=ExcelUtility.getStringdata(0, 0, "LoginPage");
	String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
	HomePage home=new HomePage(driver);
	home.enterUsernameOnUsernameField(username);
	home.enterPasswordOnPasswordField(password);
	home.clickSignInButton();
	home.clickOnAdminButton();
}
@Test
public void verifyUserIsAbleToClickLogoutButton() throws IOException {
String username=ExcelUtility.getStringdata(0, 0, "LoginPage");
	
	String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
	HomePage home=new HomePage(driver);
	home.enterUsernameOnUsernameField(username);
	home.enterPasswordOnPasswordField(password);
	home.clickSignInButton();
	home.clickOnAdminButton();
	home.clickOnLogOutButton();
}
	
}
