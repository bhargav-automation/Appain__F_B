package Customer_Application;

public class XpathExpressions {

	public String storeNumber = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[2]//select";
	String applicationType = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[3]//select";
	public String customerID = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[4]//input";
	public String AppID = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[5]//input";
	public String firstname = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[6]//input";
	public String lastname = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[7]//input";
	String DOB = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[8]//input";
	String SSN = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[9]//input";
	String phone = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[10]//input";
	String email = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[12]//input";
	String DLN = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[13]//input";
	String StateIssued = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[14]//select";
	String ExpirationDate = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[15]//input";
	String AddressLine1 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/fieldset[1]/div/div[1]/input";
	String AddressLine2 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/fieldset[1]/div/div[2]/input";
	String City = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/fieldset[1]/div/div[3]/input";
	String State = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/fieldset[1]/div/div[4]//select";
	String Zipcode = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/fieldset[1]/div/div[5]//input";
	String Rent_Own = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[16]//select";
	String TypeAmount = "//div[contains(@class,'c-currency c-field  c-col-1 c-sml-col-1 c-span-12 c-sml-span-12 c-')]//input";
	String YearAtCurrentAddress = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[17]//select";

	public String CommonButton = "//button[text() ='Next']";
	String IncomeSource = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[1]//select";
	String BussinessAddress1 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]//fieldset[1]/div/div[1]/input";
	String BussinessAddress2 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]//fieldset[1]/div/div[2]/input";
	String BussinessCity = "//div[contains(@class,'c-page toggle-on')]/div/div[2]//fieldset[1]/div/div[3]/input";
	String BUssinessState = "//div[contains(@class,'c-page toggle-on')]/div/div[2]//fieldset[1]/div/div[4]//select";
	String BussinessZipCode = "//div[contains(@class,'c-page toggle-on')]/div/div[2]//fieldset[1]/div/div[5]//input";
	String yearinBussiness = "//div[contains(@class,'c-choice-dropdown c-field  c-col-1 c-sml-col-1 c-span-12 c-sml-span-12 c')]//select";
	String PayFrequency = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[2]//select";
	String DirectDeposit = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[3]//select";
	String AvgGrossAmt = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[4]//input";
	String AvgNetAmt = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[5]//input";
	/* Vechile information */
	public String Year = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[1]//select";
	public String Make = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[2]//input";
	public String Model = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[3]//input";
	String Mileage = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[4]//input";
	String VIN = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[5]//input";
	String CollateralType = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[6]//select";
	public String TitleNumber = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[7]//input";
	String LicensePlateNumber = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[8]//input";
	String LicenseExpDate = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[9]//input";
	String Radiobtn1 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[12]//label";
	String RadioBtn2 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[14]//label";
	String RadioBtn3 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[19]//label";
	String InsuranceCompanyName = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[20]//input";
	String PolicyNumber = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[21]//input";
	/* Loan Information */
	String LoanAmtReq = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[1]//input";
	String TargetMonthlyPayment = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[2]//input";
	String PreferredTerms = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[3]//input";
	String BankAcc = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[4]//select";
	String LoanFunds = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[5]//select";
	/* Additional Information */
	String HowDoYouKnow = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div/div[2]//select";
	/* Terms and signature */
	String Checkbox = "//div[contains(@class,'c-yesno-checkbox c-field  c-col-1 c-sml-col-1 c-span-12 c-sml-span-12 ')]//label";
	String CheckBox2="//form//div/div[2]/span[1]/div/div[1]";
	String Signature = "//div[contains(@class,'c-signature c-field  c-col-1 c-sml-col-1 c-span-12 c-sml-span-12 ')]//canvas";
	String ComakerSignature="//form//div[2]/span[2]//div[2]/div[1]";
	public String Submit = "//button[text() ='Submit']";

	/* Comaker section */
	String Comaker = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/fieldset[3]//label[1]";
	String ComakerfirstName = "//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[1]/div[2]//input";
	String ComakerlastName = "//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[2]/div[2]//input";
	String ComakerDOB = "//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[3]/div[2]//input";
	String ComakerSSN="//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[4]/div[2]//input";
	String ComakerPhone="//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[5]/div[2]//input";
	String ComakerEmail="//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[7]/div[2]//input";
	String ComakerDL="//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[8]/div[2]//input";
	String ComakerStateIssued="//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[9]/div[2]//select";
	String ComakerExpirationDate="//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[10]/div[2]//input";
	String ComakerAdd1="//div[contains(@class,'c-page toggle-on')]//span//div[2]/fieldset/div[1]/div[1]//input";
	String ComakerAdd2="//div[contains(@class,'c-page toggle-on')]//span//div[2]/fieldset/div[1]/div[2]//input";
	String ComakerCity="//div[contains(@class,'c-page toggle-on')]//span//div[2]/fieldset/div[1]/div[3]//input";
	String ComakerState="//div[contains(@class,'c-page toggle-on')]//span//div[2]/fieldset/div[1]/div[4]//select";
	String ComakerZipCode="//div[contains(@class,'c-page toggle-on')]//span//div[2]/fieldset/div[1]/div[5]//input";
	String ComakerRent_Own="//div[contains(@class,'c-page toggle-on')]//span//div[2]/div[11]/div[2]//select";
	String ComakerMortgage="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[2]/div/div[2]//input";
	String ComakerYearsOfCurrentAdd="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[3]/div/div[2]//select";
	String ComakerIncomeSource="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[1]/div/div[2]//select";
	String ComakerEmployeername="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[3]/div/div[2]//input";
	String ComakerEmpAdd1="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[5]/fieldset/div[1]/div[1]//input";
	String ComakerEmpAdd2="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[5]/fieldset/div[1]/div[2]//input";
	String ComakerEmpCity="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[5]/fieldset/div[1]/div[3]//input";
	String ComakerEmpState="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[5]/fieldset/div[1]/div[4]//select";
	String ComakerEmpZipCode="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[5]/fieldset/div[1]/div[5]//input";
	String ComakerEmpPhonenum="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[6]/div/div[2]//input";
	String JobType="//form//div//span//div[2]/span[8]/fieldset/div[1]/div[2]";
	String LengthOfEmp="//div[contains(@class,'c-page toggle-on')]//span//div[2]/span[9]/div/div[2]//select";
	

	/** Vechile inspection form **/
	/* General Information */
	public String InspectSubmitBy = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[3]//input";

	/* Vechile Information */

	public String color = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[4]//input";
	public String Mileage1 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[5]//input";
	public String VIN1 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[6]//input";
	public String CheckboxBtn1 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[9]//label";
	public String CheckboxBtn2 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[13]//label";
	public String CheckboxBtn3 = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[15]//label";

	/* Vehicle Condition */
	public String OverallInterior = "//form//div[1]/div[2]/fieldset[1]/div[1]/div[1]/label[1]";
	public String DoorPanels = "//form//div[1]/div[2]/fieldset[2]/div[1]/div[2]/label[1]";
	public String DashControls = "//form//div[1]/div[2]/fieldset[3]/div[1]/div[2]/label[1]";
	public String Seats = "//form//div[1]/div[2]/fieldset[4]/div[1]/div[3]/label[1]";
	public String CarpetFloorBoard = "//form//div[1]/div[2]/fieldset[5]/div[1]/div[2]/label[1]";
	public String ExteriorCondition = "//form//div[2]/div[2]/fieldset[1]/div[1]/div[2]/label[1]";
	public String Paint = "//form//div[2]/div[2]/fieldset[2]/div[1]/div[2]/label[1]";
	public String HoodTruck = "//form//div[2]/div[2]/fieldset[3]/div[1]/div[3]/label[1]";
	public String QuaterPanels = "//form//div[2]/div[2]/fieldset[4]/div[1]/div[4]/label[1]";
	public String Headlights = "//form//div[2]/div[2]/fieldset[5]/div[1]/div[2]/label[1]";
	public String WindowGlass = "//form//div[2]/div[2]/fieldset[6]/div[1]/div[3]/label[1]";
	public String Tires = "//form//div[2]/div[2]/fieldset[7]/div[1]/div[4]/label[1]";
	public String MechanicalCondition = "//form//div[3]/div[2]/fieldset[1]/div[1]/div[2]/label[1]";
	public String Enginelights = "//form//div[3]/div[2]/fieldset[2]/div[1]/div[1]/label[1]";
	public String BrakeLight = "//form//div[3]/div[2]/fieldset[3]/div[1]/div[2]/label[1]";
	public String OilPressure = "//form//div[3]/div[2]/fieldset[4]/div[1]/div[1]/label[1]";
	public String Ignition = "//form//div[3]/div[2]/fieldset[5]/div[1]/div[3]/label[1]";
	public String GearShifting = "//form//div[3]/div[2]/fieldset[6]/div[1]/div[3]/label[1]";
	public String EngineNoises = "//form//div[3]/div[2]/fieldset[7]/div[1]/div[4]/label[1]";
	public String FluidLeaks = "//form//div[3]/div[2]/fieldset[8]/div[1]/div[2]/label[1]";

	/* Picture Upload */
	public String GPSID = "//div[@class='c-page toggle-on']/div//div[3]/div[18]//div[2]//input";
	public String DriversideUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[1]//div[2]//span/input";
	public String PassengersideUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[3]//div[2]//span/input";
	public String FrontsideUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[5]//div[2]//span/input";
	public String RearsideUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[7]//div[2]//span/input";
	public String VINUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[9]//div[2]//span/input";
	public String EnginebayUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[11]//div[2]//span/input";
	public String InteriorUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[13]//div[2]//span/input";
	public String OdometerUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[15]//div[2]//span/input";
	public String GPSIDNumberUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[17]//div[2]//input";
	public String OnlineVechileTitleUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[19]//div[2]//input";
	public String OnlineGovtIDUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[21]//div[2]//input";
	public String OnlineGPSIDUpload = "//div[@class='c-page toggle-on']/div//div[3]/div[23]//div[2]//input";
	public String OnlineGPSIDNum = "//div[@class='c-page toggle-on']/div//div[3]/div[24]//div[2]//input";
	public String checkingToSubmit = "//div[@class='c-page toggle-on']/div//div[3]/div[17]//div[contains (@class,'c-editor c-fileupload')]/div[3]/div/div[2]/div";
//	public String checkingToSubmit = "//div[@class='c-page toggle-on']/div//div[3]/div[17]//div[contains (@class,'c-editor c-fileupload')]/div[3]/div/div[1]";
	public String GPSInstallation = "//div[@class='c-page toggle-on']/div//div[3]/div[20]//div[2]//input";
	
	
	/*Online Vechile inspections*/
    public String online_Storename = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[2]//input";
    public String Online_PhnNum = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[3]//input";
    public String Online_InspectSubmitBy = "//div[contains(@class,'c-page toggle-on')]/div/div[2]/div[4]//input";
    
    
}
