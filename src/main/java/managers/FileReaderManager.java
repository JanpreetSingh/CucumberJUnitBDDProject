package managers;

import dataProvider.ConfigFileReader;
import dataProvider.JsonDataReader;

/* File Reader Manager as Singleton Design.
 * The Selenium framework will have many File Readers. So it is better to have a File Reader Manager above all the File Readers. And it is better to make the manager class as singleton.
 * The Singleton’s purpose is to control object creation, limiting the number of objects to only one. Since there is only one Singleton instance, any instance fields of a Singleton will occur only once per class, just like static fields.
 * To implement Singleton pattern, we have different approaches but all of them have following common concept:
Private constructor to restrict instantiation of the class from other classes.
Private static variable of the same class that is the only instance of the class.
Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
 **/ 
public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static JsonDataReader jsonDataReader;
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}
	
	public ConfigFileReader getConfigFileReader() {
		return (configFileReader==null) ? configFileReader = new ConfigFileReader() : configFileReader;
	}
	
	public JsonDataReader getJsonDataReader() {
		return (jsonDataReader==null) ? jsonDataReader = new JsonDataReader() : jsonDataReader;
	}
	
}
