package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		features  = {".//Features/"} ,
		glue      = "StepDefination" ,
		dryRun    =  false            ,
		monochrome=  true            ,
		tags      = "@sanity"        ,
		plugin    = {"pretty","html:target/cucumber-reports/Reports.html"}
		
	
		)

public class Runner {

}
