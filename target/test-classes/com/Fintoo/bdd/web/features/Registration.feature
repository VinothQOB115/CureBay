#@fint @Registration
#Feature: Registration Functionality
#
  #Background: 
    #Given User is in fintoo page
    #When user cicks on login button
    #Then user should be able to see the Welcome page
    #When user clicks on registerNow button
#
  #Scenario: TC_001_validating Registration Functionality
    #And user enter valid details and clicks on register button
    #And user enters OTP and clicks on Submit button
    #Then user should able to see HomePage
#
  #Scenario: TC_002_Validating the registration flow with existing email id
    #And user enters existing email id and click on register button
    #Then user should able to see error message
#
  #Scenario: TC_003_Validating the registration flow with existing Mobile Number
    #And user enters existing mobile number and click on register button
    #Then user should able to see error message for existing mobile number
#
  #Scenario: TC_004_Validating the registration flow with invalid captcha
    #And user enters invalid captcha and click on register button
    #Then user should able to see error message for invalid captcha
#
  #Scenario: TC_005_Validating the registration flow without checking the terms andd agree checkbox
    #And user enters all credentials and with ut clicking terms and agree check boxes and click on register button
    #Then user should able to see error message for error message of checkboxes
