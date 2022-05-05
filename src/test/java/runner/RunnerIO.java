package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={".\\src\\test\\java\\Feature"},
		glue={"stepDefinition"},
		dryRun=false, //true:map feature file and step defn for missing steps
		plugin={"pretty","html:cucumber.html",
				"json:cucumber-json.json"}, //used to preint scenario steps in console and also used for map
		monochrome=true, //to remove special character in console
		tags="@smokeTest and @regressiontest"
		)
public class RunnerIO extends AbstractTestNGCucumberTests{
	
}
