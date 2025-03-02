package com.noorteck.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoLocator1 extends Hooks {

	public static void main(String[] args) throws InterruptedException {

		setUp("safari");

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");

		Thread.sleep(3000);

		// usernameField
		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("ntk-admin");

		Thread.sleep(4000); // wait/pause 3 second

		// Password field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Password123@12");

		Thread.sleep(3000);

		// locate the login button using XPATH

		WebElement LoginButton = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		LoginButton.click();

		// navigate to yahho.com
		driver.get("https://us.yahoo.com/");

		// wait 2 seconds
		Thread.sleep(7000);

		// locate sports elements
		WebElement sportsLink = driver.findElement(By.linkText("Sign in"));

		// click on sports elements
		sportsLink.click();

		// navigate to yahho.com
		driver.get("https://us.yahoo.com/");

		// wait 7 seconds
		Thread.sleep(7000);
		
		// locate sports elements
		WebElement searchField = driver.findElement(By.cssSelector("#ybar-sbq"));
		
		searchField.click();
		
		searchField.sendKeys("Elon Musk");
		

		tearDown();

	}

}
