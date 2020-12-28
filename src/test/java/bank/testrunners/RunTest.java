package bank.testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
                (
                	plugin ="pretty",
                    features="src/test/resources/BUISINESS_LOGIC/CUCUMBER_SUITS",
                	tags="@SmokeTest",
                	glue="bank.cucumbermap",
                	monochrome=true
                	
               		
                		
                )

public class RunTest 
{

}
