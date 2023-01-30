package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\Features",
		glue = "Steps",
		plugin = {
				"html:reports/myReport.html",
				"json:reports/myReport-json.json",
				"rerun:reports/rerun.txt"
		},
		
		
		dryRun = false,
		monochrome = true,
		tags = "@amazonTest"
		

		)

public class TestRunner {

}
