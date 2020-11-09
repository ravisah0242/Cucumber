package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="E:\\RCSA18\\Cucumber\\src\\features\\Login.feature",
		glue= {"stepDefinition"}
		
		
		
		
		
		
		
		
		
		
		
		
		)
public class LoginRunner {

}
