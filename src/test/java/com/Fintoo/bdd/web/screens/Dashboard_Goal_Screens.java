package com.Fintoo.bdd.web.screens;

import com.Fintoo.bdd.ccl.PlayActions;
import com.Fintoo.bdd.integrations.common_utils.ConfigReader;

public class Dashboard_Goal_Screens {
	PlayActions play = new PlayActions();

	String verifyHP = "//div[text()='Your Score card']";
	String btnCashFlow = "//div[text()='CASHFLOW']";
	String btnGrossFlow = "//a[text()='Gross - Inflow & Outflow']";
	String verifyCategorySalaryAndbonus = "//td[text()=\"Salary & Bonus\"]";
	String verifyNameOfholder = "//td[text()='abc dummy']";
	String verifyIncNameSalaryAndBonus = "//td[contains(text(),\"Salary & Bonus\")][2]";
	String verifyFreqMonthly = "(//td[text()=\"Salary & Bonus\"])[2]/following-sibling::td[text()='Monthly']";
	String verifyMonthlyAmount = "//td[text()='Monthly']/following-sibling::td[text()='1,00,000']";
	String verifyYTDAmount = "//td[text()='Monthly']/following-sibling::td[text()='5,00,000']";
	String verifyAnnualAmount = "//td[text()='Monthly']/following-sibling::td[text()='13,20,000']";
	String verifyGOFParticularManditoryFixed = "//strong[text()=' Mandatory Fixed ']";
	String verifyGOFParticularMandtryVariable = "//strong[text()=' Mandatory Variable ']";
	String verifyGOFExpnameCarLoan = "//td[text()='Car Loan']";
	String verifyGOFExpnameHousehold = "//td[text()='Household Expenses']";
	String verifyMandtFixedFrequMonthly = "//td[text()='1']";
	String verifyMandtVarFreqMonthly = "//td[text()='Monthly']/ancestor::tbody[@class='Boredernone']";
	String verifyMandtFixedMonthlyAmount = "//td[text()='102']";
	String verifyMandtVarMonthlyAmount = "//td[text()='20,000']";
	String verifyYTDMandtFixedAmt = "//td[text()='512']";
	String verifyYTDMandtVarAmt = "//td[text()='1,00,000']";
	String verifyMandtFixedAnnualAmt = "//td[text()='1,229']";
	String verifyMandtVarAnnualAmt = "//td[text()='2,56,800']";
	String btnGoal = "(//a[text()='Goal Analysis']/child::img)[1]";
	String verfiyGoalNameEmg = "//td[text()='Emergency']/preceding-sibling::td[text()='Emergency']";
	String verifyCategEmg = "//td[text()='Emergency']/following-sibling::td[text()='Emergency']";
	String verifyEmgPriority = "//td[text()='Emergency']/following-sibling::td[text()='Very High']";
	String verifyEmgFreq = "//td[text()='Emergency']/following-sibling::td[text()='One-time']";
	String verifyEmgYear = "//td[text()='Emergency']/following-sibling::td[text()='2023']";
	String verifyPresentValue = "//td[text()='Emergency']/following-sibling::td[text()='2,00,000'][1]";
	String verifyCumulativeValue = "//td[text()='Emergency']/following-sibling::td[text()='2,00,000'][2]";
	String verifyFutureValue = "//td[text()='Emergency']/following-sibling::td[text()='2,00,000'][3]";
	String verifyEmgInflation = "//td[text()='Emergency']/following-sibling::td[text()='6.00']";
	String verifyContigencyGoal = "//td[text()='Contingency Goal']";
	String verifyContigencyCatg = "//td[text()='Contingency']";
	String verifyContigencyPriority = "//td[text()='Contingency']/following-sibling::td[text()='Very High']";
	String verifyContigencyFreq = "//td[text()='Contingency']/following-sibling::td[text()='One-time']";
	String verifyContigencyGoalyear = "//td[text()='Contingency']/following-sibling::td[text()='2023']";
	String verifyContigencyPresentValue = "//td[text()='Contingency']/following-sibling::td[text()='1,20,410'][1]";
	String verifyContigencyCumulativeValue = "//td[text()='Contingency']/following-sibling::td[text()='1,20,410'][2]";
	String verifyContigencyFutValue = "//td[text()='Contingency']/following-sibling::td[text()='0'][1]";
	String verifyContigecyInfValue = "//td[text()='Contingency']/following-sibling::td[text()='0'][2]";
	String verifyRetirementGoal = "//td[text()='Retirement Goal']";
	String verifyRetirementCatg = "//td[text()='Retirement']";
	String verfiyRetirementPriority = "//td[text()='Retirement']/following-sibling::td[text()='Very High']";
	String verifyRetirementFreq = "//td[text()='Retirement']/following-sibling::td[text()='One-time']";
	String verifyRetirementYear = "//td[text()='2056']";
	String verifyRetirementPresentValue = "//td[text()='Retirement']/following-sibling::td[text()='0'][1]";
	String verifyRetirementCumulativeValue = "//td[text()='Retirement']/following-sibling::td[text()='0'][2]";
	String verifyRetirementFutureValue = "//td[text()='Retirement']/following-sibling::td[text()='0'][3]";
	String verifyRetirementInfVal = "//td[text()='5'][1]";
	String verifyTotalGoalAmt = "//td[text()='Total Goal Amount']";
	String verifyPresentTotalAmt = "//td[text()='Total Goal Amount']/following-sibling::td[text()='3,20,410'][1]";
	String verifyCumuTotalAmt = "//td[text()='Total Goal Amount']/following-sibling::td[text()='3,20,410'][2]";
	String verifyTotalFutPlanAmt = "//td[text()='Total Goal Amount']/following-sibling::td[text()='2,00,000']";
	String verifyEmgGoalAsset = "(//td[text()='abc dummy'])[1]";
	String btnGoalAssetmapping = "//div[text()='GOAL ASSET MAPPING']/parent::div";
	String verifyGoalAssetFutval = "(//td[text()='abc dummy'])[1]/following-sibling::td[text()='2,00,000']";
	String verifyGoalLinkedAsset = "(//td[text()='abc dummy'])[1]/following::span[text()='No Assets Linked'][1]";
	String verifyGoallinkedfutval = "(//td[text()='abc dummy'])[1]/following::td[text()='0'][1]";
	String verifyGoalSurplus = "(//td[text()='2,00,000'])[1]";
	String verifyContigencyGoalAsset = "(//td[text()='family'])";
	String verifyContigGoalFutVal = "(//td[text()='Goal Value (₹)']/following::td[text()='1,20,410'])[1]";
	String verifyContigLinkedAsset = "(//td[text()='family']/following::span[text()='No Assets Linked'])[1]";
	String verifyContigGoalLinkedFutVal = "(//td[text()='family']/following::td[text()='0'])[1]";
	String verifyContigGoalSurplus = "(//td[text()='family']/following::td[text()='1,20,410'])[1]";
	String verifyGoalAssetTotalAmt = "(//td[text()='Total Goal Amount']/following-sibling::td[text()='3,20,410'])[1]";
	String verifyGoalAssetTotalSurPlus = "(//td[text()='3,20,410'])";
	String verifyGoalAssetTotallinkedAsset = "(//td[text()='3,20,410']/following-sibling::td[text()='0'])";
	String btnAssetGoalMapping = "//div[text()='ASSET GOAL MAPPING']";
	String verifyAssetName = "//td[text()='Agricultural land']";
	String verifyAssetCategory = "//td[text()='Real Estate']";
	String verifyAssetSubCatg = "//td[text()='Agriculture Land']";
	String verfiyAssetHolderNAme = "//td[text()='Abc Dummy']";
	String verifyAssetLinkedtype = "//td[text()='Unlinked']";
	String verifyAssetCur_MaturityVal = "//td[text()='10,00,000']";
    String btnAssetGoalMappingAnalysis="//div[text()='GOAL ASSET MAPPING ANALYSIS']";
    String verifyMappingPresentVal="//div[text()='Present Value']";
    String verifyMappingPresentAmt="(//div[text()='Present Value']/following::b[text()='2,00,000'])[1]";
    String verifyMappingFutAmt="(//div[text()='Goal Future Value']/following::b[text()='2,00,000'])[1]";
    String verifyMappingFutValtxt="//div[text()='Goal Future Value']";
    String verifyMappingYearTxt="(//div[text()='Goal Year'])";
    String verifyMappingYearDate="(//b[text()=\"13-07-2023\"])";
    String verifyTxtInfaltion="//div[text()='Inflation']";
    String verifyMappingInflationPerc="//b[text()=\"6.00\"]";
    String verifyMappingLinkedAsset="//td[text()=\" ( Gross Total - Goal Future Value )\"]";
    String verifyMappingLinkedAssetFutureValue="//td[text()=\" ( Gross Total - Goal Future Value )\"]/following::td[text()='2,00,000'][1]";
    String btnWhatif="//a[text()='//div[text()='WHAT IF ANALYSIS']";
    String btnRetirementPlanning="(//a[text()='Retirement Planning']/child::img)[1]";
    String verifyPartPlannedRetrAgetxt="//td[text()='Planned Retirement age']";
    String verifyPartPlannedRetrAge="(//th[text()='Self']/following::td[text()='60'])[1]";
    String verifyTxtLifeExpecAge="(//td[text()='Life Expectancy age'])";
    String verifyLifeExpecAge="(//td[text()='Life Expectancy age']/following::td[text()='80'])[1]";
    String btnRetirementCorpus="//div[text()='RETIREMENT CORPUS']";
    String verifyTxtCompleteRetiremntExpenses="//div[text()='RETIREMENT CORPUS']/following::a[text()='Complete Retirement expense']";
    String btnCashFlowInRet="//div[text()='CASHFLOW']";
    String btnActualCashFlow="(//a[text()='Actual Cashflow'])";
    String btnFintooRecommendations="(//a[text()='Fintoo Recommends Cashflow'])";
    String verFintooRecYear="(//td[text()='2056'])[2]";
    String verFintooRecAge="(//td[text()='60'])[2]";
    String btnSavingDeflict="//a[text()='Saving - Deficit']";
    String verifyTtlGrossInflowType="//td[text()='Total Gross Inflow']";
    String verifyTflGrossOutflowType="//td[text()='Total Gross Outflow']";
    String vfyGrossInflowMonthlyAmt="//td[text()='Total Gross Inflow']/following::td[text()='1,00,000']";
    String vfyGrossInflowYTdAmt="//td[text()='Total Gross Inflow']/following::td[text()='5,00,000']";
    String vfyGrossInflowAnnualAmt="//td[text()='Total Gross Inflow']/following::td[text()='13,20,000']";
    String vfyGrossoutflowMonthlyAmt="(//td[text()='Total Gross Outflow']/following::td[text()='20,102'])";
    String vfyGrossOufFlowYTdAmt="(//td[text()='Total Gross Outflow']/following::td[text()='1,00,511'])";
    String vfyGrossOutFLowAnnualAmt="(//td[text()='Total Gross Outflow']/following::td[text()='2,58,028'])";
    String VfyTotalSavgMonthly="(//td[text()='79,898'])";
    String vfyTotalSavgYtdAmt="(//td[text()='3,99,489'])";
    String vfytotalSavngAnnualAmt="(//td[text()='10,61,972'])";
    String vfyExctngCategory="//td[text()='Insurance']";
    String vfyExctngName="//td[text()='Insurance']/following-sibling::td[text()='General']";
    String vfyExctngNameofholder="//td[text()='Insurance']/following::td[text()='abc dummy']";
    String vfyExctngFreqMonthly="//td[text()='Insurance']/following::td[text()='Monthly']";
    String vfyExctngCommtdInv="(//td[text()='Insurance']/following::td[text()='10,000'])[1]";
    String vfyExctngYtdAmt="(//td[text()='Insurance']/following::td[text()='50,000'])[1]";
    String vfyExctngAnnualAmt="(//td[text()='Insurance']/following::td[text()='1,20,000'])[1]";
    String vfyExctngGrossTotalInvest="(//td[text()='Gross total']/following::td[text()='10,000'])[1]";
    String vfyExctngGrossTotalYtdAmt="(//td[text()='Gross total']/following::td[text()='50,000'])[1]";
    String vfyExctngGrossTotalAnnualAmt="(//td[text()='Gross total']/following::td[text()='1,20,000'])[1]";
    String vfyInvestSurplusType1="//span[text()=\"Saving ( A )\"]";
    String vfyInvestSurplusType1MonthlyAmt="(//td[text()='3,99,489']/preceding-sibling::td[text()='79,898'])[2]";
    String vfyInvestSurplusType1YtdAmt="(//td[text()='3,99,489'])[2]";
    String vfyInvestSurplusType1AnuualAmt="(//td[text()='10,61,972'])[2]";
    String vfyInvestSurplusType2="//span[text()=\"Existing Insurance & investment Commitment ( B )\"]";
    String vfyInvestSurplusType2MonthlyAmt="//span[text()='10,000']";
    String vfyInvestSurplusType2YtdAmt="//span[text()='50,000']";
    String vfyInvestSurplusType2AnuualAmt="//span[text()='1,20,000']";
    String vfyInvestTotaltxt="//b[text()=\"Net Investable Surplus ( A - B )\"]";
    String vfyInvestTotalMonthly="//td[text()='69,898']";
    String vfyInvestTotalYtdAmt="//td[text()='3,49,489']";
    String vfyInvestTotalAnnualAmt="//td[text()='9,41,972']";
    String btnScorecard="//div[text()='SCORECARD']";
    String vfyScoreratiotxt="//h4[text()='Saving ratio']";
    String vfySAvingratio="//h4[text()='Saving ratio']/following::span[text()=\"20\"][1]";
    String vfySAvingsTotalIncome="//p[text()=\"₹3.99 Lac\"]";
    String vfySavingTotalPer="//p[text()=\"80\"]";
    String vfyExpenseRatiotxt="//h4[text()='Expense ratio']";
    String vfyExpenseRatio="//h4[text()='Expense ratio']/following::span[text()='20']";
    String vfyExpenseTotalIncome="//p[text()=\"₹1.01 Lac\"]";
    String vfyExpenseTotalPer="//p[text()='20']";
    String vfyNetworktxt="//h4[text()='Networth ratio']";
    String vfyNetworkRatio="//span[text()='5']";
    String vfyNetworkTotalInctxt="//p[text()='Total assets - Total liabilities']";
    String vfyNetworkTotalInc="//p[text()=\"₹10 Lac\"]";
    String vfyNetworkTotalPer="//p[text()=\"₹9.90 Lac\"]";
    String vfyLiquRatioTxt="//h4[text()='Liquidity ratio']";
    String vfyLiquRatioScore="//h4[text()='Liquidity ratio']/following::span[text()='0']";
    String vfyLiquRatioTotaltxt="//p[text()='Assets / Expenses required']";
    String vfyLiquTotalAmt="//p[text()=\"₹20.10 K\"]";
    String vfySolRatiotxt="//h4[text()='Solvency ratio']";
    String vfySolvRatioScore="//span[text()='15']";
    String vfySolvTotalTx="//p[text()='NetWorth / Total assets']";
    String vfySolvTotalAmt="//p[text()=\"₹9.90 Lac\"]";
    String vfySolvPer="//p[text()='99']";
    

	public void verifyHomePage(String string) {
		play.verifyText(play.getText(verifyHP), string);

	}

	public void clickCashFlowBtn() {
		play.click(btnCashFlow, "Cash Flow");
	}

	public void verifyGrossInFlowDetails() {
		play.verifyText(play.getText(verifyCategorySalaryAndbonus), ConfigReader.getValue("category"));
		play.verifyText(play.getText(verifyNameOfholder), ConfigReader.getValue("nameOfHolder"));
		play.verifyText(play.getText(verifyIncNameSalaryAndBonus), ConfigReader.getValue("incomename"));
		play.verifyText(play.getText(verifyFreqMonthly), ConfigReader.getValue("frequency"));
		play.verifyText(play.getText(verifyMonthlyAmount), ConfigReader.getValue("monthlyamount"));
		play.verifyText(play.getText(verifyYTDAmount), ConfigReader.getValue("ytdAmount"));
		play.verifyText(play.getText(verifyAnnualAmount), ConfigReader.getValue("annualAmount"));
	}

	public void verifyGrossOutFlowDetails() {
		play.verifyText(play.getText(verifyGOFParticularManditoryFixed), " Mandatory Fixed ");
		play.verifyText(play.getText(verifyNameOfholder), ConfigReader.getValue("nameOfHolder"));
		play.verifyText(play.getText(verifyGOFParticularMandtryVariable), " Mandatory Variable ");
		play.verifyText(play.getText(verifyNameOfholder), ConfigReader.getValue("nameOfHolder"));
		play.verifyText(play.getText(verifyGOFExpnameCarLoan), ConfigReader.getValue("expensename1"));
		play.verifyText(play.getText(verifyGOFExpnameHousehold), ConfigReader.getValue("expensename2"));
		play.getText(verifyMandtFixedFrequMonthly);
		play.getText(verifyMandtVarFreqMonthly);
		play.verifyText(play.getText(verifyMandtFixedMonthlyAmount), ConfigReader.getValue("mandFixedAmt"));
		play.verifyText(play.getText(verifyMandtVarMonthlyAmount), ConfigReader.getValue("mandVarAmount"));
		play.verifyText(play.getText(verifyYTDMandtFixedAmt), ConfigReader.getValue("ytdFixedAmt"));
		play.verifyText(play.getText(verifyYTDMandtVarAmt), ConfigReader.getValue("ytdVarAmount"));
		play.verifyText(play.getText(verifyMandtFixedAnnualAmt), ConfigReader.getValue("mandFixedAnnualAmt"));
		play.verifyText(play.getText(verifyMandtVarAnnualAmt), ConfigReader.getValue("mandVarAnnualAmount"));
	}
	public void btnSavingDeflcit() {
		play.click(btnSavingDeflict, "Saving Deflcit");
		
	}
	public void validateSavingDeflictGrossInflowAndOutFlow() {
		play.verifyText(play.getText(verifyTtlGrossInflowType), ConfigReader.getValue("savingDefType1"));
		play.verifyText(play.getText(vfyGrossInflowMonthlyAmt), ConfigReader.getValue("savingDefInflowMonthlyAmt"));
		play.verifyText(play.getText(vfyGrossInflowYTdAmt), ConfigReader.getValue("savingDefInflowYTdAmt"));
		play.verifyText(play.getText(vfyGrossInflowAnnualAmt), ConfigReader.getValue("savingDefInflowAnnualAmt"));
		play.verifyText(play.getText(verifyTflGrossOutflowType), ConfigReader.getValue("savingDefType2"));
		play.verifyText(play.getText(vfyGrossoutflowMonthlyAmt), ConfigReader.getValue("savingDefOutFlowMonthlyAmt"));
		play.verifyText(play.getText(vfyGrossOufFlowYTdAmt), ConfigReader.getValue("savingDefOutflowYtdAmt"));
		play.verifyText(play.getText(vfyGrossOutFLowAnnualAmt), ConfigReader.getValue("savingDefOutflowAnnualAmt"));
		play.verifyText(play.getText(VfyTotalSavgMonthly), ConfigReader.getValue("savingsDefTotalMonthlyAmt"));
		play.verifyText(play.getText(vfyTotalSavgYtdAmt), ConfigReader.getValue("savingDefTotalYTDAmt"));
		play.verifyText(play.getText(vfytotalSavngAnnualAmt), ConfigReader.getValue("savingDefTotalAnnualAmt"));

	}
	public void validateExistingInsuranceDetails() {
		play.verifyText(play.getText(vfyExctngCategory), "Insurance - General");
		play.verifyText(play.getText(vfyExctngName), ConfigReader.getValue("existingNAme"));
		play.verifyText(play.getText(vfyExctngNameofholder), ConfigReader.getValue("existingHolderNAme"));
		play.verifyText(play.getText(vfyExctngFreqMonthly), ConfigReader.getValue("existingfreq"));
		play.verifyText(play.getText(vfyExctngCommtdInv), ConfigReader.getValue("existingCommittedInvestment"));
		play.verifyText(play.getText(vfyExctngYtdAmt), ConfigReader.getValue("existingYTDAmt"));
		play.verifyText(play.getText(vfyExctngAnnualAmt), ConfigReader.getValue("existingAnnual"));
		play.verifyText(play.getText(vfyExctngGrossTotalInvest), ConfigReader.getValue("existingCommittedInvestment"));
		play.verifyText(play.getText(vfyExctngGrossTotalYtdAmt), ConfigReader.getValue("existingYTDAmt"));
		play.verifyText(play.getText(vfyExctngGrossTotalAnnualAmt), ConfigReader.getValue("existingAnnual"));

	}
	public void validateinvestableSurplus() {
		play.verifyText(play.getText(vfyInvestSurplusType1), ConfigReader.getValue("investableType1"));
		play.verifyText(play.getText(vfyInvestSurplusType1MonthlyAmt), ConfigReader.getValue("investableType1MonthlyAmt"));
		play.verifyText(play.getText(vfyInvestSurplusType1YtdAmt), ConfigReader.getValue("investableType1YtdAmt"));
		play.verifyText(play.getText(vfyInvestSurplusType1AnuualAmt), ConfigReader.getValue("investableType1AnnualAmt"));
		play.verifyText(play.getText(vfyInvestSurplusType2), ConfigReader.getValue("investableType2"));
		play.verifyText(play.getText(vfyInvestSurplusType2MonthlyAmt), ConfigReader.getValue("existingCommittedInvestment"));
		play.verifyText(play.getText(vfyInvestSurplusType2YtdAmt), ConfigReader.getValue("existingYTDAmt"));
		play.verifyText(play.getText(vfyInvestSurplusType2AnuualAmt), ConfigReader.getValue("existingAnnual"));
		play.verifyText(play.getText(vfyInvestTotaltxt), ConfigReader.getValue("investabletotaltxt"));
		play.verifyText(play.getText(vfyInvestTotalMonthly), ConfigReader.getValue("investableTotalmonthAmt"));
		play.verifyText(play.getText(vfyInvestTotalYtdAmt), ConfigReader.getValue("investableTotalYtdAmt"));
		play.verifyText(play.getText(vfyInvestTotalAnnualAmt), ConfigReader.getValue("investableTotalAnnualAmt"));

	}
	public void btnScoreCard() {
		play.click(btnScorecard, "Score Card");
	}
	public void validateSavingRatioDetails() {
		play.verifyText(play.getText(vfyScoreratiotxt), ConfigReader.getValue("scoreratio"));
		play.verifyText(play.getText(vfySAvingratio), ConfigReader.getValue("scoreratiopoints"));
		play.verifyText(play.getText(vfySAvingsTotalIncome), "₹3.99 Lac / ₹5 Lac");
		play.verifyText(play.getText(vfySavingTotalPer), ConfigReader.getValue("scoreRatioPer"));
	}
	public void validateNetworkRatioDetails() {
		play.verifyText(play.getText(vfyNetworktxt), ConfigReader.getValue("networkratio"));
		play.verifyText(play.getText(vfyNetworkRatio), ConfigReader.getValue("networkpoints"));
		play.verifyText(play.getText(vfyNetworkTotalInctxt), ConfigReader.getValue("networkTotaltxt"));
		play.verifyText(play.getText(vfyNetworkTotalInc), " ₹10 Lac - ₹10 K");
		play.verifyText(play.getText(vfyNetworkTotalPer), "₹9.90 Lac");
	}
	public void validateExpenseRatioDetails() {
		play.verifyText(play.getText(vfyExpenseRatiotxt), ConfigReader.getValue("expenseratio"));
		play.verifyText(play.getText(vfyExpenseRatio), ConfigReader.getValue("expensepoints"));
		play.verifyText(play.getText(vfyExpenseTotalPer), ConfigReader.getValue("expensePer"));
		play.verifyText(play.getText(vfyExpenseTotalIncome), " ₹1.01 Lac / ₹5 Lac");
	}
	public void validateLiquidityRatioDetails() {
		play.verifyText(play.getText(vfyLiquRatioTxt), ConfigReader.getValue("liquidtxt"));
		play.verifyText(play.getText(vfyLiquRatioScore), ConfigReader.getValue("liguidScore"));
		play.verifyText(play.getText(vfyLiquRatioTotaltxt), ConfigReader.getValue("liquidtotaltxt"));
		play.verifyText(play.getText(vfyLiquTotalAmt), "₹20.10 K");
	}
	public void validateSolvencyRatioDetails() {
		play.verifyText(play.getText(vfySolRatiotxt), ConfigReader.getValue("solvencytxt"));
		play.verifyText(play.getText(vfySolvRatioScore), ConfigReader.getValue("solvencyScore"));
		play.verifyText(play.getText(vfySolvTotalTx), "NetWorth / Total assets");
		play.verifyText(play.getText(vfySolvTotalAmt), "₹9.90 Lac");
		play.verifyText(play.getText(vfySolvPer), ConfigReader.getValue("solvencyPer"));

	}
	public void clickGoalAnalysisBtn() {
		play.click(btnGoal, "Goal Analysis");
	}

	public void validateGoalAnalysisEmergencyDetails() {
		play.verifyText(play.getText(verfiyGoalNameEmg), ConfigReader.getValue("emergency"));
		play.verifyText(play.getText(verifyCategEmg), ConfigReader.getValue("emergency"));
		play.verifyText(play.getText(verifyEmgPriority), ConfigReader.getValue("emgPriority"));
		play.verifyText(play.getText(verifyEmgFreq), ConfigReader.getValue("emgfrequency"));
		play.verifyText(play.getText(verifyEmgYear), ConfigReader.getValue("emgGoalYear"));
		play.verifyText(play.getText(verifyPresentValue)," 2,00,000");
		play.verifyText(play.getText(verifyCumulativeValue), ConfigReader.getValue("emgCumulative"));
		play.verifyText(play.getText(verifyFutureValue), ConfigReader.getValue("emgFuturevalue"));
		play.verifyText(play.getText(verifyEmgInflation), ConfigReader.getValue("emgInflation"));
	}

	public void validateContigencyInGoalAnalysis() {
		play.verifyText(play.getText(verifyContigencyGoal), ConfigReader.getValue("contigencyGoal"));
		play.verifyText(play.getText(verifyContigencyCatg), ConfigReader.getValue("contigencyCategory"));
		play.verifyText(play.getText(verifyContigencyPriority), ConfigReader.getValue("contigencypriority"));
		play.verifyText(play.getText(verifyContigencyFreq), ConfigReader.getValue("contigencyFreq"));
		play.verifyText(play.getText(verifyContigencyGoalyear), ConfigReader.getValue("contigencyYear"));
		play.verifyText(play.getText(verifyContigencyPresentValue)," 1,20,410");
		play.verifyText(play.getText(verifyContigencyCumulativeValue), ConfigReader.getValue("contigencyCumulative"));
		play.verifyText(play.getText(verifyContigencyFutValue), ConfigReader.getValue("contigencyFutureval"));
		play.verifyText(play.getText(verifyContigecyInfValue), ConfigReader.getValue("contigencyInflation"));
	}

	public void validateRetirementInGoalAnalysis() {
		play.verifyText(play.getText(verifyRetirementGoal), ConfigReader.getValue("retirementGoal"));
		play.verifyText(play.getText(verifyRetirementCatg), ConfigReader.getValue("retirementCategory"));
		play.verifyText(play.getText(verfiyRetirementPriority), ConfigReader.getValue("retirementpriority"));
		play.verifyText(play.getText(verifyRetirementFreq), ConfigReader.getValue("retirementFreq"));
		play.verifyText(play.getText(verifyRetirementYear), ConfigReader.getValue("retirementYear"));
		play.verifyText(play.getText(verifyRetirementPresentValue)," 0");
		play.verifyText(play.getText(verifyRetirementCumulativeValue), ConfigReader.getValue("retirementCumulative"));
		play.verifyText(play.getText(verifyRetirementFutureValue), ConfigReader.getValue("retirementFutureval"));
		play.verifyText(play.getText(verifyRetirementInfVal), ConfigReader.getValue("retirementInflation"));
	}

	public void validateTotalGoalAnalysis() {
		play.verifyText(play.getText(verifyTotalGoalAmt), ConfigReader.getValue("goalTotal"));
		play.verifyText(play.getText(verifyPresentTotalAmt), ConfigReader.getValue("goalPresent"));
		play.verifyText(play.getText(verifyCumuTotalAmt),ConfigReader.getValue("goalCumulative"));
		play.verifyText(play.getText(verifyTotalFutPlanAmt), ConfigReader.getValue("goalFuture"));
	}

	public void clickGoalAssetAMppingBtn() {
		play.click(btnGoalAssetmapping, "Goal Asset Mapping");
	}

	public void validateEmgInGoalAsset() {
		play.verifyText(play.getText(verifyEmgGoalAsset), ConfigReader.getValue("goalAssetEmg"));
		play.verifyText(play.getText(verifyGoalAssetFutval), ConfigReader.getValue("goalAssetEmgFutPlan"));
		play.verifyText(play.getText(verifyGoalLinkedAsset), ConfigReader.getValue("goalAssetLinkedAssetName"));
		play.verifyText(play.getText(verifyGoallinkedfutval), ConfigReader.getValue("goalAssetEmgLinkedAssetValue"));
		play.verifyText(play.getText(verifyGoalSurplus)," 2,00,000");
	}

	public void validateContigencyInGoalAssetsMapping() {
		play.verifyText(play.getText(verifyContigencyGoalAsset), ConfigReader.getValue("goalAssetContig"));
		play.verifyText(play.getText(verifyContigGoalFutVal), ConfigReader.getValue("goalAssetContigFutPlan"));
		play.verifyText(play.getText(verifyContigLinkedAsset), ConfigReader.getValue("goalAssetLinkedAssetName"));
		play.verifyText(play.getText(verifyContigGoalLinkedFutVal),
				ConfigReader.getValue("goalAssetContigLinkedAssetval"));
		play.verifyText(play.getText(verifyContigGoalSurplus), ConfigReader.getValue("goalAssetContigSurplus"));
	}

	public void validateTotalGoalAssetMapping() {
		play.verifyText(play.getText(verifyGoalAssetTotalAmt), ConfigReader.getValue("goalAssetTotalFutVal"));
		play.verifyText(play.getText(verifyGoalAssetTotalSurPlus), ConfigReader.getValue("goalAssetTotalSurplus"));
		play.verifyText(play.getText(verifyGoalAssetTotallinkedAsset),
				ConfigReader.getValue("goalAssetTotalLinkedname"));
	}

	public void clickAssetGoalMappingbtn() {
		play.click(btnAssetGoalMapping, "Asset Goal Mapping");
	}

	public void validateAssetGoalMappingDetails() {
		play.verifyText(play.getText(verifyAssetName), ConfigReader.getValue("goalMappingName"));
		play.verifyText(play.getText(verifyAssetCategory), ConfigReader.getValue("goalMappingCatg"));
		play.verifyText(play.getText(verifyAssetSubCatg), ConfigReader.getValue("goalMappingSubCatg"));
		play.verifyText(play.getText(verfiyAssetHolderNAme), ConfigReader.getValue("goalMappingHolderName"));
		play.verifyText(play.getText(verifyAssetLinkedtype), ConfigReader.getValue("goalMappingLinkedType"));
		play.verifyText(play.getText(verifyAssetCur_MaturityVal), ConfigReader.getValue("goalMappingMatAmt"));
	}
	public void clickGoalMappingAnalysisBtn() {
		play.click(btnAssetGoalMappingAnalysis, "Goal Mapping Analysis");
	}
	public void validateGoalMappingAnalysis() {
		play.verifyText(play.getText(verifyMappingPresentVal), ConfigReader.getValue("mappingGoalName"));
		play.verifyText(play.getText(verifyMappingPresentAmt), ConfigReader.getValue("mappingGoalAmt"));
		play.verifyText(play.getText(verifyMappingFutValtxt), ConfigReader.getValue("mappingGoalFutName"));
		play.verifyText(play.getText(verifyMappingFutAmt), ConfigReader.getValue("mappingGoalFutVal"));
		play.verifyText(play.getText(verifyMappingYearTxt), ConfigReader.getValue("mappingGoalYearTxt"));
		play.verifyText(play.getText(verifyMappingYearDate), ConfigReader.getValue("mappingGoalYear"));
		play.verifyText(play.getText(verifyTxtInfaltion), ConfigReader.getValue("mappingGoalInflationTxt"));
		play.verifyText(play.getText(verifyMappingInflationPerc), ConfigReader.getValue("mappingGoalInflationPer"));
		play.verifyText(play.getText(verifyMappingLinkedAsset), ConfigReader.getValue("mappingGoalLinkedAsset"));
		play.verifyText(play.getText(verifyMappingLinkedAssetFutureValue), ConfigReader.getValue("mappingGoalLinkedAssetAmt"));
	}
	public void clickWhatIfAnalysisbtn() {
		play.click(btnWhatif, "What If Analysis");
	}
	/*
	 * Retirement planning
	 */
	public void btnRetirementPlanning() {
		play.click(btnRetirementPlanning, "Retirement palnning");
	}
	public void validateInfoSummaryDetails() {
		play.verifyText(play.getText(verifyPartPlannedRetrAgetxt), ConfigReader.getValue("retirementPlannedAgetxt"));
		play.verifyText(play.getText(verifyPartPlannedRetrAge), ConfigReader.getValue("retirementPlannedAge"));
		play.verifyText(play.getText(verifyTxtLifeExpecAge), ConfigReader.getValue("retirementLifeExpectxt"));
		play.verifyText(play.getText(verifyLifeExpecAge), ConfigReader.getValue("retirementLifeExpecAge"));
	}
	public void btnretirementCorpus() {
		play.click(btnRetirementCorpus, "Retirement Corpus");
	}
	public void validateCompleteRetirementExpensse() {
		play.verifyText(play.getText(verifyTxtCompleteRetiremntExpenses), ConfigReader.getValue("completeRetirementExpTxt"));
	}
	public void btnCashFlowInRtment() {
		play.click(btnCashFlowInRet, "Cash Flow");
	}
	public void btnFintooRecomCashflow() {
		play.click(btnFintooRecommendations, "Fintoo recommends");
	}
	public void fintooRecValidationYearAndAge() {
		play.verifyText(play.getText(verFintooRecYear), ConfigReader.getValue("fintooRecYear"));
		play.verifyText(play.getText(verFintooRecAge), ConfigReader.getValue("fintooRecAge"));

	}
	
}
