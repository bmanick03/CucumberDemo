package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmReport(String jsonPath) {
		
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\Cucumber");
		
		Configuration con = new Configuration(f,"NHS Assessment");
		con.addClassifications("User Story", "Search Functionality");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser Version", "116");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Time Zone", "BST");
		con.addClassifications("Sprint", "1");
		

		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(li, con);
	}
}
