package com.osa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/com/osa/features"}
		,glue= {"com.osa.steps","com.hooks.my"}
		,plugin= {"pretty","html:target/html-report"}
		)


public class Runner {

}
