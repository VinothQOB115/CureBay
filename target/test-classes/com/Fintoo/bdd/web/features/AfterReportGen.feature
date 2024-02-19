@afterreport 
Feature: User validate the data gathered are displyed in Generated Report

Background: login functionality
Given User is in fintoo page
#When user cicks on login button
Then user should be able to see the Welcome page
When user enters valid username and captcha and clicks on SendOTP button
And user enter OTP and clicks on Submit button

@assets
Scenario: Validation on Assest Summary under Assets and Liabilities
When user clicks on edit data button and clicks on generate report button
And User clicks on the Asset and liabilties 
Then User should see the stored Assets in  under Asset Summary
When User clicks on Current Equity Investments 
Then User should able to see CompleteAsset button
When User clicks on Current Debt Investments
Then User should able to see Add Equity in Assts in Debt 
When User clicks on Alternate Investment
Then Use should able to see Complete Asset button in Alternate
When User clicks on Real estate under Asset Summary
Then User should able to see Real Estate Summary 
When User clicks on ULIP under Asset Summary
Then User shoudl able to see the Complete Insurance button

@liabilities
Scenario: Validation on Liabilities statement under Assets and Liabilities
When user clicks on edit data button and clicks on generate report button
And User clicks on the Asset and liabilties 
And User clicks on Liabilities statement
Then User should see the stored Liabilites in the tabs under liabilities statement

@networthAsset
Scenario: Validation on Net Worth statement under Assets and Liabilities
When user clicks on edit data button and clicks on generate report button
And User clicks on the Asset and liabilties 
And User clicks on Net Worth 
Then User should see the net worth statement under NetWorth tab

@FintoRecommend
Scenario: Validation on Finto Recommends under Assets and Liabilities
When user clicks on edit data button and clicks on generate report button
And User clicks on the Asset and liabilties 
And USer clicks on Finto Recommends 
Then User should see the ideal and current percentage under Finto Recommends tab

@portfolio
Scenario: Validation on Portfolio Analysis and WhatIf Analysis
When user clicks on edit data button and clicks on generate report button
And User clicks on the Asset and liabilties
And User clicks on  Portfolio Analysis
And User clicks on Portfolio
Then User should able to see Complete button
When User clicks on Performance
Then User should able to see Complete Asset and Liabilities button
When User clicks on Holdings
Then User should see the Complete Asset and Liabilities button
When User clicks on Real estate 
Then user should see Complete Asset and Liabilities button
And User clicks on WhatIf Analysis.

@contingency
Scenario: Validation on Contingency Planning After Report generation
When user clicks on edit data button and clicks on generate report button
And user clicks on Contingency Planning.
Then User should able to see the Emergency Corpus details
When User clicks on Current Insurance under Contingency Planning.
Then User should able to see the Current Health Insurance details.
When User clicks on Life Insurance tab under Contingency Planning.
Then User should able to see Complete Expense button
When User clicks on Medical Insurance under Contingency Planning.
Then User should able to see the Medical Insurance coverage.
When User clicks on What If Analysis under contingency planning.

@CashflowAnalysis
Scenario: Tc_ validation on Cashflow Analysis After Report Generation
When user clicks on edit data button and clicks on generate report button
And user clicks on Cash flow Analysis
Then user should able to see the cash flow details stored in Net Surplus/Shortfall
When user clicks on Cash In flow tab 
Then User should able to see the Cash In flow details
When User clicks on Cash out flow tab 
Then user should able to see the Cash out flow details
When USer clicks on Finto Recommends
Then User should able to see the Finto reommendation details
