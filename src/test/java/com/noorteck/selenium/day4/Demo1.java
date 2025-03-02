package com.noorteck.selenium.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Demo1 extends Hooks {

	public static void main(String[] args) throws InterruptedException {
		
		setUp("safari");
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement bmwBtn = driver.findElement(By.xpath("///input[@id=\"bmwradio\"]"));
		
		bmwBtn.click();
		
		Thread.sleep(2000);
		
		WebElement benzBtn = driver.findElement(By.xpath("//input[@id=\"benzradio\"]"));
		
		benzBtn.click();
		
		Thread.sleep(2000);
		
		WebElement hondaBtn = driver.findElement(By.xpath("//input[@id=\"hondaradio\"]"));
		
		hondaBtn.click();
		
		Thread.sleep(2000);
		
		
		tearDown();
	}
	
	
}
