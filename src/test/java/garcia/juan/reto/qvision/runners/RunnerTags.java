package garcia.juan.reto.qvision.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/validarTarifasDXHotels.feature",
        glue = "garcia.juan.reto.qvision.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}