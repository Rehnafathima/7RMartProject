package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String username=ExcelUtility.getStringdata(0, 0, "LoginPage");
		String password=ExcelUtility.getStringdata(0, 1,"LoginPage" );
		ManageContactPage managecontact=new ManageContactPage(driver);
		managecontact.enterUsernameOnUsernameField(username);
		managecontact.enterPasswordOnPasswordField(password);
		managecontact.clickSignInButton();
		managecontact.getTextFromHomePage();
		

}
}

