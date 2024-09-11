package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;
import enums.EnvironmentType;

public class WebDriverManager {
	
	private WebDriver driver;
	private DriverType driverType;
	private EnvironmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
	private static final String IE_DRIVER_PROPERTY = "webdriver.ie.driver";
	
	
	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowserName();
		environmentType = FileReaderManager.getInstance().getConfigFileReader().getEnvironmentName();
	}

	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() {
		   switch (environmentType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
	}

	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}

	private WebDriver createLocalDriver() {
        switch (driverType) {	    
        case FIREFOX : 
        	System.setProperty(FIREFOX_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigFileReader().getFirefoxDriverPath());
        	driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigFileReader().getChromeDriverPath());
        	driver = new ChromeDriver();
    		break;
        case IE : 
        	System.setProperty(IE_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigFileReader().getIeDriverPath());
        	driver = new InternetExplorerDriver();
    		break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	}	

	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	

}

