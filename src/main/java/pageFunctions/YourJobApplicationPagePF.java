package pageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sun.org.apache.bcel.internal.generic.LNEG;

import pageElements.HomePagePE;
import pageElements.YourJobApplicationPagePE;

public class YourJobApplicationPagePF extends YourJobApplicationPagePE{
	 
	
	
	public YourJobApplicationPagePF(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	

	public void click_SearchJobPage() {
		System.out.println("Clicking Search button on Job Page");
		btn_SearchJobPage.click();
	}
	
	public void enter_JobTitle(String jobTitle) {
		System.out.println("Entering Job name");
		txt_JobTitle.clear();
		txt_JobTitle.sendKeys(jobTitle);
	}
	
	public void click_JobTitle() {
		System.out.println("Clicking Job title");
		li_JobSuggestion.click();;
	}
	
	public void enter_Location(String location) {
		System.out.println("Entering Job Location");
		txt_Location.clear();
		txt_Location.sendKeys(location);
	}
	
	public void click_Location() {
		System.out.println("Clicking Location");
		li_LocationSuggestion.click();
	}
	
	public void click_Search() {
		System.out.println("Clicking Search button on Your Job Application page");
		btn_Search.click();
	}
 
	
}
