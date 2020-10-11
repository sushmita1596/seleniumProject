package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 
 features = "C:\\Users\\sushmita\\eclipse-workspace\\Cucumber1\\src\\test\\java\\Features\\"
 ,glue={"StepDefinition"}
 
 )
//thid is a test class
public class TestRunner {

}
