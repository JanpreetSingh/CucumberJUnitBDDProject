package stepDefinitions;



import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class TestingStepDef {
	
		public TestingStepDef() {
	}

	@Given("^Escape 'special characters like \\$ %' in step definition$")
	public void escape_special_characters_like_$_in_step_definition() throws Throwable {
	    System.out.println("SPECIAL");
	}
	
	@Given("^User provide below case files$")
	public void user_provide_below_case_files(DataTable table) throws Throwable {
	  Map<String, String> fileMap = table.asMap(String.class, String.class);
	   
	  System.out.println(fileMap.get("PART"));
	  System.out.println(fileMap.get("CASE_DECISION"));	   
	}


}
