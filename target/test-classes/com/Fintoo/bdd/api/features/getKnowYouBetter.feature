@getKnowYouBetter @report
Feature: validation of get Know You Better Functionality


  @getfpuserdata_negative
  Scenario: TC_001_Get request for get Know You Better negative scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I send the GET request to "getKnowYouBetter_Negative" endpoint
    Then I should see the response code as "404"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue              |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff                  |
      | Vary                   | Origin                   |
      | Referrer-Policy        | same-origin              |
      | Connection             | keep-alive               |


  @getfpuserdata_negative1
  Scenario: TC_002_Get request for get Know You Better negative scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I send the GET request to "getKnowYouBetter_Negative1" endpoint
    Then I should see the response code as "404"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue              |
      | Content-Type           |application/json|
      | X-Content-Type-Options | nosniff                  |
      | Vary                   | Origin                   |
      | Referrer-Policy        | same-origin              |
      | Connection             | keep-alive               |

  @getfpuserdata_negative2
  Scenario: TC_003_Get request for get Know You Better negative scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I send the GET request to "getKnowYouBetter_Negative2" endpoint
    Then I should see the response code as "404"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue              |
      | Content-Type           | application/json|
      | X-Content-Type-Options | nosniff                  |
      | Vary                   | Origin                   |
      | Referrer-Policy        | same-origin              |
      | Connection             | keep-alive               |


  @getfpuserdata_negative3
  Scenario: TC_004_Get request for get Know You Better negative scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I send the GET request to "getKnowYouBetter_Negative3" endpoint
    Then I should see the response code as "404"
    And contentType as "text/html; charset=utf-8"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue              |
      | Content-Type           | text/html; charset=utf-8 |
      | X-Content-Type-Options | nosniff                  |
      | Vary                   | Origin                   |
      | Referrer-Policy        | same-origin              |
      | Connection             | keep-alive               |

  @withoutGatewayAuthToken_Negative
  Scenario: TC_005_Post request for  get Know You Better without Gateway AuthToken Negative
    Given I set up request specification
      | HeaderName   | HeaderValue              |
      | Content-Type | application/json         |
      | gatewayname  | https://stg.minty.co.in/ |
    When I send the GET request to "getKnowYouBetter_Positive" endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                          |
      | $.error_code  | "102"                          |
      | $.message     | Invalid Token                  |



  @withoutGatewayName_Negative
  Scenario: TC_006_Post request for  get Know You Better without Gateway Name Negative
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
    When I send the GET request to "getKnowYouBetter_Positive" endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                          |
      | $.error_code  | "102"                          |
      | $.message     | Invalid Token                  |



  @withoutGatewayNameAndAuthToken_Negative
  Scenario: TC_007_Post request for  get Know You Better without Gateway Name and AuthToken Negative
    Given I set up request specification
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    When I send the GET request to "getKnowYouBetter_Positive" endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                          |
      | $.error_code  | "102"                          |
      | $.message     | Invalid Token                  |


  @wrongGatewayAuthName_Negative
  Scenario: TC_008_Post request for get Know You Better  wrong Gateway name Negative
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayname      | https://stg.minty                                                                                                                                                |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
    When I send the GET request to "getKnowYouBetter_Positive" endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                          |
      | $.error_code  | "102"                          |
      | $.message     | Invalid Token                  |



  @wrongGatewayAuthToken_Negative
  Scenario: TC_09_Post request for get Know You Better wrong Gateway AuthToken Negative
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                      |
      | Content-Type     | application/json                                                                                                                 |
      | gatewayname      | https://stg.minty                                                                                                                |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0ImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
    When I send the GET request to "getKnowYouBetter_Positive" endpoint
    Then I should see the response code as "200"
    And contentType as "application/json"
    And verify response time is less than "4000" milliseconds
    And verify response headers
      | HeaderName             | HeaderValue      |
      | Content-Type           | application/json |
      | X-Content-Type-Options | nosniff          |
      | Vary                   | Origin           |
      | Referrer-Policy        | same-origin      |
      | Connection             | keep-alive       |
    And the fields in response should match with expected values
      | JPath         | Value                          |
      | $.error_code  | "102"                          |
      | $.message     | Invalid Token                  |


