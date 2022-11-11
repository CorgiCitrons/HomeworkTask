package runnerTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    //RunWith - tells to JUnit to run this class as Cucumber test
    @RunWith(Cucumber.class)
    @CucumberOptions(
            // feature word - provides location of feature file
            features = "src\\test\\resources",
            // glue word = provides path to steps definitions class
            glue = "stepDefinitions"
//        ,tags = "@test"
    )
    public class CucumberRunnerTest {

    }