package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before("@Smoke")
	public void setUp_browser(Scenario sc) {
		System.out.println("launch chrome Browser");
		System.out.println(sc.getName());
	}
	
//	@Before(order = 2) 
//	public void setUp_url() {
//		System.out.println("launch URL");
//	}
	
	
	@After("@Smoke")
	public void tearDown_logOut() {
		System.out.println("logOut from Application");
	}
	
//	@After(order = 1)
//	public void tearDown_Close(Scenario sc) {
//		System.out.println("Close the Browser");
//		System.out.println(sc.getName());
//	}
	
	
	
//	@BeforeStep
//	public void takeScreenshot() {
//		System.out.println("take the Screenshot");
//	}
//	
//	@AfterStep
//	public void refreshPage() {
//		System.out.println("refresh the Page");
//	}
	
	
//Before hooks are run in ascending order.
//while After hooks are run in descending order(highest order number first)	
	
	
	
}
