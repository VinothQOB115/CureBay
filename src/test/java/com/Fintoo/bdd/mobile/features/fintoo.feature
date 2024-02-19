@fintoo
Feature: Checking the functionality of fintoo dashboard
@login
Scenario: TC_001 Checking the login functionality of fintoo with valid credentials
When user clicks on onboarding premission buttons
And user clicks on Next buton
And enters valid Email id and clicks on proceed button
And enters four digit Otp and clicks on procedd button
And user clicks biometric authentication cancel option
Then user should able to see advisory plans
#@Appointment
#Scenario: TC_002 Checking the functionality of appoient booking in financial planning by selecting five star rating
#When user clicks on financial planning option
#Then user enters into Robo Advisory page
#When user swipe right
#Then user should able to see Assisted Advisory
#When user scroll up and clicks on get started button
#And user clicks on filter option and select delhi
#And user clicks on star rating and selects five star
#And user clicks on Apply button
#Then user should able to see top five star rating person name
#When user clicks on the person and clicks on book an appointment
#Then user should able to see "Select a Day" page
#When user clicks on available date
#Then user should able to see "Select a Time" page in time slecting page
#When user clicks the time and clicks on Next button
#Then user should able to see "15 MINUTES CONSULTATION" msg in consultation page
#When user selects More than 1 crore option
#And user clicks on Schedule Event button
#Then user should able to see "Thank You For Choosing Fintoo !" message
#When user clicks on cross popup symbol and navigate back to homepage
#Then user should able to see advisory plans
#@Apponiment_Mumbai
#Scenario: TC_003 Checking the functionality of appoientment booking in financial planning by selecting five star ratingin mumbai
#When user clicks on financial planning option
#Then user enters into Robo Advisory page
#When user swipe right
#Then user should able to see Assisted Advisory
#When user scroll up and clicks on get started button
#And user clicks on filter option and select mumbai
#And user clicks on star rating and selects five star
#And user clicks on Apply button
#Then user should able to see list of top five star rating persons name
#When user clicks on the first person and clicks on book an appointment
#Then user should able to see "Select a Day" page
#When user clicks on available date
#Then user should able to see "Select a Time" page in time slecting page
#When user clicks the time and clicks on Next button
#Then user should able to see "15 MINUTES CONSULTATION" msg in consultation page
#When user selects More than 1 crore option
#And user clicks on Schedule Event button
#Then user should able to see "Thank You For Choosing Fintoo !" message
#When user clicks on cross popup symbol and navigate back to homepage
#Then user should able to see advisory plans

@Advisory_FourStar
Scenario: TC_004 Checking the functionality of appointment booking in financial planning by selecting four star rating in mumbai
When user clicks on financial planning option
Then user enters into Robo Advisory page
When user swipe right
Then user should able to see Assisted Advisory
When user scroll up and clicks on get started button
And user clicks on filter option and select mumbai
And user clicks on star rating and selects four star
And user clicks on Apply button
Then user should able to see list of top four star rating persons name
When user clicks on four star rated person and clicks on book an appointment
Then user should able to see "Select a Day" page
When user clicks on available date
Then user should able to see "Select a Time" page in time slecting page
When user clicks the time and clicks on Next button
Then user should able to see "15 MINUTES CONSULTATION" msg in consultation page
When user selects More than 1 crore option
And user clicks on Schedule Event button
Then user should able to see "Thank You For Choosing Fintoo !" message
When user clicks on cross popup symbol and navigate back to homepage
Then user should able to see advisory plans
@Advisory_FourStar
Scenario: TC_005 Checking the functionality of appointment booking in financial planning by selecting four star rating in Delhi
When user clicks on financial planning option
Then user enters into Robo Advisory page
When user swipe right
Then user should able to see Assisted Advisory
When user scroll up and clicks on get started button
And user clicks on filter option and select delhi
And user clicks on star rating and selects four star
And user clicks on Apply button
Then user should able to see list of top four star rating persons name
When user clicks on four star rated person and clicks on book an appointment
Then user should able to see "Select a Day" page
When user clicks on available date
Then user should able to see "Select a Time" page in time slecting page
When user clicks the time and clicks on Next button
Then user should able to see "15 MINUTES CONSULTATION" msg in consultation page
When user selects More than 1 crore option
And user clicks on Schedule Event button
Then user should able to see "Thank You For Choosing Fintoo !" message
When user clicks on cross popup symbol and navigate back to homepage
Then user should able to see advisory plans
@Advisory_threeStar
Scenario: TC_005 Checking the functionality of appointment booking in financial planning by selecting three star rating in Delhi
When user clicks on financial planning option
Then user enters into Robo Advisory page
When user swipe right
Then user should able to see Assisted Advisory
When user scroll up and clicks on get started button
And user clicks on filter option and select delhi
#And user clicks on star rating and selects three star
And user clicks on Apply button
Then user should able to see list of top four star rating persons name
When user clicks on four star rated person and clicks on book an appointment
Then user should able to see "Select a Day" page
When user clicks on available date
Then user should able to see "Select a Time" page in time slecting page
When user clicks the time and clicks on Next button
Then user should able to see "15 MINUTES CONSULTATION" msg in consultation page
When user selects More than 1 crore option
And user clicks on Schedule Event button
Then user should able to see "Thank You For Choosing Fintoo !" message
When user clicks on cross popup symbol and navigate back to homepage
Then user should able to see advisory plans
