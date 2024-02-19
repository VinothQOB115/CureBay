 @Dashboard

Feature: Dashboard Functionality OR DataGathering Flow

Background: 
Given User is in fintoo page
#When user cicks on login button
Then user should be able to see the Welcome page
When user enter username and captcha and clicks on SendOTP button
And user enter OTP and clicks on Submit button


#Scenario: TC_001_Validating the Payment method with user info functionality
#When User clicks on StartNow button
#Then user should able to see different pricing options 
#When User selects RoboAdvisory option and clicks on get started button
#Then User should able to see subscription page
#When User clicks on apply offer button 
#And User enters coupon details and clicks on apply button
#* User needs to click on checkbox for NDA
#* User clicks on pay button
#* User needs to fill the details in yourinfo page and clicks on save and continue button
#* User needs to enter details in know your risk module and clicks on next button
#* User needs to enter details in Assumption and clicks on next button
#* User needs to enter yourfamily details and clicks on save button

#
#Scenario: TC_002_validating the add goals functionality
#When User clicks on add goals button
#Then User should able to see Add goals form
#When User clicks on Emergency button and needs to fill the details and clicks on save button
#
#
#Scenario: TC_003_Validating the Add Income Functionality
#When user clicks on add income button 
#Then user should able to see add income heading
#When user clicks on salary and bonus and enter details and clicks on save button
#
#
#Scenario: TC_004_Validating the Add Asset functionality
#When user clicks on add asset button in dashboard
#When user clicks on add asset button and enter all details and clicks on save
#And user clicks on car loan and enter details and clicks on save button
#
#Scenario: TC_005_Validating the Insurance functionality
#When User clicks on StartNow button
#And user sclicks on insurance button enter particular details and clicks on continue button
#And user clicks on general isurance button and enters particular details and clicks on save and continue button
#And user clicks on Generate Report button
@Vacation @fintoo
Scenario: TC_006_04_Validating the end to end data gathering flow
When User clicks on StartNow button
#* User needs to fill the details in yourinfo page and clicks on save and continue button
* User needs to enter details in know your risk module and clicks on next button
* User needs to enter details in Assumption and clicks on next button
* User needs to enter Father details and clicks on save button
* user clicks on goals button
* User clicks on Vacation button and needs to fill the details and clicks on save button
* User clicks on income and expenses button
* user clicks on Rental and enter details and clicks on save button
* User clicks on assets and liabilities button
* user clicks on Liquid button and enter all details and clicks on save
* user clicks on Housing and enter details and clicks on save button
* user clicks on insurance button enter particular details and clicks on continue button
* user clicks on Pension Plan button and enters particular details and clicks on save and continue button
* user clicks on Generate Report button
@Emergency
Scenario: TC_006_01_Validating the end to end data gathering flow
When User clicks on StartNow button
#* User needs to fill the details in yourinfo page and clicks on save and continue button
* User needs to enter details in know your risk module and clicks on next button
* User needs to enter details in Assumption and clicks on next button
* User needs to enter yourfamily details and clicks on save button
* user clicks on goals button
* User clicks on Emergency button and needs to fill the details and clicks on save button
* User clicks on income and expenses button
* user clicks on salary and bonus and enter details and clicks on save button
* User clicks on assets and liabilities button
* user clicks on add asset button and enter all details and clicks on save
* user clicks on car loan and enter details and clicks on save button
* user clicks on insurance button enter particular details and clicks on continue button
* user clicks on general isurance button and enters particular details and clicks on save and continue button
* user clicks on Generate Report button

@testz
Scenario: TC_006_02_Validating the end to end data gathering flow
When User clicks on StartNow button
#* User needs to fill the details in yourinfo page and clicks on save and continue button
* User needs to enter details in know your risk module and clicks on next button
* User needs to enter details in Assumption and clicks on next button
* User needs to enter yourfamily details and clicks on save button
* user clicks on goals button
* User clicks on Marriage button and needs to fill the details and clicks on save button
* User clicks on income and expenses button
* user clicks on Gifts and enter details and clicks on save button
* User clicks on assets and liabilities button
* user clicks on alternate button and enter all details and clicks on save
* user clicks on consumer loan and enter details and clicks on save button
* user clicks on insurance button enter particular details and clicks on continue button
* user clicks on guaranteed income plan button and enters particular details and clicks on save and continue button
* user clicks on Generate Report button

@testz1 @fintoo
Scenario: TC_006_03_Validating the end to end data gathering flow
When User clicks on StartNow button
#* User needs to fill the details in yourinfo page and clicks on save and continue button
* User needs to enter details in know your risk module and clicks on next button
* User needs to enter details in Assumption and clicks on next button
* User needs to enter yourfamily details and clicks on save button
* user clicks on goals button
* User clicks on Vehicle button and needs to fill the details and clicks on save button
* User clicks on income and expenses button
* user clicks on Interest Income and enter details and clicks on save button
* User clicks on assets and liabilities button
* user clicks on Gold button and enter all details and clicks on save
* user clicks on Credit card and enter details and clicks on save button
* user clicks on insurance button enter particular details and clicks on continue button
* user clicks on Mediclaim button and enters particular details and clicks on save and continue button
* user clicks on Generate Report button

@Property @fintoo
Scenario: TC_006_05_Validating the end to end data gathering flow
When User clicks on StartNow button
#* User needs to fill the details in yourinfo page and clicks on save and continue button
* User needs to enter details in know your risk module and clicks on next button
* User needs to enter details in Assumption and clicks on next button
* User needs to enter Mother details and clicks on save button
* user clicks on goals button
* User clicks on Property button and needs to fill the details and clicks on save button
* User clicks on income and expenses button
* user clicks on Pension and enter details and clicks on save button
* User clicks on assets and liabilities button
* user clicks on Debt button and enter all details and clicks on save
* user clicks on Business Loan and enter details and clicks on save button
* user clicks on insurance button enter particular details and clicks on continue button
* user clicks on Endowment button and enters particular details and clicks on save and continue button
* user clicks on Generate Report button

@GoalOthers @fintoo
Scenario: TC_006_06_Validating the end to end data gathering flow
When User clicks on StartNow button
#* User needs to fill the details in yourinfo page and clicks on save and continue button
* User needs to enter details in know your risk module and clicks on next button
* User needs to enter details in Assumption and clicks on next button
* User needs to enter your family other details and clicks on save button
When User clicks on add goals button
* User clicks on Other button and needs to fill the details and click on save button
* User clicks on income and expenses button
Then user should able to see add income heading
When user clicks on other and enter details and clicks on save button
* User clicks on assets and liabilities button
* user clicks on Others button and enter all details and clicks on save
* user clicks on Other Property loan and enter details and clicks on save button
* user clicks on insurance button enter particular details and clicks on continue button
* user clicks on term Plan button and enters particular details and clicks on save and continue button
* user clicks on Generate Report button
@GoalEdu
Scenario: TC_006_07_Validating the end to end data gathering flow
When User clicks on StartNow button
#* User needs to fill the details in yourinfo page and clicks on save and continue button
* User needs to enter details in know your risk module and clicks on next button
* User needs to enter details in Assumption and clicks on next button
* User needs to enter your son deatils in family details and clicks on save button
When User clicks on add goals button
When User clicks on Education button and needs to fill the details and clicks on save button
* User clicks on income and expenses button 
Then user should able to see add income heading
When user clicks on business and enter details and clicks on save button
* User clicks on assets and liabilities button
* user clicks on Equity button and enter all details and clicks on save
* user clicks on Personal loan and enter details and clicks on save button
* user clicks on insurance button enter particular details and clicks on continue button
* user clicks on Others button and enters particular details and clicks on save and continue button
* user clicks on Generate Report button




#After generating the report

#Scenario: TC_007_Validating the introduction functionality
#When user clicks on edit data button and clicks on generate report button
#And user clicks on next,Glossary,Disclaimer,Next button
#
#
#Scenario: TC_008_Validating the AboutYou Details
#When user clicks on edit data button and clicks on generate report button 
#And user clicks on Your profile button
#Then user needs to validate the data with entered data
#When user clicks on AboutyourFamily button
#Then user needs to validate the family details



#Scenario: TC_009_validating the remining data in the profile section
#When user clicks on Risk Aptitie button and next button
#Then user need to get the data from cashflow and validate the data
#When user clicks on saving button
#* user clicks on score card





