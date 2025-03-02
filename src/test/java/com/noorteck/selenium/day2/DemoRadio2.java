package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoRadio2 extends Hooks{
	
	
	public static void main(String[] args) throws InterruptedException {

	
	setUp("safari");
	driver.get("https://www.letskodeit.com/practice");
	
	//radio
	WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
	WebElement benzRadio = driver.findElement(By.id("benzradio"));
	WebElement hondaRadio = driver.findElement(By.id("hondaradio"));
	
	//3 boolean variable
	
	boolean isBmwS;
	boolean isBenzS;
	boolean isHondaS;
	
	isBmwS = bmwRadio.isSelected();
	isBenzS = benzRadio.isSelected();
	isHondaS = hondaRadio.isSelected();
	
	System.out.println("BMW:   " + isBmwS);
	System.out.println("Benz:   " + isBenzS);
	System.out.println("Honda:   " + isHondaS);
	
	System.out.println("********************** CLICK on Benz******************");
	
	//click
	benzRadio.click();
	hondaRadio.click();
	bmwRadio.click();
	benzRadio.click();
	
	isBmwS = bmwRadio.isSelected();
	isBenzS = benzRadio.isSelected();
	isHondaS = hondaRadio.isSelected();
	
	System.out.println("BMW:   " + isBmwS);
	System.out.println("Benz:   " + isBenzS);
	System.out.println("Honda:   " + isHondaS);
	
	
	
	tearDown();
	

}
}