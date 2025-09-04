package automation.runners.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "resources/features/aero.feature",
        glue = "automation.runners.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AeroRunner {
}
