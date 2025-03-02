package com.noorteck.selenium.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DropdownDemo2 extends Hooks{
	
	public static void main(String[] args) {
		
		setUp("safari");
		
		driver.get("https://www.ebay.com/");
		
		WebElement ebayDrop = driver.findElement(By.cssSelector("#gh-cat"));
		
		ebayDrop.click();
		
		Select dropObj = new Select (ebayDrop);
		
		dropObj.selectByVisibleText("Travel");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		tearDown();
		
		
	}

}
