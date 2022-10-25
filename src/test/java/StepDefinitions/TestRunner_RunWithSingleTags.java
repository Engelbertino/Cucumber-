package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Arbeit-Pc\\IdeaProjects\\Cucumber\\FeaturewithTags",
        glue = {"StepDefinitions"},
      tags = "@smoke and @regression"

    )
class TestRunner_RunWithSingleTags {

}
