package com.noorteck.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//step 1. set up edge for webderiverManager
		WebDriverManager.safaridriver().setup();
		
		//step2. create object of WebDriver
		WebDriver driver = new SafariDriver();
		
		//navigate to URL
		driver.get("https://www.google.com/");
		
	
		Thread.sleep(2000);
		driver.get("https://www.yahoo.com/");
		Thread.sleep(2000);
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(5000);
		driver.quit();
	
	}

}