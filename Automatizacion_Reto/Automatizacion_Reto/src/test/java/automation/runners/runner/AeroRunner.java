package automation.runners.runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/aero.feature",
        glue = "com.banistmo.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AeroRunner {
}
