Feature: Validate the search functionality of NHS Jobs website
Background:
Given User should launch the browser and load the nhs job url

@passed1
Scenario: Validate the search functionality with preference job title
When User should enter the job title in the Job title text box
And User should click the search button
And User should get a list of jobs that matches preferences
And User should sort the search results with newest date posted
Then Job results should display with newest date posted

@passed
Scenario: Validate the search functionality with preference job location
When User should enter the location in the job location text box
And User should click the search button
And User should get a list of jobs that matches preferences
And User should sort the search results with newest date posted
Then Job results should display with newest date posted

@passed
Scenario: Validate the search functionality with preferences job location and distance
When User should enter the job preferences with location and distance into search functionality
And User should click the search button
And User should get a list of jobs that matches preferences
And User should sort the search results with newest date posted
Then Job results should display with newest date posted

@passed
Scenario: Validate the search functionality with preferences job title and location
When User should enter the job title and location into search functionality
And User should click the search button
And User should get a list of jobs that matches preferences
And User should sort the search results with newest date posted
Then Job results should display with newest date posted
