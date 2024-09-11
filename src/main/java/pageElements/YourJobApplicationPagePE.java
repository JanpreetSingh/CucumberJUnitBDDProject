package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import coreAction.ActionDriver;

public class YourJobApplicationPagePE extends ActionDriver{
	

	public YourJobApplicationPagePE(WebDriver driver) {
		super(driver);
		
	}
	

	@FindBy(how = How.XPATH, using = "//button[@id='search-button']")
	protected WebElement btn_SearchJobPage;
	
	@FindBy(how = How.XPATH, using = "//div[@id='search-container']//button[contains(@class,'search-button')]")
	protected WebElement btn_Search;
	
	@FindBy(how = How.XPATH, using = "//div[@id='search-container']//input[@id='search_typeahead']")
	protected WebElement txt_JobTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='tt-menu']/div[@class='tt-dataset tt-dataset-results']/div[2]")
	protected WebElement li_JobSuggestion;
	
	@FindBy(how = How.XPATH, using = "//div[@id='search-container']//input[@id='location-typeahead']")
	protected WebElement txt_Location;
	
	@FindBy(how = How.XPATH, using = "//div[@class='tt-menu']/div[@class='tt-dataset tt-dataset-location-results']/div[1]")
	protected WebElement li_LocationSuggestion;
	


}
