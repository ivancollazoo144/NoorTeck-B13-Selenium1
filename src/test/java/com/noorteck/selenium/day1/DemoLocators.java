package com.noorteck.selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoLocators extends Hooks{

	
	public static void main(String[] args) {
		
		setUp("safari");
		//navigate to the page
		driver.get("https://www.letskodeit.com/practice");
		
		
		//locate the element using ID locator then store in webELement object
		 WebElement textField = driver.findElement(By.id("autosuggest"));
		
		//enter a value to the text field
		 
		 textField.sendKeys("John Cena");
		
		
		tearDown();
		
	}
}