package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\Sel_New\\Sel@6.30PM(EST)\\workspace\\CucumberBDD_Lab\\src\\main\\java\\features",
		glue = {"stepDefinations"},
		dryRun = false
		)
public class TestRunner {

}
