package com.Fintoo.bdd.web.screens;

import org.testng.Assert;

import com.Fintoo.bdd.ccl.PlayActions;
import com.Fintoo.bdd.integrations.common_utils.ConfigReader;

public class AfterReportGenWP {
	
	PlayActions play= new PlayActions();

	
	//=======================After Report Generated===============
		String btnAssetandliablitiesinRep="//div[@id='menu-sidebar']/div[@class='navigation-container left-scroll']/div[1]//a[text()='Assets & Liabilities']";
		String btnCurrEquityInvestment="//a[text()='Current Equity Investments']";
		String txtCurrEquityInvestmen="//div[@class='d-block']//div[@class='d-block']//a[@class='link'][text()='Complete asset']";
		String btnDebtInvestment="//a[text()='Debt Investments']";
		String txtDebtInvestment="//div[@class='d-block']//div[@class='d-block']//a[@class='link'][text()='Add Equity in Assets']";
		
		
		String btnAlternateInvestment="//a[text()='Alternate Investment']";
		String txtAlternateInvestment="//div[@class='d-block']//div[@class='pageHolder currentDebtPolicies ']//a[@class='link'][text()='Complete asset']";
		String btnRealEstateinRep="//div[@class='d-flex justify-content-md-center tab-box']//a[contains(text(),'Real Estate')]";
		String btnUlipinreport="//a[text()='ULIP']";
		String txtUlip="//a[text()='Complete Insurance']";
		String datastoredinRealestate="//div[@class='d-block']//td[text()='Real Estate']";
		String dataCurrValue="//div[@class='d-block']//td[text()='Real Estate']/following-sibling::td[text()='10,00,000']";
		String nameofassetinrealEstate="//td[normalize-space()='Agricultural land']";
		String assetsummaryTot="//td[text()='Total Value']/following-sibling::td[text()='10,00,000']";
		String subcatinrealestate="//td[normalize-space()='Agricultural land']/following-sibling::td[text()='Agriculture Land']";
		String residentialTypeinRealEstate="//td[normalize-space()='Agricultural land']/following-sibling::td[text()='Agriculture Land']/following-sibling::td[text()='Self Occupied']";
		String mortageorfreeload="//td[text()='Free hold']";
		String InvestamountinrealEstate="//td[text()='Free hold']/following-sibling::td[text()='0.00']";
		String curreValinRealEstate="//tr[@class='tabledata']//td[text()='1000000.00']";
		String AbsolutereturninrelaEstate="//tr[@class='tabledata']//td[text()='1000000.00']/following-sibling::td[text()='0']";
		
		String btnLiabilityStmt="//div[text()='LIABILITY STATEMENT']";
		String nameofliablitie="//table[@class='bgStyleTable']//td[text()='Car Loan'][1]";
		String catinliability="//table[@class='bgStyleTable']//td[text()='Car Loan'][2]";
		String intrestrateinliability="//table[@class='bgStyleTable']//td[text()='Car Loan'][2]//following-sibling::td[1]";
		String liabilityEMi="//table[@class='bgStyleTable']//td[text()='Car Loan'][2]//following-sibling::td[2]";
		String CurrOutinliabilities="//table[@class='bgStyleTable']//td[text()='Car Loan'][2]//following-sibling::td[2]";
		String Dateinliability="//table[@class='bgStyleTable']//td[text()='Car Loan'][2]//following-sibling::td[2]";
		String totinLiabilitity="//table[@class='bgStyleTable']//td[text()='Total Liability']/following-sibling::td";
		

		
		String btnNetWorth="//div[text()='NET WORTH']";
		String realEstateCat="//div[@class='table-responsive rTable']//tr[@class='tabledata']//td[text()='Real Estate']";
		String grossAsset="//div[@class='table-responsive rTable']//tr[@class='tabledata']//td[text()='Real Estate']/following-sibling::td[1]";
		String LiabilitiesCat="//div[@class='table-responsive rTable']//td[text()='Liability']";
		String grossLiabilities="//div[@class='table-responsive rTable']//td[text()='Liability']/following-sibling::td[2]";
		String TotLiaTxtinLiabilities="//div[@class='lifeInsuranceHolderBoxInner ']//div[@class='table-responsive rTable']//tr[@class='bold top-line total-value']//td[1]";
		String GrossAssetATotLia="//div[@class='lifeInsuranceHolderBoxInner ']//div[@class='table-responsive rTable']//tr[@class='bold top-line total-value']//td[2]";
		String GrossAssetBTotLia="//div[@class='lifeInsuranceHolderBoxInner ']//div[@class='table-responsive rTable']//tr[@class='bold top-line total-value']//td[3]";
		String networthVal="//div[@class='colorGreen1  ']";
		String netAssetworth="//tr[@class='bold top-line total-value']//td[2]";
		String netLiabilityworth="//tr[@class='bold top-line total-value']//td[3]";
		String idealworthVal="//h4[@class='rTitle text-center  '][text()][1]";
		String CurrworthVal="//h4[@class='rTitle text-center  '][text()][2]";
		
		
		String btnFintoRecommends="//div[text()='FINTOO RECOMMENDS']";
		String totidealPercentageinAssetAlloc="//div[@class='col-md-6'][1]//tr[@class='bold top-line total-value']/td[1]";
		String idealPercentageinAssetAlloc="//div[@class='col-md-6'][1]//tr[@class='bold top-line total-value']/td[2]";
		String AmtinidealPercentageinAssetAlloc="//div[@class='col-md-6'][1]//tr[@class='bold top-line total-value']/td[3]";
		String totCurrPercentageinAssetAlloc="//div[@class='col-md-6'][2]//tr[@class='bold top-line total-value']/td[1]";
		String currPercentageinAssetAlloc="//div[@class='col-md-6'][2]//tr[@class='bold top-line total-value']/td[2]";
		String AmtinCurrPercentageinAssetAlloc="//div[@class='col-md-6'][2]//tr[@class='bold top-line total-value']/td[3]";
		
		
		String btnPortfolioAnalysis="//div[text()='PORTFOLIO ANALYSIS']";
		String btnPortfolioRep="//a[text()='Portfolio']";
		String txtPortfolioHoldings="//div[text()=' Portfolio Holdings']";
		String txtAssesAlloc="//div[text()=' Asset Allocation']";
		String btnPerformance="//a[text()='Performance']";
		String txtPerformance="//div[text()=' Performance']";
		String txtReturnAnalysis="//div[text()=' Return Analysis']";
		String txtTopPortfolio="//div[text()=' Top Portfolio Holdings']";
		String txtStatistics="//div[text()='Statistics']";
		String btnHoldings="//a[text()='Holdings']";
		String txtHoldings="//div[contains(@class,'tabs innerTabs subTabWrapper')]//div[contains(@class,'d-block')]//a[normalize-space()='Complete Assets & Liabilities']";
		String btnRealEstateinPortfolio="//div[contains(@class,'d-block')]//a[contains(text(),'Real Estate')]";
		String txtRealEstateinPortfolio="//div[contains(@class,'tabs innerTabs subTabWrapper')]//div[contains(@class,'d-block')]//a[normalize-space()='Complete Assets & Liabilities']";
		String btnWhatIfAnalysis="//div[text()='WHAT IF ANALYSIS']";
		
		
		
		String btnContingencyPlanAfterRep="//div[@id='menu-sidebar']/div[@class='navigation-container left-scroll']/div[1]//a[text()='Contingency Planning']";
		String ContingencyType="//td[text()='Emergency Corpus Required for ']";
		String ContingencyAmount="//td[text()='Emergency Corpus Required for ']/following-sibling::td";
		String assetAvailB="//td[text()='Assets Available ( B )']";
		String assetAmount="//td[text()='Assets Available ( B )']/following-sibling::td";
		String EmergencycorpuCal="//div[text()='Emergency corpus(₹) (B-A)']";
		String EmergencyCorpusAmount="//div[@class='colorGreen1 ']";	
		
		String btnCurrInsur="//div[text()='CURRENT INSURANCE']";
		String PolicyNameinCrrInsur="//td[text()='General'][1]";
		String PolicyTypeCurrInsure="//td[text()='General'][2]";
		String NameofHolderCurrInsur="//td[text()='General'][2]/following-sibling::td[1]";
		String StartYearCurrInsur="//td[text()='General'][2]/following-sibling::td[2]";
		String EndYearCurrInsur="//td[text()='General'][2]/following-sibling::td[3]";
		String SumAssurCurrInsur="//td[text()='General'][2]/following-sibling::td[4]";
		String PremiumPayCurrInsur="//td[text()='General'][2]/following-sibling::td[5]";
		String PremiumFrequencyCurrInsur="//td[text()='General'][2]/following-sibling::td[6]";
		String TotSumAssurCurrInsur="//tr[@class='bold top-line total-value']//td[text()='Total']/following-sibling::td[1]";
		String TotPremiumCurrInsur="//tr[@class='bold top-line total-value']//td[text()='Total']/following-sibling::td[2]";
		
		String btnLifeInsurance="//div[text()='LIFE INSURANCE']";
		String txtRegInsurSelf="//td[text()='Regular expenses till lifetime (Of Self)']";
		String AmttxtRegInsurSelf="//td[text()='Regular expenses till lifetime (Of Self)']/following-sibling::td";
		String txtRegInsurFamily="//td[text()='Regular expenses till Limited term It include family members and dependent member']";
		String AmttxtRegInsurFamily="//td[text()='Regular expenses till Limited term It include family members and dependent member']/following-sibling::td";
		String totCriticalExp="//td[text()='Total Critical Expenses (A)']";
		String AmttotCriticalExp="//td[text()='Total Critical Expenses (A)']/following-sibling::td";
		String txtCarLoan="//td[text()='Car Loan']";
		String AmttxtCarLoan="//td[text()='Car Loan']/following-sibling::td";
		String txtContigencyGoal="//td[text()='contingency goal']";
		String AmttxtContigencyGoal="//td[text()='contingency goal']/following-sibling::td";
		String txtGoalVAlue="//td[text()='Total Goal Present Value (C)']";
		String AmttxtGoalVAlue="//td[text()='Total Goal Present Value (C)']/following-sibling::td";
		String txtIdealValue="//td[text()='Total Ideal Insurance(D) (']";
		String AmttxtIdealValue="//td[text()='Total Ideal Insurance(D) (']/following-sibling::td";
		String txtIdealInsurCover="//td[text()='Ideal Insurance cover (D)']";
		String AmttxtIdealInsurCover="//td[text()='Ideal Insurance cover (D)']/following-sibling::td";
		String txtExistingInsurCover="//td[text()='Existing Insurance cover (E)']";
		String AmttxtExistingInsurCover="//td[text()='Existing Insurance cover (E)']/following-sibling::td";
		String txtAddInsurRequired="//td[text()='Additional Insurance Required (E-D)']";
		String AmttxtAddInsurRequired="//td[text()='Additional Insurance Required (E-D)']/following-sibling::td";
		
		
		
		String btnMedicalInsurance="//div[text()='MEDICAL INSURANCE']";
		String btnWhatifinContingency="//div[text()='WHAT IF ANALYSIS']";
		String HealthCoverage="//td[text()='Ideal Health Coverage For Family (A)']";
		String HealthCoverageAmt="//td[text()='Ideal Health Coverage For Family (A)']/following-sibling::td";
		String ExistingPersonalCover="//td[text()='Existing Personal Cover (B)']";
		String ExistingPersonalCoveramt="//td[text()='Existing Personal Cover (B)']/following-sibling::td";
		String SumAmountinMedInsure="//td[text()='shortfall']/following-sibling::td";
		
		String btnCashFlowAnalysis="//div[@id='menu-sidebar']/div[@class='navigation-container left-scroll']/div[1]//a[text()='Cashflow Analysis']";
		//String txtNetSurplus="//h4[@class='rTitle'][text()='Net Surplus / Shortfall']";
		String yearinNetSurPlus="//div[@class='CashflowNetSurplus']//tr[@class='tabledata']//td[1]";
		String AgeinNetSurplus="//div[@class='CashflowNetSurplus']//tr[@class='tabledata']//td[2]";
		String cashinflow="//div[@class='CashflowNetSurplus']//tr[@class='tabledata']//td[3]";
		String cashoutflow="//div[@class='CashflowNetSurplus']//tr[@class='tabledata']//td[4]";
		String GrossInvestableSurplus="//div[@class='CashflowNetSurplus']//tr[@class='tabledata']//td[5]";
		String existingInvestCommit="//div[@class='CashflowNetSurplus']//tr[@class='tabledata']//td[6]";
		String SurPlusandShortfall="//div[@class='CashflowNetSurplus']//tr[@class='tabledata']//td[7]";

		String btnCashInFlowTab="//div[text()='CASHINFLOW']";
		String PlanyearCashInFlow="//div[@class='cashflowIn']//tr[@class='tabledata']//td[1]";
		String PlanAgeCashInFlow="//div[@class='cashflowIn']//tr[@class='tabledata']//td[2]";
		String SalandBonusinCashInFlow="//div[@class='cashflowIn']//tr[@class='tabledata']//td[3]";
		String GrossIncomeinCashInFlow="//div[@class='cashflowIn']//tr[@class='tabledata']//td[4]";

		String btncashoutflowtab="//div[text()='CASHOUTFLOW']";
		String MandatoryVarExp="//div[@class='cashflowOut']//tr[@class='tabledata']//td[1]";
		String MandatoryFixedExp="//div[@class='cashflowOut']//tr[@class='tabledata']//td[2]";
		String GrossExpinCashoutFlow="//div[@class='cashflowOut']//tr[@class='tabledata']//td[3]";
		String PlanyearInCashOutFlow="//div[@class='cashflowOut']//tr[@class='tabledata']//td[4]";
		String PlanAgeInCashOutFlow="//div[@class='cashflowOut']//tr[@class='tabledata']//td[5]";

		
		String fintoRecYear="//td[text()='0']/following-sibling::td[text()='3,99,488']/preceding-sibling::td[1]";
		String fintoRecOpenBalance="//td[text()='0']/following-sibling::td[text()='3,99,488']/preceding-sibling::td[2]";
		String NetinvestableFintoRec="//td[text()='0']/following-sibling::td[text()='3,99,488']";
		String CommitedInvest="//td[text()='0']/following-sibling::td[text()='3,99,488']/following-sibling::td[1]";
		String RecommededInvest="//td[text()='0']/following-sibling::td[text()='3,99,488']/following-sibling::td[2]";
		String ReInvestcorpus="//td[text()='0']/following-sibling::td[text()='3,99,488']/following-sibling::td[3]";
		
		
		String FintoRecInfloAssets="//div[@class='table-responsive rTable cashFlowTables']//tr[@class='tabledata']//td[text()='Additional Investment Corpus']/following-sibling::td";
		String FintoRecOutflowGoalAmt="//div[@class='table-responsive rTable cashFlowTables']//tr[@class='tabledata']//td[8]";
		String FintoRecClosingBal="//div[@class='table-responsive rTable cashFlowTables']//tr[@class='tabledata']//td[9]";

				
			
		
	
	 public void clickOnAssetLiaablitiesBtnAfterRep()
	    {
	    	play.click(btnAssetandliablitiesinRep, "Clicking on Assest&Liablities After Report Generated");
	    }
	    public void assetSummaryValidation()
	    {
	    	
	    	String txt= play.getText(datastoredinRealestate);
	    	play.verifyText(play.getText(datastoredinRealestate), txt);
	    	String txt1= play.getText(dataCurrValue);
	    	play.verifyText(play.getText(dataCurrValue), txt1);
	    	String txt2= play.getText(assetsummaryTot);
	    	play.verifyText(play.getText(assetsummaryTot),txt2);
	    	
	    }
	    public void clickONCurrEquityInvestment()
	    {
	    	play.click(btnCurrEquityInvestment, "Clicking on Current EquityInvestment underAsset Summary");
	    }
	    
	    public void validateCurrEquityInvestment()
	    {
	    	String txt= play.getText(txtCurrEquityInvestmen);
	    	play.verifyText(play.getText(txtCurrEquityInvestmen), txt);
	    }
	    
	    public void clickONDebtInvestment()
	    {
	    	play.click(btnDebtInvestment, "Clicking on Current Debt Investment underAsset Summary");
	    }
	    
	    public void validateDebtInvestment()
	    {
	    	String txt= play.getText(txtDebtInvestment);
	    	play.verifyText(play.getText(txtDebtInvestment), txt);
	    }
	  
	    public void clickOnAlthernateandRealEstate()
	    {
	    	play.click(btnAlternateInvestment, "Clicking on Althernate Investment under Asset Summary");
	    }
	    
	    public void validateAlthernateandRealEstate()
	    {
	    	String txt= play.getText(txtAlternateInvestment);
	    	play.verifyText(play.getText(txtAlternateInvestment), txt);
	    }
	    
	    
	    public void clickonRealEstateinRep()
	    {
	    	play.click(btnRealEstateinRep, "Clicking on Althernate Investment under Asset Summary");
	    }
	      
	    
	    public void validateRealEstateinAssetSummary()
	    {
	    	
	    	String txt=play.getText(nameofassetinrealEstate);
	    	play.verifyText(play.getText(nameofassetinrealEstate), txt);
	    	String txt1=play.getText(subcatinrealestate);
	    	play.verifyText(play.getText(subcatinrealestate), txt1);
	    	String txt2=play.getText(residentialTypeinRealEstate);
	    	play.verifyText(play.getText(residentialTypeinRealEstate), txt2);
	    	String txt3=play.getText(mortageorfreeload);
	    	play.verifyText(play.getText(mortageorfreeload), txt3);
	    	String txt4=play.getText(InvestamountinrealEstate);
	    	play.verifyText(play.getText(InvestamountinrealEstate), txt4);
	    	String txt5=play.getText(curreValinRealEstate);
	    	play.verifyText(play.getText(curreValinRealEstate), txt5);
	    	String txt6=play.getText(AbsolutereturninrelaEstate);
	    	play.verifyText(play.getText(AbsolutereturninrelaEstate), txt6);
	    	String txt7=play.getText(assetsummaryTot);
	    	play.verifyText(play.getText(assetsummaryTot), txt7);
	    
	    }
	    
	    public void clickONUlip()
	    {
	    	play.click(btnUlipinreport, "Clicking on Ulip underAsset Summary");
	    }
	    public void validateUlip()
	    {
	    	String txt=play.getText(txtUlip);
	    	play.verifyText(play.getText(txtUlip), txt);
	    	
	    }
	    
	    public void clickonLiabilityStatements()
	    {
	    	play.click(btnLiabilityStmt, "clicking on liabilities statement");
	    }
	    public void validationInLiabilities()
	    {
	    	String txt1=play.getText(nameofliablitie);
	    	play.verifyText(play.getText(nameofliablitie), txt1);
	    	String txt2=play.getText(catinliability);
	    	play.verifyText(play.getText(catinliability), txt2);
	    	String txt3=play.getText(intrestrateinliability);
	    	play.verifyText(play.getText(intrestrateinliability), txt3);
	    	String txt4=play.getText(liabilityEMi);
	    	play.verifyText(play.getText(liabilityEMi), txt4);
	    	String txt5=play.getText(CurrOutinliabilities);
	    	play.verifyText(play.getText(CurrOutinliabilities), txt5);
	    	String txt6=play.getText(Dateinliability);
	    	play.verifyText(play.getText(Dateinliability), txt6);
	    	String txt7=play.getText(totinLiabilitity);
	    	play.verifyText(play.getText(totinLiabilitity), txt7);
	    	
	     }
	    
	    public void clickOnNetWorth()
	    {
	    	play.click(btnNetWorth, "clicking on NetWorth");

	    }
	    
		public void validationinNetWorth() {
			
			String txt=play.getText(realEstateCat);
	    	play.verifyText(play.getText(realEstateCat), txt);
	    	String txt1=play.getText(grossAsset);
	    	play.verifyText(play.getText(grossAsset), txt1);
	    	String txt2=play.getText(LiabilitiesCat);
	    	play.verifyText(play.getText(LiabilitiesCat), txt2);
	    	String txt3=play.getText(grossLiabilities);
	    	play.verifyText(play.getText(grossLiabilities), txt3);
	    	String txt4=play.getText(TotLiaTxtinLiabilities);
	    	play.verifyText(play.getText(TotLiaTxtinLiabilities), txt4);
	    	String txt5=play.getText(GrossAssetATotLia);
	    	play.verifyText(play.getText(GrossAssetATotLia), txt5);
	    	String txt6=play.getText(GrossAssetBTotLia);
	    	play.verifyText(play.getText(GrossAssetBTotLia), txt6);
	    	String txt7=play.getText(networthVal);
	    	play.verifyText(play.getText(networthVal), txt7);
	    	String txt8=play.getText(idealworthVal);
	    	play.verifyText(play.getText(idealworthVal), txt8);
	    }

		public void clickOnWhatIfAnalysisTab()
		{
			play.click(btnWhatIfAnalysis, "Clicking on the Tab What if Analysis");
		}
		
		public void clickOnFintoRecommends()
		{
			play.click(btnFintoRecommends, "Clicking on FintoRecommends");
		}
		
		public void validationinFRecommends()
		{
			String txt=play.getText(totidealPercentageinAssetAlloc);
	    	play.verifyText(play.getText(totidealPercentageinAssetAlloc), txt);
			String txt1=play.getText(idealPercentageinAssetAlloc);
	    	play.verifyText(play.getText(idealPercentageinAssetAlloc), txt1);
	    	String txt2=play.getText(AmtinidealPercentageinAssetAlloc);
	    	play.verifyText(play.getText(AmtinidealPercentageinAssetAlloc), txt2);
	    	String txt3=play.getText(totCurrPercentageinAssetAlloc);
			play.verifyText(play.getText(totCurrPercentageinAssetAlloc), txt3);
			String txt4=play.getText(currPercentageinAssetAlloc);
	    	play.verifyText(play.getText(currPercentageinAssetAlloc), txt4);
			String txt5=play.getText(AmtinCurrPercentageinAssetAlloc);
	    	play.verifyText(play.getText(AmtinCurrPercentageinAssetAlloc), txt5);

		}
		
		public void clickOninPortfolio()
		{
			play.click(btnPortfolioAnalysis, "Clicking on Portfolio Analysis");
		}
		
		public void clickonPortfoliounderPort()
		{
			play.click(btnPortfolioRep, "Clicking on Portfolio");
		}
		public void validatePortfoliounderPort()
		{
			String txt=play.getText(txtPortfolioHoldings);
	    	play.verifyText(play.getText(txtPortfolioHoldings), txt);
	    	String txt1=play.getText(txtAssesAlloc);
	    	play.verifyText(play.getText(txtAssesAlloc), txt1);
	    	
		}
		public void clickonPerformnace()
		{
			play.click(btnPerformance, "Clicking on Performance");
		}
		public void validatetxtPerformance()
		{
			String txt=play.getText(txtPerformance);
	    	play.verifyText(play.getText(txtPerformance), txt);
	    	String txt1=play.getText(txtReturnAnalysis);
	    	play.verifyText(play.getText(txtReturnAnalysis), txt1);
	    	String txt2=play.getText(txtTopPortfolio);
	    	play.verifyText(play.getText(txtTopPortfolio), txt2);
	    	String txt3=play.getText(txtStatistics);
	    	play.verifyText(play.getText(txtStatistics), txt3);
		}
		public void clickonHoldings()
		{
			play.click(btnHoldings, "Clicking on Holdings");
		}
		public void valiateHoldings()
		{
			
			String txt=play.getText(txtHoldings);
	    	play.verifyText(play.getText(txtHoldings), txt);
		}
		public void clickonRealEstateunderPort()
		{
			play.click(btnRealEstateinPortfolio, "Clicking on Real Estate");
		}
		
		public void valiateRealEstateunderPort()
		{
			String txt=play.getText(txtRealEstateinPortfolio);
	    	play.verifyText(play.getText(txtRealEstateinPortfolio), txt);
		}
		public void clickonContingencyPlanning()
		{
			play.click(btnContingencyPlanAfterRep, "clicking on ContingencyPlanning");
		}
		
		public void validateContingencyPlanningDetails()
		{
//			String txt=play.getText(ContingencyType);
//	    	play.verifyText(play.getText(ContingencyType), txt);
//			String txt1=play.getText(ContingencyAmount);
//	    	play.verifyText(play.getText(ContingencyAmount), txt1);
//			String txt2=play.getText(assetAvailB);
//	    	play.verifyText(play.getText(assetAvailB), txt2);
//	    	String txt3=play.getText(assetAmount);
//	    	play.verifyText(play.getText(assetAmount), txt3);
//	    	String txt4=play.getText(EmergencycorpuCal);
//	    	play.verifyText(play.getText(EmergencycorpuCal), txt4);
//			String txt5=play.getText(EmergencyCorpusAmount);
//	    	play.verifyText(play.getText(EmergencyCorpusAmount), txt5);
			
		}
		public void clickonCurrentInsurance()
		{
			play.click(btnCurrInsur, "Clicking on CurrentInsurance");
		}
			
		public void validateCurrentInsurance()
		{
			String txt=play.getText(ContingencyType);
	    	play.verifyText(play.getText(ContingencyType), txt);
	    	String txt1=play.getText(PolicyNameinCrrInsur);
	    	play.verifyText(play.getText(PolicyNameinCrrInsur), txt1);
	    	String txt2=play.getText(PolicyTypeCurrInsure);
	    	play.verifyText(play.getText(PolicyTypeCurrInsure), txt2);
	    	String txt3=play.getText(NameofHolderCurrInsur);
	    	play.verifyText(play.getText(NameofHolderCurrInsur), txt3);
	    	String txt4=play.getText(StartYearCurrInsur);
	    	play.verifyText(play.getText(StartYearCurrInsur), txt4);
	    	String txt5=play.getText(EndYearCurrInsur);
	    	play.verifyText(play.getText(EndYearCurrInsur), txt5);
	    	String txt6=play.getText(SumAssurCurrInsur);
	    	play.verifyText(play.getText(SumAssurCurrInsur), txt6);
	    	String txt7=play.getText(PremiumPayCurrInsur);
	    	play.verifyText(play.getText(PremiumPayCurrInsur), txt7);
	    	String txt8=play.getText(PremiumFrequencyCurrInsur);
	    	play.verifyText(play.getText(PremiumFrequencyCurrInsur), txt8);
	    	String txt9=play.getText(TotSumAssurCurrInsur);
	    	play.verifyText(play.getText(TotSumAssurCurrInsur), txt9);
	    	String txt10=play.getText(TotPremiumCurrInsur);
	    	play.verifyText(play.getText(TotPremiumCurrInsur), txt10);
		}
		public void clickOnLifeInsurance()
		{
			play.click(btnLifeInsurance, "Clicking on LifeInsurance");
		}
		
		public void validateLifeInsurance()
		{
			String txt=play.getText(txtRegInsurSelf);
	    	play.verifyText(play.getText(txtRegInsurSelf), txt);
			String txt19=play.getText(AmttxtRegInsurSelf);
	    	play.verifyText(play.getText(AmttxtRegInsurSelf), txt19);
	    	String txt1=play.getText(txtRegInsurFamily);
	    	play.verifyText(play.getText(txtRegInsurFamily), txt1);
	    	String txt2=play.getText(AmttxtRegInsurFamily);
	    	play.verifyText(play.getText(AmttxtRegInsurFamily), txt2);
	    	String txt3=play.getText(totCriticalExp);
	    	play.verifyText(play.getText(totCriticalExp), txt3);
	    	String txt4=play.getText(AmttotCriticalExp);
	    	play.verifyText(play.getText(AmttotCriticalExp), txt4);
	    	String txt5=play.getText(txtCarLoan);
	    	play.verifyText(play.getText(txtCarLoan), txt5);
	    	String txt6=play.getText(AmttxtCarLoan);
	    	play.verifyText(play.getText(AmttxtCarLoan), txt6);
	    	String txt7=play.getText(txtContigencyGoal);
	    	play.verifyText(play.getText(txtContigencyGoal), txt7);
	    	String txt8=play.getText(AmttxtContigencyGoal);
	    	play.verifyText(play.getText(AmttxtContigencyGoal), txt8);
	    	String txt9=play.getText(txtGoalVAlue);
	    	play.verifyText(play.getText(txtGoalVAlue), txt9);
	    	String txt10=play.getText(AmttxtGoalVAlue);
	    	play.verifyText(play.getText(AmttxtGoalVAlue), txt10);
	    	String txt11=play.getText(txtIdealValue);
	    	play.verifyText(play.getText(txtIdealValue), txt11);
	    	String txt12=play.getText(AmttxtIdealValue);
	    	play.verifyText(play.getText(AmttxtIdealValue), txt12);
	    	String txt13=play.getText(txtIdealInsurCover);
	    	play.verifyText(play.getText(txtIdealInsurCover), txt13);
	    	String txt14=play.getText(AmttxtIdealInsurCover);
	    	play.verifyText(play.getText(AmttxtIdealInsurCover), txt14);
	    	String txt15=play.getText(txtExistingInsurCover);
	    	play.verifyText(play.getText(txtExistingInsurCover), txt15);
	    	String txt16=play.getText(AmttxtExistingInsurCover);
	    	play.verifyText(play.getText(AmttxtExistingInsurCover), txt16);
	    	String txt17=play.getText(txtAddInsurRequired);
	    	play.verifyText(play.getText(txtAddInsurRequired), txt17);
	    	String txt18=play.getText(AmttxtAddInsurRequired);
	    	play.verifyText(play.getText(AmttxtAddInsurRequired), txt18);
	    	
	    	
		}
		public void clickonMedicalInsurance()
		{
			play.click(btnMedicalInsurance, "Clicking on Medical Insurance");
		}
		
		public void validateMedicalInsurance()
		{
			String txt=play.getText(HealthCoverage);
	    	play.verifyText(play.getText(HealthCoverage), txt);
			String txt1=play.getText(HealthCoverageAmt);
	    	play.verifyText(play.getText(HealthCoverageAmt), txt1);
			String txt2=play.getText(ExistingPersonalCover);
	    	play.verifyText(play.getText(ExistingPersonalCover), txt2);
			String txt3=play.getText(ExistingPersonalCoveramt);
	    	play.verifyText(play.getText(ExistingPersonalCoveramt), txt3);
			String txt4=play.getText(SumAmountinMedInsure);
	    	play.verifyText(play.getText(SumAmountinMedInsure), txt4);
			
		}
		public void clickonWhatIfInsurance()
		{
			play.click(btnWhatifinContingency, "clicking on Whatif Analysis");
		}
	
	
		
		
		public void clickonCashFlowAnalysis()
		{
			play.click(btnCashFlowAnalysis, "Clicking on Cash flow Analysis");
		}
		

		public void validateNetSurPlusandShortFall()
		{
			String txt5=play.getText(yearinNetSurPlus);
			play.verifyText(play.getText(yearinNetSurPlus), txt5);
			String txt6=play.getText(AgeinNetSurplus);
			play.verifyText(play.getText(AgeinNetSurplus), txt6);
			String txt=play.getText(cashinflow);
			play.verifyText(play.getText(cashinflow), txt);
			String txt1=play.getText(cashoutflow);
			play.verifyText(play.getText(cashoutflow), txt1);
			String txt2=play.getText(GrossInvestableSurplus);
			play.verifyText(play.getText(GrossInvestableSurplus), txt2);
			String txt3=play.getText(existingInvestCommit);
			play.verifyText(play.getText(existingInvestCommit), txt3);
			String txt4=play.getText(SurPlusandShortfall);
			play.verifyText(play.getText(SurPlusandShortfall), txt4);
		}
		

		public void clickonCashInFlow()
		{
			play.click(btnCashInFlowTab, "Clicking on CashIn flow Tab");
		}
		
		public void validateCashInFlow()
		{
			String txt=play.getText(PlanyearCashInFlow);
			play.verifyText(play.getText(PlanyearCashInFlow),txt);
			String txt2=play.getText(PlanAgeCashInFlow);
			play.verifyText(play.getText(PlanAgeCashInFlow),txt2);
			String txt3=play.getText(SalandBonusinCashInFlow);
			play.verifyText(play.getText(SalandBonusinCashInFlow),txt3);
			String txt4=play.getText(GrossIncomeinCashInFlow);
			play.verifyText(play.getText(GrossIncomeinCashInFlow),txt4);
		}
		
		public void clickoncashOutFlow()
		{
			play.click(btncashoutflowtab, "Clicking on cash out flow");
		}
		
		public void validateCashOutFlow()
		{
			String txt=play.getText(PlanyearInCashOutFlow);
			play.verifyText(play.getText(PlanyearInCashOutFlow), txt);
			String txt1=play.getText(PlanAgeInCashOutFlow);
			play.verifyText(play.getText(PlanAgeInCashOutFlow), txt1);
			String txt2=play.getText(MandatoryVarExp);
			play.verifyText(play.getText(MandatoryVarExp),txt2);
			String txt3=play.getText(MandatoryFixedExp);
			play.verifyText(play.getText(MandatoryFixedExp),txt3);
			String txt4=play.getText(GrossExpinCashoutFlow);
			play.verifyText(play.getText(GrossExpinCashoutFlow),txt4);

		}
		
		public void clickonFintoRecommedation()
		{
			play.click(btnFintoRecommends, "Clicking on FintoRecommends");
		}
		
		public void validateFintoRecommend()
		{
			String txt=play.getText(fintoRecYear);
			play.verifyText(play.getText(fintoRecYear), txt);
			String txt1=play.getText(fintoRecOpenBalance);
			play.verifyText(play.getText(fintoRecOpenBalance), txt1);
			String txt2=play.getText(NetinvestableFintoRec);
			play.verifyText(play.getText(NetinvestableFintoRec), txt2);
			String txt3=play.getText(CommitedInvest);
			play.verifyText(play.getText(CommitedInvest), txt3);
			String txt4=play.getText(RecommededInvest);
			play.verifyText(play.getText(RecommededInvest), txt4);
			String txt5=play.getText(ReInvestcorpus);
			play.verifyText(play.getText(ReInvestcorpus), txt5);
			String txt6=play.getText(FintoRecInfloAssets);
			play.verifyText(play.getText(FintoRecInfloAssets), txt6);
			String txt7=play.getText(FintoRecOutflowGoalAmt);
			play.verifyText(play.getText(FintoRecOutflowGoalAmt), txt7);
			String txt8=play.getText(FintoRecClosingBal);
			play.verifyText(play.getText(FintoRecClosingBal), txt8);

		}
		

}
