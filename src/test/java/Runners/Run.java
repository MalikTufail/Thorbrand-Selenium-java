package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Find_a_Lawyer.feature",
        glue = {"StepDefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {
}
