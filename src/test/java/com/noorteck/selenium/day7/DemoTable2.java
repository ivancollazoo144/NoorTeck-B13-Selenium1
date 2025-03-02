package com.noorteck.selenium.day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class DemoTable2 extends Hooks {
	public static void main(String[] args) {
		
		setUp("safari");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//Step 1. Find out how many rows we have in the table
		//(Number of rows will include both the talbe header & table data)
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		
		
		//Step 2. Find out how many columns we have in the table		
		List<WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']//th"));

		
		
		//Step 3. FInd out the size of the row & column and store in varaible
		
		int rowSize = rowList.size();
		int columnSize = columnList.size();
		
		
		System.out.println("Number of Rows:    " + rowSize);
		System.out.println("Number of Columns: " + columnSize);
		
		
		System.out.println("**********************");
		
		//LOOP 1: Outter Loop --> will be for the ROW_DATA( Which row # does the data starts 
		for(int row = 2; row <= rowSize; row++) {
			
					
			//LOOP 2: Inner Loop --> will be for the COLUMN_NAME
			for(int column = 1; column <= columnSize; column++) {
				// logic or work happens heree.....
				

				
				//1. Locate the Column Element			
				WebElement columnNameElement = driver.findElement(By.xpath("//table[@name='BookTable']//th["+column+"]"));			
				// 2. Retrieve the Column Name
				String columnName = columnNameElement.getText();
				
			
				//3. Locate the ColumnValue Element			
				WebElement columnValueElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+column+"]"));
				// 4. Retrieve the Column Value
				String columnValue = columnValueElement.getText();
				
				
				System.out.println(columnName + " : "  + columnValue);
			}
			
			System.out.println("**********************");
		}
		
 
		tearDown();
	}



}
