package com.noorteck.selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;





public class Demo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		String browserName = "safari";
		
		WebDriver driver = null;
		
		
		if(browserName.equals("safari")) {
			//set up safari webdriverManager
			
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
			
		}else if(browserName.equals("firefox")) {
			//set up fireFox webdriverManager
			WebDriverManager.firefoxdriver();
			
			driver = new FirefoxDriver();
			
		}
		
		//navigate to Url
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(30000);
		driver.quit();
		
	}
	
	

}



