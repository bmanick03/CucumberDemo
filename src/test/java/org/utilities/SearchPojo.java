package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends BaseClass {

	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id="searchOptionsBtn")
	private WebElement moreOptions;
	
	@FindBy(xpath="//a[contains(text(),'Fewer')]")
	private WebElement fewerOptions;
	
	@FindBy(id="keyword")
	private WebElement jobTitle;
	
	@FindBy(id="location")
	private WebElement jobLocation;
	
	@FindBy(id="employer")
	private WebElement employer;
	
	@FindBy(name="jobReference")
	private WebElement jobRef;
	
	@FindBy(id="search")
	private WebElement btnSearch;
	
	@FindBy(id="sort")
	private WebElement sortByValue;

	
	@FindBy(name="distance")
	private WebElement locDistance;
	
	@FindBy(id="clearFilters")
	private WebElement clearFilters;

	@FindAll({
		@FindBy(id="payRange"),
		@FindBy(name="payRange")
		})
		private WebElement payScale;
	
	public WebElement getFewerOptions() {
		return fewerOptions;
	}

	public WebElement getJobRef() {
		return jobRef;
	}

	public WebElement getClearFilters() {
		return clearFilters;
	}

	
	public WebElement getLocDistance() {
		return locDistance;
	}

	public WebElement getPayScale() {
		return payScale;
	}

	public WebElement getJobLocation() {
		return jobLocation;
	}

	public WebElement getSortByValue() {
		return sortByValue;
	}

	public WebElement getEmployer() {
		return employer;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getJobTitle() {
		return jobTitle;
	}

	public WebElement getMoreOptions() {
		return moreOptions;
	}
	
	
}
