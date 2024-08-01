package Testsript;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features="C:\\Users\\web\\eclipse-workspace\\com.EspireAutomation_BDD\\Feature\\myhome.feature",
                glue="step_Definition",
                tags= "@sunil",
                dryRun = false
                )

public class Runner{

}

		
	





