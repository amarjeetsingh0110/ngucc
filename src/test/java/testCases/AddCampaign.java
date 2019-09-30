package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ngucc.Pages.Campaign;
import com.ngucc.utilities.ExcelReader;

public class AddCampaign {
	
	@Test(dataProvider="getData")
	public void verifyAddCampaign(String campaignName,	String cRM,	String country,	String recordingFileExtension,	String externalCrm,	String campaignDesc, String trunkGroup, String voiceFileFormat, String queue,  String auxModeDuration, String previewCallDelay
)
	{
		new Campaign().addCampaign(campaignName, cRM, country, recordingFileExtension, externalCrm,	campaignDesc,trunkGroup,voiceFileFormat,queue,auxModeDuration,previewCallDelay);
		//new Campaign().addSkills(campaignName, cRM, country, recordingFileExtension, externalCrm,	campaignDesc,trunkGroup,voiceFileFormat,selectQueue,auxModeDuration,previewCallDelay);
		
	}

	@DataProvider
	public Object[][] getData()
	{
		
		ExcelReader reader= new ExcelReader("./src/main/resources/excelData/ngucc.xlsx");
		String sheetName= "addCampaign";
		int rows=reader.getRowCount(sheetName);
		int cols=reader.getColumnCount(sheetName);
		
		Object[][] data=new Object[rows-1][cols];
		
		//data[0][0]=reader.getCellData(sheetName, 0, 2);
		for(int row=2;row<=rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
				data[row-2][col]=reader.getCellData(sheetName, col, row);
				//System.out.println(data[row-2][col]);
			}
		}
		
		
		return data;
		
	}
	
	
}


