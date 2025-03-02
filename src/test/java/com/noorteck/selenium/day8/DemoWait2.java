package com.noorteck.selenium.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Hooks;

public class DemoWait2 extends Hooks{

	public static void main(String[] args) {
		
		setUp("safari");
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		
		
		hideBtn.click();
		
		
		//webdriverwait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("displayed-text"))).sendKeys("Java");
		
		
		tearDown();
		
		
		
	}
	
	
	
}
