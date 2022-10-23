package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features", glue= {"StepDefinations"},
monochrome= true,
//plugin = {"pretty","html:target/HTMLReports/reports.html"}

//plugin = {"pretty", "json:target/JSONReports/reports.json"}

//plugin = {"pretty", "junit:target/XMLReports/reports.xml"},

plugin = {"pretty", "html:target/HTMLReports/report.html",
		   "json:target/JSONReports/reports.json",
		   "junit:target/XMLReports/reports.xml"
		   },

tags= "@smoketest"
		)
public class TestRunner {

}
