package com.KurtGeiger.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"
        },
        strict = false,
        features = "src/test/resources/features",
        glue = "com/KurtGeiger/stepDefinitions",
        dryRun = false,
        tags = "@Carvela"  // @Carvela, @Men, @Checkout
)
public class CukesRunner {
}