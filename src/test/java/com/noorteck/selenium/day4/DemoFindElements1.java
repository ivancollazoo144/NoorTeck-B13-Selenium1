package com.noorteck.selenium.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoFindElements1 extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp("safari");
		driver.get("https://www.letskodeit.com/practice");

		List<WebElement> carList = driver.findElements(By.xpath("//input[@name='cars"));

		for (WebElement car : carList) {
			car.click();

			Thread.sleep(2000);

		}
		tearDown();
	}
}
