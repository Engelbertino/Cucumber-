package StepDefinitions;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Arbeit-Pc\\IdeaProjects\\Cucumber\\Features",
        glue = {"StepDefinitions"},
        monochrome = true,
       // plugin = {"pretty", "json:target/JSONReports"},
        //plugin = {"pretty", "html:target/HtmlReports"},
        plugin = {"pretty", "junit:target/JUnitReports/report.xml",
        "json:target/JSONReports",
                "html:target/HtmlReports"},
        tags = "@smoketest"
    )
public class TestRunner {

}
