package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="./src//test//resources//Resource",
				glue={"org.stepdefinition"},
				dryRun=false,tags=("@addcustomerfeature"),
				monochrome=true
				
		)

public class TestRunner {

}
