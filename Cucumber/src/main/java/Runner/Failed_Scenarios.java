package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target\\rerun.txt", //the path of the feature files
		glue={"StepDefinitions"}, //the path of the step definition files
		plugin = {"pretty","html:Tarteg\\test-outout", "json:json_output\\cucumber.json", "junit:junit_xml\\cucumber.xml", "rerun:target\\rerun.txt"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		)//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
public class Failed_Scenarios {
	
}
