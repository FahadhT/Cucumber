package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepDefinition", monochrome = true, dryRun = false, strict = true, plugin = {
		"html:C:\\Users\\A\\eclipse-workspace\\Cucumber\\AllReports\\htmlReport",
		"junit:C:\\Users\\A\\eclipse-workspace\\Cucumber\\AllReports\\junitReport\\face.xml",
		"json:C:\\Users\\A\\eclipse-workspace\\Cucumber\\AllReports\\jsonReport\\facebook.json",
		"rerun:C:\\Users\\A\\eclipse-workspace\\Cucumber\\Rerun\\failures.txt"})
public class TestRunner {

	@AfterClass

	public static void report() {

		JvmReport.generateJvmReport("C:\\Users\\A\\eclipse-workspace\\Cucumber\\AllReports\\jsonReport\\facebook.json");
				
	}
}
