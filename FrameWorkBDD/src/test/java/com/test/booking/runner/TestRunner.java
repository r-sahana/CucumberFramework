package com.test.booking.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions 
(features = "src\\test\\resources\\FeatureFile\\"
,glue = "com.test.booking.StepDefinition"
,monochrome = true
,plugin = {"pretty", "html:target/reports", "json:target/reports"})

public class TestRunner extends AbstractTestNGCucumberTests {
}
