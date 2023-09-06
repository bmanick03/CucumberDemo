$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Search.feature");
formatter.feature({
  "name": "Validate the search functionality of NHS Jobs website",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should launch the browser and load the nhs job url",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDefinition.userShouldLaunchTheBrowserAndLoadTheNhsJobUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the search functionality with preference job title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@passed1"
    }
  ]
});
formatter.step({
  "name": "User should enter the job title in the Job title text box",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDefinition.userShouldEnterTheJobTitleInTheJobTitleTextBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefinition.userShouldClickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get a list of jobs that matches preferences",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefinition.userShouldGetAListOfJobsThatMatchesPreferences()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should sort the search results with newest date posted",
  "keyword": "And "
});
formatter.match({
  "location": "SearchStepDefinition.userShouldSortTheSearchResultsWithNewestDatePosted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Job results should display with newest date posted",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefinition.jobResultsShouldDisplayWithNewestDatePosted()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});