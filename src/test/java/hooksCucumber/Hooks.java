package hooksCucumber;

import helpers.TestContext;

import java.util.concurrent.TimeUnit;

import managers.FileReaderManager;
import managers.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProvider.ConfigFileReader;

/*
 * There are only 2 Global HOOKS in CUCUMBER: @BEFORE and @AFTER:- These run before and after every scenario in the Feature file.
 * TAGGED HOOKS are used to run before and after a scenario with a specific tag: @Before/After("@tagName")
 */
public class Hooks {

	TestContext testContext;
	WebDriverManager webDriverManager;
	WebDriver driver;
	
	
	public Hooks(TestContext context) {
		testContext = context;
	}
	
	
	@Before(order = 2)
	public void setupFirst() {

		System.out.println("*************SETUP METHOD*************");
		driver = testContext.getWebDriverManager().getDriver();
	}
	
	//Smaller order number @Before method will be called first.
	@Before(order = 1)
	public void setupSecond() {

		System.out.println("************SETUP SECOND METHOD************");
	}
	
	//Greater order number @After method will be called first.
	@After(order = 2)
	public void teardownSecond() {
		System.out.println("************TEARDOWN SECOND METHOD************");
	}

	@After(order = 1)
	public void teardownFirst() {
		System.out.println("************TEARDOWN METHOD************");
		//testContext.getWebDriverManager().closeDriver();
	}

}
