package jUnitRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/testing.feature",
		glue={"src.test.java.stepDefinitions.TestingStepDef.java"},
		plugin={"pretty",
				"html:test-output",
				"json:json_output/cucumber.json",
				"junit:junit_xml_output/cucumber.xml",
				},		
		dryRun=true, 	
		monochrome=true	
		)
public class TestingRunner {

}
