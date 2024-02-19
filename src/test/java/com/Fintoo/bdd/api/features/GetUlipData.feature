@getulipdata_AssetsLiability @Investment
Feature: validation of get ulip data Functionality

  @getulipdata_Positive
  Scenario: TC_001_Get request for get ulip data positive scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I send the GET request to "getulipdata_Positive" endpoint
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
      | JPath                | Value                                         |
      | $.error_code         |                                           100 |
      | $.data[0].share_name | Aditya Birla Sun Life - Asset Allocation Fund |
      | $.message            | Successful                                    |
      | $.data[0].ms_secid   | F00000WBF1                                    |
      | $.data[0].price      |                                        0.0000 |

  @getulipdata_negative
  Scenario: TC_002_Get request for get ulip data negative scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I send the GET request to "getulipdata_negative" endpoint
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

  @getulipdata_negative1
  Scenario: TC_003_Get request for getulipdata negative1 scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I send the GET request to "getulipdata_negative1" endpoint
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

  @getulipdata_negative2
  Scenario: TC_004_Get request for getulipdata negative2 scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I send the GET request to "getulipdata_negative2" endpoint
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

  @getulipdata_negative3
  Scenario: TC_005_Get request for get ulip data negative3 scenario
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
      | gatewayname      | https://stg.minty.co.in/                                                                                                                                         |
    When I send the GET request to "getulipdata_negative3" endpoint
    Then I should see the response code as "200"
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
  Scenario: TC_006_Post request for  get ulip data without Gateway AuthToken Negative
    Given I set up request specification
      | HeaderName   | HeaderValue              |
      | Content-Type | application/json         |
      | gatewayname  | https://stg.minty.co.in/ |
    When I send the GET request to "getulipdata_Positive" endpoint
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
      | JPath         | Value                           |
      | $.error_code  | "102"                           |
      | $.message     | Invalid Token                   |
      | $.current_url | /restapi/report/getulipdata/ |

  @withoutGatewayName_Negative
  Scenario: TC_007_Post request for  getulipdata  without Gateway Name Negative
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
    When I send the GET request to "getulipdata_Positive" endpoint
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
      | JPath         | Value                           |
      | $.error_code  | "102"                           |
      | $.message     | Invalid Token                   |
      | $.current_url | /restapi/report/getulipdata/ |

  @withoutGatewayNameAndAuthToken_Negative
  Scenario: TC_008_Post request for  getulipdata without Gateway Name and AuthToken Negative
    Given I set up request specification
      | HeaderName   | HeaderValue      |
      | Content-Type | application/json |
    When I send the GET request to "getulipdata_Positive" endpoint
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
      | JPath         | Value                           |
      | $.error_code  | "102"                           |
      | $.message     | Invalid Token                   |
      | $.current_url | /restapi/report/getulipdata/ |

  @wrongGatewayAuthName_Negative
  Scenario: TC_009_Post request for  getulipdata  wrong Gateway name Negative
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                                                      |
      | Content-Type     | application/json                                                                                                                                                 |
      | gatewayname      | https://stg.minty                                                                                                                                                |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0dHBzOi8vc3RnLm1pbnR5LmNvLmluLyIsImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
    When I send the GET request to "getulipdata_Positive" endpoint
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
      | JPath         | Value                           |
      | $.error_code  | "102"                           |
      | $.message     | Invalid Token                   |
      | $.current_url | /restapi/report/getulipdata/ |

  @wrongGatewayAuthToken_Negative
  Scenario: TC_010_Post request for getulipdata  wrong Gateway AuthToken Negative
    Given I set up request specification
      | HeaderName       | HeaderValue                                                                                                                      |
      | Content-Type     | application/json                                                                                                                 |
      | gatewayname      | https://stg.minty                                                                                                                |
      | gatewayauthtoken | eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnYXRld2F5bmFtZSI6Imh0ImV4cCI6MTY5NDMyMjgxN30.GajK6Khkwc-oU5r7G8hW--uMoFKIzGAs1TEBOBS35Q0 |
    When I send the GET request to "getulipdata_Positive" endpoint
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
      | JPath         | Value                           |
      | $.error_code  | "102"                           |
      | $.message     | Invalid Token                   |
      | $.current_url |/restapi/report/getulipdata/ |
