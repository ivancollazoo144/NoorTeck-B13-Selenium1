package com.noorteck.selenium.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Hooks;



public class DemoAdvance extends Hooks {
	
	public static void main(String[] args) {
		
		setUp("safari");
		
		driver.get("https://demoqa.com/buttons");
		
		
	doubleClickAction();
	
		
		
		
		tearDown();
	}
	
	public static void ClickAction() {
		
		setUp("Safari");
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement btn = driver.findElement(By.id("KL4XJ"));
		
		Actions actionsObj = new Actions(driver);
		
		//this will perform double click
		actionsObj.doubleClick(btn).build().perform();
		
		
		WebElement message = driver.findElement(By.id("dynamicClickMessage"));
		String text = message.getText();
		
		System.out.println(text);
		
	
	
}
	
	public static void rightClickAction() {
	
		setUp("Safari");
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement btn = driver.findElement(By.id("rightClickBtn"));
		
		Actions actionsObj = new Actions(driver);
		
		//this will perform double click
		actionsObj.doubleClick(btn).build().perform();
		
		
		WebElement message = driver.findElement(By.id("rightClickMessage"));
		String text = message.getText();
		
		System.out.println(text);
		
	
	
}
	
	
	public static void doubleClickAction() {
		driver.get("https://demoqa.com/buttons");
		
		WebElement btn = driver.findElement(By.id("doubleClickBtn"));
		
		Actions actionsObj = new Actions(driver);
		
		//this will perform double click
		actionsObj.doubleClick(btn).build().perform();
		
		
		WebElement message = driver.findElement(By.id("doubleClickMessage"));
		String text = message.getText();
		
		System.out.println(text);
		
		
		
		
	}

}
