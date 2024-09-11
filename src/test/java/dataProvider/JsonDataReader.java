package dataProvider;

import gherkin.deps.com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import com.google.common.reflect.TypeToken;

import net.bytebuddy.jar.asm.TypeReference;
import testDataPOJO.Career;
import managers.FileReaderManager;

public class JsonDataReader {
	
	private String careerJson = FileReaderManager.getInstance().getConfigFileReader().getTestDataJSONPath() + "Career.json";
	private List<Career> careerList;
	
	public JsonDataReader() {
		getCareerData();
	}
	
	private void getCareerData() {
		Gson gson = new Gson();
		FileReader fileReader;
		
		try {
			fileReader = new FileReader(careerJson);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			Career[] careers = gson.fromJson(bufferedReader, Career[].class);
			careerList = Arrays.asList(careers);
//			Alternative way: JSON to JAVA Object.
			/*
			 * Type type = new TypeToken<List<Career>>(){}.getType();
			 * careerList = gson.fromJson(bufferedReader, type);
			*/
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + careerJson);
		}
		
	}
	
	public Career getCareerDataByName(String CareerName) {
		for (Career career : careerList) {
			if(career.job.equalsIgnoreCase(CareerName)) return career;
		}
		return null;
//		Alternative way: Lamda Expression to the above approach.
		/*
		 * return careerList.stream().filter(x -> x.job.equalsIgnoreCase(CareerName)).findAny().get();
		 * */
	}

}
