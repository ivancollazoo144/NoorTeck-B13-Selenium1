package com.noorteck.selenium.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoWait1 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		setUp("safari");
		driver.get("https://www.letskodeit.com/practice");
		// radio
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
		WebElement benzRadio = driver.findElement(By.id("benzradio"));
		WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
		bmwRadio.click();
		benzRadio.click();
		hondaRadio.click();
		// checkbox
		WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
		WebElement benzCheck = driver.findElement(By.id("benzcheck"));
		WebElement hondaCheck = driver.findElement(By.id("hondacheck"));
		bmwCheck.click();
		benzCheck.click(); // 1st click CHECK
		hondaCheck.click();
		benzCheck.click(); // 2nd click UNCHECK
		tearDown();
	}


}
