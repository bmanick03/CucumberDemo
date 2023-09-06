package org.stepdefinition;

import java.io.IOException;
import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.SearchPojo;

import io.cucumber.java.en.*;

public class SearchStepDefinition extends BaseClass{
	
	@Given("User should launch the browser and load the nhs job url")
	public void userShouldLaunchTheBrowserAndLoadTheNhsJobUrl() {
	    //Code is given in HooksClass
	}
	
	@When("User should click the search button")
	public void userShouldClickTheSearchButton() {
		SearchPojo sp = new SearchPojo();
		toClick(sp.getBtnSearch());
	}

	@When("User should sort the search results with newest date posted")
	public void userShouldSortTheSearchResultsWithNewestDatePosted() {
		SearchPojo sp = new SearchPojo();
		selectUsingtext(sp.getSortByValue(), "Date Posted (newest)" );
	}

	@Then("Job results should display with newest date posted")
	public void jobResultsShouldDisplayWithNewestDatePosted() throws IOException {
		Assert.assertTrue("Check Date Descending", fetchUrl().contains("Date"));
	    System.out.println("Test Case Passed");
	}
	
	@When("User should get a list of jobs that matches preferences")
	public void userShouldGetAListOfJobsThatMatchesPreferences() {
		Assert.assertTrue("Check Results", fetchUrl().contains("results?"));
	    System.out.println("Test Case Passed");
	}
	
	@When("User should enter the job title in the Job title text box")
	public void userShouldEnterTheJobTitleInTheJobTitleTextBox() throws IOException {
		 SearchPojo sp = new SearchPojo();
		 fillValue(sp.getJobTitle(), readData("Preferences", 3, 0));
	}


	@When("User should enter the location in the job location text box")
	public void userShouldEnterTheLocationInTheJobLocationTextBox() throws IOException {
	SearchPojo sp = new SearchPojo();
    fillValue(sp.getJobLocation(), readData("Preferences", 4, 2));
	}

	@When("User should enter the job preferences with location and distance into search functionality")
	public void userShouldEnterTheJobPreferencesWithLocationAndDistanceIntoSearchFunctionality() throws IOException {
	SearchPojo sp = new SearchPojo();
	fillValue(sp.getJobLocation(), readData("Preferences", 2, 2));
	selectUsingIndex(sp.getLocDistance(), readData("Preferences", 2, 3));
	}

	@When("User should enter the job title and location into search functionality")
	public void userShouldEnterTheJobTitleAndLocationIntoSearchFunctionality() throws IOException {
	SearchPojo sp = new SearchPojo();
	fillValue(sp.getJobTitle(), readData("Preferences", 2, 1));
    fillValue(sp.getJobLocation(), readData("Preferences", 2, 2));
	}


	
}
