 @afterreportGoal
Feature: Checking the validations in dashboard

  Background: login
    Given User is in fintoo page
    #When user cicks on login button
    Then user should be able to see the Welcome page
    When user enters valid username and captcha and clicks on SendOTP button
    And user enter OTP and clicks on Submit button
    Then user should able to see homepage "Your Score card"

  @Cashflow
  Scenario: TC_001_Validating the functionality of cashflow in Your profile
    When user clicks on edit data button and clicks on generate report button
    And user clicks on Your profile button
    And user clicks on cashflow
    Then user should able to see the gross inflow details
    And user should able to see gross outflow details
    
    @Cashflow_SavingDeflict
    Scenario: TC_002_Validating the functionality of cashflow saving deflict in Your profile
    When user clicks on edit data button and clicks on generate report button
    And user clicks on Your profile button
    And user clicks on cashflow 
    And user clicks on saving deflict option
    Then user should able to see gross inflow and outflow details
    
    @Cashflow_scoreCard
    Scenario: TC_003_Validating the functionality of cashflow score card in Your profile
    When user clicks on edit data button and clicks on generate report button
    And user clicks on Your profile button
    And user clicks on score card option
    Then user should able to see saving ratio details
    And user should able to see expense ratio details
    And user should able to see network ratio details
    #And user should able to see liquidity ratio details 
    And user should able to see solvency ratio details

  @GoalAnalysis
  Scenario: TC_004_Validating the functionality of GoalAnalysis
    When user clicks on edit data button and clicks on generate report button
    And user clicks on goals analysis button
    Then user should able to see emergency goal details
    And user should able to see contigency goal details
    And user should able to see retirement goal details

  @GoalAssetMapping
  Scenario: TC_005_Validating the functionality of Goal Assets
    When user clicks on edit data button and clicks on generate report button
    And user clicks on goals analysis button
    And user clicks on goal asset mapping button
    Then user should able to see emergency goal asset details
    And user should able to see contigency goal asset details

  @AssetGoalMapping
  Scenario: TC_006_Validating the functionality of Asset Goal Mapping
    When user clicks on edit data button and clicks on generate report button
    And user clicks on goals analysis button
    And user clicks on asset goal mapping button
    Then user should able to see asset goal mapping details

  @MappingAnalysis
  Scenario: TC_007_Validating the functionality of Mapping Analysis and What if Analysis
    When user clicks on edit data button and clicks on generate report button
    And user clicks on goals analysis button
    And user clicks on goal mapping analysis button
    Then user should able to see assest mapping analysis details
    #When user clicks on what if analysis button
    #Then user should able to see the details or coming soon text
    @Retirement
    Scenario: Tc_008_Validating the functionality of Retirement Plan
    When user clicks on edit data button and clicks on generate report button
    And user clicks on retirement planning
    Then user should able to see info summary details
    When user clicks on retirement corpus
    Then user should able to see complete retirement expenses and validate if present
    When user clicks on cash flow in retirement
    Then user should able to see the details or coming soon text
    When user clicks on fintoo recommends cash flow
    Then user should able to see the details or coming soon text
    
    
    
