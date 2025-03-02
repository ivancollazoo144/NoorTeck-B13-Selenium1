package com.noorteck.selenium.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoFindElements2 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp("safari");

		driver.get("https://www.letskodeit.com/practice");
		
		//Enetr your name
		
				WebElement nameField = driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']"));
				nameField.sendKeys("John");
				
				//click ALert Button
				WebElement alertBtn = driver.findElement(By.id("alertbtn"));
				alertBtn.click();

				// click ok button
				Alert alert =	driver.switchTo().alert();
			
				//click ok
				alert.accept();
				
				
				//select BMW from radio group
				WebElement bmw = driver.findElement(By.id("bmwradio"));
				bmw.click();
				
				
				System.out.println("******************");
				
				//click confimr button
				WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));
				confirmBtn.click();

				
				Alert confirmAlert = driver.switchTo().alert();
				
				//from alert retreive the text and pritn
				
				String text = confirmAlert.getText();
				
				System.out.println(text);
				
				//click cancel
				confirmAlert.dismiss();
				
				//click bmwCHECKBOX 
				WebElement bmwCheck = driver.findElement(By.id("bmwcheck"));
				bmwCheck.click();
				

				
				
				tearDown();
			}

		}