package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {
	public WebDriver driver;
	public ManageContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

		
		@FindBy(xpath="//input[@type='text']") private WebElement usernamefield;
		 @FindBy(xpath="//input[@type='password']") private WebElement passwordfield;
		 @FindBy(xpath="//button[@type='submit']") private WebElement signinbutton;
		 @FindBy(xpath="//h3[text()='1']") private WebElement managecontact;
		 
		  public void enterUsernameOnUsernameField(String username) {
				usernamefield.sendKeys(username);
				}

			public void enterPasswordOnPasswordField(String password) {
				passwordfield.sendKeys(password);
			}

			public void clickSignInButton() {
				signinbutton.click();
			}
			
			public String getTextFromHomePage() {
				return managecontact.getText();
				
			}
	}

			
			
	
