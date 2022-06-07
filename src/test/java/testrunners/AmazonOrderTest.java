package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\AppFeatures\\Order.feature"}, 
		glue = {"stepdefinition"},
//		tags = "@Regression or @Smoke or @Production",
//		tags = "@Regression and @Smoke",
//      tags = "not @Production",
//		tags = "@All",
		plugin = {"pretty"}
		
		)

//To Run from maven in Command Line -> mvn test
public class AmazonOrderTest {

}
