package pageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageElements.HomePagePE;

public class HomePagePF extends HomePagePE{
	 
	
	
	public HomePagePF(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	

	public void click_Signin() {
		System.out.println("Clicking Signin");
		btn_Signin.click();
	}
	
	public void click_Careers() {
		System.out.println("Clicking Careers link");
		lnk_Careers.click();
	}
 
	
}
