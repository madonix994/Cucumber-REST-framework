import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/",
		glue = {"steps"},
		plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
		monochrome = true
)

public class TestRunner {

	public static void main(String[] args) {
	}

}