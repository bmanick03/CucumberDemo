package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class Test {
	
	WebDriver driver;

@Given("User should launch the url")
public void userShouldLaunchTheUrl() {
   driver = new ChromeDriver();
   driver.manage().window().maximize();
}

@When("User load the url")
public void userLoadTheUrl() {
    driver.get("https://www.facebook.com");
    
}

@Then("Url should be loaded successfully")
public void urlShouldBeLoadedSuccessfully() {
    String s = driver.getCurrentUrl();
    System.out.println(s);
}
	
	
}
