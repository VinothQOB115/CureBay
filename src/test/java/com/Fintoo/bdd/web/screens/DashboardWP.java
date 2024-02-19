package com.Fintoo.bdd.web.screens;

import org.testng.Assert;

import com.Fintoo.bdd.ccl.PlayActions;
import com.Fintoo.bdd.integrations.common_utils.ConfigReader;
import com.microsoft.playwright.options.AriaRole;

public class DashboardWP {
	String startnowBtn = "//a[text()=\"start now\"]";
	String roboAdvisoryTxt = "//h4[text()=\"ROBO ADVISORY\"]";
	String getStartedBtn = "(//button[text()=\"Get Started\"])[1]";
	String subscriptionTxt = "//span[text()=\"Subscription\"]";
	String applayOfferBtn = "//b[@class=\"right_arrow\"]";
	String enterCouponTxtBx = "//input[@id=\"coupon_code\"]";
	String applyBtn = "//button[@value=\"Apply\"]";
	String ndaChkbx = "//input[@id=\"ndacheck\"]";
	String payBtn = "//button[@id=\"skipPayment\"]";
	// ========YOURINFO============
	String lastnametxt = "(//input[@id='lastName'])[2]";
	String pincodetxt = "(//input[@id=\"pinCode\"])[1]";
	String pantxt = "(//input[@id=\"pan\"])[1]";
	String dobtxt = "(//input[@name=\"dob\"])[1]";
	String yearTxt = "//select[@data-handler=\"selectYear\"]";
	String btnyr = "1996";
	String date = "//a[text()=\"1\"]";
	String occupationDrpDwm = "//span[@id=\"ui-id-1-button\"]";
	String businessOptn = "(//div[text()=\"Business\"])[1]";
	String retirementAgeTxt = "//input[@id=\"retirement_age\"]";
	String lifeExpectancy = "//input[@id=\"lifeExpectancy\"]";
	String saveAndContinueBtn = "Save & Continue";
	String OKbtn = "OK";
	// =========KNowYourRisk==================
	String btnKnowYourRisk="//a[text()='Know Your Risk']";
	String q1ChkBx = "Very low risk taker.";
	String a1NextBtn = "(//button[@id=\"btn1\"])[2]";
	String q2ChkBx = "Somewhat uneasily.";
	String a2NextBtn = "(//button[@id=\"btn2\"])[1]";
	String q3ChkBx = "Uncertainty.";
	String a3NextBtn = "(//button[@id=\"btn3\"])[2]";
	String q4ChkBx = "Probably  more job Security with a small pay Increase.";
	String a4NextBtn = "(//button[@id=\"btn4\"])[1]";
	String q5ChkBx = "Probably not.";
	String a5NextBtn = "(//button[@id=\"btn5\"])[1]";
	String q6ChkBx = "10%.";
	String a6NextBtn = "(//button[@id=\"btn6\"])[1]";
	String continueBtn = "(//a[@class=\"next-btn form-arrow\"])[1]";
	// ========Assumptions======================
	String btnNext = "(//a[@class='next-btn form-arrow'])[2]";
	String btnNxtInInflationAssumption = "(//a[@class='next-btn form-arrow'])[3]";
	// ==========YourFamily=================
	String btnFamOthers = "//input[@ref='Others']/parent::li[@ng-click='resetForm()']";
	String txtDaughter = "//img[@alt='about family daughter']";
	String txtFamFirstname = "//input[@id='firstName']";
	String txtFamOthLastname = "#famlastName";
	String txtFamLastname = "//input[@id='famlastName']";
	String txtFamSelectYr = "//input[@id=\"childrensdob\"]";
	String txtFamyr = "2007";
	String txtFamDate = "15";
	String btnFamSave = "//button[@id='familySavebtn']";
	String txtAddedFamDetails = "//div[@id='familyMember']";
	String btnNextInYrFam = "(//a[@class='next-btn form-arrow'])[4]";
	//String btnFather = "//img[@alt='about family father']";
	String btnFather="//input[@ref='Father']//parent::li";
	String txtFatherDOB = "//input[@id=\"parentsdob\"]";
	String btnMother = "//input[@ref='Mother']//parent::li";
	String btnSon = "//label[@title='Son' or @for ='type-3']";
	// =========AddIncome=============
	String btnAddincome = "//a[text()=\"Add Income\"]";
	String txtAddIncome = "//a[@id=\"tab-btn1\"]";
	String btnSalaryAndBonus = "\"Salary & Bonus\"";// *[@id="incomeform"]/div[1]/div/ul/li[6]/label/text()
	String txtIncomeValue = "//input[@name=\"income_amount\"]";
	String radioBtnRetirement = "//label[@ for=\"retirement\"]";
	String btnSaveInIncome = "//button[@id=\"incomeSavebtn\"]";
	String txtSavedIncomeDetails = "//h4[text()=\"Salary & Bonus  - Salary & Bonus\"]";
	String btnnextInIncome = "(//a[@class='next-btn form-arrow'])[1]";
	String txtYourExpense = "//div[@id='expenses_box']";
	String btnHouseHoldExpenses = "\"Household Expenses\"";
	String btnExpenseValue = "//input[@name='expenses_amount']";
	String radiobtnRetirement1 = "#retirement1";// *[@id="expensesretirementClassId"]/div/ul/li[1]/label/text()
	String btnOkBravo = "//button[text()=\"OK\"]";
	String btnsaveinExpenses = "//button[@id=\"expensesSavebtn\"]";
	String txtSavedExpenses = "//*[@id=\"expensesdata\"]/h4";
	String btnYesInExpenses = "Yes";
	String btnContinueInExpenses = "(//span[text()=\"Continue\"])[4]";
	String btnGifts = "//*[@id=\"incomeform\"]/div[1]/div/ul/li[2]/label";
	String btnVacation = "//img[@alt='Vacation expenses']";
	String txtExpenseAmount = "#expenseAmt";
	String btnInterestIncome = "//img[@alt='Post office income']";
	String btnHouseRent = "//img[@alt='House rent']";
	String txtINterestINcome = "//input[@name=\"income_amount\"]";
	String btnRentalINIncome = "//img[@alt='Rental income']";
	String btnMedicalINExp = "//label[@for=\"type-19\"]";
	String btnPension = "//img[@alt='Income pension']";
	String btnPostRetirement = "//img[@alt='post retirement expenses']";
	// ========Goals==============
	String btnAddGoals = "//a[text()= 'Goals']";
	String txtgoalHeading = "//div[@class='accordion-header']";
	String btnEmergency = "(//li[@ng-click=\"resetForm('emergency')\"])";
	String txtGoalValue = "(//input[@name=\"goal_current_value\"])";
	String btnGoalSave = "(//button[@id=\"goalSavebtn\"])";
	String btnNextInGoals = "(//a[@class='next-btn form-arrow'])[1]";
	String btnMarriag = "//img[@alt='Marriage goal analysis']";
	String txtMrrgValue = "input[name=\"goal_current_value\"]";
	String btnVehicle = "//img[@alt='Vehicle goal analysis']";
	String txtVehicleLoanAmount = "input[name=\"goal_current_value\"]";
	String btnVacationINGoal = "//img[@alt='Vacation goal analysis']";
	String btnPropertyInGoal = "//img[@alt='Property goal analysis']";
	// ==========Assets&Liabilities==============
	String btnAddAsset = "//a[text()=\"Add Assets\"]";
	String txtAddAssets = "//span[text()='Add Assets']";
	String btnRealEstate = "//span[text()='Real Estate']/ancestor::label";
	String btnAgricultureLand = "\"Agricultural Land\"";
	String btncrntMarketValue = "//input[@id='currentAmt']";
	String btnPincode = "//input[@id='pinCode']";
	String btnSaveInAssets = "//button[text()='Save & Add More']";
	String btnCarLoan = "\"Car Loan\"";
	String btnOKInGoals = "//*[@id=\"asset_liab_complete_popup\"]/div/div[2]/ul/button";
	String btnNextInAssets = "(//a[@class=\"next-btn form-arrow\"])[1]";
	String btnYesInAssets = "(//button[@value=\"Yes\"])[2]";
	String btnNextInLiabilities = "(//a[@class=\"next-btn form-arrow\"])[2]";
	String btnEndDateINliabilities = "(//input[@name=\"enddate\"])";
	String btnAlternate = "//*[@id=\"cd_alternate\"]/label";
	String btnCurrency = "//*[@id=\"alternate\"]/li[4]/label";
	String txtAssetUnits = "#assetUnits";
	String txtAssetpurchaseamount = "input[name=\"asset_purchase_amount\"]";
	String txtAssetCurrentAmount = "#unitPrice";
	String txtAssetCurrentamount = "//input[@ng-model='equityasset.asset_current_unit_price']";
	String btnConsumerLoan = "\"Consumer Loan\"";
	String txtConsumerLoanAmount = "#currentOut";
	String txtEndDate = "//input[@name=\"enddate\"]";
	String btnGold = "//img[@alt='Gold']";
	String btnPhysicalGold = "//img[@alt='Physical Gold']";
	String txtGoldUnits = "input[name=\"asset_units\"]";
	String txtGoldPrice = "input[name=\"asset_current_unit_price\"]";
	String txtCreditCard = "//input[@ref='Credit card']//parent::li";
	String btnLiquid = "//label[@for=\"type-4\"]";
	String btnCashBalance = "//input[@data-ref='Cash Balance']/parent::li[@ng-click=\"scrolltoForm('#liquidregisterform');upload_opt('60');generalresetForm();\"]";
	String txtCashBalance = "#currentBalance";
	String btnHousin = "//input[@ref='Housing']/parent::li[@ng-click=\"liabilityResetform()\"]";
	String btnDebt = "//label[@for=\"type-2\"]";
	String btnFixedDeposit = "//img[@alt='fixed deposit']";
	String txtAssetname = "#assetName";
	String txtPurchaseAmount = "#purchaseAmt";
	String btnBusinessLoan = "//label[@for=\"type-14\"]";
	String txtAssetsNameOthers = "//input[@id='assetName']";
	String btnAssestsothers = "//label[@for='Others' or title='Others']/ancestor::li";
	String txtOthersCurrentBal = "//input[@id='currentBalance']";
	//String btnLiabOtherProLoan = "//input[@ref='Other Property Loan' ]//ancestor::li[@ng-click='liabilityResetform()']";
	String btnLiabOtherProLoan="//input[@ref='Other Property Loan']/parent::li";
	String btnPersonalLoan = "//input[@ref=\"Personal Loan\"]/parent::li[@ng-click=\"liabilityResetform()\"]";
	// ============Insurance==========
	String btnInsurance = "Insurance Insurance";
	String btnNOinM1 = "No";
	String btnNextM1 = "(//button[text()=\"Next\"])[1]";
	String btnNOinM2 = "Reputed Multispeciality Hospital With All Required Facilities";
	String btnNextM2 = "(//button[text()=\"Next\"])[3]";
	String btnNOinM3 = "Mid Level Of Risk";
	String btnNextM3 = "(//button[text()=\"Next\"])[5]";
	String btnNextInInsurance = "(//a[@class='next-btn form-arrow'])[2]";
	String btnGeneral = "//img[@alt='General insurace']";
	String btnInsurancePremiumAmount = "//input[@name='insurance_premium_amount']";
	String btnSumAssured = "//input[@name='insurance_sum_assured']";
	String btnTypeOfInsurance = "(//span[@role='combobox'])[2]";
	String btnInsurancetype = "Bite-size insurance";
	String btnenddate = "#insurance_payment_enddate";
	String btnSaveInInsurance = "Save & Add More";
	String btnGenerateReport = "Generate Report";
	String btnGuaranteedIncomePlan = "//img[@alt='Assured income plan']";
	String txtInsuranceSurrendervalue = "input[name=\"insurance_surrender_value\"]";
	String txtInsurancePremium = "input[name=\"insurance_premium_amount\"]";
	String txtInsuranceSumAssured = "input[name=\"insurance_sum_assured\"]";
	String txtEndDateinInsurance = "//input[@id=\"insurance_payment_enddate\"]";
	String btnTab = "//a[@id=\"tab-btn2\"]";
	String btnMediclaim = "//*[@id=\"insuranceform\"]/div[1]/div/ul/li[4]/label";
	String txtInsuranceTotalMembers = "input[name=\"insurance_total_memebers\"]";
	String txtMedicalimEnddate = "//input[@name=\"insurance_payment_enddate\"]";
	String btnPensionPlan = "//img[@alt='Personal insurance plan']";
	String btnEndowment = "//label[@for=\"type-4\"]";
	String btnTermPlan = "//input[@ref='Term Plan']/parent::li[@ng-click='resetForminsurance()']";
	String txtMaternityAmountInTermPlan = "\"Insurance Maturity Amount If Any (₹)\"";

	// ===========================
	String btnEditData = "//a[text()=\"Edit Data\"]";
	String btnnextINgenrep = "Next ";
	String btninflamation = "Inflation Assumptions";
	String btnGlossary = "Glossary";
	String btnDisclaimer = "Disclaimer";
	//String btnYrProfile = "Your Profile";
	String btnYrProfile = "(//*[text()='Your Profile'])[1]";
	String txtPAN = "//p[text()=\"GMEPA2040E\"]";
	String txtRetirmntAge = "//p[text()=\"60\"]";
	String txtLifExpctnyAge = "//p[text()=\"80\"]";
	String btnAboutYourFamily = "About Your Family";
	String txtdaughtervalid = "//span[@class=\"relation ng-binding\"]";

	String btnCludMembership = "(//label[@title='Club Membership and Subscriptions' or @for='type-14']/ancestor::li)";
	String btnOther = "//img[@alt='Income others' or text()='Other']";
	String btnOthersInsurance = "//input[@ref=\"Others\" and @ng-model=\"insurance.insurance_category_id\"]/parent::li";
	//String btnGoalsOthers = "Others";
	String btnGoalsOthers="//img[@alt='Other goal analysis']";
	String txtOthersGoalValue = "input[name=\"goal_current_value\"]";
	String btnEquity = "//span[text()='Equity']";
	String btnFutureOptions = "//input[@ng-model=\"equityasset.asset_sub_category_id\"]/parent::li[@ng-click=\"scrolltoForm('#registerform');upload_opt('35');generalresetForm();\"]";
	String dateOfPurchase = "//input[@name=\"asset_purchase_date\"]";
	String july5date = "//a[text()='2']";
	String noOfShares = "//input[@ng-model=\"equityasset.asset_units\"]";
	String avgBuyPrice = "//input[@ng-model=\"equityasset.asset_purchase_amount\"]";
	String txtAvgBuyPrice="//input[@name='asset_purchase_avgamount']";
	String investAmount = "//input[@name='asset_total_purchase']";
	String currentPrice = "//input[@ng-keyup=\"unitPrice()\"]";
	String btnEduExpense = "//input[@ref=\"Education Expense\"]//parent::li[@ng-click=\"resetForm(1,0)\"]";
	String btnBusiness = "//input[@ng-model='income.income_category_id' or @ref='Business']/ancestor::ul";
	String incEndDate = "//input[@id='income_end_date']";
	String incEndYear = "//select[@class='ui-datepicker-year']";
	String incSelectEndDate = "//td[@data-handler='selectDay']/child::a[text()='13']";
	String btnEducation = "(//li[@ng-click=\"resetForm('education')\"])";
	String edu_current_value = "(//input[@name='goal_current_value'])";
	String type_of_edu = "(//span[@aria-autocomplete='list'])[2]";
	String type_of_edu_engg = "(//div[@id='ui-id-415' or text()='Engineering '])";
	String txtSonDOB = "//input[@id='childrensdob' or @ng-model='family.dob']";
	// =======================Equity========================//
	String btnEquEsop = "//img[@alt='ESOP']";
	String btnEquEquMutualFund = "//img[@alt='mutual funds']";
	String btnEquShares = "//img[@alt='equity shares']";
	String btnEquPms = "//img[@alt='PMS']";
	String btnEquUnListed = "//img[@alt='unlisted equity']";
	String btnEquOthers = "//input[@data-ref='Others' ]/ancestor::li[@ng-click=\"scrolltoForm('#registerform');upload_opt('74');generalresetForm();\"]";
	String btnEquUSEquity = "//img[@alt='us equity']";
	String btnLiquidLiqFunds = "//img[@alt='Liquid funds']";
	String btnLiqBankBal = "//img[@alt='Liquid bank balance']";
	String btnLiqOthers = "//input[@value1='Others']/parent::li[@ng-click=\"scrolltoForm('#liquidregisterform');upload_opt('63');generalresetForm();\"]";
	String btnRealEstateCommercial = "//img[@alt='Commercial fund']";
	String btnRealEsateLand = "//img[@alt='Real estate land']";
	String btnRealEstateResidential = "//img[@alt='Residenial premises']";
	String btnRealEstateUnderConst = "//img[@alt='RE construction']";
	String btnRealEstateOthers = "//input[@id=\"real-estate-9\" and @data-ref='Others']/parent::li";
	String txtDirectValueothers = "//input[@name=\"asset_amount\"]";
	String dateDirectvalueStartDate = "//input[@name=\"asset_purchase_date\"]/parent::div";
	String btnArtInvestInAlternate = "//img[@alt='Assets art investment']";
	String txtAssetAmount = "//input[@name='asset_amount' or @ng-model='equityasset.asset_amount']";
	String btnCommidityInAlternate = "//img[@alt='Commodity']";
	String btnCryptoCurrInAlternate = "//img[@alt='Cryptocurrency']";
	String txtCryptoCurrency = "//div[@name='cryptocurrency_list1']";
	String btnvintageInAlteranate = "//img[@alt='assets vinatge car']";
	String btnOthersInAlternate = "//label[@for='alternate-5']/img[@alt='debt others']";
	String btnETFInGoldAssets = "//img[@alt='ETF']";
	String btnOthersInGoldAssets = "//input[@id='gold-5' and @value1='Alternate Others']/ancestor::li[@ng-click=\"scrolltoForm('#goldregisterform');upload_opt('73');generalresetForm();\"]";
	String btnGoldMutualFundInAssets = "//img[@alt='Gold mutual fund']";
	String btnSovereignBondInAssets = "//img[@alt='Soverign bond']";
	String txtPurchaseAmountEpf = "//input[@name='asset_purchase_amount']";
	String txtCurrentAmountEpf = "//input[@name='asset_current_unit_price' and @id='unitPrice']";
	String txtNoOfGramsInGoldAssets = "//input[@id='assetUnits' and @name='asset_units']";
    String txtKaratsInGold="//input[@name='asset_gold_karat']";
    String txtTotalInvestAmountInGold="//input[@name='asset_purchase_amount']";
    String txtNoOfgrams="//input[@name='asset_units']";
    String txtCurrentValue="//input[@name='asset_current_value'and @ng-model='equityasset.totalinvestedvalue']";
	//String selectEquityShare="//div[@ng-model='equityasset.usequity_list']";
	String selectEquityShare=".selectize-input";
	String btnDebtop="//span[text()='Debt']";
    String btnDebtDebentures="//img[@alt='debenture']";
    String btnDebtMutualFunds="//img[@alt='mutual fund']";
    String btnDebtEPF="//label[@for='debt-14']//img[@alt='PPF']";
    String btnDebtGratuity="//img[@alt='gratuity']";
    String btnDebtGovtBond="//img[@alt='government bond']";
    String btnDebtGovtScheme="//img[@alt='government schemes']";
    String btnDebtNPS="//img[@alt='NPS']";
    String btnDebtNSCKVP="//img[@alt='NSC']";
    String btnDebtPensionScheme="//img[@alt='Pension scheme']";
    String btnDebtPostOfficeSch="//img[@alt='post office scheme']";
    String btnDebtPPFGPFVPF="//label[@for='debt-7']//img[@alt='PPF']";
    String btnDebtSukanyaSamriddhiYojana="//img[@alt='Sukanya Samriddhi Yojana']";
    String btnDebtRecurringDeposit="//img[@alt='Recurring Deposit']";
    String btnDebtOthers="//label[@for='debt-13']//img[@alt='debt others']";
    String txtdebtCurrentUnitPrice=" //input[@name='asset_current_unit_price']";
    String txtdebtinvestAmount="//input[@name='asset_purchase_amount']";
    String Retireentop="//label[@for='asset_isperpetual']";
    String halfyearlyop="//label[@for='half-yearlydebt']";
    String purchasedate="#dp1690191460601";
    String txtinvestAmount="//input[@id='purchaseAmt']";
    String Assetname="//input[@name='asset_name']";
	String txtcurrentPrice="#unitPrice";
    PlayActions play = new PlayActions();

	public void clickOnStartNowBtn() {
		play.click(startnowBtn, "Start Now Button");
	}

	public void roboAdvisoryTextValidation() {
		play.waitForVisible(roboAdvisoryTxt, 60000, "RObo Advisory");
	}

	public void clickOnGetStartedBtn() {
		play.click(getStartedBtn, "Get Started Button");
	}

	public void subscriptionTextValidation() {
		play.waitForVisible(subscriptionTxt, 60000, "Subscription Heading");
	}

	public void clickOnApplyCouponBtn() {
		play.click(applayOfferBtn, "Apply Offer Button");
	}

	public void enterCouponValue() {
		play.enterText(enterCouponTxtBx, ConfigReader.getValue("couponCode"), "coupon Value");
		;
	}

	public void clickOnApplyButton() {
		play.click(applyBtn, "Apply Button");
	}

	public void ndaCheckBox() {
		play.check(ndaChkbx, "NDA CheckBox");
	}

	public void clickOnPayBtn() {
		play.click(payBtn, "Pay Button");
	}

	public void yourInfo() throws InterruptedException {
		Thread.sleep(10000);
		//play.sendKeys(lastnametxt, ConfigReader.getValue("lastName"), "last Name");
		play.sendKeys(pincodetxt, ConfigReader.getValue("pincode"), "pinCode");
		play.sendKeys(pantxt, ConfigReader.getValue("pannumber"), "pan number");
		play.click(dobtxt, "DOB");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole(btnyr, 2, "year");
		play.click(date, "Date");
		play.click(occupationDrpDwm, "occupation dropdown");
		play.click(businessOptn, "business option");
		play.sendKeys(retirementAgeTxt, ConfigReader.getValue("retirementAge"), "Retirement Age");
		play.sendKeys(lifeExpectancy, ConfigReader.getValue("lifeExpectancy"), "Life Expectancy");
		play.clickRoleByButton(saveAndContinueBtn, "Save and Continue button");
		try {
			play.clickRoleByButton(OKbtn, "ok button");
		}catch(Exception e) {
			
		}

	}

	public void knowYourRisk() throws InterruptedException {
		Thread.sleep(10000);
		try {
		play.click(btnKnowYourRisk, "Know your Risk");}
		catch(Exception e) {
		}
		play.clickbyText(q1ChkBx, "First Question CheckBox");
		play.clickbylocatortext("#step-rf1", "Next", "First Next Button");
		play.clickbyText(q2ChkBx, "Second Question CheckBox");
		play.clickbylocatortext("#step-rf2", "Next", "Second Next Button");
		play.clickbyText(q3ChkBx, "Third Question CheckBox");
		play.clickbylocatortext("#step-rf3", "Next", "Third Next Button");
		play.clickbyText(q4ChkBx, "Fourth Question CheckBox");
		play.clickbylocatortext("#step-rf4", "Next", "Fourth Next Button");
		play.clickbyText(q5ChkBx, "Fifth Question CheckBox");
		play.clickbylocatortext("#step-rf5", "Next", "Fifth Next Button");
		play.clickbyText(q6ChkBx, "Sixth Question CheckBox");
		play.clickbylocatortext("#step-rf6", "Next", "Sixth Next Button");
		try{
		 play.click(OKbtn, "ok button");}
		catch(Exception e) {
			
		}try {
		play.clickRoleByLink("Continue ", "continue button");}
		catch(Exception e) {
			
		}
	}

	public void AssumptionPage() throws InterruptedException {
		Thread.sleep(3000);
		play.click(btnNext, "Next Button");
		play.click(btnNxtInInflationAssumption, "Next button");
	}

	public void YourFamilyPage() {
		play.click(txtDaughter, "Daughter");
		play.click(txtFamFirstname, "first name");
		play.sendKeys(txtFamFirstname, ConfigReader.getValue("SonFirstName"), "Daughter first name");
		play.click(txtFamLastname, "lase name");
		play.sendKeys(txtFamLastname, ConfigReader.getValue("sonLastName"), "Daughter last name");
		play.click(txtFamSelectYr, "Year");
		play.Clickpagebyrole(txtFamyr, 2, "year");
		play.clickRoleByLink(txtFamDate, "Date");
		play.click(btnFamSave, "Save button");
		play.click(btnNextInYrFam, "Next Button");

	}

	// =========ADD GOAL===============
	public void addGoal() {
		play.clickRoleByLink("Goals*", "goals button");
		//play.click(btnAddGoals, "add goals");
	}
   
	public void goalFormvalidation() {
		play.isDisplayed(txtgoalHeading, "goal form heading");
	}

	public void emergencyInGoal() {
		play.click(btnEmergency, "emergency button");
		play.sendKeys(txtGoalValue, ConfigReader.getValue("goalValue"), "goal value");
		play.click(btnGoalSave, "save button in goal");

	}

	// ==========ADD INCOME==============
	public void addIncome() {
		play.click(btnAddincome, "add income");
	}

	public void addincomevalidation() {
		play.isDisplayed(txtAddIncome, "add income heading");
	}

	public void salaryandbonusinINcome() throws InterruptedException {
		play.click(btnSalaryAndBonus, "salary and bonus");
		boolean addIncome = play.isDisplayed(txtAddIncome, "income Heading");
		Assert.assertTrue(addIncome);
		play.click(btnSalaryAndBonus, "salary and bonus");
		play.sendKeys(txtIncomeValue, ConfigReader.getValue("income"), "Income value");
		play.click(radioBtnRetirement, "retirement age");
		play.click(btnSaveInIncome, "save button");
		play.click(btnTab, "expenses button");
		// play.clickRoleByLink("Continue ", "continue button");
		// play.clickRoleByButton("Yes", "yes button");
		play.click(btnHouseHoldExpenses, "house hold expenses");
		play.sendKeys(btnExpenseValue, ConfigReader.getValue("householdExpenses"), "House hold expenses");
		play.clickbygettext("#expensesretirementClassId", "Upto Retirement Age", "retirment age");
		play.click(btnsaveinExpenses, "save button");
		try {
		 play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
//		play.clickRoleByLink("Continue ", "continue button");
//		play.clickRoleByButton(btnYesInExpenses, "yes button");
	}

	// =========Asset&liabilities============
	public void addAsset() {
		play.click(btnAddAsset, "add asset button");
	}

	public void addAssetDetails() throws InterruptedException {
		play.click(btnRealEstate, "real estate button");
		play.click(btnAgricultureLand, "agriculture land");
		play.sendKeys(btncrntMarketValue, ConfigReader.getValue("marketpriceforland"), "marketprice");
		play.sendKeys(btnPincode, ConfigReader.getValue("pincode"), "pincode");
		play.clickRoleByButton("Save & Add More", "save button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
		// play.clickRoleByButton("Ok", "OK button");
		// Thread.sleep(60000);
		// play.clickRoleByLink("Continue ", "continue button");
		// play.clickRoleByButton(btnYesInExpenses, "yes button");

	}

	public void addCommercicalInRealEstateAsset() {
		play.click(btnRealEstate, "real estate button");
		play.click(btnRealEstateCommercial, "Commercial");
		play.sendKeys(btncrntMarketValue, ConfigReader.getValue("marketpriceforland"), "marketprice");
		play.sendKeys(btnPincode, ConfigReader.getValue("pincode"), "pincode");
		play.clickRoleByButton("Save & Add More", "save button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
	}
	public void addLandInRealEstateAsset() {
		 play.click(btnRealEstate, "real estate button");
		 play.click(btnRealEsateLand, "Land");
		 play.sendKeys(btncrntMarketValue, ConfigReader.getValue("marketpriceforland"), "marketprice");
			play.sendKeys(btnPincode, ConfigReader.getValue("pincode"), "pincode");
			play.clickRoleByButton("Save & Add More", "save button");
			try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {				
			}	 
	}
	public void addResPremisesInRealEstAsset() {
		 play.click(btnRealEstate, "real estate button");
		play.click(btnRealEstateResidential, "Residential premises");
		 play.sendKeys(btncrntMarketValue, ConfigReader.getValue("marketpriceforland"), "marketprice");
			play.sendKeys(btnPincode, ConfigReader.getValue("pincode"), "pincode");
			play.clickRoleByButton("Save & Add More", "save button");
			try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {			
			}
	}
	public void addUnderConsPropInRealEstAsset() {
		play.click(btnRealEstate, "real estate button");
		play.click(btnRealEstateUnderConst, "under Construction property");
		 play.sendKeys(btncrntMarketValue, ConfigReader.getValue("marketpriceforland"), "marketprice");
			play.sendKeys(btnPincode, ConfigReader.getValue("pincode"), "pincode");
			play.clickRoleByButton("Save & Add More", "save button");
			try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {				
			}	
	}
	public void addOthersInRealEstAsset() {
		play.click(btnRealEstate, "real estate button");
		play.click(btnRealEstateOthers, "Others");
		 play.sendKeys(btncrntMarketValue, ConfigReader.getValue("marketpriceforland"), "marketprice");
			play.sendKeys(btnPincode, ConfigReader.getValue("pincode"), "pincode");
			play.clickRoleByButton("Save & Add More", "save button");
			try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {				
			}	
		

	}

	public void carloan() {
		play.click(btnTab, "liabilities button");
		play.click(btnCarLoan, "car loan button");
		play.sendKeys("#currentOut", ConfigReader.getValue("carloan"), "car loan amount");
		play.click(btnEndDateINliabilities, "enddate");
		play.Clickpagebyrole("2035", 2, "emi end year");
		play.clickRoleByLink("26", "emi end date");
		play.clickRoleByButton("Save & Add More", "save button");
//		play.clickRoleByLink("Continue ", "continue button");
//		play.clickRoleByButton(btnYesInExpenses, "yes button");

	}

	public void insurance() {
		play.clickRoleByLink(btnInsurance, "Insurance button");
		play.clickbygettext("#step-gm1", btnNOinM1, "no button");
		play.clickbylocatortext("#step-gm1", "Next", "next button");
		play.clickbyText(btnNOinM2, "option in 2nd question");
		play.clickbylocatortext("#step-gm2", "Next", "next button");
		play.clickbyText(btnNOinM3, "option in 2nd question");
		play.clickbylocatortext("#step-gm3", "Next", "next button");

	}

	public void generealInsurance() {
		play.click(btnGeneral, "general button");
		play.click(btnInsurancePremiumAmount, "premium amount button");
		play.sendKeys(btnInsurancePremiumAmount, ConfigReader.getValue("expenseamount"), "premium amount");
		play.click(btnSumAssured, "sum assured amount button");
		play.sendKeys(btnSumAssured, ConfigReader.getValue("sumassuredamount"), "sum assured amount");
		play.click(btnTypeOfInsurance, "type of insurance");
		play.clickRoleByOption(btnInsurancetype, "selects option");
		play.click(btnenddate, "end date");
		play.Clickpagebyrole("2030", 4, "selects date");
		play.clickRoleByLink("11", "date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void generatereport() {
		try {
		play.clickRoleByButton(btnGenerateReport, "generate button");}
		catch(Exception e) {
			
		}
	}

	public void editData() {
		play.click(btnEditData, "edit data button");
		play.clickRoleByLink(btnGenerateReport, "generate report button");

	}

	public void clickgoals() {
		play.clickRoleByLink("Goals*", "goals button");
	}

	public void clickincomeandexpenses() {
		play.clickRoleByLink("Income expenses Income & Expenses*", "income and expenses button");
	}

	public void clickassetandliabilities() {
		play.clickRoleByLink("Assets & Liabilities*", "assets and liabilities");
	}

	public void addMarriageinGoals() {
		play.click(btnMarriag, "marriage button");
		play.sendKeys(txtMrrgValue, ConfigReader.getValue("marriageamount"), "marriage amount");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		 play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
	}

	public void addGiftsinIncome() {
		play.click(btnGifts, "GIfts button");
		play.sendKeys(txtIncomeValue, ConfigReader.getValue("giftvalue"), "Gift value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		// play.clickRoleByButton("Ok", "OK button");
		play.click(btnTab, "expenses button");
		play.click(btnVacation, "vacation button");
		play.sendKeys(txtExpenseAmount, ConfigReader.getValue("expenseamount"), "expense value");
		play.clickbygettext("#expensesretirementClassId", "Upto Retirement Age", "retirment age");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
	}

	public void addAlternateInIncome() {
		play.click(btnAlternate, "alternate button");
		play.click(btnCurrency, "Currency Button");
		play.sendKeys(txtAssetname, ConfigReader.getValue("assetname"), "Asset name");
		play.sendKeys(txtAssetUnits, ConfigReader.getValue("assetUnits"), "Asset Unit value");
		play.sendKeys(txtAssetpurchaseamount, ConfigReader.getValue("purchaseamount"), "Asset purchase value");
		play.sendKeys(txtAssetCurrentAmount, ConfigReader.getValue("currentValueAmount"), "Asset current value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}try {
		// play.click(btnTab, "expenses button");
			}
		catch(Exception e) {
			
		}
	}

	public void addArtInvestmentInAlternateAssets() {
		play.click(btnAlternate, "alternate button");
		play.click(btnArtInvestInAlternate, "Art Investment");
		play.click(dateDirectvalueStartDate, "start date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2021", 3, "end date");
		play.clickRoleByLink("29", "Date");
		play.sendKeys(txtAssetAmount, ConfigReader.getValue("currentValueAmount"), "Current value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void addCommodityInAlternateAssets() {
		play.click(btnAlternate, "alternate button");
		play.click(btnCommidityInAlternate, "Commidity");
		play.click(dateDirectvalueStartDate, "start date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2021", 3, "end date");
		play.clickRoleByLink("29", "Date");
		play.sendKeys(txtAssetUnits, ConfigReader.getValue("assetUnits"), "Asset Unit value");
		play.sendKeys(txtAssetpurchaseamount, ConfigReader.getValue("purchaseamount"), "Asset purchase value");
		play.sendKeys(txtAssetCurrentAmount, ConfigReader.getValue("currentValueAmount"), "Asset current value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void addCryptoCurrencyInAlternateAssets() {
		play.click(btnAlternate, "alternate button");
		play.click(btnCryptoCurrInAlternate, "Crypto currency");
		play.click(txtCryptoCurrency, "Select crypto currency type");
		play.keyboard("ArrowDown");
		play.keyboard("ArrowDown");
		play.keyboard("Enter");
		play.sendKeys(txtAssetUnits, ConfigReader.getValue("assetUnits"), "Asset Unit value");
		play.sendKeys(txtAssetpurchaseamount, ConfigReader.getValue("purchaseamount"), "Asset purchase value");
		// play.sendKeys(txtAssetCurrentamount,
		// ConfigReader.getValue("currentValueAmount"), "Asset current value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void addVintageInAlternateAssets() {
		play.click(btnAlternate, "alternate button");
		play.click(btnvintageInAlteranate, "Vintage/Luxury cars");
		play.sendKeys(txtAssetAmount, ConfigReader.getValue("currentValueAmount"), "Current value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void addOthersInAlternateAssets() {
		play.click(btnAlternate, "alternate button");
		play.click(btnOthersInAlternate, "others");
		play.sendKeys(txtAssetAmount, ConfigReader.getValue("currentValueAmount"), "Current value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void addConsumerLoan() {
		play.click(btnTab, "liabilities button");
		play.click(btnConsumerLoan, "consumer loan button");
		play.sendKeys(txtConsumerLoanAmount, ConfigReader.getValue("consumerLoan"), "Consumer Loan value");
		play.click(txtEndDate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2025", 2, "end date");
		play.clickRoleByLink("16", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void addGuaranteedincomePlan() {
		play.click(btnGuaranteedIncomePlan, "Guaranteed Income Plan");
		play.sendKeys(txtInsurancePremium, ConfigReader.getValue("insurancePremium"), "Insurance Premium value");
		play.sendKeys(txtInsuranceSumAssured, ConfigReader.getValue("insuraceSumAssured"),
				"Insurance sum Assured value");
		play.click(txtEndDateinInsurance, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2025", 4, "end date");
		play.clickRoleByLink("16", "Date");
		play.sendKeys(txtInsuranceSurrendervalue, ConfigReader.getValue("insuranceSurrendervalue"),
				"Insurance Surrender value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void addVehicleInGoal() {
		play.click(btnVehicle, "vehicle button");
		play.sendKeys(txtVehicleLoanAmount, ConfigReader.getValue("vehicelAmount"), "Vehicle amount");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
	}

	public void addInterestIncomeinIncome() {
		play.click(btnInterestIncome, "Interest Income button");
		play.sendKeys(txtINterestINcome, ConfigReader.getValue("interestAmount"), "Interest amount");
		play.click(radioBtnRetirement, "retirement age");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		 play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
		play.click(btnTab, "expenses button");
		play.click(btnHouseRent, "HouseRent");
		play.sendKeys(txtExpenseAmount, ConfigReader.getValue("houseRentAmount"), "House rent");
		play.click("#expensesretirementClassId", "retirement age");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
	}

	public void addGoldInassets() {
		play.click(btnGold, "gold button");
		play.click(btnPhysicalGold, "physical gold button");
		play.sendKeys(txtGoldUnits, ConfigReader.getValue("goldUnits"), "Gold units");
		play.sendKeys(txtGoldPrice, ConfigReader.getValue("goldPrice"), "Gold price");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}

	}

	public void addGoldETFInGoldAssets() {
		play.click(btnGold, "gold button");
		play.click(btnETFInGoldAssets, "ETF");
		play.sendKeys(txtGoldUnits, ConfigReader.getValue("goldUnits"), "Gold units");
		play.sendKeys(txtPurchaseAmountEpf, ConfigReader.getValue("goldPrice"), "Gold price");
		play.sendKeys(txtCurrentAmountEpf, ConfigReader.getValue("goldCurrentPrice"), "Gold current Price");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {
				
			}
	}

	public void addGoldMutFundInGoldAssets() {
		play.click(btnGold, "gold button");
		play.click(btnGoldMutualFundInAssets, "Mutual Fund");

	}

	public void addSovereignGoldAssets() {
		play.click(btnGold, "gold button");
		play.click(btnSovereignBondInAssets, "Sovereign Bond");
		play.sendKeys(txtNoOfGramsInGoldAssets, ConfigReader.getValue("goldUnits"), "Gold units");
		play.sendKeys(txtPurchaseAmountEpf, ConfigReader.getValue("goldPrice"), "Gold price");
		play.sendKeys(txtCurrentAmountEpf, ConfigReader.getValue("goldCurrentPrice"), "Gold current Price");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {
				
			}
	}

	public void addOthersInGoldAssets() {
		play.click(btnGold, "gold button");
		play.click(btnOthersInGoldAssets, "Others");
		play.click(dateDirectvalueStartDate, "start date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2021", 3, "end date");
		play.clickRoleByLink("29", "Date");
		play.sendKeys(txtNoOfgrams, ConfigReader.getValue("goldUnits"), "Gold units");
		//play.sendKeys(txtCurrentValue, ConfigReader.getValue("goldCurrentPrice"), "Gold current Price");
		play.sendKeys(txtKaratsInGold, ConfigReader.getValue("goldkarat"), "Gold karat");
		play.sendKeys(txtTotalInvestAmountInGold, ConfigReader.getValue("goldInvestedAmount"), "Gold invested amount");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {
				
			}
	}

	public void addCreditCardInLiabilities() {
		play.click(btnTab, "liabilities button");
		play.click(txtCreditCard, "Credit card");
		play.sendKeys(txtConsumerLoanAmount, ConfigReader.getValue("creditcard"), "credit card amount");
		play.click(txtEndDate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2024", 2, "end date");
		play.clickRoleByLink("11", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}

	public void addMediclaimInInsurance() {
		play.click(btnMediclaim, "Mediclaim button");
		play.sendKeys(txtInsurancePremium, ConfigReader.getValue("mediclaimPremium"), "Mediclaim Premium Amount");
		play.sendKeys(txtInsuranceSumAssured, ConfigReader.getValue("mediclaimSumAssured"),
				"Mediclaim SumAssured Amount");
		play.click(txtMedicalimEnddate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2026", 3, "end date");
		play.clickRoleByLink("11", "Date");
		play.sendKeys(txtInsuranceTotalMembers, "1", "Insurance Members");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void addFatherinYourFamily() {
		play.click(btnFather, "Father button");
		play.sendKeys(txtFamFirstname, ConfigReader.getValue("spousefirstname"), "First name");
		play.sendKeys(txtFamLastname, ConfigReader.getValue("spouselastname"), "Last name");
		play.click(txtFatherDOB, "Father DOB");
		play.Clickpagebyrole("1975", 2, "year");
		play.clickRoleByLink(txtFamDate, "Date");
		play.click(btnFamSave, "Save button");
		play.click(btnNextInYrFam, "Next Button");

	}

	public void addVacationINGoal() {
		play.click(btnVacationINGoal, "Vacation in Goal");
		play.sendKeys(txtGoalValue, ConfigReader.getValue("vacationgoalvalue"), "GOal current value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
	}

	public void addRentalInIncome() {
		play.click(btnRentalINIncome, "Rental");
		play.sendKeys(txtIncomeValue, ConfigReader.getValue("rentIncome"), "Rent amount");
		play.clickbygettext("#incomeform", "Upto Life Expectancy Age", "Upto Life Expectancy Age");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		play.click(btnTab, "expenses button");
		play.click(btnMedicalINExp, "Medical");
		play.sendKeys(txtExpenseAmount, ConfigReader.getValue("medicalExp"), "Medical expense amount");
		play.clickbygettext("#expensesretirementClassId", "Upto Life Expectancy Age", "Upto Life Expectancy Age");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
	}
	public void addLiquidInAssets() {
		play.click(btnLiquid, "Liquid Button");
		play.click(btnCashBalance, "Cash Balance");
		play.sendKeys(txtCashBalance, ConfigReader.getValue("cashbalance"), "cash balance amount");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		 play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {		
		}
		// play.click(btnTab, "liabilities button");
	}
	public void addBankBalInLiquidAssets() {
		//play.click(btnTab, "liabilities button");
		play.click(btnLiquid, "Liquid Button");
		play.click(btnLiqBankBal, "Bank balance");
		play.sendKeys(txtCashBalance, ConfigReader.getValue("cashbalance"), "cash balance amount");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		 play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
	}
	public void addLiquidFundsInLiquidassets() {
		play.click(btnLiquid, "Liquid Button");
		play.clickbyText(btnLiquidLiqFunds, "Liquid funds");
	}

	public void addOthersInLiquidAssets() {
		play.click(btnLiquid, "Liquid Button");
		play.click(btnLiqOthers, "Others");
		play.click(dateDirectvalueStartDate, "start date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2021", 3, "end date");
		play.clickRoleByLink("29", "Date");
		play.sendKeys(txtDirectValueothers, ConfigReader.getValue("directValue"), "Direct value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");

	}

	public void addHousingInLiabilities() {
		play.click(btnTab, "liabilities button");
		play.click(btnHousin, "Housing");
		play.sendKeys(txtConsumerLoanAmount, ConfigReader.getValue("housing"), "Housing amount");
		play.click(txtEndDate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2025", 2, "end date");
		play.clickRoleByLink("11", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}

	public void addPensionPlaninInsurance() {
		play.click(btnPensionPlan, "Pension Plan");
		play.sendKeys(txtInsurancePremium, ConfigReader.getValue("pensionPremium"), "Pension Premium Amount");
		play.sendKeys(txtInsuranceSumAssured, ConfigReader.getValue("pensionSumAssured"), "Pension SumAssured Amount");
		play.sendKeys(txtInsuranceSurrendervalue, ConfigReader.getValue("insuranceSurrendervalue"),
				"Pesnion Surrender value");
		play.click(txtMedicalimEnddate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2027", 4, "end date");
		play.clickRoleByLink("11", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}

	public void addMotherInFamily() {
		play.click(btnMother, "Mother button");
		play.sendKeys(txtFamFirstname, ConfigReader.getValue("motherfirstname"), "First name");
		play.sendKeys(txtFamLastname, ConfigReader.getValue("motherlastname"), "Last name");
		play.click(txtFatherDOB, "MOther DOB");
		play.Clickpagebyrole("1977", 2, "year");
		play.clickRoleByLink(txtFamDate, "Date");
		play.click(btnFamSave, "Save button");
		play.click(btnNextInYrFam, "Next Button");

	}

	public void addPropertyInGoals() {
		play.click(btnPropertyInGoal, "Property Button");
		play.sendKeys(txtMrrgValue, ConfigReader.getValue("propertyvalue"), "property value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}

	public void addPensionInIncome() {
		play.click(btnPension, "Pension button");
		play.sendKeys(txtIncomeValue, ConfigReader.getValue("pensionvalue"), "pension value");
		play.clickbygettext("#incomeform", "Upto Life Expectancy Age", "Upto Life Expectancy Age");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		play.click(btnTab, "expenses button");
		play.click(btnPostRetirement, "post retirement expense button");
		play.sendKeys(txtExpenseAmount, ConfigReader.getValue("postretirementamount"), "expense value");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		 play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}

	}

	public void addDebtInAssets() {
		play.click(btnDebt, "Debt button");
		play.click(btnFixedDeposit, "Fixed Deposit button");
		play.sendKeys(txtAssetname, ConfigReader.getValue("assetname"), "Asset name");
		play.sendKeys(txtPurchaseAmount, ConfigReader.getValue("purchaseamount"), "purchase amount");
		play.click("#cal_matuarity", "date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2033", 4, "end date");
		play.clickRoleByLink("11", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
		play.clickRoleByButton("Ok", "OK button");}
		catch(Exception e) {
			
		}
	}
	

    public void addDebenturesinDebtAsset()  {
        play.click(btnDebt, "Clicking Debt button");
        play.click(btnDebtDebentures, "clicking on Debentures" );
        play.sendKeys(txtAssetname, ConfigReader.getValue("debassetname"), "Asset name");
        play.sendKeys(txtPurchaseAmount, ConfigReader.getValue("debtpurchaseamount"), "purchase amount");
        play.click(dateDirectvalueStartDate, "start date");
        play.click(yearTxt, "Year");
        play.Clickpagebyrole("2022", 4, "start date");
        play.clickRoleByLink("29", "Date");
        play.click("#cal_matuarity", "date");
        play.click(yearTxt, "Year");
        play.Clickpagebyrole("2033", 4, "end date");
        play.clickRoleByLink("11", "Date");
        play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
    }
    public void addMutualFundsinDebtAsset()   {
        play.click(btnDebt, "Clicking Debt button");
        play.click(btnDebtMutualFunds, "clicking on Mutual funds" );
    }
    public void addEPFinDebtAsset() {
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtEPF, "clicking on EPF" );
}
    public void addGratuityinDebtAsset()
       {
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtGratuity, "clicking on Gratuity" );
           play.sendKeys(txtAssetname, ConfigReader.getValue("gratuityassetname"), "Asset name");
           play.click(txtAssetname, "Clicking month sal");
           play.sendKeys(txtdebtCurrentUnitPrice, ConfigReader.getValue("deptcurrentunitprice"), "Month sal");
          play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
 }
    public void addGovtBondinDebtAsset(){
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtGovtBond, "clicking on GovtBond" );
           play.sendKeys(txtAssetname, ConfigReader.getValue("govbondassetname"), "Asset name");
           play.sendKeys(txtPurchaseAmount, ConfigReader.getValue("debtpurchaseamount"), "purchase amount");
           play.click(dateDirectvalueStartDate, "start date");
        play.click(yearTxt, "Year");
        play.Clickpagebyrole("2022", 4, "start date");
        play.clickRoleByLink("29", "Date");
        play.click("#cal_matuarity", "date");
        play.click(yearTxt, "Year");
        play.Clickpagebyrole("2033", 4, "end date");
        play.clickRoleByLink("11", "Date");
        play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }
    public void addGovtSchemeinDebtAsset()  {
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtGovtScheme, "clicking on GovtScheme" );
           play.sendKeys(txtAssetname, ConfigReader.getValue("govschassetname"), "Asset name");
       play.sendKeys(txtPurchaseAmount, ConfigReader.getValue("debtpurchaseamount"), "purchase amount");
           play.click(dateDirectvalueStartDate, "start date");
        play.click(yearTxt, "Year");
        play.Clickpagebyrole("2022", 4, "start date");
        play.clickRoleByLink("29", "Date");
        play.click("#cal_matuarity", "date");
        play.click(yearTxt, "Year");
        play.Clickpagebyrole("2033", 4, "end date");
        play.clickRoleByLink("11", "Date");
        play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }
    public void addNPSinDebtAsset()  {
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtNPS, "clicking on NPS" );
           play.sendKeys(Assetname, ConfigReader.getValue("nspassetname"), "Asset name");
           play.sendKeys(txtdebtCurrentUnitPrice, ConfigReader.getValue("deptcurrentunitprice") , "entering current price");
           play.sendKeys(txtinvestAmount, ConfigReader.getValue("debtinvestamount"), "Entering investamount" );     
           play.click(halfyearlyop, "clicking on half yearly pay");
           play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }
    public void addNSCKVPinDebtAsset() {
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtNSCKVP, "clicking on NSCKVP" );
           play.sendKeys(Assetname, ConfigReader.getValue("nsckvpassetname"), "Asset name");
           play.sendKeys(txtPurchaseAmount, ConfigReader.getValue("debtpurchaseamount"), "purchase amount");
           play.click(dateDirectvalueStartDate, "start date");
        play.click(yearTxt, "Year");
        play.Clickpagebyrole("2021", 3, "start date");
        play.clickRoleByLink("29", "Date");
        play.click("#cal_matuarity", "date");
        play.click(yearTxt, "Year");
        play.Clickpagebyrole("2028", 3, "end date");
        play.clickRoleByLink("11", "Date");
        play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }
    public void addPensionSchemeinDebtAsset()  {
        play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtPensionScheme, "clicking on PensionSchem" );
           play.sendKeys(Assetname, ConfigReader.getValue("pensionschassetname"), "Asset name");
           play.click(txtdebtCurrentUnitPrice, "Clicking on unit price");
           play.sendKeys(txtdebtCurrentUnitPrice, ConfigReader.getValue("deptcurrentunitprice") , "entering current price");
           play.click(txtdebtinvestAmount, "click on invest ");
           play.sendKeys(txtdebtinvestAmount, ConfigReader.getValue("debtinvestamount"), "Entering investamount" );
           play.click(halfyearlyop, "clicking on half yearly pay");
           play.click(Retireentop, "Clicking on retirement option");
        play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }
    public void addPostOfficeSchinDebtAsset()  {
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtPostOfficeSch, "clicking on PostOfficeSch" );
           play.sendKeys(Assetname, ConfigReader.getValue("postschassetname"), "Asset name");
           play.sendKeys(txtinvestAmount, ConfigReader.getValue("debtpurchaseamount"), "purchase amount");
        play.click("#cal_matuarity", "date");
        play.click(yearTxt, "Year");
        play.Clickpagebyrole("2033", 4, "end date");
        play.clickRoleByLink("11", "Date");
        play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }
    public void addOthersinDebtAsset()  {
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtOthers, "clicking on Others" );
           play.sendKeys(Assetname, ConfigReader.getValue("otherdebtassetname"), "Asset name");
           play.sendKeys(txtinvestAmount, ConfigReader.getValue("debtpurchaseamount"), "purchase amount");
           play.click("#cal_matuarity", "date");
           play.click(yearTxt, "Year");
           play.Clickpagebyrole("2033", 4, "end date");
           play.clickRoleByLink("11", "Date");
           play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }

    public void addSukanyaSamriddhiYojanainDebtAsset()   {
    	play.click(btnDebt, "Clicking Debt button");
    	play.click(btnDebtSukanyaSamriddhiYojana, "clicking on SukanyaSamriddhiYojana" );
        play.sendKeys(Assetname, ConfigReader.getValue("ssydebtassetname"), "Asset name");
           play.sendKeys(txtdebtCurrentUnitPrice, ConfigReader.getValue("deptcurrentunitprice") , "entering current price");
           play.sendKeys(txtdebtinvestAmount, ConfigReader.getValue("debtinvestamount"), "Entering investamount" );
           play.click(halfyearlyop, "clicking on half yearly pay");
           play.click(Retireentop, "Clicking on retirement option");
           play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }
    public void addRecurringDepositinDebtAsset() {
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtRecurringDeposit, "clicking on RecurringDeposit" );
           play.sendKeys(Assetname, ConfigReader.getValue("recurrdebtassetname"), "Asset name");
           play.sendKeys(txtdebtCurrentUnitPrice, ConfigReader.getValue("deptcurrentunitprice") , "entering current price");
           play.sendKeys(txtdebtinvestAmount, ConfigReader.getValue("debtinvestamount"), "Entering investamount" );
           play.click(halfyearlyop, "clicking on half yearly pay");
           play.click(Retireentop, "Clicking on retirement option");
           play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }
    public void addPPFGPFVPFinDebtAsset() {
           play.click(btnDebt, "Clicking Debt button");
           play.click(btnDebtPPFGPFVPF, "clicking on PPFGPFVPF" );
           play.sendKeys(Assetname, ConfigReader.getValue("ppfvpfgpfdebtassetname"), "Asset name");
           play.sendKeys(txtdebtCurrentUnitPrice, ConfigReader.getValue("deptcurrentunitprice") , "entering current price");
           play.sendKeys(txtdebtinvestAmount, ConfigReader.getValue("debtinvestamount"), "Entering investamount" );
           play.click(halfyearlyop, "clicking on half yearly pay");
           play.click(Retireentop, "Clicking on retirement option");
           play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
       }
	public void addBusinessLoaninLiabilities() {
		play.click(btnTab, "liabilities button");
		play.click(btnBusinessLoan, "Business Loan");
		play.sendKeys(txtConsumerLoanAmount, ConfigReader.getValue("consumerLoan"), "Business Loan value");
		play.click(txtEndDate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2025", 2, "end date");
		play.clickRoleByLink("16", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}

	public void addEndowment() {
		play.click(btnEndowment, "Endowment button");
		play.sendKeys(txtInsurancePremium, ConfigReader.getValue("pensionPremium"), "endowment Premium Amount");
		play.sendKeys(txtInsuranceSumAssured, ConfigReader.getValue("pensionSumAssured"),
				"endowment SumAssured Amount");
		play.sendKeys(txtInsuranceSurrendervalue, ConfigReader.getValue("insuranceSurrendervalue"),
				"endowment Surrender value");
		play.click(txtMedicalimEnddate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2027", 4, "end date");
		play.clickRoleByLink("11", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}
	// ==========================Education===============
	public void clickEducationInGoals() {
		play.click(btnEducation, "Education");
		play.sendKeys(edu_current_value, ConfigReader.getValue("goalValue"), "goal value");
		play.click(type_of_edu, "Type of education dropdown");
        play.keyboardActions("ArrowDown");
        play.ArrowDown(1);
        play.keyboardActions("Enter");
		play.click(btnGoalSave, "save button in goal");
	}
	// =====================Income Business=====================//
	public void incomeBusinessDetails() throws InterruptedException {
		play.click(btnBusiness, "Business");
		play.sendKeys(txtIncomeValue, ConfigReader.getValue("income"), "Income value");
		play.click(incEndDate, "End date");
		play.click(incEndYear, "Year");
		play.click(incSelectEndDate, "Slect end date");
		play.click(radioBtnRetirement, "retirement age");
		play.click(btnSaveInIncome, "save button");
		play.click(btnTab, "Expenses");
		play.click(btnEduExpense, "Education Expenses");
		play.sendKeys(btnExpenseValue, ConfigReader.getValue("EducationExpenses"), "Education expenses");
		play.clickbygettext("#expensesretirementClassId", "Upto Retirement Age", "retirement age");
		play.click(btnsaveinExpenses, "save button");
		try {
		play.clickRoleByLink("Continue ", "continue button");}
		catch(Exception e) {
			
		}
	}
	public void assestsEquity() {
		play.click(btnEquity, "Equity");
		play.click(btnFutureOptions, "Future and options");
		play.click(dateOfPurchase, "Date of purchase");
		play.click(july5date, "July 5");
		play.sendKeys(noOfShares, ConfigReader.getValue("NoOfShares"), "No of Shares");
		play.sendKeys(avgBuyPrice, ConfigReader.getValue("avgPrice"), "Avg price");
		play.sendKeys(currentPrice, ConfigReader.getValue("currentPrice"), "Current Price");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {			
			}
		// play.click(btnTab, "liabilities button");
	}
	public void assetsEquityUnlisted() {
		play.click(btnEquity, "Equity");
		play.click(btnEquUnListed, "Unlisted AIF Equity");
		play.click(dateOfPurchase, "Date of purchase");
		play.click(july5date, "July 5");
		play.sendKeys(noOfShares, ConfigReader.getValue("NoOfShares"), "No of Shares");
		play.sendKeys(avgBuyPrice, ConfigReader.getValue("avgPrice"), "Avg price");
		play.sendKeys(currentPrice, ConfigReader.getValue("currentPrice"), "Current Price");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {			
			}	
	}
	public void assetsEquityUS_Equity() throws InterruptedException {
		play.click(btnEquity, "Equity");
		play.click(btnEquUSEquity, "US Equity");
		play.click(selectEquityShare, "Select Equity share type");
		play.keyboard("ArrowDown");
		play.keyboard("ArrowDown");
		play.keyboard("ArrowDown");
		//Thread.sleep(2000);
		play.keyboard("Enter");
		Thread.sleep(2000);
		play.click(dateDirectvalueStartDate, "start date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2021", 3, "end date");
		play.clickRoleByLink("29", "Date");
		play.sendKeys(noOfShares, ConfigReader.getValue("NoOfShares"), "No of Shares");
		play.sendKeys(txtAvgBuyPrice, ConfigReader.getValue("avgPrice"), "Avg price");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {			
			}
	}
	public void assetsEquityPMS() {
		play.click(btnEquity, "Equity");
		play.click(btnEquPms, "PMS");
		play.click(dateDirectvalueStartDate, "start date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2021", 3, "end date");
		play.clickRoleByLink("29", "Date");
		play.sendKeys(noOfShares, ConfigReader.getValue("NoOfShares"), "No of Shares");
		play.sendKeys(avgBuyPrice, ConfigReader.getValue("avgPrice"), "Avg price");
		play.sendKeys(currentPrice, ConfigReader.getValue("currentPrice"), "Current Price");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {			
			}
	}
	public void assetsEquityEquityShares() {
		play.click(btnEquity, "Equity");
		play.click(btnEquShares, "Equity Shares");
	}
	public void assetsEquityEquMutualFund() {
		play.click(btnEquity, "Equity");
		play.click(btnEquEquMutualFund, "Equity Mutual Fund");
	}

	public void assetsEquityESOp() {
		play.click(btnEquity, "Equity");
		play.click(btnEquEsop, "ESOP's");
		play.click(dateDirectvalueStartDate, "start date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2021", 3, "end date");
		play.clickRoleByLink("29", "Date");
		play.sendKeys(noOfShares, ConfigReader.getValue("NoOfShares"), "No of Shares");
		play.sendKeys(avgBuyPrice, ConfigReader.getValue("avgPrice"), "Avg price");
		play.sendKeys(currentPrice, ConfigReader.getValue("currentPrice"), "Current Price");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {			
			}
	}
	public void assetsEquityOthers() {
		play.click(btnEquity, "Equity");
		play.click(btnEquOthers, "Others");
		play.click(dateDirectvalueStartDate, "start date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2021", 3, "end date");
		play.clickRoleByLink("29", "Date");
		play.sendKeys(noOfShares, ConfigReader.getValue("NoOfShares"), "No of Shares");
		play.sendKeys(avgBuyPrice, ConfigReader.getValue("avgPrice"), "Avg price");
		play.sendKeys(currentPrice, ConfigReader.getValue("currentPrice"), "Current Price");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		try {
			play.clickRoleByButton("Ok", "OK button");}
			catch(Exception e) {			
			}
	}
	public void personalLoanLiabilities() {
		play.click(btnTab, "liabilities button");
		play.click(btnPersonalLoan, "Personal loan");
		play.sendKeys(txtConsumerLoanAmount, ConfigReader.getValue("personalLoan"), "Personal loan anount");
		play.click(txtEndDate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2024", 2, "end date");
		play.clickRoleByLink("11", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}
	public void insuranceOthers() {
		play.click(btnOthersInsurance, "Others button");
		play.sendKeys(txtInsurancePremium, ConfigReader.getValue("othersPremiumAmount"), "Others Premium Amount");
		play.sendKeys(txtInsuranceSumAssured, ConfigReader.getValue("othersSumAssured"), "Others SumAssured Amount");
		play.click(txtMedicalimEnddate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2026", 4, "year");
		play.clickRoleByLink("29", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}
	public void familyDetailsOfSon() {
		play.click(btnSon, "Son");
		play.sendKeys(txtFamFirstname, ConfigReader.getValue("sonfirstname"), "First name");
		play.sendKeys(txtFamLastname, ConfigReader.getValue("sonlastname"), "Last name");
		play.click(txtSonDOB, "Son DOB");
		play.Clickpagebyrole("2012", 2, "year");
		play.Clickpagebyrole("9", 1, "Month");
		play.clickRoleByLink(txtFamDate, "Date");
		play.click(btnFamSave, "Save button");
		play.click(btnNextInYrFam, "Next Button");
	}
	public void familyOtherDetails() {
		play.click(btnFamOthers, "Others");
		play.sendKeys(txtFamFirstname, ConfigReader.getValue("othersfirstname"), "First name");
		play.sendKeys(txtFamOthLastname, ConfigReader.getValue("otherslastname"), "Last name");
		play.click(txtSonDOB, "Others DOB");
		play.Clickpagebyrole("2011", 2, "year");
		play.clickRoleByLink(txtFamDate, "Date");
		play.click(btnFamSave, "Save button");
		play.click(btnNextInYrFam, "Next Button");
	}
	public void goalOthersBtn() {
		play.click(btnGoalsOthers, "Others");
		play.sendKeys(txtOthersGoalValue, ConfigReader.getValue("othersgoalamount"), "Others goal amount");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}
	public void incomeOther() {
		play.click(btnOther, "Other");
		play.sendKeys(txtIncomeValue, ConfigReader.getValue("income"), "Income value");
		play.click(btnSaveInIncome, "save button");
		play.click(btnTab, "Expenses");
		play.click(btnCludMembership, "Education Expenses");
		play.sendKeys(btnExpenseValue, ConfigReader.getValue("EducationExpenses"), "Education expenses");
		play.click(btnsaveinExpenses, "save button");
		play.clickRoleByLink("Continue ", "continue button");
	}
	public void assestsOthers() {
		play.click(btnAssestsothers, "Assests Others");
		play.sendKeys(txtAssetsNameOthers, ConfigReader.getValue("assetsname"), "Others");
		play.sendKeys(txtOthersCurrentBal, ConfigReader.getValue("currentbalance"), "Current balance");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
		//play.click(btnTab, "liabilities button");
	}
	public void liabilitiesOtherPropertyLoan() {
		play.click(btnTab, "liabilities button");
		play.click(btnLiabOtherProLoan, "Other property loan");
		play.sendKeys(txtConsumerLoanAmount, ConfigReader.getValue("otherpropertyloan"), "Other property loan amount");
		play.click(txtEndDate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2024", 2, "end date");
		play.clickRoleByLink("11", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}
	public void insuranceTermPlan() {
		play.click(btnTermPlan, "term Plan");
		play.sendKeys(txtInsurancePremium, ConfigReader.getValue("termPlanPremium"), "Term Plan Premium Amount");
		play.sendKeys(txtInsuranceSumAssured, ConfigReader.getValue("termPlanSumAssured"),
				"Term Plan SumAssured Amount");
		play.click(txtMedicalimEnddate, "end date");
		play.click(yearTxt, "Year");
		play.Clickpagebyrole("2026", 3, "end date");
		play.clickRoleByLink("11", "Date");
		play.clickRoleByButton(btnSaveInInsurance, "save and add more button");
	}
	public void introduction() {
		play.clickRoleByLink(btnnextINgenrep, "next button");
		play.clickRoleByLink(btninflamation, "next button");
		play.clickRoleByLink(btnGlossary, "next button");
		play.clickRoleByLink(btnDisclaimer, "next button");
		play.clickRoleByLink(btnnextINgenrep, "next button");
	}
	public void yourprofile() {
		play.click(btnYrProfile, "your profile button");
	}
	public void profilevalidation() {
		String pan = play.getText(txtPAN);
		Assert.assertEquals(pan, ConfigReader.getValue("pannumber"));
		String retirement = play.getText(txtRetirmntAge);
		Assert.assertEquals(retirement, ConfigReader.getValue("retirementAge"));
		String lifeexpectancy = play.getText(txtLifExpctnyAge);
		Assert.assertEquals(lifeexpectancy, ConfigReader.getValue("lifeExpectancy"));
	}
	public void aboutYourfamily() {
		play.clickRoleByLink(btnAboutYourFamily, "about your family button");
	}
	public void famdetailsValidation() {
		String daughter = play.getText(txtdaughtervalid);
		String aftertrim = daughter.trim();
		Assert.assertEquals(aftertrim, "Daughter");
	}
}
