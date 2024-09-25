package jUnitRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\resources\\features\\amazonCareerSearch.feature",
		glue={".\\src\\test\\java\\stepDefinitions\\AmazonCareerSearchStepDef.java", "hooksCucumber"},
//		Reporting in HTML, JSON, XML formats.
		plugin={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
//		When TRUE, The test is not actually run, but verifies whether all feature file steps have corresponding step definitions.		
		dryRun=false, 
//		When TRUE, Readable format for scenarios and steps execution result.		
		monochrome=true,	
//		At execution time if cucumber encounters any undefined/pending steps then cucumber does fails the execution and undefined steps are marked as fail and BUILD is FAILURE.
		strict=true,		
//		Tags are used to Groups Scenarios in Feature file. And decide which scenarios to run
//		tags={"@sanityGroup,@regressionSuite,@end2End"}	// Execute SCENARIOS with tags @sanityGroup OR @regressionSuite OR @end2End
//		tags={"@sanityGroup","@regressionSuite"}	// Execute SCENARIOS with tags @sanityGroup AND @regressionSuite
		tags={"~@sanityGroup","~@regressionSuite"}  // Execute all SCENARIOS except with tags @sanityGroup AND/OR @regressionSuite
		)
public class Runner {

}
