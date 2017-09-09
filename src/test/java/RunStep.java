import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by shweta on 02/07/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format="html:target/CucumberReports",
features= "src/test/features/",
tags= "@smoke")
public class RunStep {
}
