package org.utilities;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends nhsInputExcel {

	public static WebDriver driver;
	public static Actions act;
	public static Robot r;
	public static Select s;
	

	public static void openEdge() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
	}
	
	public static void moveToElement(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element);

	}
	public static void closeBrowser() {
		
		driver.quit();
	}
	
	public static void closeCurrentTab() {
		driver.close();

	}
	
	public static void toReload() {
		driver.navigate().refresh();

	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	
	public static String fetchUrl() {
		String s = driver.getCurrentUrl();
		return s;

	}
	
	public static void printTitle() {
		driver.getTitle();

	}
	public static void toClick(WebElement input) {
		input.click();

	}
	
	public static void launchUrl(String url) {
		driver.get(url);

	}
	
	public static void selectUsingtext(WebElement element, String value) {
		s = new Select(element);
		s.selectByVisibleText(value);

	}
	
	
	public static void printAllOptions(WebElement options) {
		s = new Select(options);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement eachOption: allOptions) {
			System.out.println(eachOption.getText());
		}

	}
		
	public static void fillValue(WebElement element, String value) {
		element.sendKeys(value);

	}
	
	public static void takesnap(String picName) throws IOException {
		TakesScreenshot snap = (TakesScreenshot) driver;
		File src = snap.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\BERLIN BABILA\\eclipse-workspace\\NhsAssessment\\target\\Screenshots\\" + picName + ".png");
		FileUtils.copyFile(src, dest);
}
	
	public static void FillUsingJs(WebElement text, String input) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','" + input + "')", text );

	}
	
	public static void selectUsingValue(WebElement value1, String value2) {
		s = new Select(value1);
		s.selectByValue(value2);
	}
	
	public static void selectUsingIndex(WebElement value1, String value2) {
		s = new Select(value1);
		Integer intValue = Integer.parseInt(value2);
		s.selectByIndex(intValue);
	}
	
	public static void fullScreenshot() throws IOException {
		TakesScreenshot snap = (TakesScreenshot) driver;
		File src = snap.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\BERLIN BABILA\\eclipse-workspace\\NhsAssessment\\target\\Screenshots\\fullscreen.png");
		FileUtils.copyFile(src, dest);
		WebElement ele = driver.findElement(By.id("maincontent"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int yPosition = ele.getLocation().getY();
		js.executeScript("window.scroll (0, " + yPosition + ") ");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\BERLIN BABILA\\eclipse-workspace\\NhsAssessment\\target\\Screenshots\\fullscreen1.png"));
	}
	
}
