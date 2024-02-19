#@Riskcovy_Login
#Feature: IC Plans
#
  #Scenario Outline: Validating IC plans
    #Given User is in Riskcovry LivLong url page
    #When User enter Username on login page <Username>
    #And User enter Password on login page <Password>
    #And User click on Login button
    #Then User should able to see error message
#
    #Examples: 
      #| Username       | Password   |
      #|     7900035610 | 5656343412 |
      #|     7653216812 | 7900035610 |
      #|     7653216812 | 5656343412 |
      #| bghf@gmail.com | 0987654321 |
      #|                |            |
      #| @$&            | @$&        |
#
  #deliberatelyFailedTheTestCase
  #Scenario Outline: Validating IC plans
    #Given User is in Riskcovry LivLong url page
    #When User enter Username on login page <Username>
    #And User enter Password on login page <Password>
    #And User click on Login button
    #Then User should able not to see error message
#
    #Examples: 
      #| Username   | Password   |
      #| 7900035610 | 5656343412 |
