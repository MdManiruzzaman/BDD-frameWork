package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\Manir\\eBayBDD\\eBayCucumber\\src\\test\\java\\feature\\search.feature"},
        glue = {"stepDefinitions"},
        format = {"pretty", "json:report/cucumber.json", "html:report/cucumber-pretty"},
        strict = false,
        monochrome = true,
        tags = {"@SmokeTest"},
        dryRun = true
        )

public class RunnerTest {
}
