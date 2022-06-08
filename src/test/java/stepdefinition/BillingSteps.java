package stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingSteps {

	double billingAmount;
	double taxAmount;
	double finalAmount;

	@Given("user is on biling page")
	public void user_is_on_biling_page() {

	}

	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billingAmount) {
		this.billingAmount = Double.parseDouble(billingAmount);
	}

	@When("user enters tax amount {string}")
	public void user_enters_tax_amount(String taxAmount) {
		this.taxAmount = Double.parseDouble(taxAmount);
	}

	@When("user clicks on calculate button")
	public void user_clicks_on_calculate_button() {

	}

	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String expectedfinalAmount) {
		this.finalAmount = this.billingAmount + this.taxAmount;
		System.out.println("expected final amount: " + Double.parseDouble(expectedfinalAmount));
		System.out.println("actual final amount: " + this.finalAmount); 
		
		Assert.assertTrue(this.finalAmount == Double.parseDouble(expectedfinalAmount));
	}

}

//Scenario Outline and Examples Keyword in Cucumber (Data Driven Testing):
//Introducing some Bug in the Calculating billing amount

//Feature: Calculate billing amount

//Scenario Outline: billing amount 
//Given user is on biling page
//When user enters billing amount <billingamount> --> without String is taken as INteger and Double value in Step Definition files
//When user enters tax amount <taxamount>
//And user clicks on calculate button 
//Then it gives the final amount <finalamount>


//@When("user enters tax amount {double}")
//public void user_enters_tax_amount(Double taxAmount) { --> this will Method Overloading work in cucumber 4xx Version
//	this.taxAmount = taxAmount;
//}

//@When("user enters tax amount {int}")
//public void user_enters_tax_amount(int taxAmount) {
//	this.taxAmount = taxAmount;
//}

//@Then("it gives the final amount {double}")
//public void it_gives_the_final_amount(Double finalAmount) {
//	this.finalAmount = this.billingAmount + this.taxAmount;
//

//@Then("it gives the final amount {int}")
//public void it_gives_the_final_amount(int finalAmount) {
//	this.finalAmount = this.billingAmount + this.taxAmount;
//

