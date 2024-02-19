@Advisory @Investment @fintoo
Feature: Checking the functionality of Fintoo Advisory Investment

  Background: login functionality
    Given User is in fintoo page
    Then user should be able to see the Welcome page
    When user enter username and captcha and clicks on SendOTP button
    And user enter OTP and clicks on Submit button

  @invest
  Scenario: TC_Advisory_001 Validating the functionality of Investment in advisory
    When User MouseHover on Advisory and clicks on Investment planning
    Then user should able to see the invest greeting message
    When User clicks on Get Started button
    Then user should able to see "Select a Day" text message
    When User selects the available Date
    Then USer should able to see the Text as "Select a Time"
    When User selects the available Time
    Then User should able to see the consultancy text message as "15 Min. Consultation Call - Retirement Planning"
    When User books an appointment
    Then User should able to see message as "You are scheduled with Fintoo."

  #And user should navigate to thank you page
  @investValidate
  Scenario: TC_Advisory_002 Validating the plans of Investment in advisory
    When User MouseHover on Advisory and clicks on Investment planning
    Then user should able to see the invest greeting message
    And user should able to see the plans text as "Let’s Turn Your Idle Savings Into Profitable Investments With Our 360 Degree Investment Solutions."
    And user should able to see private plans "Private Wealth Management Solutions"
    And user should able to see equity plans "Equity Offerings"
    And user should able to see debt investments plans "Debt Investments"
    And user should able to see alternate investment plans "Alternate Investments"
    
   @InvestBooking @Negative
   Scenario: TC_Advisory_003 Validating the functionality of investment in Advisory without passing input data
    When User MouseHover on Advisory and clicks on Investment planning
    Then user should able to see the invest greeting message
    When User clicks on Get Started button
    Then user should able to see "Select a Day" text message
    When User selects the available Date
    Then USer should able to see the Text as "Select a Time"
    When User selects the available Time
    Then User should able to see the consultancy text message as "15 Min. Consultation Call - Retirement Planning"
    When User clicks on submit button without passing data
    Then User should able to see error msg "Can't be blank."
    And User should able to see income slab error msg as "One answer must be selected."
    
    @InvestMobile @negative
    Scenario Outline: <TC_Advisory_ID> Validating the functionality of investment in Advisory with invaid mobile number<Phonenumber>
    When User MouseHover on Advisory and clicks on Investment planning
    Then user should able to see the invest greeting message
    When User clicks on Get Started button
    Then user should able to see "Select a Day" text message
    When User selects the available Date
    Then USer should able to see the Text as "Select a Time"
    When User selects the available Time
    Then User should able to see the consultancy text message as "15 Min. Consultation Call - Retirement Planning"
    When User enters data in name, email id, text field
    And User  enters invalid <Phonenumber>
    And User clicks on submit button
    Then User should able to see the error msg as "This phone number format is not recognized. Please check the country and number."
    
    Examples:
    | TC_Advisory_ID |  Phonenumber          |
    | TC_Advisory_004|  0                    |
    | TC_Advisory_005| 630570466             |
    | TC_Advisory_006| 63057046650           |
    | TC_Advisory_007| 63.56789              |
    | TC_Advisory_008| 63.56789f             |
    | TC_Advisory_009| 65fgh                 |
    | TC_Advisory_010| @#%&$                 |
    |TC_Advisory_011 |  @fg12_               |
    
    