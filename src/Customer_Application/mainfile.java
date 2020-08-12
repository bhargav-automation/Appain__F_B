package Customer_Application;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class mainfile {

	static WebDriver driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		File file = new File("Config/Customer.properties");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		keyword key = new keyword();

		System.out.println("Do you want\r\n" + "1. Comaker\r\n" + "2. Cosigner");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		key.url(prop.getProperty("CustomerURL"));

		FileInputStream fis1 = new FileInputStream(prop.getProperty("CustomerFilepath"));

		XSSFWorkbook wb = new XSSFWorkbook(fis1);

		XSSFSheet sh = wb.getSheet(prop.getProperty("Sheet"));
		int rownum = sh.getLastRowNum();
		System.out.println("Row Count " + rownum);

		XpathExpressions XP = new XpathExpressions();

		for (int i = 1; i < 2; i++) {

			key.dropdown(XP.storeNumber, sh.getRow(i).getCell(0).toString());
			key.dropdown(XP.applicationType, sh.getRow(i).getCell(1).toString());
			key.Sendkeys(XP.customerID, NumberToTextConverter.toText(sh.getRow(i).getCell(2).getNumericCellValue()));
			key.Sendkeys(XP.AppID, NumberToTextConverter.toText(sh.getRow(i).getCell(3).getNumericCellValue()));
			key.Sendkeys(XP.firstname, sh.getRow(i).getCell(4).toString());
			key.Sendkeys(XP.lastname, sh.getRow(i).getCell(5).toString());

			key.Sendkeys(XP.DOB, sh.getRow(i).getCell(6).toString());
			key.Sendkeys(XP.SSN, sh.getRow(i).getCell(7).toString());
			key.Sendkeys(XP.phone, sh.getRow(i).getCell(8).toString());
			key.Sendkeys(XP.email, sh.getRow(i).getCell(9).toString());
			key.Sendkeys(XP.DLN, sh.getRow(i).getCell(10).toString());
			key.dropdown(XP.StateIssued, sh.getRow(i).getCell(11).toString());
			key.Sendkeys(XP.ExpirationDate, sh.getRow(i).getCell(12).toString());
			key.Sendkeys(XP.AddressLine1, sh.getRow(i).getCell(13).toString());
			key.Sendkeys(XP.AddressLine2, sh.getRow(i).getCell(14).toString());
			key.Sendkeys(XP.City, sh.getRow(i).getCell(15).toString());
			key.Sendkeys(XP.State, sh.getRow(i).getCell(16).toString());
			key.Sendkeys(XP.Zipcode, NumberToTextConverter.toText(sh.getRow(i).getCell(17).getNumericCellValue()));
			key.Sendkeys(XP.Rent_Own, sh.getRow(i).getCell(18).toString());
			key.Clickaction(XP.Zipcode);
			key.Sendkeys(XP.TypeAmount, sh.getRow(i).getCell(19).toString());
			key.Sendkeys(XP.YearAtCurrentAddress,
					NumberToTextConverter.toText(sh.getRow(i).getCell(20).getNumericCellValue()));
			if (num == 1) {
				key.Clickaction(XP.Comaker);
				Thread.sleep(1500);

			}
			key.Clickaction(XP.CommonButton);

			/* Empolye info */
			key.dropdown(XP.IncomeSource, sh.getRow(i).getCell(21).toString());
			key.Sendkeys(XP.BussinessAddress1, sh.getRow(i).getCell(22).toString());
			key.Sendkeys(XP.BussinessAddress2, sh.getRow(i).getCell(23).toString());
			key.Sendkeys(XP.BussinessCity, sh.getRow(i).getCell(24).toString());
			key.dropdown(XP.BUssinessState, sh.getRow(i).getCell(25).toString());
			key.Sendkeys(XP.BussinessZipCode,
					NumberToTextConverter.toText(sh.getRow(i).getCell(26).getNumericCellValue()));
			key.dropdown(XP.yearinBussiness, sh.getRow(i).getCell(27).toString());
			key.dropdown(XP.PayFrequency, sh.getRow(i).getCell(28).toString());
			key.dropdown(XP.DirectDeposit, sh.getRow(i).getCell(29).toString());
			key.Sendkeys(XP.AvgGrossAmt, NumberToTextConverter.toText(sh.getRow(i).getCell(30).getNumericCellValue()));
			key.Sendkeys(XP.AvgNetAmt, NumberToTextConverter.toText(sh.getRow(i).getCell(31).getNumericCellValue()));
			key.Clickaction(XP.CommonButton);

			/* Vechile information */
			Thread.sleep(500);
			key.dropdown(XP.Year, NumberToTextConverter.toText(sh.getRow(i).getCell(32).getNumericCellValue()));
			key.Sendkeys(XP.Make, sh.getRow(i).getCell(33).toString());
			key.Sendkeys(XP.Model, sh.getRow(i).getCell(34).toString());
			key.Sendkeys(XP.Mileage, NumberToTextConverter.toText(sh.getRow(i).getCell(35).getNumericCellValue()));
			key.Sendkeys(XP.VIN, sh.getRow(i).getCell(36).toString());
			key.dropdown(XP.CollateralType, sh.getRow(i).getCell(37).toString());
			key.Sendkeys(XP.TitleNumber, sh.getRow(i).getCell(38).toString());
			key.Sendkeys(XP.LicensePlateNumber, sh.getRow(i).getCell(39).toString());
			key.Sendkeys(XP.LicenseExpDate, sh.getRow(i).getCell(40).toString());

			key.Clickaction(XP.Radiobtn1);
			key.Clickaction(XP.RadioBtn2);
			key.Clickaction(XP.RadioBtn3);

			key.Sendkeys(XP.InsuranceCompanyName, sh.getRow(i).getCell(41).toString());
			key.Sendkeys(XP.PolicyNumber, sh.getRow(i).getCell(42).toString());
			key.Clickaction(XP.CommonButton);

			/* Loan Information */

			key.Sendkeys(XP.LoanAmtReq, NumberToTextConverter.toText(sh.getRow(i).getCell(43).getNumericCellValue()));
			key.Sendkeys(XP.TargetMonthlyPayment,
					NumberToTextConverter.toText(sh.getRow(i).getCell(44).getNumericCellValue()));
			key.Sendkeys(XP.PreferredTerms,
					NumberToTextConverter.toText(sh.getRow(i).getCell(45).getNumericCellValue()));
			key.dropdown(XP.BankAcc, sh.getRow(i).getCell(46).toString());
			key.dropdown(XP.LoanFunds, sh.getRow(i).getCell(47).toString());
			key.Clickaction(XP.CommonButton);

			/* Additional Information */
			Thread.sleep(500);
			key.dropdown(XP.HowDoYouKnow, sh.getRow(i).getCell(48).toString());
			key.Clickaction(XP.CommonButton);

			/* Terms and signature */
			Thread.sleep(500);
			key.Clickaction(XP.Checkbox);
			key.canvasESign(XP.Signature);
//			key.Clickaction(XP.Submit);

		}
	}

}
