@AdvisoryFintoo 
Feature: Validation in Advisory in Finto Website

  Background: login functionality
    Given User is in fintoo page
    Then user should be able to see the Welcome page
    When user enter username and captcha and clicks on SendOTP button
    And user enter OTP and clicks on Submit button

  @delhi @test
  Scenario: TC_Advisory_003 Validation on Assisted Advisory Financial Planning Under Advisory using Delhi Filter option
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    When User clicks on Get Started button
    And User clicks on  Get Started in Assisted Advisory
    And User clicks on Filter option Location as Delhi
    Then User should able to see the Experts available in Delhi location
    When User  clicks on the Expert and clicks on Book an Appointment
    Then User should see the text message as "Select a Day"
    When User selects the Date for consultancy
    Then User should able to see the Text message "Select a Time" for consultancy Time
    When User selects the consultancy Time for Expert Anil
    Then User should able to see the duration as "15 MINUTES CONSULTATION"
    And User enters details for booking an appointment  and clicks on Schedule Event
    Then User should able to see message as "You are scheduled with Fintoo."

  @mumbai @test
  Scenario: TC_Advisory_004 Validation on Assisted Advisory Financial Planning Under Advisory using Mumbai Filter option
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    When User clicks on Get Started button
    And User clicks on  Get Started in Assisted Advisory
    And User clicks on Filter option Location as Mumbai
    Then User should able to see the Experts available in Mumbai location
    When User  clicks on the Expert and clicks on Book an Appointment button
    Then User should see the text message as "Select a Day"
    When User selects the Date for consultancy
    Then User should able to see the Text message "Select a Time" for consultancy Time
    When User selects the consultancy Time for Expert Shama
    Then User should able to see the duration as "15 MINUTES CONSULTATION"
    And User enters details for booking an appointment  and clicks on Schedule Event
    Then User should able to see message as "You are scheduled with Fintoo."

  @fivestar @test
  Scenario: TC_Advisory_005 Validation on Assisted Advisory Financial Planning Under Advisory using 5 start Rating Filter option
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    When User clicks on Get Started button
    And User clicks on  Get Started in Assisted Advisory
    And User clicks on Filter option Start rating as five
    Then User should able to see the Experts available in five star rating
    When User  clicks on the Expert and clicks the Book an Appointment button
    Then User should see the text message as "Select a Day"
    When User selects the Date for consultancy
    Then User should able to see the Text message "Select a Time" for consultancy Time
    When User selects the consultancy Time for Expert Mayuri
    Then User should able to see the duration as "15 MINUTES CONSULTATION"
    And User enters details for booking an appointment  and clicks on Schedule Event
    Then User should able to see message as "You are scheduled with Fintoo."

  @fourstar @test
  Scenario: TC_Advisory_006 Validation on Assisted Advisory Financial Planning Under Advisory using 4 start Rating Filter option
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    When User clicks on Get Started button
    And User clicks on  Get Started in Assisted Advisory
    And User clicks on Filter option Start rating as four
    Then User should able to see the Experts available in four star rating
    When User  clicks on the Expert and clicks on the Book an Appointment button.
    Then User should see the text message as "Select a Day"
    When User selects the Date for consultancy
    Then User should able to see the Text message "Select a Time" for consultancy Time
    When User selects the consultancy Time for Expert Yash
    Then User should able to see the duration as "15 MINUTES CONSULTATION"
    And User enters details for booking an appointment  and clicks on Schedule Event
    Then User should able to see message as "You are scheduled with Fintoo."

  @Threestar @test
  Scenario: TC_Advisory_007 Validation on Assisted Advisory Financial Planning Under Advisory using 3 start Rating Filter option
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    When User clicks on Get Started button
    And User clicks on  Get Started in Assisted Advisory
    And User clicks on Filter option Start rating as three
    Then User should able to see  the response for Three star rating.

  @abovefour @test
  Scenario: TC_Advisory_008 Validation on Assisted Advisory Financial Planning Under Advisory using above 4 years of Experience Filter option
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    When User clicks on Get Started button
    And User clicks on  Get Started in Assisted Advisory
    And User clicks on Filter option Experience above four years
    Then User should able to see the Experts available in Experience above four years
    When User  clicks on Expert and clicks Book an Appointment button.
    Then User should see the text message as "Select a Day"
    When User selects the Date for consultancy
    Then User should able to see the Text message "Select a Time" for consultancy Time
    When User selects the consultancy Time for Expert Kosar
    Then User should able to see the duration as "15 MINUTES CONSULTATION"
    And User enters details for booking an appointment  and clicks on Schedule Event
    Then User should able to see message as "You are scheduled with Fintoo."

  @TwoandFour @test
  Scenario: TC_Advisory_009 Validation on Assisted Advisory Financial Planning Under Advisory using experience filter option between 2 to 4
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    When User clicks on Get Started button
    And User clicks on  Get Started in Assisted Advisory
    And User clicks on Filter option experience between two to four years
    Then User should able to see the Experts available in experience between two to four years
    When User  clicks on Expert and clicks on the Book an Appointment button.
    Then User should see the text message as "Select a Day"
    When User selects the Date for consultancy
    Then User should able to see the Text message "Select a Time" for consultancy Time
    When User selects the consultancy Time for Expert Maitri
    Then User should able to see the duration as "15 MINUTES CONSULTATION"
    And User enters details for booking an appointment  and clicks on Schedule Event
    Then User should able to see message as "You are scheduled with Fintoo."

  @belowtwo @test
  Scenario: TC_Advisory_010 Validation on Assisted Advisory Financial Planning Under Advisory using experience filter option below 2years
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    When User clicks on Get Started button
    And User clicks on  Get Started in Assisted Advisory
    And User clicks on Filter option experience below two years
    Then User should able to see the Experts available in experience below two years
    When User  clicks on the Expert and click on the Book an Appointment button.
    Then User should see the text message as "Select a Day"
    When User selects the Date for consultancy
    Then User should able to see the Text message "Select a Time" for consultancy Time
    When User selects the consultancy Time for Expert Meghna
    Then User should able to see the duration as "15 MINUTES CONSULTATION"
    And User enters details for booking an appointment  and clicks on Schedule Event
    Then User should able to see message as "You are scheduled with Fintoo."

  @FinancialPlanReport
  Scenario: TC_Advisory_00 Validation on DownloadSample report and Automation Advisory option in Financial Planning
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    And User should able to see intro for Sample Report
    When User clicks on the Sample Report to download
    And User should able to see Auto Advisory as  "Automated Advisory"
    When User clicks on Start in Automatic Advisory
    Then User should able to see Advisory tab as "Advisory"

  @FinancialExpertPlan
  Scenario: TC_Advisory_00 Validation on Expert Advisory option and book an appointment in Financial Planning
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    And User should able to see Expert Advisory as "Expert Advisory"
    When User clicks on Start in Expert Advisory
    Then User should able to see  the text message to bbok Appointment as " Book Your Appointment with Expert Now"
    When User clicks on Filter option Location as Delhi
    Then User should able to see the Expert name as Anil Verma available in Delhi location
    When User  clicks on the Expert Anil Verma and clicks on Book an Appointment
    Then User should see the text message as "Select a Day" in ExpertPlan
    When User selects the Date for consultancy in ExpertPlan
    Then User should able to see the Text message "Select a Time" for consultancy Time in ExpertPlan
    When User selects the consultancy Time in ExpertPlan
    Then User should able to see the duration as "15 MINUTES CONSULTATION" in ExpertPlan
    And User enters details for booking an appointment  and clicks on Schedule Event in ExpertPlan
    Then User should able to see message as "You are scheduled with Fintoo." in ExpertPlan

  @TextinFinancialPlan
  Scenario: TC_Advisory_00 Validation on text fields in Financial Planning
    When User MouseHover on Advisory and clicks on Financial planning
    Then user should able to see the greeting message
    And User should able to see Expert Advisory as "Expert Advisory"
    And User should able to see step title as "Steps For Financial Planning" and its steps
    And User should able to see  text This Is How Your Customised Financial Report Will Look Like and its steps
    And User should able to see "Security"
    And User shoudl able to see the Youtube link title for Financial Plan
    And user should able to see greeting for Introductory Call
    And User should able to see as "FAQs" and questions

  @RetirementPlan
  Scenario: TC_Advisory_011 Validation on booking an appointment in Retirment Planning under Addvisory
    When User MouseHover on Advisory and clicks on Retirement plan
    Then User should able to see the message as "Don’t ReTire, Reboot… Relive… Rejoice"
    When User clicks on Get Started
    Then user should able to see "Select a Day" text message
    When User selects the available Date
    Then USer should able to see the Text as "Select a Time"
    When User selects the available Time
    Then User should able to see the consultancy text message as "15 Min. Consultation Call - Retirement Planning"
    When User books an appointment
    Then User should able to see message as "You are scheduled with Fintoo."

  @RetirementPlanText
  Scenario: TC_Advisory_012 Validation on text in Retirment Planning under Advisory
    When User MouseHover on Advisory and clicks on Retirement plan
    Then User should able to see the message as "Don’t ReTire, Reboot… Relive… Rejoice"
    And user should able to see the text as "Steps To Create A Perfect Retirement Plan"
    And User should able to see the text "This Is How Your Customised Financial Report Will Look Like"
    And user should able to see  text as "How Fintoo’s Customised Retirement Planning Helps You To  Achieve Your Goals."
    And User should able to see "Security"
    And user should able to see greeting for Introductory Call
    And User should able to see as "FAQs" and questions

  @TaxPlanning
  Scenario: TC_Advisory_013 Validation on text in Tax Planning under Advisory
    When User MouseHover on Advisory and clicks on Tax plan
    Then User should able to see the greeting message as "Minimise Your Taxes, Maximise Your Savings."
    When User clicks on Get Started
    Then user should able to see "Select a Day" text message
    When User selects the available Date
    Then USer should able to see the Text as "Select a Time"
    When User selects the available Time
    Then User should able to see the consultancy text message "15 Min. Consultation Call - Tax Planning "
    And User books an appointment
    Then User should able to see message as "You are scheduled with Fintoo."

  @TaxPlanningText
  Scenario: TC_Advisory_014 Validation on text in Tax Planning under Advisory
    When User MouseHover on Advisory and clicks on Tax plan
    Then User should able to see the greeting message as "Minimise Your Taxes, Maximise Your Savings."
    And User should see the text as "Effective Tax Planning & Management Solutions For Every Individual, Entrepreneur, Professional and Business."
    And User should able to see "Security"
    And user should able to see greeting for Introductory Call
    And User should able to see as "FAQs" and questions

 @NegativeTax
  Scenario Outline: TC_Advisory_015 Validation on providing in invalid email address in Booking an Appointment
    When User MouseHover on Advisory and clicks on Tax plan
    Then User should able to see the greeting message as "Minimise Your Taxes, Maximise Your Savings."
    When User clicks on Get Started
    Then user should able to see "Select a Day" text message
    When User selects the available Date
    Then USer should able to see the Text as "Select a Time"
    When User selects the available Time
    Then User should able to see the consultancy text message "15 Min. Consultation Call - Tax Planning "
    When User enters the Name in the enter Details
    And User enters the email id <emailID> ,clicks on Add Guest and the enters the Guest email id <guestEmail>
    And User enters the Telnumber,IncomeExpense and clicks on ScheduleTime.
    Then user should able to see the Email error message as "Please ensure all email addresses are properly formatted"

    Examples: 
      | emailID         | guestEmail        |
      | abc@gn          | abh@gk            |
      | 123@jfmd        | 1234@skfks        |
      | gajfj@gmail2    | antharik@gmail3   |
      | bd$hvk@gmail.in | bed@jjvf@gmail.in |
