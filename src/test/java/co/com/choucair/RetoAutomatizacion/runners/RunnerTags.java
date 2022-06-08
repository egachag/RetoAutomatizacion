package co.com.choucair.RetoAutomatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Opencart.feature",
        tags = "@HU",
        glue ="co.com.choucair.RetoAutomatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
