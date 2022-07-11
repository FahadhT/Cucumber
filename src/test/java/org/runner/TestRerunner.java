package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\failures.txt", glue = "org.stepDefinition",plugin = {
		
		"rerun:C:\\Users\\A\\eclipse-workspace\\Cucumber\\Rerun\\failures.txt"})

public class TestRerunner {

	@AfterClass

	public static void report() {

		JvmReport.generateJvmReport("C:\\Users\\A\\eclipse-workspace\\Cucumber\\AllReports\\jsonReport\\facebook.json");
		
	}
}
