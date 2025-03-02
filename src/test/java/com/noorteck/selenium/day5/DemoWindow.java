package com.noorteck.selenium.day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoWindow extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		setUp("safari");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement searchField = driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input"));
		WebElement searchButton = driver.findElement(By.cssSelector(".wikipedia-search-button"));
		
		//STEP 1. Nike, Inc.
		searchField.sendKeys("Nike, Inc.");
		searchButton.click();
		Thread.sleep(3000);
		
		WebElement nikeLink = driver.findElement(By.linkText("Nike, Inc."));
	
		nikeLink.click();
		
		//STEP 2. Puma (brand)
		
		searchField.clear();
		searchField.sendKeys("Puma (brand)");
		searchButton.click();
		Thread.sleep(3000);
		
		WebElement pumaLink = driver.findElement(By.linkText("Puma (brand)"));
		pumaLink.click();
		
		//Step 3: Adidas
		searchField.clear();
		searchField.sendKeys("Adidas");
		searchButton.click();
		Thread.sleep(3000);
		
		WebElement adidasLink = driver.findElement(By.linkText("Adidas"));
		adidasLink.click();
		
		//This will get the current active window ID and we will make this as parent window
		String parentWindow = driver.getWindowHandle();
		
		System.out.println("Parent Window ID: " + parentWindow);
		
		/**
		 * Once we capture the parent windowID and we are done opening new window/tab
		 * 
		 *	Now we need to retrieve all the WINDOW IDS --> getWindowHandles()
		 *
		 *	getWindowHandles() will return all the ids ( parent + child)
		 */
		
        Set<String> allWindows = driver.getWindowHandles();
		
		System.out.println("All Window IDS: " + allWindows);



		
		
		
		
		tearDown();
	}

}
/**
Nike, Inc.

Puma (brand)


Adidas


*/