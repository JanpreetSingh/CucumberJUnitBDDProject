package pageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageElements.SignInPE;

public class SignInPF extends SignInPE{
	 
	
	
	public SignInPF(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	public void enter_Email(String emailId) {
		System.out.println("Entering Email");
		txtbx_Email.clear();
		txtbx_Email.sendKeys(emailId);
	}
	
	public void enter_Password(String password) {
		System.out.println("Entering Password");
		txtbx_Password.clear();
		txtbx_Password.sendKeys(password);
	}
	
	public void click_SignIn() {
		System.out.println("Clicking Sign-In");
		btn_Signin.click();
	}
 
	
}
