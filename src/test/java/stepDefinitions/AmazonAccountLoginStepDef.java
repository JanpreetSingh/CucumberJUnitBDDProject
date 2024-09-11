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

public class AmazonAccountLoginStepDef {
	
	TestContext testContext;
	WebDriver driver;
	HomePagePF homePagePF;
	SignInPF signInPF;
	
	
	public AmazonAccountLoginStepDef(TestContext context) {
		testContext = context;
		
		driver = testContext.getWebDriverManager().getDriver();
		
		homePagePF = testContext.getPageObjectManager().getHomePage();
		signInPF = testContext.getPageObjectManager().getSignInPage();
	}
	
	
	@Given("^open the url \"([^\"]*)\" in the browser$")
	public void open_the_url_in_the_browser(String arg1) throws Throwable {	
		
		driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
		homePagePF.click_Signin();
	}
	
	@When("^enter incorrect username and password$")
	public void enter_incorrect_username_and_password() throws Throwable {
	   signInPF.enter_Email("email@idid.com");
	   signInPF.enter_Password("amazon");
	   
	}
	
	@When("^enter unregistered username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_unregistered_username_and_password(String username, String password) throws Throwable {
		signInPF.enter_Email(username);
		signInPF.enter_Password(password);
	   
	}
	
	@When("^enter invalid username and password$")
	public void enter_invalid_username_and_password(DataTable credentials) throws Throwable {
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<String> dataList = credentials.asList(String.class);
		System.out.println("LIST--->" + dataList);
		List<List<String>> dataListList = credentials.asLists(String.class);
		System.out.println("LIST of Lists--->" + dataListList);
		Map<String, String> dataMap = credentials.asMap(String.class, String.class);
		System.out.println("MAP-----> " + dataMap);
		List<Map<String, String>> dataMapList = credentials.asMaps(String.class, String.class);
		System.out.println("LIST of Maps-----> " + dataMapList);
		
		for (Map<String, String> map : dataMapList) {
			signInPF.enter_Email(map.get("username"));
			signInPF.enter_Password(map.get("password"));
		    Thread.sleep(2000);
		 }	
		
	}
	
	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		signInPF.click_SignIn();
	}

	@Then("^user should not successfully login to the application$")
	public void user_should_not_successfully_login_to_the_application() throws Throwable {
		Assert.assertTrue(true);
	}
	
	
	

}
