package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/USER-PC/workspace/FreeCRMBDDFramework/src/main/java/Features"//the path of the features file
		,glue={"StepDeffintion"},// the path of the step definition file
		format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucmber.xml"},// to genarate different form of reports
		monochrome=true,//display the console output proper readable format 
		dryRun=false,// it will check the mapping b/w step definition and feature file
		strict=true//it will check if any step definition is not defined in step definition file
		)
public class TestRunner {

}
