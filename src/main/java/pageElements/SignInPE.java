package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import coreAction.ActionDriver;

public class SignInPE extends ActionDriver{
	

	public SignInPE(WebDriver driver) {
		super(driver);
		
	}
	

	@FindBy(how = How.XPATH, using = "//input[@type='email']")
	protected WebElement txtbx_Email;
	
	@FindBy(xpath = "//input[@type='password']")
	protected WebElement txtbx_Password ;
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit' and @id='signInSubmit']")
	protected WebElement btn_Signin ;

}
