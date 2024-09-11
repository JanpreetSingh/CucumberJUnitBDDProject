package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import coreAction.ActionDriver;

public class HomePagePE extends ActionDriver{
	

	public HomePagePE(WebDriver driver) {
		super(driver);
		
	}
	

	@FindBy(how = How.XPATH, using = "//div[@id='nav-tools']/a[contains(@href,'signin')]")
	protected WebElement btn_Signin ;
	
	@FindBy(xpath = "//a[contains(text(),'Careers')]")
	protected WebElement lnk_Careers;
	


}
