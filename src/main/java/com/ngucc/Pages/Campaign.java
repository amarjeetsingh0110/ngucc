package com.ngucc.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ngucc.framework.ManagerBaseClass;
import com.ngucc.utilities.CommonUtilities;
import com.ngucc.utilities.ExcelReader;

public class Campaign extends ManagerBaseClass {
	
	
	public void addCampaign(String campaignName, String cRM, String country, String recordingFileExtension,	String externalCrm,	String campaignDesc, String trunkGroup, String voiceFileFormat, String queue,  String auxModeDuration, String previewCallDelay)
	{
		CommonUtilities.click(locator.getProperty("campaignTab"));
		CommonUtilities.click(locator.getProperty("campaignMenu"));
		CommonUtilities.click(locator.getProperty("addCampaignButton"));
		CommonUtilities.type(locator.getProperty("campaignName"), campaignName);
		CommonUtilities.selectElement(locator.getProperty("selectCRM"), cRM);
		CommonUtilities.selectElement(locator.getProperty("selectCountry"), country);
		CommonUtilities.selectElement(locator.getProperty("recFileExtn"), recordingFileExtension);
		CommonUtilities.selectElement(locator.getProperty("extCRM"), externalCrm);
		CommonUtilities.type(locator.getProperty("campDesc"), campaignDesc);
		CommonUtilities.listSelect(locator.getProperty("trunkGrp"), trunkGroup);
		CommonUtilities.type(locator.getProperty("voiceFormat"), "");
		CommonUtilities.click(locator.getProperty("voiceFormatAdd"));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(CommonUtilities.pathFinder(locator.getProperty("voiceFormatSelect")))));
		CommonUtilities.selectElement(locator.getProperty("voiceFormatSelect"), voiceFileFormat);
		CommonUtilities.click(locator.getProperty("voiceFormatSubmitButton"));
		CommonUtilities.selectElement(locator.getProperty("queue"), queue);
		CommonUtilities.type(locator.getProperty("auxModeDuration"), auxModeDuration);
		CommonUtilities.click(locator.getProperty("saveButton"));
		
		try
		{
			Thread.sleep(5000);
			
		}
		
		catch(Exception e)
		{
			
		}
	
		
		
		
	
		
	}

	
	
	
	public void addSkills()
	{
		
	}
}
