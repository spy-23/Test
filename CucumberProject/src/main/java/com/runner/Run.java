package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = {"src/test/java/com/featurefiles"},
        dryRun = false,
        glue = "com.steps"
)
public class Run {
}
