package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\AppFeatures\\Uber.feature"}, 
		glue = {"stepdefinition"},
//		tags = "@Regression or @Smoke or @Production",
//		tags = "@Regression and @Smoke",
//      tags = "not @Production",
		tags = "@All",
		plugin = {"pretty",
		          "json:target\\MyReports\\report.json",
		          "junit:target\\MyReports\\report.xml"
		          },
		publish = false,        //For JUnit Report Generation Command --> publish = true.
		monochrome = false,   //Give the Console output in Proper Format or Proper Alignment --> monochrome = true.
		dryRun = false//,     //dryRun Means What if any Specific Step Definition is Missing against that Particular feature file.
		                      //dryRun = true --> will not execute any Scenario it will just check which Step is Missing against the particular feature step.
//		strict = true        //It is Deprecated
		)

//We can also run the UberTest class in Command line using Maven is mvn test

//For Cucumber version 4:--> mvn test -Dcucumber.options.tags="@Smoke or @Regression"
//We can Override the Tag from command line Using Maven is mvn test -Dcucumber.options.tags="@Smoke or @Regression"

//For Cucumber version 6:--> mvn test -Dcucumber.filter.tags="@Smoke or @Regression"
//We can Override the Tag from command line Using Maven is mvn test -Dcucumber.filter.tags="@Smoke or @Regression"
//mvn test -Dcucumber.filter.tags="@Production"

public class UberTest {

	
	
	
	
	
}
