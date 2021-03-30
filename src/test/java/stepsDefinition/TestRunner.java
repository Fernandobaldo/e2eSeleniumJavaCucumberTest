package stepsDefinition;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"stepsDefinition"},
monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports.html"}
)
public class TestRunner {
}
