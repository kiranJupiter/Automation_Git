package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multiple_scenario {




@Given("^I want to write a step with precondition$")
public void i_want_to_write_a_step_with_precondition() {
	System.out.println("1");
}

@Given("^some other precondition$")
public void some_other_precondition() {
	System.out.println("2");
}

@When("^I complete action$")
public void i_complete_action() {
	System.out.println("3");
}

@When("^some other action$")
public void some_other_action() {
System.out.println("4");
}

@Given("^yet another action$")
public void yet_another_action() { 
System.out.println("5");
}

@Then("^I validate the outcomes$")
public void i_validate_the_outcomes() {
	System.out.println("6");
}

@Then("^check more outcomes$")
public void check_more_outcomes() { 
System.out.println("7");
System.setProperty("webdriver.chrome.driver","D:\\Browser driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www1.nseindia.com/live_market/dynaContent/live_watch/pre_open_market/pre_open_market.htm");
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
driver.manage().window().maximize();
}

@When("^i go to bus stop$")
public void i_go_to_bus_stop(){
	System.out.println("8");
}

@Then("^I have to wait$")
public void i_have_to_wait() {
	System.out.println("9");	
}

	
}
