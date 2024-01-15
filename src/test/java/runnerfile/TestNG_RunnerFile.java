package runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        dryRun = false,
        monochrome = true,
        features = {"src/test/resources/feature_files" },
        glue     = {"scenarios"},
        tags = "@TutorialsNinjaLogin or @TutorialsNinjaRegister or @TutorialsNinjaSearchProduct",
        plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"}

   )

public class TestNG_RunnerFile extends AbstractTestNGCucumberTests{

}
