package managers;

import org.openqa.selenium.WebDriver;

import pageFunctions.HomePagePF;
import pageFunctions.SignInPF;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePagePF homePagePF;
	private SignInPF signInPF;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public HomePagePF getHomePage() {
		return (homePagePF == null) ? homePagePF = new HomePagePF(driver) : homePagePF;
	}
	
	public SignInPF getSignInPage() {
		return (signInPF == null) ? signInPF = new SignInPF(driver) : signInPF;
	}

}
