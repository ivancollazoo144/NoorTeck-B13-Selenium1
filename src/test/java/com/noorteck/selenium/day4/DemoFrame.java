package com.noorteck.selenium.day4;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoFrame extends Hooks{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("safari");

		driver.get("https://www.letskodeit.com/practice");
		
		//click bmwCHECKBOX 
				WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
				bmwCheck.click();
				
				
				Thread.sleep(2000);
				
				
				WebElement iframe = driver.findElement(By.id("courses-iframe"));
				
				//switch to the frame
				
				//driver.switchTo().frame(iframe);

					//switch by index
				//driver.switchTo().frame(0);
				
				
				//switch by ID
				driver.switchTo().frame("courses-iframe");
				
				//enter Java inside search field
				WebElement searchField = driver.findElement(By.cssSelector("input#search"));
				searchField.sendKeys("java");
				Thread.sleep(2000);
			
				WebElement searchBtn= driver.findElement(By.xpath("//*[@class='find-course search-course']"));
				searchBtn.click();
				Thread.sleep(2000);

				driver.switchTo().defaultContent();
				
				//click bmwCHECKBOX 
				WebElement hondaCheck = driver.findElement(By.id("hondacheck"));
				hondaCheck.click();
				
						
				
				
				tearDown();
			}

		
		

		
		
		
}
		
		
	
