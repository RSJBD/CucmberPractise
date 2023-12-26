package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features="src\\test\\resource\\featuresFile\\ListOfList.feature",
		dryRun=!true,
		glue= {"steps"},
		monochrome=true,
		plugin= {"pretty",
				"json:target/cucumber-report.json",
				"html:target/cucumber-htmlreport.html"
		},
		snippets=SnippetType.CAMELCASE
		
		
		)
public class ListOfListRunner extends AbstractTestNGCucumberTests{

}
