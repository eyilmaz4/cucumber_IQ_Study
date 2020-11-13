package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features="C:\\Users\\12812\\cucumber_IQ_Study\\src\\test\\java\\features\\login.feature",
        glue="stepDefs",
        tags="@multipleUsers",//unprofessional
        plugin={"pretty","html:target/cucumber.html",
        "json:target/cucumber.json"}

)

public class TestRunner {
}
