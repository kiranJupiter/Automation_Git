package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {
	@Given("^kiran is on facebook login page$")
	public void kiran_is_on_facebook_login_page()  {
	   System.out.println("Kiran is on login page");
	   
	}

	@When("^kiran enters username and password$")
	public void kiran_enters_username_and_password() {
	 System.out.println("Kiran is entering username and password");
	}

	@Then("^click on login$")
	public void click_on_login()  {
	   System.out.println("Kiran will click on login button");
	}


}
