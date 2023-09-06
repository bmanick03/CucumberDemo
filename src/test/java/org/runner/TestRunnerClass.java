package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
				 glue="org.stepdefinition", 
				 dryRun=false, 
				 monochrome=true, 
				 snippets=SnippetType.CAMELCASE, 
				 tags= {"@passed1"},
				 plugin= {"pretty", "html:target\\Reports",
						 "junit:target\\Reports\\CucumberReport.xml",
						 "json:target\\Reports\\CucumberRep.json"})
public class TestRunnerClass extends JVMReport {

	@AfterClass
	public static void callReport() {
		generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\CucumberRep.json");

	}
}
