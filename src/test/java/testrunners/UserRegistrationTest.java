package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\AppFeatures\\registration.feature"}, 
		glue = {"stepdefinition"},		
		plugin = {"pretty",
		          "json:target\\MyReports\\report.json",
		          "junit:target\\MyReports\\report.xml"
		          },
		publish = false,        
		monochrome = false,   

		dryRun = false//,     		                      
//		strict = true        
		)

public class UserRegistrationTest {

	
	
	
	
	
	
	
}
