package org.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonPath) {

		// 1.mention the target folder location

		File f = new File("C:\\Users\\A\\eclipse-workspace\\Cucumber\\AllReports\\jvmReport");

		// 2.we use to create a object for configuration class

		Configuration c = new Configuration(f, "FACEBOOK APPLICATION");

		c.addClassifications("platform", "window");
		c.addClassifications("jdk", "1.8");

		// 3.to add the json file path into the list

		List<String> li = new ArrayList<String>();
		li.add(jsonPath);

		// 4.ReportBuilder class

		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
	}

}
