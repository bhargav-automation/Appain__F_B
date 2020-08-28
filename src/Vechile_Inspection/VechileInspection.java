package Vechile_Inspection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Customer_Application.XpathExpressions;
import Customer_Application.keyword;

public class VechileInspection {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		File file = new File("Config/Customer.properties");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		keyword key = new keyword();
		key.url(prop.getProperty("VechieInspectionURL"));
		FileInputStream fis1 = new FileInputStream(prop.getProperty("CustomerFilepath1"));

		XSSFWorkbook wb = new XSSFWorkbook(fis1);

		XSSFSheet sh = wb.getSheet(prop.getProperty("Sheet1"));
		int rownum = sh.getLastRowNum();
		System.out.println(rownum);
		String filePath = System.getProperty("user.dir");
		String ActualResult ="233.57 KB";

		XpathExpressions XP = new XpathExpressions();
		for (int i = 1; i <= rownum; i++)
		{
			/* General Information */
			key.dropdown(XP.storeNumber, sh.getRow(i).getCell(0).toString());
			key.Sendkeys(XP.InspectSubmitBy, sh.getRow(i).getCell(1).toString());
			key.Sendkeys(XP.customerID, NumberToTextConverter.toText(sh.getRow(i).getCell(2).getNumericCellValue()));
			key.Sendkeys(XP.AppID, NumberToTextConverter.toText(sh.getRow(i).getCell(3).getNumericCellValue()));
			key.Sendkeys(XP.firstname, sh.getRow(i).getCell(4).toString());
			key.Sendkeys(XP.lastname, sh.getRow(i).getCell(5).toString());
			key.Clickaction(XP.CommonButton);

			/* Vechile Inspection */
			Thread.sleep(1000);
			key.dropdown(XP.Year, NumberToTextConverter.toText(sh.getRow(i).getCell(6).getNumericCellValue()));
			key.Sendkeys(XP.Make, sh.getRow(i).getCell(7).toString());
			key.Sendkeys(XP.Model, sh.getRow(i).getCell(8).toString());
			key.Sendkeys(XP.color, sh.getRow(i).getCell(9).toString());
			key.Sendkeys(XP.Mileage1, NumberToTextConverter.toText(sh.getRow(i).getCell(10).getNumericCellValue()));
			key.Sendkeys(XP.VIN1, sh.getRow(i).getCell(11).toString());
			key.Clickaction(XP.CheckboxBtn1);
			key.Clickaction(XP.CheckboxBtn2);
			key.Clickaction(XP.CheckboxBtn3);
			key.Clickaction(XP.CommonButton);

			/* Vehicle Condition */
			Thread.sleep(1000);
			key.Clickaction(XP.OverallInterior);
			key.Clickaction(XP.DoorPanels);
			key.Clickaction(XP.DashControls);
			key.Clickaction(XP.Seats);
			key.Clickaction(XP.CarpetFloorBoard);
			key.Clickaction(XP.ExteriorCondition);
			key.Clickaction(XP.Paint);
			key.Clickaction(XP.HoodTruck);
			key.Clickaction(XP.QuaterPanels);
			key.Clickaction(XP.Headlights);
			key.Clickaction(XP.WindowGlass);
			key.Clickaction(XP.Tires);
			key.Clickaction(XP.MechanicalCondition);
			key.Clickaction(XP.Enginelights);
			key.Clickaction(XP.BrakeLight);
			key.Clickaction(XP.OilPressure);
			key.Clickaction(XP.Ignition);
			key.Clickaction(XP.GearShifting);
			key.Clickaction(XP.EngineNoises);
			key.Clickaction(XP.FluidLeaks);
			key.Clickaction(XP.CommonButton);
            
			/* Picture Upload */
			key.Sendkeys(XP.GPSID, sh.getRow(i).getCell(12).toString());
			key.Sendkeys1(XP.DriversideUpload, filePath + sh.getRow(i).getCell(13).toString());
			key.Sendkeys1(XP.PassengersideUpload, filePath + sh.getRow(i).getCell(14).toString());
			key.Sendkeys1(XP.FrontsideUpload, filePath + sh.getRow(i).getCell(15).toString());
			key.Sendkeys1(XP.RearsideUpload, filePath + sh.getRow(i).getCell(16).toString());
			key.Sendkeys1(XP.VINUpload, filePath + sh.getRow(i).getCell(17).toString());
			key.Sendkeys1(XP.EnginebayUpload, filePath + sh.getRow(i).getCell(18).toString());
			key.Sendkeys1(XP.InteriorUpload, filePath + sh.getRow(i).getCell(19).toString());
			key.Sendkeys1(XP.OdometerUpload, filePath + sh.getRow(i).getCell(20).toString());
			key.Sendkeys1(XP.GPSIDNumberUpload, filePath + sh.getRow(i).getCell(21).toString());
			key.Sendkeys(XP.GPSInstallation, sh.getRow(i).getCell(22).toString());
			
			for(;;)
			{
				try
				{
					if((key.GetTex(XP.checkingToSubmit)).equalsIgnoreCase(ActualResult))
					{
					    System.out.println(key.GetTex(XP.checkingToSubmit));
//						key.Clickaction(XP.Submit);
					    break;
					}
				}
				catch(Exception e)
				{
					
				}
			}

			

		}
	}

}
