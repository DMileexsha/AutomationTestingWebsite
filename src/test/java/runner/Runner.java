package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = {"stepDefinitions","hooks"},
        plugin = {"pretty", "html:target/cucumber-report.html"
        },
        monochrome = true,
        publish = true
)
public class Runner extends AbstractTestNGCucumberTests {
}
