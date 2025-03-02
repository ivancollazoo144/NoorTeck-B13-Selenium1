package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DemoDropDown extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		setUp("safari");
		driver.get("https://www.letskodeit.com/practice");
		
		
		WebElement carDrop = driver.findElement(By.id("carselect"));
		
		//create an objevt of select class
		Select selectObj = new Select(carDrop);
		
		selectObj.selectByIndex(0);
		Thread.sleep(2000);
		
		selectObj.selectByIndex(1);
		Thread.sleep(2000);
		
		selectObj.selectByIndex(2);
		Thread.sleep(2000);
		
		
		selectObj.selectByValue("bmw");
		Thread.sleep(2000);
		
		selectObj.selectByValue("benz");
		Thread.sleep(2000);
		
		selectObj.selectByValue("honda");
		Thread.sleep(2000);
		
		
		
		selectObj.selectByVisibleText("BMW");
		Thread.sleep(2000);
		
		selectObj.selectByVisibleText("Benz");
		Thread.sleep(2000);
		
		selectObj.selectByVisibleText("Honda");
		Thread.sleep(2000);

		
		
				
		
		
		
		
		
		
		
		
		
		
		
		tearDown();
		
		
	}

}
