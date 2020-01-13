package uk.co.sja.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ("src/test/java/uk/co/sja/features"),

        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue=   "uk.co.sja.steps"
        //tags =  {"@regression"}
)

public class AllTest {
}