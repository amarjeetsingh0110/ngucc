package com.ngucc.utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.ngucc.framework.ManagerBaseClass;


public class CommonUtilities extends ManagerBaseClass{
	//public static ExcelReader reader= new ExcelReader("./src/test/resources/excelData/amarjeetSingh.xlsx");
	
		public static By pathFinder(String path)
		{
			if(path.contains("XPATH~"))
			{
				path=path.split("~")[1];
				return By.xpath(path);
			}
			else if(path.contains("CSS~"))
			{
				path=path.split("~")[1];
				return By.cssSelector(path);
			}
			
			return null;
			
		}
		
		
		
		/*	public Object[][] getData(String sheetName)
			{
				if(sheetName.equalsIgnoreCase("addCustomerdetails"))
				{
					sheetName=config.getProperty("addCustomerdetails");
				}
				else if(sheetName.equalsIgnoreCase("deleteCustomer"))
				{
					sheetName=config.getProperty("deleteCustomerSheet");
				}
				
				//System.out.println(sheetName);
				
				int rowCount=reader.getRowCount(sheetName);
				int colCount=reader.getColumnCount(sheetName);
				//System.out.println(rowCount +" " +colCount);
				Object[][] data= new Object[rowCount-1][colCount];
				
				//System.out.println(reader.getCellData(sheetName, 0, 4));
				
				
				for(int i=2; i<=rowCount;i++)
				{
					for(int j=0;j<colCount;j++)
					{
						data[i-2][j]=reader.getCellData(sheetName, j, i);
					}
				}
				
				return data;

			}*/
		
		
		
		public static void click(String locater)
		{
			driver.findElement(pathFinder(locater)).click();
		}
		
		
		public static void type(String locater, String value)
		{
			if(locater.contains("voicefileformat"))
			{
				driver.findElement(pathFinder(locater)).clear();
				
			}
			
			else
			{
				driver.findElement(pathFinder(locater)).clear();
				driver.findElement(pathFinder(locater)).sendKeys(value);;
				
			}
		}
		
		public void mouseHover(String target)
		{
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(pathFinder(config.getProperty(target)))).perform();
			action.moveToElement(driver.findElement(pathFinder(config.getProperty(target)))).perform();
			
		}
		

		public boolean isElementPresent(String locater)
		{
			try {
				//Thread.sleep(4000);
			driver.findElement(pathFinder(config.getProperty("addCustomer")));
			return true;
			}
			catch(Throwable t)
			{
				System.out.println(t.getMessage());
				return false;
			}
			
		}
		

		public void nextWindow()
		{
			Set<String> winHandler= driver.getWindowHandles();
			Iterator<String> it= winHandler.iterator();
			
			for(String child: winHandler)
			{
				driver.switchTo().window(it.next());
			}
			
			
		}
		
		public static void selectElement(String path, String value)
		{
			Select select = new Select(driver.findElement(pathFinder(path)));
			select.selectByVisibleText(value);
		}
		
		
		public static void listSelect(String path, String value)
		{
			Select oSelect= new Select(driver.findElement(pathFinder(path)));
			oSelect.selectByVisibleText(value);
			
		}
		
	
		
	

}
