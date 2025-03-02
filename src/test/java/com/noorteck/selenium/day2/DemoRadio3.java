package com.noorteck.selenium.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoRadio3 extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp("safari");
		driver.get("https://www.letskodeit.com/practice");

		WebElement showBtn = driver.findElement(By.id("show-textbox"));
		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		WebElement showHiddenTextField = driver.findElement(By.id("displayed-text"));
		
		
		showHiddenTextField.sendKeys("John Cena");
		
		boolean isShowDisplay = showHiddenTextField.isDisplayed();
		
		
		System.out.println("Is TextField Displayed: " + isShowDisplay);
		
		
		Thread.sleep(2000);
		System.out.println("************ CLICK HIDE ************");
		hideBtn.click();
		
		//get the current status
		isShowDisplay = showHiddenTextField.isDisplayed();
		
		System.out.println("is TExtField Displayed: " + isShowDisplay);
		
		
		tearDown();
		
		
		
	}
}
