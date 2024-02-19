#@fint @fintooLogin
#Feature: Login Page validation
#
  #Background: 
    #Given User is in fintoo page
    #When user cicks on login button
    #Then user should be able to see the Welcome page
#
  #Scenario: TC_001_Validating the login page with valid credentials
    #When user enter username and captcha and clicks on SendOTP button
    #And user enter OTP and clicks on Submit button
    #Then user should able to see HomePage
    #When user clicks on username and clicks on logout
    #Then user should able to see login page
#
  #Scenario: TC_002_Validating the login page with valid number and Invalid captcha
    #When user enter valid username and Invalid captcha and clicks on SendOTP button
    #Then user should able to see invalid captcha error message
#
  #Scenario: TC_003_Validating the login page with Invalid Captcha
    #When user enter username and captcha and clicks on SendOTP button
    #And user enter Invalid OTP and clicks on Submit button
    #Then user should able to see invalid OTP error message
    #
    #Scenario: TC_004_Validating the login page with Invalid number and valid captcha
    #When user enter invalid username and valid captcha and clicks on SendOTP button
    #Then user should able to see invalid user name error message
