package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoRadio4 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {

		setUp("safari");
		driver.get("https://www.letskodeit.com/practice");

		WebElement enableBtn = driver.findElement(By.id("enabled-button"));
		WebElement disableBtn = driver.findElement(By.id("disabled-button"));
		WebElement EnableDisableTextField = driver.findElement(By.id("enabled-example-input"));
		
		boolean isEnable = EnableDisableTextField.isEnabled();
		
		EnableDisableTextField.sendKeys("John");
		
		
		System.out.println("Is it Enable?: " + isEnable);
		
		System.out.println("********** click disable*********");
		
		disableBtn.click();
		
		isEnable = EnableDisableTextField.isEnabled();
		
		System.out.println("Is it Enable?: " + isEnable);
		
		tearDown();

}
}