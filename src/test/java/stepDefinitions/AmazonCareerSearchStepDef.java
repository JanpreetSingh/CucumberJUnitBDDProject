package stepDefinitions;



import helpers.TestContext;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import managers.FileReaderManager;
import managers.PageObjectManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageElements.HomePagePE;
import pageFunctions.HomePagePF;
import pageFunctions.SignInPF;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;

public class AmazonCareerSearchStepDef {
	
	TestContext testContext;
	WebDriver driver;
	HomePagePF homePagePF;
	SignInPF signInPF;
	
	
	public AmazonCareerSearchStepDef(TestContext context) {
		testContext = context;
		
		driver = testContext.getWebDriverManager().getDriver();
		
		homePagePF = testContext.getPageObjectManager().getHomePage();
		signInPF = testContext.getPageObjectManager().getSignInPage();
	}
	
	
	@Given("^open url \"([^\"]*)\" in the browser$")
	public void open_url_in_the_browser(String arg1) throws Throwable {
	    driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
	}

	@When("^click on \"([^\"]*)\" link under \"([^\"]*)\" in the bottom section of the page\\.$")
	public void click_on_link_under_in_the_bottom_section_of_the_page(String arg1, String arg2) throws Throwable {
	    testContext.getPageObjectManager().getHomePage().click_Careers();
	}

	@Then("^Find jobs page should open\\.$")
	public void find_jobs_page_should_open() throws Throwable {
	    System.out.println(driver.getTitle());
	}

	@When("^user clicks on the search icon$")
	public void user_clicks_on_the_search_icon() throws Throwable {

	}

	@Then("^Your job application page should open$")
	public void your_job_application_page_should_open() throws Throwable {
	    
	}

	@When("^enter the \"([^\"]*)\" title and select appropriate job$")
	public void enter_the_title_and_select_appropriate_job(String arg1) throws Throwable {
	    
	}

	@When("^enter the \"([^\"]*)\" and select approproate location$")
	public void enter_the_and_select_approproate_location(String arg1) throws Throwable {
	    
	}

	@When("^click the search icon$")
	public void click_the_search_icon() throws Throwable {
	    
	}

	@Then("^a list of related job results should be displayed$")
	public void a_list_of_related_job_results_should_be_displayed() throws Throwable {
	    
	}	
	
	

}
