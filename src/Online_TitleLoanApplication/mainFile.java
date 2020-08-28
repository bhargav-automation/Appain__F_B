package Online_TitleLoanApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class mainFile {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		File file=new File("Config/Customer.properties");
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		Reusable_Methods re=new Reusable_Methods();
		re.URL(prop.getProperty("OnlineLoanApplicationURL"));
		FileInputStream fis1 = new FileInputStream(prop.getProperty("LoanApplicationPath"));
		XSSFWorkbook wb = new XSSFWorkbook(fis1);
		XSSFSheet sh = wb.getSheet(prop.getProperty("Sheetname"));
		int rownum = sh.getLastRowNum();
		System.out.println(rownum);
		String filePath = System.getProperty("user.dir");
		String ActualResult ="411.76 KB";
		XpathExpressions1 XP = new XpathExpressions1();
		
		for (int i = 1; i <= rownum; i++)
		{
			//* Loan Application Form *//
			re.Sendkeys(XP.Firstname, sh.getRow(i).getCell(0).toString());
			re.Sendkeys(XP.Lastname, sh.getRow(i).getCell(1).toString());
			re.Sendkeys(XP.AddressLine1,  sh.getRow(i).getCell(2).toString());
			re.Sendkeys(XP.AddressLine2, sh.getRow(i).getCell(3).toString());
			re.Sendkeys(XP.city,  sh.getRow(i).getCell(4).toString());
			re.Sendkeys(XP.State, sh.getRow(i).getCell(5).toString());
			re.Sendkeys(XP.Zipcode,sh.getRow(i).getCell(6).toString());
			re.Sendkeys(XP.Rent_Own, sh.getRow(i).getCell(7).toString());
			re.Clickaction(XP.Zipcode);
			re.Sendkeys(XP.PropertyAmt, sh.getRow(i).getCell(8).toString());
			re.Sendkeys(XP.YearAtCurrentAdd,
					NumberToTextConverter.toText(sh.getRow(i).getCell(9).getNumericCellValue()));
			re.Sendkeys(XP.Phonenumber, sh.getRow(i).getCell(10).toString());
			re.Sendkeys(XP.Email, sh.getRow(i).getCell(11).toString());
			re.Sendkeys(XP.DOB, sh.getRow(i).getCell(12).toString());
			re.Sendkeys(XP.SSN, sh.getRow(i).getCell(13).toString());
			re.Sendkeys(XP.DL, sh.getRow(i).getCell(14).toString());
			re.Sendkeys(XP.StateIssued, sh.getRow(i).getCell(15).toString());
			re.Sendkeys(XP.DLExpirationDate, sh.getRow(i).getCell(16).toString());
			re.Clickaction(XP.spouseActive);
			re.dropdown(XP.Active_Retired, sh.getRow(i).getCell(17).toString());
			re.dropdown(XP.IncomeSource, sh.getRow(i).getCell(18).toString());
			re.Sendkeys(XP.EmpName, sh.getRow(i).getCell(19).toString());
			re.Sendkeys(XP.EmpAddLine1, sh.getRow(i).getCell(20).toString());
			re.Sendkeys(XP.EmpAddLine2, sh.getRow(i).getCell(21).toString());
			re.Sendkeys(XP.EmpCity, sh.getRow(i).getCell(22).toString());
			re.Sendkeys(XP.EmpState, sh.getRow(i).getCell(23).toString());
			re.Sendkeys(XP.EmpZipcode, sh.getRow(i).getCell(24).toString());
			re.Sendkeys(XP.EmpPhonenumber, sh.getRow(i).getCell(25).toString());
			re.Clickaction(XP.JobType);
			re.Sendkeys(XP.LengthOfEmp, sh.getRow(i).getCell(26).toString());
			re.Clickaction(XP.PayFrequency);
			re.Sendkeys(XP.GrossAmt,
					NumberToTextConverter.toText(sh.getRow(i).getCell(27).getNumericCellValue()));
			re.Clickaction(XP.NextBtn);
			
			//* Vehicle Information *//
			re.dropdown(XP.VehicleType, sh.getRow(i).getCell(28).toString());
			re.dropdown(XP.Vehicleyear, sh.getRow(i).getCell(29).toString());
			re.Sendkeys(XP.Make, sh.getRow(i).getCell(30).toString());
			re.Sendkeys(XP.Model, sh.getRow(i).getCell(31).toString());
			re.Sendkeys(XP.Mileage,
					NumberToTextConverter.toText(sh.getRow(i).getCell(32).getNumericCellValue()));
			re.Sendkeys(XP.VIN, sh.getRow(i).getCell(33).toString());	
			re.Clickaction(XP.checkbox1);
			re.Clickaction(XP.checkbox2);
			re.Clickaction(XP.checkbox3);
			re.Sendkeys(XP.Titlenumber, sh.getRow(i).getCell(34).toString());
			re.Sendkeys(XP.InsuranceCompanyName, sh.getRow(i).getCell(35).toString());
			re.Sendkeys(XP.LicencePlateNumber, sh.getRow(i).getCell(36).toString());
			re.Sendkeys(XP.LicenceExpirationDate, sh.getRow(i).getCell(37).toString());
			re.Sendkeys(XP.LoanAmt, sh.getRow(i).getCell(38).toString());
			re.Clickaction(XP.ExistingLoan_Yes);
			re.Sendkeys(XP.ExistingLoanComp, sh.getRow(i).getCell(39).toString());
			re.dropdown(XP.ActiveBankAcc, sh.getRow(i).getCell(40).toString());
			re.dropdown(XP.AccType, sh.getRow(i).getCell(41).toString());
			re.dropdown(XP.DebitCard_attached, sh.getRow(i).getCell(42).toString());
			re.Sendkeys(XP.Bank_Name, sh.getRow(i).getCell(43).toString());
			re.dropdown(XP.Loan_Fund, sh.getRow(i).getCell(44).toString());
			re.Clickaction(XP.NextBtn);
			
			//** Documents/Picture Upload **//
			re.Clickaction(XP.AgreeCheckbox);
			re.canvasESign(XP.Signature);
			re.Sendkeys1(XP.VehicleTitlefrontimg, filePath + sh.getRow(i).getCell(45).toString());
			re.Sendkeys1(XP.VehicleTitleBackimg, filePath + sh.getRow(i).getCell(46).toString());
			re.Sendkeys1(XP.IncomeDocumentationImg, filePath + sh.getRow(i).getCell(47).toString());
			re.Sendkeys1(XP.DLimg, filePath + sh.getRow(i).getCell(48).toString());
			re.Sendkeys1(XP.VehicleRegistrationimg, filePath + sh.getRow(i).getCell(49).toString());
			re.Sendkeys1(XP.InsuranceCard, filePath + sh.getRow(i).getCell(50).toString());
			re.Sendkeys1(XP.DriverSideimg, filePath +  sh.getRow(i).getCell(51).toString());
			re.Sendkeys1(XP.PassengerSide, filePath + sh.getRow(i).getCell(52).toString());
			re.Sendkeys1(XP.frontsideimg, filePath + sh.getRow(i).getCell(53).toString());
			re.Sendkeys1(XP.Rearsideimg, filePath +  sh.getRow(i).getCell(54).toString());
			re.Sendkeys1(XP.Odometer, filePath + sh.getRow(i).getCell(55).toString());
			for(;;)
			{
				try
				{
					if((re.GetTex(XP.CheckinSubmit)).equalsIgnoreCase(ActualResult))
					{
					    System.out.println(re.GetTex(XP.CheckinSubmit));
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
