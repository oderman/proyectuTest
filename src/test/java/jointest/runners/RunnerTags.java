package jointest.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Utest.feature",
        tags = "@stories",
        glue = "jointest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {

}
