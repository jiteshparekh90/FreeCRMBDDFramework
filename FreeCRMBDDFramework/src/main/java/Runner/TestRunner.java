package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\SeleniumWorkSpace\\FreeCRMBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature"},//the path of the feature files
		glue={"stepDefinitions"},//step Definition Package Name
		//format = {"pretty","html:test-outout", "json:json_output/cuccumber.json", "junit:junit_xml/cucmber.xml"},// to generate different types of reporting
		monochrome = true, //display the console output in readable format
		//strict = true, //it will check if any step is not define in step definition file
		dryRun = false // to check the mapping is proper between feature file and step def file
		//tags = "~@SmokeTest or ~@RegressionTest or ~@End2End" 
		)

public class TestRunner {

	}

    //ORed : tags = "@SmokeTest or @RegressionTest" -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = "@SmokeTest" and "@RegressionTest" -- execute all tests tagged as @SmokeTest AND @RegressionTest
