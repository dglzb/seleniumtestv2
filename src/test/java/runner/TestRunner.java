package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps"},
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-reports/Cucumber.html"},
        monochrome = true
)

// *** mvn clean test -Dtags="@TextBox" *** Ejecutar test de tag especifico
// *** mvn clean test -Dtest=TestRunner *** Ejecutar clase TestRunner


public class TestRunner {
}
