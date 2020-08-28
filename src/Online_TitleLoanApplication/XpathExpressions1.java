package Online_TitleLoanApplication;

public class XpathExpressions1
{
	//* Loan Application Form *//
	public String Firstname="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[2]/div[2]//input";
	public String Lastname="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[3]/div[2]//input";
	public String AddressLine1="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/fieldset[1]/div[1]/div[1]//input";
	public String AddressLine2="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/fieldset[1]/div[1]/div[2]//input";
	public String city="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/fieldset[1]/div[1]/div[3]//input";
	public String State="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/fieldset[1]/div[1]/div[4]//select";
	public String Zipcode="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/fieldset[1]/div[1]/div[5]//input";
	public String Rent_Own="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[4]/div[2]//select";
	public String PropertyAmt="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/span[1]/div/div[2]//input";
	public String YearAtCurrentAdd="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[5]/div[2]//select";
	public String Phonenumber="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[6]/div[2]//input";
	public String Email="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[7]/div[2]//input";
	public String DOB="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[8]/div[2]/div[1]//input";
	public String SSN="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[9]/div[2]//input";
	public String DL="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[10]/div[2]//input";
	public String StateIssued="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[11]/div[2]//select";
	public String DLExpirationDate="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[12]/div[2]/div[1]//input";
	public String spouseActive="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/fieldset[2]/div[1]//label//span[contains(.,'Yes')]";
	public String Active_Retired="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/span[4]/div/div[2]//select";
	public String IncomeSource="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/div/div[2]//select";
	public String EmpName="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[2]/div/div[2]//input";
	public String EmpAddLine1="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[4]/fieldset/div[1]/div[1]//input";
	public String EmpAddLine2="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[4]/fieldset/div[1]/div[2]//input";
	public String EmpCity="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[4]/fieldset/div[1]/div[3]//input";
	public String EmpState="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[4]/fieldset/div[1]/div[4]//select";
	public String EmpZipcode="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[4]/fieldset/div[1]/div[5]//input";
	public String EmpPhonenumber="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[5]/div/div[2]//input";
	public String JobType="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[7]/fieldset/div[1]/div[1]";
	public String LengthOfEmp="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[8]/div/div[2]//select";
	public String PayFrequency="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[10]/fieldset/div[1]/div[2]";
	public String GrossAmt="//div[contains(@class,'c-page toggle-on')]/div[1]/div[2]/div[13]/div[2]/span[11]/div/div[2]//input";
	public String NextBtn="//button[contains(.,'Next')]";
	
	//* Vehicle Information *//
	public String VehicleType="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[1]/div[2]//select";
	public String Vehicleyear="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[2]/div[2]//select";
	public String Make="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[3]/div[2]//input";
	public String Model="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[4]/div[2]//input";
	public String Mileage="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[5]/div[2]//input";
	public String VIN="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[6]/div[2]//input";
	public String checkbox1="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[9]/div[1]//label";
	public String checkbox2="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[13]/div[1]//label";
	public String checkbox3="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[15]/div[1]//label";
	public String Titlenumber="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[17]/div[2]//input";
	public String InsuranceCompanyName="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[18]/div[2]//input";
	public String LicencePlateNumber="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[19]/div[2]//input";
	public String LicenceExpirationDate="//div[contains(@class,'c-page toggle-on')]//div[1]/div[2]/div[20]/div[2]/div//input";
	public String LoanAmt="//div[contains(@class,'c-page toggle-on')]//div[2]/div[2]/div[1]/div[2]//input";
	public String ExistingLoan_Yes="//div[contains(@class,'c-page toggle-on')]//div[2]/div[2]/fieldset/div[1]//label";
	public String ExistingLoanComp="//div[contains(@class,'c-page toggle-on')]//div[2]/div[2]/span[1]/div/div[2]//input";
	public String ActiveBankAcc="//div[contains(@class,'c-page toggle-on')]//div[2]/div[2]/div[2]/div[2]//select";
	public String AccType="//div[contains(@class,'c-page toggle-on')]//div[2]/div[2]/span[2]/div/div[2]//select";
	public String DebitCard_attached="//div[contains(@class,'c-page toggle-on')]//div[2]/div[2]/span[3]/div/div[2]//select";
	public String Bank_Name="//div[contains(@class,'c-page toggle-on')]//div[2]/div[2]/span[4]/div/div[2]//input";
	public String Loan_Fund="//div[contains(@class,'c-page toggle-on')]//div[2]/div[2]/div[3]/div[2]//select";
	
	//** Documents/Picture Upload **//
	public String AgreeCheckbox="//div[3]/div[1]/div/div[3]/div[2]/div[2]/div[1]";
	public String VehicleTitlefrontimg="//div[@class='c-page toggle-on']//div[1]/div[3]/div[1]/div[2]/div[1]//input";
	public String VehicleTitleBackimg="//div[@class='c-page toggle-on']//div[1]/div[3]/div[2]/div[2]/div[1]//input";
	public String IncomeDocumentationImg="//div[@class='c-page toggle-on']//div[1]/div[3]/div[3]/div[2]/div[1]//input";
	public String DLimg="//div[@class='c-page toggle-on']//div[1]/div[3]/div[4]/div[2]/div[1]//input";
	public String VehicleRegistrationimg="//div[@class='c-page toggle-on']//div[1]/div[3]/div[5]/div[2]/div[1]//input";
	public String InsuranceCard="//div[@class='c-page toggle-on']//div[1]/div[3]/div[6]/div[2]/div[1]//input";
	public String DriverSideimg="//div[@class='c-page toggle-on']//div[2]/div[3]/div[1]/div[2]/div[1]//input";
	public String PassengerSide="//div[@class='c-page toggle-on']//div[2]/div[3]/div[3]/div[2]/div[1]//input";
	public String frontsideimg="//div[@class='c-page toggle-on']//div[2]/div[3]/div[5]/div[2]/div[1]//input";
	public String Rearsideimg="//div[@class='c-page toggle-on']//div[2]/div[3]/div[7]/div[2]/div[1]//input";
	public String Odometer="//div[@class='c-page toggle-on']//div[2]/div[3]/div[9]/div[2]/div[1]//input";
	public String CheckinSubmit="//div[@class='c-page toggle-on']/div//div[3]/div[15]//div[contains (@class,'c-editor c-fileupload')]/div[3]/div/div[2]/div";
	public String Signature="//div[1]//div[3]//div[4]//div[1]/canvas";

}
