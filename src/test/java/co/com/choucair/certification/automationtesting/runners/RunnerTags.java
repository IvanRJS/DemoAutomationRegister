package co.com.choucair.certification.automationtesting.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/automation_testing.feature"},
        tags = {"@Tag0"},
        glue = {"co.com.choucair.certification.automationtesting.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
