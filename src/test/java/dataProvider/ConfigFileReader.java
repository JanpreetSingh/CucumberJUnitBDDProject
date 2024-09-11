package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	private Properties prop;
	private final String configFilePath = "./configs/configuration.properties"; 
	
	public ConfigFileReader() {
		
try {
			
			File src = new File(configFilePath);
			
			FileInputStream fis = new FileInputStream(src);
			
			prop = new Properties();
			prop.load(fis);
			
		} catch (Exception e) {			
			System.out.println("Exception is == "+ e.getMessage());
		}
	}
	
	
	public String getChromeDriverPath(){
		
		String chromeDriverPath = prop.getProperty("chromeDriverPath");
		if(chromeDriverPath!= null) return chromeDriverPath;
		 else throw new RuntimeException("chromeDriverPath not specified in the Configuration.properties file."); 
	}
	
	public String getFirefoxDriverPath(){
		
		String firefoxDriverPath = prop.getProperty("chromeDriverPath");
		if(firefoxDriverPath!= null) return firefoxDriverPath;
		 else throw new RuntimeException("firefoxDriverPath not specified in the Configuration.properties file."); 
	}
	
	public String getIeDriverPath(){
		
		String ieDriverPath = prop.getProperty("ieDriverPath");
		if(ieDriverPath!= null) return ieDriverPath;
		else throw new RuntimeException("ieDriverPath not specified in the Configuration.properties file."); 
	}
	
	public long getImplicitlyWait() { 
		 String implicitlyWait = prop.getProperty("implicitlyWait");
		 if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		 else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
	}
		 
	public String getApplicationUrl() {
		 String url = prop.getProperty("url");
		 if(url != null) return url;
		 else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public DriverType getBrowserName() {
		 String browser = prop.getProperty("browser");
		 if(browser == null || browser.equals("chrome")) return DriverType.CHROME;
		 else if (browser.equals("firefox")) return DriverType.FIREFOX;
		 else if (browser.equals("ie")) return DriverType.IE;
		 else throw new RuntimeException("Browser not specified in the Configuration.properties file.");
	}
	
	public EnvironmentType getEnvironmentName() {
		 String environment = prop.getProperty("environment");
		 if(environment == null || environment.equals("local")) return EnvironmentType.LOCAL;
		 else if (environment.equals("remote")) return EnvironmentType.REMOTE;
		 else throw new RuntimeException("environment not specified in the Configuration.properties file.");
	}
	
	public String getTestDataJSONPath() {
		String testDataJSONPath = prop.getProperty("testDataJSONPath");
		if(testDataJSONPath!= null) return testDataJSONPath;
		else throw new RuntimeException("Value not specified in the configuration.properties file for the Key:testDataJSONPath");
	}
	

}
