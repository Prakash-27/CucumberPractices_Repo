package stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	    
		System.out.println("user navigates on registration page");
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	    
		 List<List<String>> userList = dataTable.asLists(String.class);
		
		 for (List<String> e : userList) {
			System.out.println(e);
		} 
	}

	@When("User enters following user details with Columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
	    
		List<Map<String, String>> userList = dataTable.asMaps(String.class , String.class);
		
//		System.out.println(userList);
//		System.out.println(userList.get(0).get("Firstname"));
		
		for (Map<String, String> e : userList) {
			System.out.println(e.get("Firstname"));
			System.out.println(e.get("Lastname"));
			System.out.println(e.get("E-mail"));
			System.out.println(e.get("Phone No"));
			System.out.println(e.get("City"));
			System.out.println("---------------");
		}		
	}
	
	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
	    
		System.out.println("user registration should be successful");
	}
	
	
//What is the difference between examples and data table.
//Two things looks similar. 
//Please tell the differences.	

//Answer:	
//Examples are nothing but we are testing with multiple sets of data. 
//Where as DataTables are used send one set of data and will read all the data once for a scenario. 
//Depending on the number of examples your scenario will be executed that many times	
	
	
}
